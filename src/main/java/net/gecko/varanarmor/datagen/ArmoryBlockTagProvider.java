package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varanarmor.util.ArmoryTags;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;

public class ArmoryBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ArmoryBlockTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ArmoryTags.Blocks.SICKLES_MINEABLE)
                .forceAddTag(BlockTags.HOE_MINEABLE)
                .forceAddTag(BlockTags.SAPLINGS)
                .forceAddTag(BlockTags.FLOWERS)
                .forceAddTag(BlockTags.CROPS)
                .forceAddTag(BlockTags.REPLACEABLE_PLANTS)
                .forceAddTag(BlockTags.FROG_PREFER_JUMP_TO)
                .add(Blocks.PUMPKIN)
                .add(Blocks.MELON)
                .add(Blocks.SMALL_DRIPLEAF)
                .add(Blocks.BIG_DRIPLEAF_STEM)
                .add(Blocks.SWEET_BERRY_BUSH)
                .add(Blocks.CAVE_VINES)
                .add(Blocks.CAVE_VINES_PLANT)
                .add(Blocks.CRIMSON_ROOTS)
                .add(Blocks.WARPED_ROOTS)
                .add(Blocks.NETHER_SPROUTS)
                .add(Blocks.NETHER_WART)
                .add(Blocks.TWISTING_VINES)
                .add(Blocks.WEEPING_VINES)
                .add(Blocks.TWISTING_VINES_PLANT)
                .add(Blocks.WEEPING_VINES_PLANT)
                .add(Blocks.MANGROVE_ROOTS)
                .add(Blocks.RED_MUSHROOM)
                .add(Blocks.BROWN_MUSHROOM)
                .add(Blocks.CRIMSON_FUNGUS)
                .add(Blocks.WARPED_FUNGUS)
                .add(Blocks.INFESTED_COBBLESTONE)
                .add(Blocks.INFESTED_STONE)
                .add(Blocks.INFESTED_MOSSY_STONE_BRICKS)
                .add(Blocks.INFESTED_CHISELED_STONE_BRICKS)
                .add(Blocks.INFESTED_STONE_BRICKS)
                .add(Blocks.INFESTED_CRACKED_STONE_BRICKS)
                .add(Blocks.INFESTED_DEEPSLATE);
    }
}
