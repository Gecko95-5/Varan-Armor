package net.gecko.varanarmor.item.components;

import net.gecko.varanarmor.item.ArmoryItems;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;

import java.util.function.Supplier;

public enum ArmoryToolMaterials implements ToolMaterial {
    COPPER (1, 190, 6.5F, 1.0F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    SILVER(2, 378, 7.5F, 2.0F, 18,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    STEEL(2, 1760, 9.5F, 3.5F, 7,
            () -> Ingredient.ofItems(ArmoryItems.STEEL_INGOT)),

    FLINT_WOOD(0, 72, 3.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    FLINT_STONE (1, 189, 5.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    FLINT_COPPER (1, 232, 7.5F, 1.0F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    FLINT_GOLD (0, 20, 13.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    FLINT_IRON (2, 305, 7.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    FLINT_SILVER(2, 231, 8.5F, 2.0F, 18,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    FLINT_DIAMOND (3, 1748,9.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FLINT_NETHERITE (4, 2518,10.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    LAPIS_WOOD(0, 81, 2.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    LAPIS_STONE(1, 89, 4.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    LAPIS_COPPER(1, 331, 6.5F, 1.0F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    LAPIS_GOLD(0, 44, 12.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    LAPIS_IRON(2, 435, 6.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    LAPIS_SILVER(2, 518, 7.5F, 2.0F, 18,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    LAPIS_DIAMOND(3, 1061,8.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    LAPIS_NETHERITE(4, 1381,9.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    QUARTZ_WOOD(0, 101, 1.5F, 0.0F, 17,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    QUARTZ_STONE (1, 224, 3.5F, 1.0F, 7,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    QUARTZ_COPPER(1, 162, 6.0F, 1.0F, 15,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    QUARTZ_GOLD (0, 39, 11.5F, 0.0F, 24,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    QUARTZ_IRON (2, 213, 5.5F, 2.0F, 16,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    QUARTZ_SILVER(2, 926, 7.0F, 2.0F, 20,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    QUARTZ_DIAMOND (3, 2747,7.5F, 3.0F, 12,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    QUARTZ_NETHERITE (4, 3067,8.5F, 4.0F, 17,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    BAMBOO_WOOD(0, 62, 2.0F, 0.5F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    BAMBOO_STONE(1, 62, 4.0F, 1.5F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    BAMBOO_COPPER(1, 89, 6.5F, 1.5F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    BAMBOO_GOLD(0, 27, 12.0F, 0.5F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    BAMBOO_IRON(2, 213, 6.0F, 2.5F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    BAMBOO_SILVER(2, 321, 7.5F, 2.5F, 18,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    BAMBOO_DIAMOND(3, 827,8.0F, 3.5F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    BAMBOO_NETHERITE(4, 955,9.0F, 4.5F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    BLAZE_WOOD(0, 47, 2.0F, 1.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    BLAZE_STONE (1, 199, 4.0F, 2.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    BLAZE_COPPER (1, 289, 6.5F, 2.0F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    BLAZE_GOLD (0, 49, 12.0F, 1.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    BLAZE_IRON (2, 380, 6.0F, 3.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    BLAZE_SILVER(2, 575, 7.5F, 3.0F, 18,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    BLAZE_DIAMOND (3, 2638,8.0F, 4.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    BLAZE_NETHERITE (4, 2681,9.0F, 5.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    HEAVY_WOOD (0, 76,1.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    HEAVY_STONE (1, 168,3.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    HEAVY_COPPER (1, 243, 5.5F, 1.0F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    HEAVY_GOLD (0, 41,11.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    HEAVY_IRON (2, 320,5.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    HEAVY_SILVER(2, 484, 6.5F, 2.0F, 18,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    HEAVY_DIAMOND (3, 1998,7.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    HEAVY_STEEL (2, 2253,7.5F, 3.5F, 7,
            () -> Ingredient.ofItems(ArmoryItems.STEEL_INGOT)),
    HEAVY_NETHERITE (4, 2600,8.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    HEAVY_FLINT_WOOD (0, 83,2.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    HEAVY_FLINT_STONE (1, 225,4.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    HEAVY_FLINT_COPPER (1, 266, 7.0F, 1.0F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    HEAVY_FLINT_GOLD (0, 29,12.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    HEAVY_FLINT_IRON (2, 350,6.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    HEAVY_FLINT_SILVER(2, 348, 9.0F, 2.0F, 18,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    HEAVY_FLINT_DIAMOND (3, 2185,8.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    HEAVY_FLINT_NETHERITE (4, 3087,9.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    HEAVY_LAPIS_WOOD(0, 97,1.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    HEAVY_LAPIS_STONE(1, 126,3.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    HEAVY_LAPIS_COPPER (1, 384, 6.0F, 1.0F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    HEAVY_LAPIS_GOLD(0, 53,11.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    HEAVY_LAPIS_IRON(2, 505,5.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    HEAVY_LAPIS_SILVER(2, 624, 8.0F, 2.0F, 18,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    HEAVY_LAPIS_DIAMOND(3, 1499,7.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    HEAVY_LAPIS_NETHERITE(4, 1950,8.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    HEAVY_QUARTZ_WOOD (0, 117,0.0F, 0.0F, 17,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    HEAVY_QUARTZ_STONE (1, 261,2.0F, 1.0F, 7,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    HEAVY_QUARTZ_COPPER (1, 215, 5.0F, 1.0F, 15,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    HEAVY_QUARTZ_GOLD (0, 72,10.0F, 0.0F, 24,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    HEAVY_QUARTZ_IRON (2, 283,4.0F, 2.0F, 16,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    HEAVY_QUARTZ_SILVER(2, 847, 7.0F, 2.0F, 20,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    HEAVY_QUARTZ_DIAMOND (3, 3028,6.0F, 3.0F, 12,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    HEAVY_QUARTZ_NETHERITE (4, 3635,7.0F, 4.0F, 17,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    HEAVY_BAMBOO_WOOD(0, 78,1.0F, 0.5F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    HEAVY_BAMBOO_STONE(1, 93,3.0F, 1.5F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    HEAVY_BAMBOO_COPPER (1, 135, 6.0F, 1.5F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    HEAVY_BAMBOO_GOLD(0, 32,11.0F, 0.5F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    HEAVY_BAMBOO_IRON(2, 253,5.0F, 2.5F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    HEAVY_BAMBOO_SILVER(2, 382, 8.0F, 2.5F, 18,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    HEAVY_BAMBOO_DIAMOND(3, 1577,7.0F, 3.5F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    HEAVY_BAMBOO_NETHERITE(4, 1442,8.0F, 4.5F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    HEAVY_BLAZE_WOOD (0, 53,1.0F, 1.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    HEAVY_BLAZE_STONE (1, 229,3.0F, 2.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    HEAVY_BLAZE_COPPER (1, 266, 6.0F, 2.0F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    HEAVY_BLAZE_GOLD (0, 29,11.0F, 1.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    HEAVY_BLAZE_IRON (2, 350,5.0F, 3.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    HEAVY_BLAZE_SILVER(2, 348, 8.0F, 3.0F, 18,
            () -> Ingredient.ofItems(ArmoryItems.SLIVER_INGOT)),
    HEAVY_BLAZE_DIAMOND (3, 2185,7.0F, 4.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    HEAVY_BLAZE_NETHERITE (4, 3087,8.0F, 5.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    FIREBRAND (3, 1748,5.0F, 3.0F, 6,
            () -> Ingredient.ofItems(ArmoryItems.WITHER_BONE)),

    HEARTSTEALER (3, 742,0.0F, 3.5F, 8,
            () -> Ingredient.ofItems(Items.GHAST_TEAR)),

    OBSIDASTROM (3, 3120,0.0F, 4.0F, 12,
            () -> Ingredient.ofItems(Items.GHAST_TEAR)),

    SPINDTOX (3, 562,2.0F, 0.0F, 2,
            () -> Ingredient.ofItems(ArmoryItems.POISONOUS_NEEDLE));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ArmoryToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
