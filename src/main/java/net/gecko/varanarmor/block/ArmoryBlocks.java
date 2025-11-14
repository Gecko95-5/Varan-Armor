package net.gecko.varanarmor.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.item.ArmoryItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ArmoryBlocks {

    public static final Block SLIVER_BLOCK = registerBlock("sliver_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.LIGHT_BLUE_GRAY)),
            ArmoryItemGroup.VARAN_ARMOR);

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name,block,tab);
        return Registry.register(Registry.BLOCK,new Identifier(VaranArmor.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM,new Identifier(VaranArmor.MOD_ID, name),
                new BlockItem(block, new Item.Settings().group(tab)));
    }

    public static void registerArmoryBlocks(){
        VaranArmor.LOGGER.debug("Registering Blocks for " + VaranArmor.MOD_ID);
    }
}
