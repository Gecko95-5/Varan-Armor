package net.gecko.varanarmor.item.components;

import net.gecko.varanarmor.VaranArmor;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ArmoryArmourMaterials implements ArmorMaterial {
    SWIFT("swift", 12, new int[] { 2, 0, 0, 0}, 9,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, 0f, () -> Ingredient.ofItems(Items.LAPIS_LAZULI)),

    GOOGLES("googles", 6, new int[] { 0, 0, 0, 1}, 6,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0f, 0f, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),

    BRACER("bracer", 15, new int[] { 0, 0, 4, 0}, 2,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.ofItems(Items.IRON_BARS)),

    PARACHUTE("parachute", 10, new int[] { 0, 2, 0, 0}, 12,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, 0f, () -> Ingredient.ofItems(Items.PHANTOM_MEMBRANE));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final  int[] BASE_DURABILITY = { 11, 16, 15, 13};

    ArmoryArmourMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                          float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return VaranArmor.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}