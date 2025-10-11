package net.gecko.varanarmor.entity.renderer.armour;

import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.item.armour.model.BracerSuitItem;
import net.gecko.varanarmor.item.armour.model.MiningGooglesItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BracerSuitModel extends AnimatedGeoModel<BracerSuitItem> {
    @Override
    public Identifier getModelResource(BracerSuitItem object) {
        return new Identifier(VaranArmor.MOD_ID, "geo/bracer_suit.geo.json");
    }

    @Override
    public Identifier getTextureResource(BracerSuitItem object) {
        return new Identifier(VaranArmor.MOD_ID,"textures/models/armour/bracer_suit.png");
    }

    @Override
    public Identifier getAnimationResource(BracerSuitItem animatable) {
        return new Identifier(VaranArmor.MOD_ID, "animations/dummy_armour.json");
    }
}
