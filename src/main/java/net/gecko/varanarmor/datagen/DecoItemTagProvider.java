package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varanarmor.item.DecoItems;
import net.gecko.varanarmor.util.DecoTags;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;

public class DecoItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DecoItemTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ItemTags.ARROWS)
                .add(DecoItems.IRON_ARROW)
                .add(DecoItems.AMETHYST_ARROW)
                .add(DecoItems.QUARTZ_ARROW)
                .add(DecoItems.NETHER_ARROW);

    getOrCreateTagBuilder(DecoTags.Items.HARVESTERS)
            .addTag(DecoTags.Items.SICKLES)
            .addTag(DecoTags.Items.HOES);

        getOrCreateTagBuilder(DecoTags.Items.AXES)
                .addTag(DecoTags.Items.SINGLE_AXES);

    getOrCreateTagBuilder(DecoTags.Items.SICKLES)
            .add(DecoItems.WOODEN_SICKLE)
            .add(DecoItems.FLINT_WOODEN_SICKLE)
            .add(DecoItems.COPPER_WOODEN_SICKLE)
            .add(DecoItems.QUARTZ_WOODEN_SICKLE)
            .add(DecoItems.STONE_SICKLE)
            .add(DecoItems.FLINT_STONE_SICKLE)
            .add(DecoItems.COPPER_STONE_SICKLE)
            .add(DecoItems.QUARTZ_STONE_SICKLE)
            .add(DecoItems.IRON_SICKLE)
            .add(DecoItems.FLINT_IRON_SICKLE)
            .add(DecoItems.COPPER_IRON_SICKLE)
            .add(DecoItems.QUARTZ_IRON_SICKLE)
            .add(DecoItems.GOLDEN_SICKLE)
            .add(DecoItems.FLINT_GOLDEN_SICKLE)
            .add(DecoItems.COPPER_GOLDEN_SICKLE)
            .add(DecoItems.QUARTZ_GOLDEN_SICKLE)
            .add(DecoItems.DIAMOND_SICKLE)
            .add(DecoItems.FLINT_DIAMOND_SICKLE)
            .add(DecoItems.COPPER_DIAMOND_SICKLE)
            .add(DecoItems.QUARTZ_DIAMOND_SICKLE)
            .add(DecoItems.NETHERITE_SICKLE)
            .add(DecoItems.FLINT_NETHERITE_SICKLE)
            .add(DecoItems.COPPER_NETHERITE_SICKLE)
            .add(DecoItems.QUARTZ_NETHERITE_SICKLE);

        getOrCreateTagBuilder(DecoTags.Items.CLAYMORES)
                .add(DecoItems.WOODEN_CLAYMORE)
                .add(DecoItems.FLINT_WOODEN_CLAYMORE)
                .add(DecoItems.COPPER_WOODEN_CLAYMORE)
                .add(DecoItems.QUARTZ_WOODEN_CLAYMORE)
                .add(DecoItems.STONE_CLAYMORE)
                .add(DecoItems.FLINT_STONE_CLAYMORE)
                .add(DecoItems.COPPER_STONE_CLAYMORE)
                .add(DecoItems.QUARTZ_STONE_CLAYMORE)
                .add(DecoItems.IRON_CLAYMORE)
                .add(DecoItems.FLINT_IRON_CLAYMORE)
                .add(DecoItems.COPPER_IRON_CLAYMORE)
                .add(DecoItems.QUARTZ_IRON_CLAYMORE)
                .add(DecoItems.GOLDEN_CLAYMORE)
                .add(DecoItems.FLINT_GOLDEN_CLAYMORE)
                .add(DecoItems.COPPER_GOLDEN_CLAYMORE)
                .add(DecoItems.QUARTZ_GOLDEN_CLAYMORE)
                .add(DecoItems.DIAMOND_CLAYMORE)
                .add(DecoItems.FLINT_DIAMOND_CLAYMORE)
                .add(DecoItems.COPPER_DIAMOND_CLAYMORE)
                .add(DecoItems.QUARTZ_DIAMOND_CLAYMORE)
                .add(DecoItems.NETHERITE_CLAYMORE)
                .add(DecoItems.FLINT_NETHERITE_CLAYMORE)
                .add(DecoItems.COPPER_NETHERITE_CLAYMORE)
                .add(DecoItems.QUARTZ_NETHERITE_CLAYMORE);

    getOrCreateTagBuilder(DecoTags.Items.SWORDS)
            .add(Items.WOODEN_SWORD)
            .add(Items.STONE_SWORD)
            .add(Items.IRON_SWORD)
            .add(Items.GOLDEN_SWORD)
            .add(Items.DIAMOND_SWORD)
            .add(Items.NETHERITE_SWORD)
            .add(DecoItems.FLINT_WOODEN_SWORD)
            .add(DecoItems.FLINT_STONE_SWORD)
            .add(DecoItems.FLINT_IRON_SWORD)
            .add(DecoItems.FLINT_GOLDEN_SWORD)
            .add(DecoItems.FLINT_DIAMOND_SWORD)
            .add(DecoItems.FLINT_NETHERITE_SWORD)
            .add(DecoItems.COPPER_WOODEN_SWORD)
            .add(DecoItems.COPPER_STONE_SWORD)
            .add(DecoItems.COPPER_IRON_SWORD)
            .add(DecoItems.COPPER_GOLDEN_SWORD)
            .add(DecoItems.COPPER_DIAMOND_SWORD)
            .add(DecoItems.COPPER_NETHERITE_SWORD)
            .add(DecoItems.QUARTZ_WOODEN_SWORD)
            .add(DecoItems.QUARTZ_STONE_SWORD)
            .add(DecoItems.QUARTZ_IRON_SWORD)
            .add(DecoItems.QUARTZ_GOLDEN_SWORD)
            .add(DecoItems.QUARTZ_DIAMOND_SWORD)
            .add(DecoItems.QUARTZ_NETHERITE_SWORD)
            .addTag(DecoTags.Items.CLAYMORES);

    getOrCreateTagBuilder(DecoTags.Items.PICKAXES)
            .add(Items.WOODEN_PICKAXE)
            .add(Items.STONE_PICKAXE)
            .add(Items.IRON_PICKAXE)
            .add(Items.GOLDEN_PICKAXE)
            .add(Items.DIAMOND_PICKAXE)
            .add(Items.NETHERITE_PICKAXE)
            .add(DecoItems.FLINT_WOODEN_PICKAXE)
            .add(DecoItems.FLINT_STONE_PICKAXE)
            .add(DecoItems.FLINT_IRON_PICKAXE)
            .add(DecoItems.FLINT_GOLDEN_PICKAXE)
            .add(DecoItems.FLINT_DIAMOND_PICKAXE)
            .add(DecoItems.FLINT_NETHERITE_PICKAXE)
            .add(DecoItems.COPPER_WOODEN_PICKAXE)
            .add(DecoItems.COPPER_STONE_PICKAXE)
            .add(DecoItems.COPPER_IRON_PICKAXE)
            .add(DecoItems.COPPER_GOLDEN_PICKAXE)
            .add(DecoItems.COPPER_DIAMOND_PICKAXE)
            .add(DecoItems.COPPER_NETHERITE_PICKAXE)
            .add(DecoItems.QUARTZ_WOODEN_PICKAXE)
            .add(DecoItems.QUARTZ_STONE_PICKAXE)
            .add(DecoItems.QUARTZ_IRON_PICKAXE)
            .add(DecoItems.QUARTZ_GOLDEN_PICKAXE)
            .add(DecoItems.QUARTZ_DIAMOND_PICKAXE)
            .add(DecoItems.QUARTZ_NETHERITE_PICKAXE);

        getOrCreateTagBuilder(DecoTags.Items.SINGLE_AXES)
                .add(Items.WOODEN_AXE)
                .add(Items.STONE_AXE)
                .add(Items.IRON_AXE)
                .add(Items.GOLDEN_AXE)
                .add(Items.DIAMOND_AXE)
                .add(Items.NETHERITE_AXE)
                .add(DecoItems.FLINT_WOODEN_AXE)
                .add(DecoItems.FLINT_STONE_AXE)
                .add(DecoItems.FLINT_IRON_AXE)
                .add(DecoItems.FLINT_GOLDEN_AXE)
                .add(DecoItems.FLINT_DIAMOND_AXE)
                .add(DecoItems.FLINT_NETHERITE_AXE)
                .add(DecoItems.COPPER_WOODEN_AXE)
                .add(DecoItems.COPPER_STONE_AXE)
                .add(DecoItems.COPPER_IRON_AXE)
                .add(DecoItems.COPPER_GOLDEN_AXE)
                .add(DecoItems.COPPER_DIAMOND_AXE)
                .add(DecoItems.COPPER_NETHERITE_AXE)
                .add(DecoItems.QUARTZ_WOODEN_AXE)
                .add(DecoItems.QUARTZ_STONE_AXE)
                .add(DecoItems.QUARTZ_IRON_AXE)
                .add(DecoItems.QUARTZ_GOLDEN_AXE)
                .add(DecoItems.QUARTZ_DIAMOND_AXE)
                .add(DecoItems.QUARTZ_NETHERITE_AXE);

        getOrCreateTagBuilder(DecoTags.Items.SHOVELS)
                .add(Items.WOODEN_SHOVEL)
                .add(Items.STONE_SHOVEL)
                .add(Items.IRON_SHOVEL)
                .add(Items.GOLDEN_SHOVEL)
                .add(Items.DIAMOND_SHOVEL)
                .add(Items.NETHERITE_SHOVEL)
                .add(DecoItems.FLINT_WOODEN_SHOVEL)
                .add(DecoItems.FLINT_STONE_SHOVEL)
                .add(DecoItems.FLINT_IRON_SHOVEL)
                .add(DecoItems.FLINT_GOLDEN_SHOVEL)
                .add(DecoItems.FLINT_DIAMOND_SHOVEL)
                .add(DecoItems.FLINT_NETHERITE_SHOVEL)
                .add(DecoItems.COPPER_WOODEN_SHOVEL)
                .add(DecoItems.COPPER_STONE_SHOVEL)
                .add(DecoItems.COPPER_IRON_SHOVEL)
                .add(DecoItems.COPPER_GOLDEN_SHOVEL)
                .add(DecoItems.COPPER_DIAMOND_SHOVEL)
                .add(DecoItems.COPPER_NETHERITE_SHOVEL)
                .add(DecoItems.QUARTZ_WOODEN_SHOVEL)
                .add(DecoItems.QUARTZ_STONE_SHOVEL)
                .add(DecoItems.QUARTZ_IRON_SHOVEL)
                .add(DecoItems.QUARTZ_GOLDEN_SHOVEL)
                .add(DecoItems.QUARTZ_DIAMOND_SHOVEL)
                .add(DecoItems.QUARTZ_NETHERITE_SHOVEL);

        getOrCreateTagBuilder(DecoTags.Items.HOES)
                .add(Items.WOODEN_HOE)
                .add(Items.STONE_HOE)
                .add(Items.IRON_HOE)
                .add(Items.GOLDEN_HOE)
                .add(Items.DIAMOND_HOE)
                .add(Items.NETHERITE_HOE)
                .add(DecoItems.FLINT_WOODEN_HOE)
                .add(DecoItems.FLINT_STONE_HOE)
                .add(DecoItems.FLINT_IRON_HOE)
                .add(DecoItems.FLINT_GOLDEN_HOE)
                .add(DecoItems.FLINT_DIAMOND_HOE)
                .add(DecoItems.FLINT_NETHERITE_HOE)
                .add(DecoItems.COPPER_WOODEN_HOE)
                .add(DecoItems.COPPER_STONE_HOE)
                .add(DecoItems.COPPER_IRON_HOE)
                .add(DecoItems.COPPER_GOLDEN_HOE)
                .add(DecoItems.COPPER_DIAMOND_HOE)
                .add(DecoItems.COPPER_NETHERITE_HOE)
                .add(DecoItems.QUARTZ_WOODEN_HOE)
                .add(DecoItems.QUARTZ_STONE_HOE)
                .add(DecoItems.QUARTZ_IRON_HOE)
                .add(DecoItems.QUARTZ_GOLDEN_HOE)
                .add(DecoItems.QUARTZ_DIAMOND_HOE)
                .add(DecoItems.QUARTZ_NETHERITE_HOE);
    }
}
