package net.gecko.varanarmor.entity.renderer.armour;

import net.gecko.varanarmor.item.armour.model.MiningGooglesItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MiningGooglesRenderer extends GeoArmorRenderer<MiningGooglesItem> {
    public MiningGooglesRenderer() {
        super(new MiningGooglesModel());

        this.headBone = "armorHead";
    }
}
