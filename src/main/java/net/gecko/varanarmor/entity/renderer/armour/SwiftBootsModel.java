package net.gecko.varanarmor.entity.renderer.armour;

import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.item.armour.model.SwiftBootsItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SwiftBootsModel extends AnimatedGeoModel<SwiftBootsItem> {
    @Override
    public Identifier getModelResource(SwiftBootsItem object) {
        return new Identifier(VaranArmor.MOD_ID, "geo/swift_boots.geo.json");
    }

    @Override
    public Identifier getTextureResource(SwiftBootsItem object) {
        return new Identifier(VaranArmor.MOD_ID,"textures/models/armor/swift_boots_armour.png");
    }

    @Override
    public Identifier getAnimationResource(SwiftBootsItem animatable) {
        return new Identifier(VaranArmor.MOD_ID, "animations/dummy_armour.json");
    }
}
