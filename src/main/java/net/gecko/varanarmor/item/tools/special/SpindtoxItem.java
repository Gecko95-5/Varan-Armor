package net.gecko.varanarmor.item.tools.special;

import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SpindtoxItem extends SwordItem {
    public SpindtoxItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.getGroup() == EntityGroup.UNDEAD) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,200,0),attacker);
        } else if (target.getGroup() == EntityGroup.ARTHROPOD) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,200,0),attacker);
        } else {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON,200,0),attacker);
        }
        return super.postHit(stack, target, attacker);
    }
}
