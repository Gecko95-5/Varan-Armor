package net.gecko.varanarmor.mixin;

import net.fabricmc.fabric.mixin.transfer.ItemMixin;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BowItem.class)
public abstract class BowItemMixin extends RangedWeaponItem implements Vanishable {

    public BowItemMixin(Settings settings) {
        super(settings);
    }

    @Override
    public int getEnchantability() {
        return 14;
    }
}
