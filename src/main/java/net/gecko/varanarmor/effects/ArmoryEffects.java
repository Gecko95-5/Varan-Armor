package net.gecko.varanarmor.effects;

import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.effects.statuseffects.FatalPoisonEffect;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ArmoryEffects{

    public static StatusEffect FATAL_POISON = register("fatal_poison",new FatalPoisonEffect(StatusEffectCategory.HARMFUL,0x3fd11b, -4.0)
            .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "55FCED67-E92A-486E-9800-B47F202C4386",
                     0.0, EntityAttributeModifier.Operation.ADDITION));

    private static StatusEffect register(String name, StatusEffect effect) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(VaranArmor.MOD_ID,name),effect);
    }
    public static void registerArmoryEffects() {
        VaranArmor.LOGGER.debug("Registering Effect for" + VaranArmor.MOD_ID);
    }
}
