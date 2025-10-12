package net.gecko.varanarmor.entity.renderer.armour;

import net.gecko.varanarmor.item.armour.model.ParachutePantsItem;
import net.gecko.varanarmor.item.armour.model.SwiftBootsItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ParachutePantsRenderer extends GeoArmorRenderer<ParachutePantsItem> {
    public ParachutePantsRenderer() {
        super(new ParachutePantsModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.leftLegBone = "armorLeftLeg";
        this.rightLegBone = "armorRightLeg";
    }
}
