package net.gecko.varanarmor.item.tools.special;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class HeartstealerItem extends SwordItem {
    public HeartstealerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        float health = attacker.getHealth();
        float maxHealth = attacker.getMaxHealth();
        if (health <= maxHealth/2) {
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,100,0));
        } else {
            attacker.damage(DamageSource.MAGIC,2);
            target.damage(DamageSource.MAGIC,4);
        }

        return super.postHit(stack, target, attacker);
    }
}
