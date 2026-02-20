package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gecko.varanarmor.block.ArmoryBlocks;
import net.gecko.varanarmor.block.custom.OnionBlock;
import net.gecko.varanarmor.item.ArmoryItems;
import net.gecko.varanarmor.util.ArmoryModels;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ArmoryModelProvider extends FabricModelProvider {
    public ArmoryModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ArmoryItems.POISONOUS_NEEDLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.IRON_ARROW, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.AMETHYST_ARROW, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.QUARTZ_ARROW, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.NETHER_ARROW, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.GOLDEN_FEATHER, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.SQUID_TENTACLES, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.GLOW_SQUID_TENTACLES, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.COOKED_SQUID_TENTACLES, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.WOODEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.STONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.GOLDEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.IRON_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.DIAMOND_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.NETHERITE_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.NETHERITE_DAGGER, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BRACED_STICK, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.WOODEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.STONE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.IRON_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.GOLDEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.DIAMOND_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.NETHERITE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.WOODEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.STONE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.GOLDEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.IRON_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.DIAMOND_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.NETHERITE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.COPPER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.COPPER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.SPINDTOX, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.SWIFT_BOOTS,Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.BRACER_SUIT,Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.MINING_GOOGLES,Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.PARACHUTE_PANTS,Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.HARD_BOILED_EGG,Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.FRIED_EGG,Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.WITHER_BONE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FIREBRAND, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.COPPER_HELMET, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.COPPER_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.COPPER_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.COPPER_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.SLIVER_HELMET, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.SLIVER_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.SLIVER_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.SLIVER_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.TANNED_LEATHER, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.MOLTEN_IRON, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.IRON_PLATE, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.HIGHLAND_HELMET, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.HIGHLAND_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.HIGHLAND_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.HIGHLAND_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.STALWART_HELMET, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.STALWART_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.STALWART_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.STALWART_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.SLIVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.SLIVER_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.SLIVER_APPLE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.ENCHANTED_SLIVER_APPLE, ArmoryItems.SLIVER_APPLE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.SLIVER_BEETROOT, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.SLIVER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.SLIVER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.SLIVER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.SLIVER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.SLIVER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.SLIVER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.SLIVER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.SLIVER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.SLIVER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.STEEL_COMPOUND, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.STEEL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.STEEL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.STEEL_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.STEEL_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.STEEL_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.STEEL_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.OBSIDASTROM, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.OAK_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.OAK_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.OAK_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.OAK_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.OAK_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.OAK_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.OAK_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.OAK_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.OAK_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.SPRUCE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.SPRUCE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.SPRUCE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.SPRUCE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.SPRUCE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.SPRUCE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.SPRUCE_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.SPRUCE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.SPRUCE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.BIRCH_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BIRCH_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BIRCH_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BIRCH_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BIRCH_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BIRCH_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BIRCH_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BIRCH_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BIRCH_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.JUNGLE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.JUNGLE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.JUNGLE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.JUNGLE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.JUNGLE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.JUNGLE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.JUNGLE_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.JUNGLE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.JUNGLE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.ACACIA_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.ACACIA_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.ACACIA_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.ACACIA_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.ACACIA_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.ACACIA_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.ACACIA_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.ACACIA_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.ACACIA_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.CRIMSON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.CRIMSON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.CRIMSON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.CRIMSON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.CRIMSON_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.CRIMSON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.CRIMSON_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.CRIMSON_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.CRIMSON_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.ONION, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.BEEF_PIE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.CHICKEN_PIE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.APPLE_PIE,Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.BERRY_PIE,Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.RAW_OMELET, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.COOKED_OMELET, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.WHITE_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.RED_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.ORANGE_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.YELLOW_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.LIME_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.GREEN_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.CYAN_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.LIGHT_BLUE_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.BLUE_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.PURPLE_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.MAGENTA_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.PINK_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.LIGHT_GRAY_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.GRAY_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.BLACK_CUPCAKE, Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.BROWN_CUPCAKE, Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.HEARTSTEALER, Models.HANDHELD);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ArmoryBlocks.SLIVER_BLOCK);

        blockStateModelGenerator.registerCrop(ArmoryBlocks.ONIONS, OnionBlock.AGE,0,1,2,3,4,5,6,7);
    }
}
