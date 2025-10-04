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

    public static StatusEffect FATAL_POISON = register("fatal_poison",
            new FatalPoisonEffect(StatusEffectCategory.HARMFUL,0x3fd11b));

    private static StatusEffect register(String name, StatusEffect effect) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(VaranArmor.MOD_ID,name),effect);
    }
    public static void registerArmoryEffects() {
        VaranArmor.LOGGER.debug("Registering Effect for" + VaranArmor.MOD_ID);
    }
}
