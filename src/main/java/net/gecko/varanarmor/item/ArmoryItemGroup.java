package net.gecko.varanarmor.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gecko.varanarmor.VaranArmor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ArmoryItemGroup {
    public static final ItemGroup VARAN_ARMOR = FabricItemGroupBuilder.build(
            new Identifier(VaranArmor.MOD_ID,"varan_armor"), () -> new ItemStack(ArmoryItems.COPPER_CLAYMORE));
}
