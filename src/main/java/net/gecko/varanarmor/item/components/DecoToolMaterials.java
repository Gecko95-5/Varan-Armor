package net.gecko.varanarmor.item.components;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;

import java.util.function.Supplier;

public enum DecoToolMaterials implements ToolMaterial {
    FLINT_WOOD(0, 72, 3.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    FLINT_STONE (0, 189, 5.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    FLINT_GOLD (0, 39, 13.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    FLINT_IRON (0, 153, 7.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    FLINT_DIAMOND (0, 1748,9.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    COPPER_WOOD(0, 81, 2.0F, 0.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    COPPER_STONE (0, 89, 4.0F, 1.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    COPPER_GOLD (0, 44, 12.0F, 0.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    COPPER_IRON (0, 435, 6.0F, 2.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    COPPER_DIAMOND (0, 1061,8.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    QUARTZ_WOOD(0, 101, 1.5F, 0.0F, 17,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    QUARTZ_STONE (0, 224, 3.5F, 1.0F, 7,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    QUARTZ_GOLD (0, 39, 11.5F, 0.0F, 24,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    QUARTZ_IRON (0, 213, 5.5F, 2.0F, 16,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    QUARTZ_DIAMOND (0, 2747,7.5F, 3.0F, 12,
            () -> Ingredient.ofItems(Items.DIAMOND));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    DecoToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
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
