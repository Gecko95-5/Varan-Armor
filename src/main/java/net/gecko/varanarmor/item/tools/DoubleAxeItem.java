package net.gecko.varanarmor.item.tools;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class DoubleAxeItem extends AxeItem {
    private final int slownessDuration;
    private final int slownessAmplifier;

    public DoubleAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, int duration, int amplifier, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        slownessDuration = duration;
        slownessAmplifier = amplifier;

    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200,0));
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, slownessDuration, slownessAmplifier));
//        if (!target.getMainHandStack().isDamageable()) {
//        } else {
//            target.getMainHandStack().damage(25, target, t -> t.sendToolBreakStatus(target.preferredHand));
//            stack.damage(24, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
//        }
        return super.postHit(stack, target, attacker);
    }
}
