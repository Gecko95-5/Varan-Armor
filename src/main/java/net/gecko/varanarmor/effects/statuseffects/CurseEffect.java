package net.gecko.varanarmor.effects.statuseffects;

import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class CurseEffect extends StatusEffect {

    public CurseEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
            this.spawnEffectCloud(entity.getWorld(), entity.getX(), entity.getY() + 0.5, entity.getZ());
    }

    private void spawnEffectCloud(World world, double x, double y, double z) {
        AreaEffectCloudEntity areaEntity = EntityType.AREA_EFFECT_CLOUD.create(world);
        if (areaEntity != null) {
            areaEntity.setParticleType(ParticleTypes.DRAGON_BREATH);
            areaEntity.setRadius(3.0f);
            areaEntity.setDuration(400);
            areaEntity.addEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 1));
            areaEntity.refreshPositionAndAngles(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
            world.spawnEntity(areaEntity);
        }
    }
}
