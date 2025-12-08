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

        itemModelGenerator.register(ArmoryItems.FLINT_ROD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_ROD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_ROD, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.POISONOUS_NEEDLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_WOODEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_STONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_STONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_STONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_STONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_STONE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_IRON_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_GOLDEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_DIAMOND_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_WOODEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_STONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_STONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_STONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_STONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_STONE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_IRON_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_GOLDEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_DIAMOND_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_WOODEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_STONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_STONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_STONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_STONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_STONE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_IRON_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_GOLDEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_DIAMOND_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_WOODEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_STONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_STONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_STONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_STONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_STONE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_IRON_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_GOLDEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_DIAMOND_HOE, Models.HANDHELD);


        itemModelGenerator.register(ArmoryItems.BLAZE_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_WOODEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_STONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_STONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_STONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_STONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_STONE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_IRON_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_GOLDEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_DIAMOND_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_NETHERITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_NETHERITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_NETHERITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_NETHERITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_NETHERITE_HOE, Models.HANDHELD);

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

        itemModelGenerator.register(ArmoryItems.FLINT_WOODEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_STONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_GOLDEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_IRON_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_DIAMOND_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_WOODEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_STONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_GOLDEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_IRON_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_DIAMOND_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_WOODEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_STONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_GOLDEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_IRON_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_DIAMOND_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_WOODEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_STONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_GOLDEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_IRON_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_DIAMOND_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_WOODEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_STONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_GOLDEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_IRON_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_DIAMOND_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_NETHERITE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_NETHERITE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_NETHERITE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_NETHERITE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_NETHERITE_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.NETHERITE_DAGGER, Models.HANDHELD);
        
        itemModelGenerator.register(ArmoryItems.FLINT_WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_WOODEN_DAGGER, Models.HANDHELD);
                
        itemModelGenerator.register(ArmoryItems.FLINT_STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_STONE_DAGGER, Models.HANDHELD);
                
        itemModelGenerator.register(ArmoryItems.FLINT_IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_IRON_DAGGER, Models.HANDHELD);
                
        itemModelGenerator.register(ArmoryItems.FLINT_GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_GOLDEN_DAGGER, Models.HANDHELD);
                
        itemModelGenerator.register(ArmoryItems.FLINT_DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_DIAMOND_DAGGER, Models.HANDHELD);
                
        itemModelGenerator.register(ArmoryItems.FLINT_NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_NETHERITE_DAGGER, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BRACED_STICK, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BRACED_BAMBOO, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.HEAVY_FLINT_ROD, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.HEAVY_LAPIS_ROD, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.HEAVY_QUARTZ_ROD, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.HEAVY_BLAZE_ROD, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.WOODEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.STONE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.IRON_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.GOLDEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.DIAMOND_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.NETHERITE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_WOODEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_STONE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_IRON_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_GOLDEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_DIAMOND_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_NETHERITE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_WOODEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_STONE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_IRON_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_GOLDEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_DIAMOND_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_NETHERITE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_WOODEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_STONE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_IRON_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_GOLDEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_DIAMOND_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_NETHERITE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_WOODEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_STONE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_IRON_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_GOLDEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_DIAMOND_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_NETHERITE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_WOODEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_STONE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_IRON_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_GOLDEN_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_DIAMOND_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_NETHERITE_CLAYMORE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.WOODEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.STONE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.GOLDEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.IRON_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.DIAMOND_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.NETHERITE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        
        itemModelGenerator.register(ArmoryItems.FLINT_WOODEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_STONE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_IRON_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_GOLDEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_DIAMOND_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_NETHERITE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_WOODEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_STONE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_IRON_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_GOLDEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_DIAMOND_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_NETHERITE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_WOODEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_STONE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_IRON_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_GOLDEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_DIAMOND_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_NETHERITE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_WOODEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_STONE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_IRON_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_GOLDEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_DIAMOND_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_NETHERITE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_WOODEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_STONE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_IRON_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_GOLDEN_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_DIAMOND_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_NETHERITE_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.COPPER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.COPPER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.COPPER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_COPPER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_COPPER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_COPPER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_COPPER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_COPPER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_COPPER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_COPPER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_COPPER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_COPPER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_COPPER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_COPPER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_COPPER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_COPPER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_COPPER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_COPPER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_COPPER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_COPPER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_COPPER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_COPPER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_COPPER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

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

        itemModelGenerator.register(ArmoryItems.FLINT_SLIVER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_SLIVER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_SLIVER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_SLIVER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_SLIVER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_SLIVER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_SLIVER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.FLINT_SLIVER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.FLINT_SLIVER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_SLIVER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_SLIVER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_SLIVER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_SLIVER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_SLIVER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_SLIVER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_SLIVER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.LAPIS_SLIVER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_SLIVER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_SLIVER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_SLIVER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_SLIVER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_SLIVER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_SLIVER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_SLIVER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_SLIVER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.QUARTZ_SLIVER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_SLIVER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_SILVER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_SILVER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_SILVER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_SILVER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_SILVER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_SILVER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_SILVER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BAMBOO_SILVER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BAMBOO_SILVER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_SILVER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_SILVER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_SILVER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_SILVER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_SILVER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_SILVER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_SILVER_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BLAZE_SILVER_CLAYMORE, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.BLAZE_SILVER_DOUBLE_AXE, ArmoryModels.BRACED_HANDHELD);

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
