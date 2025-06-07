package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gecko.varanarmor.item.DecoItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class DecoModelProvider extends FabricModelProvider {
    public DecoModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DecoItems.COPPER_NUGGET, Models.GENERATED);

        itemModelGenerator.register(DecoItems.FLINT_ROD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_ROD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_ROD, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.FLINT_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_WOODEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.FLINT_STONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_STONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_STONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_STONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_STONE_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.FLINT_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_IRON_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.FLINT_GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_GOLDEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.FLINT_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_DIAMOND_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.COPPER_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_WOODEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.COPPER_STONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_STONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_STONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_STONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_STONE_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.COPPER_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_IRON_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.COPPER_GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_GOLDEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.COPPER_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_DIAMOND_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.QUARTZ_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_WOODEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.QUARTZ_STONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_STONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_STONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_STONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_STONE_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.QUARTZ_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_IRON_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.QUARTZ_GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_GOLDEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.QUARTZ_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_DIAMOND_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.FLINT_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.FLINT_NETHERITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.COPPER_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.COPPER_NETHERITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.QUARTZ_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DecoItems.QUARTZ_NETHERITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(DecoItems.IRON_ARROW, Models.GENERATED);
        itemModelGenerator.register(DecoItems.AMETHYST_ARROW, Models.GENERATED);
        itemModelGenerator.register(DecoItems.QUARTZ_ARROW, Models.GENERATED);
        itemModelGenerator.register(DecoItems.NETHER_ARROW, Models.GENERATED);

        itemModelGenerator.register(DecoItems.GOLDEN_FEATHER, Models.GENERATED);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }
}
