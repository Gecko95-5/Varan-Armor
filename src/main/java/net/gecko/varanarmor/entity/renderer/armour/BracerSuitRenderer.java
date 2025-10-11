package net.gecko.varanarmor.entity.renderer.armour;

import net.gecko.varanarmor.item.armour.model.BracerSuitItem;
import net.gecko.varanarmor.item.armour.model.MiningGooglesItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BracerSuitRenderer extends GeoArmorRenderer<BracerSuitItem> {
    public BracerSuitRenderer() {
        super(new BracerSuitModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
    }
}
