package net.gecko.varanarmor.item.components;

import net.gecko.varanarmor.item.ArmoryItems;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;

import java.util.function.Supplier;

public enum ArmoryToolMaterials implements ToolMaterial {
    COPPER (1, 190, 5.0F, 1.0F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),

    FLINT_WOOD(0, 72, 3.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    FLINT_STONE (1, 189, 5.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    FLINT_GOLD (0, 39, 13.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    FLINT_IRON (2, 153, 7.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    FLINT_DIAMOND (3, 1748,9.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FLINT_NETHERITE (4, 3371,10.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    LAPIS_WOOD(0, 81, 2.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    LAPIS_STONE(1, 89, 4.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    LAPIS_GOLD(0, 44, 12.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    LAPIS_IRON(2, 435, 6.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    LAPIS_DIAMOND(3, 1061,8.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    LAPIS_NETHERITE(4, 1381,9.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    QUARTZ_WOOD(0, 101, 1.5F, 0.0F, 17,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    QUARTZ_STONE (1, 224, 3.5F, 1.0F, 7,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    QUARTZ_GOLD (0, 39, 11.5F, 0.0F, 24,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    QUARTZ_IRON (2, 213, 5.5F, 2.0F, 16,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    QUARTZ_DIAMOND (3, 2747,7.5F, 3.0F, 12,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    QUARTZ_NETHERITE (4, 3067,8.5F, 4.0F, 17,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    HEAVY_WOOD (0, 76,1.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    HEAVY_STONE (1, 168,3.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    HEAVY_COPPER (1, 243, 4.0F, 1.0F, 13,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    HEAVY_GOLD (0, 41,11.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    HEAVY_IRON (2, 320,5.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    HEAVY_DIAMOND (3, 1998,7.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    HEAVY_NETHERITE (4, 2600,8.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    HEAVY_FLINT_WOOD (0, 83,2.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    HEAVY_FLINT_STONE (1, 225,4.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    HEAVY_FLINT_GOLD (0, 45,12.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    HEAVY_FLINT_IRON (2, 223,6.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    HEAVY_FLINT_DIAMOND (3, 2185,8.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    HEAVY_FLINT_NETHERITE (4, 3940,9.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    HEAVY_LAPIS_WOOD(0, 97,1.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    HEAVY_LAPIS_STONE(1, 126,3.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    HEAVY_LAPIS_GOLD(0, 53,11.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    HEAVY_LAPIS_IRON(2, 505,5.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    HEAVY_LAPIS_DIAMOND(3, 1499,7.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    HEAVY_LAPIS_NETHERITE(4, 1950,8.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    HEAVY_QUARTZ_WOOD (0, 117,0.0F, 0.0F, 17,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    HEAVY_QUARTZ_STONE (1, 261,2.0F, 1.0F, 7,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    HEAVY_QUARTZ_GOLD (0, 72,10.0F, 0.0F, 24,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    HEAVY_QUARTZ_IRON (2, 283,4.0F, 2.0F, 16,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    HEAVY_QUARTZ_DIAMOND (3, 3028,6.0F, 3.0F, 12,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    HEAVY_QUARTZ_NETHERITE (4, 3635,7.0F, 4.0F, 17,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    FIREBRAND (3, 1748,5.0F, 3.0F, 6,
                           () -> Ingredient.ofItems(ArmoryItems.WITHER_BONE)),

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
