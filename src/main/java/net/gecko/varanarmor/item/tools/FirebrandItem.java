package net.gecko.varanarmor.item.tools;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class FirebrandItem extends AxeItem {
    public FirebrandItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.isOnFire()){
            target.extinguish();
            target.damage(DamageSource.GENERIC,5);
        } else {
            target.setOnFireFor(5);
        }
        return true;
    }
}
