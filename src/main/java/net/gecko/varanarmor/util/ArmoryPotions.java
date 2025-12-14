package net.gecko.varanarmor.util;

import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.effects.ArmoryEffects;
import net.gecko.varanarmor.item.ArmoryItems;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ArmoryPotions {

    public static Potion FATAL_POISON_POTION;
    public static Potion LONG_FATAL_POISON_POTION;

    public static Potion WITHER_POTION;
    public static Potion LONG_WITHER_POTION;

    public static Potion BLINDNESS_POTION;
    public static Potion LONG_BLINDNESS_POTION;

    public static Potion CURSE_POTION;


    public static Potion registerFatalPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(VaranArmor.MOD_ID, name),
                new Potion(new StatusEffectInstance(ArmoryEffects.FATAL_POISON, 420, 0)));
    }
    public static Potion registerLongFatalPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(VaranArmor.MOD_ID, name),
                new Potion(new StatusEffectInstance(ArmoryEffects.FATAL_POISON, 900, 0)));
    }
    public static Potion registerWitherPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(VaranArmor.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.WITHER, 420, 0)));
    }
    public static Potion registerLongWitherPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(VaranArmor.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.WITHER, 900, 0)));
    }
    public static Potion registerBlindnessPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(VaranArmor.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, 1800, 0)));
    }
    public static Potion registerLongBlindnessPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(VaranArmor.MOD_ID, name),
                new Potion(new StatusEffectInstance(ArmoryEffects.CURSE, 4800, 0)));
    }
    public static Potion registerCursePotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(VaranArmor.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, 1800, 0)));
    }
    public static void registerPotions(){
        FATAL_POISON_POTION = registerFatalPotion("fatal_poison_potion");
        LONG_FATAL_POISON_POTION = registerLongFatalPotion("long_fatal_poison_potion");

        WITHER_POTION = registerWitherPotion("wither_potion");
        LONG_WITHER_POTION = registerLongWitherPotion("long_wither_potion");

        BLINDNESS_POTION = registerBlindnessPotion("blindness_potion");
        LONG_BLINDNESS_POTION = registerLongBlindnessPotion("long_blindness_potion");

        CURSE_POTION = registerCursePotion("curse_potion");

        registerPotionRecipes();
    }

    private static void registerPotionRecipes(){
        BrewingRecipeRegistry.registerPotionRecipe(Potions.POISON, ArmoryItems.POISONOUS_NEEDLE, ArmoryPotions.FATAL_POISON_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ArmoryPotions.FATAL_POISON_POTION, Items.REDSTONE, ArmoryPotions.LONG_FATAL_POISON_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.LONG_POISON, ArmoryItems.POISONOUS_NEEDLE, ArmoryPotions.LONG_FATAL_POISON_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, ArmoryItems.POISONOUS_NEEDLE, Potions.POISON);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.MUNDANE, ArmoryItems.POISONOUS_NEEDLE, Potions.POISON);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, ArmoryItems.POISONOUS_NEEDLE, Potions.LONG_POISON);
        BrewingRecipeRegistry.registerPotionRecipe(Potions.THICK, ArmoryItems.POISONOUS_NEEDLE, Potions.STRONG_POISON);

        BrewingRecipeRegistry.registerPotionRecipe(Potions.HARMING, ArmoryItems.WITHER_BONE, ArmoryPotions.WITHER_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ArmoryPotions.WITHER_POTION, Items.REDSTONE, ArmoryPotions.LONG_WITHER_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.INK_SAC, ArmoryPotions.BLINDNESS_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ArmoryPotions.BLINDNESS_POTION, Items.REDSTONE, ArmoryPotions.LONG_BLINDNESS_POTION);

        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.SOUL_SAND, ArmoryPotions.CURSE_POTION);
    }
}
