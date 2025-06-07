package net.gecko.varanarmor.entity.arrow;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import net.gecko.varanarmor.entity.DecoEntities;
import net.gecko.varanarmor.item.DecoItems;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class IronArrowEntity extends PersistentProjectileEntity {
    protected boolean inGround;
    protected int inGroundTime;
    public PersistentProjectileEntity.PickupPermission pickupType = PersistentProjectileEntity.PickupPermission.DISALLOWED;
    private final SoundEvent sound = this.getHitSound();
    private int punch;
    @Nullable
    private IntOpenHashSet piercedEntities;
    @Nullable
    private List<Entity> piercingKilledEntities;

    public IronArrowEntity(EntityType<? extends IronArrowEntity> entityType, World world) {
        super(entityType, world);
    }

    public IronArrowEntity(World world, LivingEntity owner) {
        super(DecoEntities.IRON_ARROW, owner, world);
    }

    public IronArrowEntity(World world, double x, double y, double z) {
        super(DecoEntities.IRON_ARROW, x, y, z, world);
    }
    @Override
    public void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        float f = (float)this.getVelocity().length();
        double damage = 2.5;
        int i = MathHelper.ceil(MathHelper.clamp(f * damage, 0.0, 2.147483647E9));
        if (this.getPierceLevel() > 0) {
            if (this.piercedEntities == null) {
                this.piercedEntities = new IntOpenHashSet(5);
            }

            if (this.piercingKilledEntities == null) {
                this.piercingKilledEntities = Lists.newArrayListWithCapacity(5);
            }

            if (this.piercedEntities.size() >= this.getPierceLevel() + 1) {
                this.discard();
                return;
            }

            this.piercedEntities.add(entity.getId());
        }

        if (this.isCritical()) {
            long l = this.random.nextInt(i / 2 + 2);
            i = (int)Math.min(l + i, 2147483647L);
        }

        Entity entity2 = this.getOwner();
        DamageSource damageSource;
        if (entity2 == null) {
            damageSource = DamageSource.arrow(this, this);
        } else {
            damageSource = DamageSource.arrow(this, entity2);
            if (entity2 instanceof LivingEntity) {
                ((LivingEntity)entity2).onAttacking(entity);
            }
        }

        boolean bl = entity.getType() == EntityType.ENDERMAN;
        int j = entity.getFireTicks();
        if (this.isOnFire() && !bl) {
            entity.setOnFireFor(5);
        }

        if (entity.damage(damageSource, i)) {
            if (bl) {
                return;
            }

            if (entity instanceof LivingEntity livingEntity) {
                if (!this.world.isClient && this.getPierceLevel() <= 0) {
                    livingEntity.setStuckArrowCount(livingEntity.getStuckArrowCount() + 1);
                }

                if (this.punch > 0) {
                    double d = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE));
                    Vec3d vec3d = this.getVelocity().multiply(1.0, 0.0, 1.0).normalize().multiply(this.punch * 0.6 * d);
                    if (vec3d.lengthSquared() > 0.0) {
                        livingEntity.addVelocity(vec3d.x, 0.1, vec3d.z);
                    }
                }

                if (!this.world.isClient && entity2 instanceof LivingEntity) {
                    EnchantmentHelper.onUserDamaged(livingEntity, entity2);
                    EnchantmentHelper.onTargetDamaged((LivingEntity)entity2, livingEntity);
                }

                this.onHit(livingEntity);
                if (livingEntity != entity2 && livingEntity instanceof PlayerEntity && entity2 instanceof ServerPlayerEntity && !this.isSilent()) {
                    ((ServerPlayerEntity)entity2)
                            .networkHandler
                            .sendPacket(new GameStateChangeS2CPacket(GameStateChangeS2CPacket.PROJECTILE_HIT_PLAYER, GameStateChangeS2CPacket.DEMO_OPEN_SCREEN));
                }

                if (!entity.isAlive() && this.piercingKilledEntities != null) {
                    this.piercingKilledEntities.add(livingEntity);
                }

                if (!this.world.isClient && entity2 instanceof ServerPlayerEntity serverPlayerEntity) {
                    if (this.piercingKilledEntities != null && this.isShotFromCrossbow()) {
                        Criteria.KILLED_BY_CROSSBOW.trigger(serverPlayerEntity, this.piercingKilledEntities);
                    } else if (!entity.isAlive() && this.isShotFromCrossbow()) {
                        Criteria.KILLED_BY_CROSSBOW.trigger(serverPlayerEntity, List.of(entity));
                    }
                }
            }

            this.playSound(this.sound, 1.0F, 1.2F / (this.random.nextFloat() * 0.2F + 0.9F));
            if (this.getPierceLevel() <= 0) {
                this.discard();
            }
        } else {
            entity.setFireTicks(j);
            this.setVelocity(this.getVelocity().multiply(-0.1));
            this.setYaw(this.getYaw() + 180.0F);
            this.prevYaw += 180.0F;
            if (!this.world.isClient && this.getVelocity().lengthSquared() < 1.0E-7) {
                if (this.pickupType == PersistentProjectileEntity.PickupPermission.ALLOWED) {
                    this.dropStack(this.asItemStack(), 0.1F);
                }

                this.discard();
            }
        }
    }

    public void setPunch(int punch) {
        this.punch = punch;
    }
    @Override
    public void tick() {
        super.tick();
        if (this.inGround && this.inGroundTime != 0 && this.inGroundTime >= 600) {
            this.world.sendEntityStatus(this, (byte)0);
        }
    }

    @Override
    protected ItemStack asItemStack() {
        return new ItemStack(DecoItems.IRON_ARROW);
    }
}
