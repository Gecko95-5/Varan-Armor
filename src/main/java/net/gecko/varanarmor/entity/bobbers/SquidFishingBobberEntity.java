package net.gecko.varanarmor.entity.bobbers;

import com.mojang.logging.LogUtils;
import net.gecko.varanarmor.entity.DecoEntities;
import net.gecko.varanarmor.item.DecoItems;
import net.gecko.varanarmor.util.DecoLootTables;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.tag.FluidTags;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

//I got this code from Scouter456 Nether Depths Upgrade Mod https://github.com/Scouter456/Nether_Depths_Upgrade/tree/nether_depths_upgrade_1.19.2-fabric
public class SquidFishingBobberEntity extends FishingBobberEntity {
	private Entity hookedEntity;
	private float luckOfTheSeaLevel;
	private int hookCountdown;

	public SquidFishingBobberEntity(EntityType<? extends FishingBobberEntity> type, World world, int luckOfTheSeaLevel, int lureLevel) {
		super(type, world, luckOfTheSeaLevel, lureLevel);
	}

	public SquidFishingBobberEntity(EntityType<? extends FishingBobberEntity> entityType, World world) {
		super(entityType, world);
	}

	public SquidFishingBobberEntity(PlayerEntity thrower, World world, int luckOfTheSeaLevel, int lureLevel) {
		this(DecoEntities.SQUID_BOBBER, world, luckOfTheSeaLevel, lureLevel);
		this.setOwner(thrower);
		float f = thrower.getPitch();
		float g = thrower.getYaw();
		float h = MathHelper.cos(-g * 0.017453292F - 3.1415927F);
		float k = MathHelper.sin(-g * 0.017453292F - 3.1415927F);
		float l = -MathHelper.cos(-f * 0.017453292F);
		float m = MathHelper.sin(-f * 0.017453292F);
		double d = thrower.getX() - (double)k * 0.3;
		double e = thrower.getEyeY();
		double n = thrower.getZ() - (double)h * 0.3;
		this.refreshPositionAndAngles(d, e, n, g, f);
		Vec3d vec3 = new Vec3d(-k, MathHelper.clamp(-(m / l), -5.0F, 5.0F), -h);
		double o = vec3.length();
		vec3 = vec3.multiply(0.6 / o + this.random.nextTriangular(0.5, 0.0103365),
				0.6 / o + this.random.nextTriangular(0.5, 0.0103365),
				0.6 / o + this.random.nextTriangular(0.5, 0.0103365));
		this.setVelocity(vec3);
		this.getYaw((float)(MathHelper.atan2(vec3.x, vec3.z) * 57.2957763671875));
		this.getPitch((float)(MathHelper.atan2(vec3.y, vec3.horizontalLength()) * 57.2957763671875));
		this.prevYaw = this.getYaw();
		this.prevPitch = this.getPitch();
	}
	private void checkForCollision() {
		HitResult hitResult = ProjectileUtil.getCollision(this, this::canHit);
		this.onCollision(hitResult);
	}

	@Override
	protected boolean canHit(Entity entity) {
		return super.canHit(entity) || entity.isAlive() && entity instanceof ItemEntity;
	}
	@Override
	protected void onEntityHit(EntityHitResult pResult) {
		super.onEntityHit(pResult);
		if (!this.world.isClient) {
			this.getHookedEntity(hookedEntity);
		}
	}

	private void getHookedEntity(Entity hookedEntity) {
        this.hookedEntity = hookedEntity;
    }
	public int use(ItemStack usedItem) {
		PlayerEntity playerEntity = this.getPlayerOwner();
		if (!this.world.isClient && playerEntity != null && !this.remove(playerEntity)) {
			int i = 0;
			if (this.hookedEntity != null) {
				this.pullHookedEntity(this.hookedEntity);
				Criteria.FISHING_ROD_HOOKED.trigger((ServerPlayerEntity)playerEntity, usedItem, this, Collections.emptyList());
				this.world.sendEntityStatus(this, EntityStatuses.PULL_HOOKED_ENTITY);
				i = this.hookedEntity instanceof ItemEntity ? 3 : 5;
			} else if (this.hookCountdown > 0) {
				LootContext.Builder builder = new LootContext.Builder((ServerWorld)this.world)
						.parameter(LootContextParameters.ORIGIN, this.getPos())
						.parameter(LootContextParameters.TOOL, usedItem)
						.parameter(LootContextParameters.THIS_ENTITY, this)
						.random(this.random)
						.luck(this.luckOfTheSeaLevel + playerEntity.getLuck());
				LootTable lootTable = Objects.requireNonNull(this.world.getServer()).getLootManager().getTable(DecoLootTables.SUPER_FISHING_GAMEPLAY);
				List<ItemStack> list = lootTable.generateLoot(builder.build(LootContextTypes.FISHING));
				Criteria.FISHING_ROD_HOOKED.trigger((ServerPlayerEntity)playerEntity, usedItem, this, list);

				for (ItemStack itemStack : list) {
					ItemEntity itemEntity = new ItemEntity(this.world, this.getX(), this.getY(), this.getZ(), itemStack);
					double d = playerEntity.getX() - this.getX();
					double e = playerEntity.getY() - this.getY();
					double f = playerEntity.getZ() - this.getZ();
					double g = 0.1;
					itemEntity.setVelocity(d * 0.1, e * 0.1 + Math.sqrt(Math.sqrt(d * d + e * e + f * f)) * 0.08, f * 0.1);
					this.world.spawnEntity(itemEntity);
					playerEntity.world
							.spawnEntity(
									new ExperienceOrbEntity(playerEntity.world, playerEntity.getX(), playerEntity.getY() + 0.5, playerEntity.getZ() + 0.5, this.random.nextInt(6) + 1)
							);
					if (itemStack.isIn(ItemTags.FISHES)) {
						playerEntity.increaseStat(Stats.FISH_CAUGHT, 1);
					}
				}

				i = 1;
			}

			if (this.onGround) {
				i = 2;
			}

			this.discard();
			return i;
		} else {
			return 0;
		}
	}

	private boolean remove(PlayerEntity player) {
		ItemStack itemStack = player.getMainHandStack();
		ItemStack itemStack2 = player.getOffHandStack();
		boolean bl = itemStack.isOf(DecoItems.SQUID_FISHING_ROD);
		boolean bl2 = itemStack2.isOf(DecoItems.SQUID_FISHING_ROD);
		if (!player.isRemoved() && player.isAlive() && (bl || bl2) && !(this.squaredDistanceTo(player) > 1024.0)) {
			return false;
		} else {
			this.discard();
			return true;
		}
	}

	@Override
	protected void onBlockHit(BlockHitResult blockHitResult) {
		super.onBlockHit(blockHitResult);
		this.setVelocity(this.getVelocity().normalize().multiply(blockHitResult.squaredDistanceTo(this)));
	}

}