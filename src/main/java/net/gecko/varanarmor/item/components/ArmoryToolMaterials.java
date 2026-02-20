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
