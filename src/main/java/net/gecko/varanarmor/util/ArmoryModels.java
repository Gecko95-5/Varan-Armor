package net.gecko.varanarmor.util;

import net.gecko.varanarmor.VaranArmor;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ArmoryModels {
    public static final Model BRACED_HANDHELD = registerItemModels("braced_handheld", TextureKey.LAYER0);

    private static Model registerItemModels(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier(VaranArmor.MOD_ID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}
