package net.gecko.varanarmor.entity.renderer.armour;

import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.item.armour.model.MiningGooglesItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MiningGooglesModel extends AnimatedGeoModel<MiningGooglesItem> {
    @Override
    public Identifier getModelResource(MiningGooglesItem object) {
        return new Identifier(VaranArmor.MOD_ID, "geo/mining_googles.geo.json");
    }

    @Override
    public Identifier getTextureResource(MiningGooglesItem object) {
        return new Identifier(VaranArmor.MOD_ID,"textures/models/armour/mining_googles.png");
    }

    @Override
    public Identifier getAnimationResource(MiningGooglesItem animatable) {
        return new Identifier(VaranArmor.MOD_ID, "animations/dummy_armour.json");
    }
}
