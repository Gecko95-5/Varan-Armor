package net.gecko.varanarmor.entity.renderer.armour;

import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.item.armour.model.ParachutePantsItem;
import net.gecko.varanarmor.item.armour.model.SwiftBootsItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ParachutePantsModel extends AnimatedGeoModel<ParachutePantsItem> {
    @Override
    public Identifier getModelResource(ParachutePantsItem object) {
        return new Identifier(VaranArmor.MOD_ID, "geo/parachute_pants.geo.json");
    }

    @Override
    public Identifier getTextureResource(ParachutePantsItem object) {
        return new Identifier(VaranArmor.MOD_ID,"textures/models/armour/parachute_pants.png");
    }

    @Override
    public Identifier getAnimationResource(ParachutePantsItem animatable) {
        return new Identifier(VaranArmor.MOD_ID, "animations/dummy_armour.json");
    }
}
