package net.gecko.varanarmor.entity.arrow;

import net.gecko.varanarmor.entity.DecoEntities;
import net.gecko.varanarmor.item.DecoItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class QuartzArrowEntity extends PersistentProjectileEntity {
    public LivingEntity owner;
    public QuartzArrowEntity(EntityType<? extends QuartzArrowEntity> entityType, World world) {
        super(entityType, world);
    }

    public QuartzArrowEntity(World world, LivingEntity owner) {
        super(DecoEntities.QUARTZ_ARROW, owner, world);
        this.owner = owner;
    }

    public QuartzArrowEntity(World world, double x, double y, double z) {
        super(DecoEntities.QUARTZ_ARROW, x, y, z, world);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.inGround && this.inGroundTime != 0 && this.inGroundTime >= 1200) {
            this.world.sendEntityStatus(this, (byte)0);
        }
    }

    @Override
    protected ItemStack asItemStack() {
        return new ItemStack(DecoItems.QUARTZ_ARROW);
    }

    @Override
    public void setDamage(double damage) {
        super.setDamage(damage + 1.5);
    }
    @Override
    public void onHit(LivingEntity target) {
            if (owner.getHealth() < owner.getMaxHealth()) {
                owner.heal(1.0F);
            }
            else {
                owner.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 400));
            }
            super.onHit(target);
        }

}

