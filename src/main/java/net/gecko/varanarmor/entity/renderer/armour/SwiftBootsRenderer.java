package net.gecko.varanarmor.entity.renderer.armour;

import net.gecko.varanarmor.item.armour.model.SwiftBootsItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SwiftBootsRenderer extends GeoArmorRenderer<SwiftBootsItem> {
    public SwiftBootsRenderer() {
        super(new SwiftBootsModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.leftLegBone = "armorLeftLeg";
        this.rightLegBone = "armorRightLeg";
        this.leftBootBone = "armorLeftBoot";
        this.rightBootBone = "armorRightBoot";
    }
}
