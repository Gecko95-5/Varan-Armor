package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varanarmor.item.ArmoryItems;
import net.gecko.varanarmor.util.ArmoryTags;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;

public class ArmoryItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ArmoryItemTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ItemTags.ARROWS)
                .add(ArmoryItems.IRON_ARROW)
                .add(ArmoryItems.AMETHYST_ARROW)
                .add(ArmoryItems.QUARTZ_ARROW)
                .add(ArmoryItems.NETHER_ARROW);

    getOrCreateTagBuilder(ArmoryTags.Items.HARVESTERS)
            .addTag(ArmoryTags.Items.SICKLES)
            .addTag(ArmoryTags.Items.HOES);

        getOrCreateTagBuilder(ArmoryTags.Items.AXES)
                .addTag(ArmoryTags.Items.SINGLE_AXES)
                .addTag(ArmoryTags.Items.DOUBLE_AXES);

    getOrCreateTagBuilder(ArmoryTags.Items.SICKLES)
            .addTag(ArmoryTags.Items.WOODEN_SICKLES)
            .add(ArmoryItems.STONE_SICKLE)
            .add(ArmoryItems.IRON_SICKLE)
            .add(ArmoryItems.GOLDEN_SICKLE)
            .add(ArmoryItems.DIAMOND_SICKLE)
            .add(ArmoryItems.NETHERITE_SICKLE)
            .add(ArmoryItems.COPPER_SICKLE)
            .add(ArmoryItems.SLIVER_SICKLE)
            .add(ArmoryItems.STEEL_SICKLE);

        getOrCreateTagBuilder(ArmoryTags.Items.WOODEN_SICKLES)
                .add(ArmoryItems.WOODEN_SICKLE)
                .add(ArmoryItems.OAK_SICKLE)
                .add(ArmoryItems.SPRUCE_SICKLE)
                .add(ArmoryItems.BIRCH_SICKLE)
                .add(ArmoryItems.JUNGLE_SICKLE)
                .add(ArmoryItems.ACACIA_SICKLE)
                .add(ArmoryItems.DARK_OAK_SICKLE)
                .add(ArmoryItems.MANGROVE_SICKLE)
                .add(ArmoryItems.CRIMSON_SICKLE)
                .add(ArmoryItems.WARPED_SICKLE);

        getOrCreateTagBuilder(ArmoryTags.Items.CLAYMORES)
                .addTag(ArmoryTags.Items.WOODEN_CLAYMORES)
                .add(ArmoryItems.STONE_CLAYMORE)
                .add(ArmoryItems.IRON_CLAYMORE)
                .add(ArmoryItems.GOLDEN_CLAYMORE)
                .add(ArmoryItems.DIAMOND_CLAYMORE)
                .add(ArmoryItems.NETHERITE_CLAYMORE)
                .add(ArmoryItems.COPPER_CLAYMORE)
                .add(ArmoryItems.SLIVER_CLAYMORE)
                .add(ArmoryItems.STEEL_CLAYMORE);

        getOrCreateTagBuilder(ArmoryTags.Items.WOODEN_CLAYMORES)
                .add(ArmoryItems.WOODEN_CLAYMORE)
                .add(ArmoryItems.OAK_CLAYMORE)
                .add(ArmoryItems.SPRUCE_CLAYMORE)
                .add(ArmoryItems.BIRCH_CLAYMORE)
                .add(ArmoryItems.JUNGLE_CLAYMORE)
                .add(ArmoryItems.ACACIA_CLAYMORE)
                .add(ArmoryItems.DARK_OAK_CLAYMORE)
                .add(ArmoryItems.MANGROVE_CLAYMORE)
                .add(ArmoryItems.CRIMSON_CLAYMORE)
                .add(ArmoryItems.WARPED_CLAYMORE);

        getOrCreateTagBuilder(ArmoryTags.Items.DAGGERS)
                .addTag(ArmoryTags.Items.WOODEN_DAGGERS)
                .add(ArmoryItems.STONE_DAGGER)
                .add(ArmoryItems.IRON_DAGGER)
                .add(ArmoryItems.GOLDEN_DAGGER)
                .add(ArmoryItems.DIAMOND_DAGGER)
                .add(ArmoryItems.NETHERITE_DAGGER)
                .add(ArmoryItems.COPPER_DAGGER)
                .add(ArmoryItems.SLIVER_DAGGER)
                .add(ArmoryItems.STEEL_DAGGER)
                .add(ArmoryItems.SPINDTOX);

        getOrCreateTagBuilder(ArmoryTags.Items.WOODEN_DAGGERS)
                .add(ArmoryItems.WOODEN_DAGGER)
                .add(ArmoryItems.OAK_DAGGER)
                .add(ArmoryItems.SPRUCE_DAGGER)
                .add(ArmoryItems.BIRCH_DAGGER)
                .add(ArmoryItems.JUNGLE_DAGGER)
                .add(ArmoryItems.ACACIA_DAGGER)
                .add(ArmoryItems.DARK_OAK_DAGGER)
                .add(ArmoryItems.MANGROVE_DAGGER)
                .add(ArmoryItems.CRIMSON_DAGGER)
                .add(ArmoryItems.WARPED_DAGGER);

    getOrCreateTagBuilder(ArmoryTags.Items.BLADES)
            .addTag(ArmoryTags.Items.CLAYMORES)
            .addTag(ArmoryTags.Items.DAGGERS)
            .addTag(ArmoryTags.Items.SWORDS);

    getOrCreateTagBuilder(ArmoryTags.Items.SWORDS)
            .addTag(ArmoryTags.Items.WOODEN_SWORDS)
            .add(Items.STONE_SWORD)
            .add(Items.IRON_SWORD)
            .add(Items.GOLDEN_SWORD)
            .add(Items.DIAMOND_SWORD)
            .add(Items.NETHERITE_SWORD)
            .add(ArmoryItems.COPPER_SWORD)
            .add(ArmoryItems.SLIVER_SWORD)
            .add(ArmoryItems.STEEL_SWORD)
            .add(ArmoryItems.HEARTSTEALER);

        getOrCreateTagBuilder(ArmoryTags.Items.WOODEN_SWORDS)
                .add(Items.WOODEN_SWORD)
                .add(ArmoryItems.OAK_SWORD)
                .add(ArmoryItems.SPRUCE_SWORD)
                .add(ArmoryItems.BIRCH_SWORD)
                .add(ArmoryItems.JUNGLE_SWORD)
                .add(ArmoryItems.ACACIA_SWORD)
                .add(ArmoryItems.DARK_OAK_SWORD)
                .add(ArmoryItems.MANGROVE_SWORD)
                .add(ArmoryItems.CRIMSON_SWORD)
                .add(ArmoryItems.WARPED_SWORD);

    getOrCreateTagBuilder(ArmoryTags.Items.PICKAXES)
            .addTag(ArmoryTags.Items.WOODEN_PICKAXES)
            .add(Items.STONE_PICKAXE)
            .add(Items.IRON_PICKAXE)
            .add(Items.GOLDEN_PICKAXE)
            .add(Items.DIAMOND_PICKAXE)
            .add(Items.NETHERITE_PICKAXE)
            .add(ArmoryItems.COPPER_PICKAXE)
            .add(ArmoryItems.SLIVER_PICKAXE)
            .add(ArmoryItems.STEEL_PICKAXE);

        getOrCreateTagBuilder(ArmoryTags.Items.WOODEN_PICKAXES)
                .add(Items.WOODEN_PICKAXE)
                .add(ArmoryItems.OAK_PICKAXE)
                .add(ArmoryItems.SPRUCE_PICKAXE)
                .add(ArmoryItems.BIRCH_PICKAXE)
                .add(ArmoryItems.JUNGLE_PICKAXE)
                .add(ArmoryItems.ACACIA_PICKAXE)
                .add(ArmoryItems.DARK_OAK_PICKAXE)
                .add(ArmoryItems.MANGROVE_PICKAXE)
                .add(ArmoryItems.CRIMSON_PICKAXE)
                .add(ArmoryItems.WARPED_PICKAXE);

        getOrCreateTagBuilder(ArmoryTags.Items.SINGLE_AXES)
                .addTag(ArmoryTags.Items.WOODEN_SINGLE_AXES)
                .add(Items.STONE_AXE)
                .add(Items.IRON_AXE)
                .add(Items.GOLDEN_AXE)
                .add(Items.DIAMOND_AXE)
                .add(Items.NETHERITE_AXE)
                .add(ArmoryItems.COPPER_AXE)
                .add(ArmoryItems.SLIVER_AXE)
                .add(ArmoryItems.STEEL_AXE);

        getOrCreateTagBuilder(ArmoryTags.Items.WOODEN_SINGLE_AXES)
                .add(Items.WOODEN_AXE)
                .add(ArmoryItems.OAK_AXE)
                .add(ArmoryItems.SPRUCE_AXE)
                .add(ArmoryItems.BIRCH_AXE)
                .add(ArmoryItems.JUNGLE_AXE)
                .add(ArmoryItems.ACACIA_AXE)
                .add(ArmoryItems.DARK_OAK_AXE)
                .add(ArmoryItems.MANGROVE_AXE)
                .add(ArmoryItems.CRIMSON_AXE)
                .add(ArmoryItems.WARPED_AXE);

        getOrCreateTagBuilder(ArmoryTags.Items.DOUBLE_AXES)
                .addTag(ArmoryTags.Items.WOODEN_DOUBLE_AXES)
                .add(ArmoryItems.STONE_DOUBLE_AXE)
                .add(ArmoryItems.IRON_DOUBLE_AXE)
                .add(ArmoryItems.GOLDEN_DOUBLE_AXE)
                .add(ArmoryItems.DIAMOND_DOUBLE_AXE)
                .add(ArmoryItems.NETHERITE_DOUBLE_AXE)
                .add(ArmoryItems.COPPER_DOUBLE_AXE)
                .add(ArmoryItems.SLIVER_DOUBLE_AXE)
                .add(ArmoryItems.STEEL_DOUBLE_AXE);

        getOrCreateTagBuilder(ArmoryTags.Items.WOODEN_DOUBLE_AXES)
                .add(ArmoryItems.WOODEN_DOUBLE_AXE)
                .add(ArmoryItems.OAK_DOUBLE_AXE)
                .add(ArmoryItems.SPRUCE_DOUBLE_AXE)
                .add(ArmoryItems.BIRCH_DOUBLE_AXE)
                .add(ArmoryItems.JUNGLE_DOUBLE_AXE)
                .add(ArmoryItems.ACACIA_DOUBLE_AXE)
                .add(ArmoryItems.DARK_OAK_DOUBLE_AXE)
                .add(ArmoryItems.MANGROVE_DOUBLE_AXE)
                .add(ArmoryItems.CRIMSON_DOUBLE_AXE)
                .add(ArmoryItems.WARPED_DOUBLE_AXE);

        getOrCreateTagBuilder(ArmoryTags.Items.SHOVELS)
                .addTag(ArmoryTags.Items.WOODEN_SHOVELS)
                .add(Items.STONE_SHOVEL)
                .add(Items.IRON_SHOVEL)
                .add(Items.GOLDEN_SHOVEL)
                .add(Items.DIAMOND_SHOVEL)
                .add(Items.NETHERITE_SHOVEL)
                .add(ArmoryItems.COPPER_SHOVEL)
                .add(ArmoryItems.SLIVER_SHOVEL)
                .add(ArmoryItems.STEEL_SHOVEL);

        getOrCreateTagBuilder(ArmoryTags.Items.WOODEN_SHOVELS)
                .add(Items.WOODEN_SHOVEL)
                .add(ArmoryItems.OAK_SHOVEL)
                .add(ArmoryItems.SPRUCE_SHOVEL)
                .add(ArmoryItems.BIRCH_SHOVEL)
                .add(ArmoryItems.JUNGLE_SHOVEL)
                .add(ArmoryItems.ACACIA_SHOVEL)
                .add(ArmoryItems.DARK_OAK_SHOVEL)
                .add(ArmoryItems.MANGROVE_SHOVEL)
                .add(ArmoryItems.CRIMSON_SHOVEL)
                .add(ArmoryItems.WARPED_SHOVEL);

        getOrCreateTagBuilder(ArmoryTags.Items.HOES)
                .addTag(ArmoryTags.Items.WOODEN_HOES)
                .add(Items.STONE_HOE)
                .add(Items.IRON_HOE)
                .add(Items.GOLDEN_HOE)
                .add(Items.DIAMOND_HOE)
                .add(Items.NETHERITE_HOE)
                .add(ArmoryItems.COPPER_HOE)
                .add(ArmoryItems.SLIVER_HOE)
                .add(ArmoryItems.STEEL_HOE);

        getOrCreateTagBuilder(ArmoryTags.Items.WOODEN_HOES)
                .add(Items.WOODEN_HOE)
                .add(ArmoryItems.OAK_HOE)
                .add(ArmoryItems.SPRUCE_HOE)
                .add(ArmoryItems.BIRCH_HOE)
                .add(ArmoryItems.JUNGLE_HOE)
                .add(ArmoryItems.ACACIA_HOE)
                .add(ArmoryItems.DARK_OAK_HOE)
                .add(ArmoryItems.MANGROVE_HOE)
                .add(ArmoryItems.CRIMSON_HOE)
                .add(ArmoryItems.WARPED_HOE);

        getOrCreateTagBuilder(ArmoryTags.Items.CUPCAKES)
                .add(ArmoryItems.CUPCAKE)
                .add(ArmoryItems.WHITE_CUPCAKE)
                .add(ArmoryItems.RED_CUPCAKE)
                .add(ArmoryItems.ORANGE_CUPCAKE)
                .add(ArmoryItems.YELLOW_CUPCAKE)
                .add(ArmoryItems.LIME_CUPCAKE)
                .add(ArmoryItems.GREEN_CUPCAKE)
                .add(ArmoryItems.CYAN_CUPCAKE)
                .add(ArmoryItems.LIGHT_BLUE_CUPCAKE)
                .add(ArmoryItems.BLUE_CUPCAKE)
                .add(ArmoryItems.PURPLE_CUPCAKE)
                .add(ArmoryItems.MAGENTA_CUPCAKE)
                .add(ArmoryItems.PINK_CUPCAKE)
                .add(ArmoryItems.LIGHT_GRAY_CUPCAKE)
                .add(ArmoryItems.GRAY_CUPCAKE)
                .add(ArmoryItems.BLACK_CUPCAKE)
                .add(ArmoryItems.BROWN_CUPCAKE);
    }
}
