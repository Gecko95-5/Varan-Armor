package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
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

        itemModelGenerator.register(ArmoryItems.FLINT_NETHERITE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_NETHERITE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_NETHERITE_SICKLE, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.NETHERITE_DAGGER, Models.HANDHELD);
        
        itemModelGenerator.register(ArmoryItems.FLINT_WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_WOODEN_DAGGER, Models.HANDHELD);
                
        itemModelGenerator.register(ArmoryItems.FLINT_STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_STONE_DAGGER, Models.HANDHELD);
                
        itemModelGenerator.register(ArmoryItems.FLINT_IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_IRON_DAGGER, Models.HANDHELD);
                
        itemModelGenerator.register(ArmoryItems.FLINT_GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_GOLDEN_DAGGER, Models.HANDHELD);
                
        itemModelGenerator.register(ArmoryItems.FLINT_DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_DIAMOND_DAGGER, Models.HANDHELD);
                
        itemModelGenerator.register(ArmoryItems.FLINT_NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.LAPIS_NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.QUARTZ_NETHERITE_DAGGER, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.BRACED_STICK, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.HEAVY_FLINT_ROD, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.HEAVY_LAPIS_ROD, ArmoryModels.BRACED_HANDHELD);
        itemModelGenerator.register(ArmoryItems.HEAVY_QUARTZ_ROD, ArmoryModels.BRACED_HANDHELD);

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


        itemModelGenerator.register(ArmoryItems.SPINDTOX, Models.HANDHELD);

        itemModelGenerator.register(ArmoryItems.SWIFT_BOOTS,Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.BRACER_SUIT,Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.MINING_GOOGLES,Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.PARACHUTE_PANTS,Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.HARD_BOILED_EGG,Models.GENERATED);
        itemModelGenerator.register(ArmoryItems.FRIED_EGG,Models.GENERATED);

        itemModelGenerator.register(ArmoryItems.WITHER_BONE, Models.HANDHELD);
        itemModelGenerator.register(ArmoryItems.FIREBRAND, Models.HANDHELD);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }
}
