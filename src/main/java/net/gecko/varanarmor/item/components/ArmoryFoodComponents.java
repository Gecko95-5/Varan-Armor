package net.gecko.varanarmor.item.components;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ArmoryFoodComponents {
    public static final FoodComponent SQUID_TENTACLES = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 600),0.8f).build();

    public static final FoodComponent COOKED_SQUID_TENTACLES = new FoodComponent.Builder().hunger(4).saturationModifier(0.7F).build();

    public static final FoodComponent HARD_BOILED_EGG = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).snack().meat().build();

    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().hunger(3).saturationModifier(0.7F).meat().build();

    public static final FoodComponent CUPCAKE = new FoodComponent.Builder().hunger(4).saturationModifier(0.2F).build();

    public static final FoodComponent GLOW_SQUID_TENTACLES = new FoodComponent.Builder().hunger(1).saturationModifier(0.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,400),0.6f).build();

    public static final FoodComponent SLIVER_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent ENCHANTED_SLIVER_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,200, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,6000, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent SLIVER_BEETROOT = new FoodComponent.Builder().hunger(2).saturationModifier(1.2F).snack().build();

    public static final FoodComponent ONION = new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).build();

    public static final FoodComponent BEEF_PIE = new FoodComponent.Builder().hunger(10).saturationModifier(0.6F).build();

    public static final FoodComponent CHICKEN_PIE = new FoodComponent.Builder().hunger(10).saturationModifier(0.4F).build();

    public static final FoodComponent APPLE_PIE = new FoodComponent.Builder().hunger(6).saturationModifier(1.2F).build();

    public static final FoodComponent BERRY_PIE = new FoodComponent.Builder().hunger(6).saturationModifier(0.8F).build();

    public static final FoodComponent OMELET = new FoodComponent.Builder().hunger(6).saturationModifier(1.1F).meat().build();

    public static final FoodComponent RAW_OMELET = new FoodComponent.Builder().hunger(2).saturationModifier(0.4F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,600,0),0.2f).meat().build();
}
