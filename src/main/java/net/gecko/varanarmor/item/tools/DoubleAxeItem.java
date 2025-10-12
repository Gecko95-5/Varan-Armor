package net.gecko.varanarmor.item.tools;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class DoubleAxeItem extends AxeItem {
    private final int weaknessDuration;
    private final int weaknessAmplifier;
    private final int entityDurabilityTaken;

    public DoubleAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, int duration, int amplifier, int entityDurability, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.weaknessDuration = duration;
        this.weaknessAmplifier = amplifier;
        this.entityDurabilityTaken = entityDurability;
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.getMainHandStack().isDamageable()) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, weaknessDuration, weaknessAmplifier));
        } else {
            target.getMainHandStack().damage(entityDurabilityTaken, target, t -> t.sendToolBreakStatus(target.preferredHand));
            stack.damage(24, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
        return super.postHit(stack, target, attacker);
    }
}
