package net.gecko.varanarmor.item.tools.special;

import net.gecko.varanarmor.effects.ArmoryEffects;
import net.gecko.varanarmor.item.tools.ClaymoreItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class ObsidastromItem extends ClaymoreItem {
    public ObsidastromItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, int duration, int amplifier, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, duration, amplifier, settings);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
            target.addStatusEffect(new StatusEffectInstance(ArmoryEffects.CURSE,600,0),attacker);
        return super.postHit(stack, target, attacker);
    }
}
