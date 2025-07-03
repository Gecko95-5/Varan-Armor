package net.gecko.varanarmor.entity.bobbers;

import net.gecko.varanarmor.entity.DecoEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
//I got this code from Scouter456 Nether Depths Upgrade Mod https://github.com/Scouter456/Nether_Depths_Upgrade/tree/nether_depths_upgrade_1.19.2-fabric

public class NautilusFishingBobberEntity extends FishingBobberEntity {
	public NautilusFishingBobberEntity(EntityType<? extends FishingBobberEntity> type, World world, int luckOfTheSeaLevel, int lureLevel) {
		super(type, world, luckOfTheSeaLevel, lureLevel);
	}

	public NautilusFishingBobberEntity(EntityType<? extends FishingBobberEntity> entityType, World world) {
		super(entityType, world);
	}

	public NautilusFishingBobberEntity(PlayerEntity thrower, World world, int luckOfTheSeaLevel, int lureLevel) {
		this(DecoEntities.NAUTILUS_BOBBER, world, luckOfTheSeaLevel, lureLevel);
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
}