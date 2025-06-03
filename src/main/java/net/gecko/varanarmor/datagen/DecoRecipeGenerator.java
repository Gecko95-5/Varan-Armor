package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varanarmor.item.DecoItems;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class DecoRecipeGenerator extends FabricRecipeProvider {
    public DecoRecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_ROD,4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.FLINT)
                .criterion(RecipeProvider.hasItem(Items.FLINT),
                        RecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_ROD)));

        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_ROD,2)
                .pattern("#")
                .pattern("#")
                .input('#', DecoItems.COPPER_NUGGET)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_NUGGET),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_ROD)));

        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_ROD,4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.QUARTZ)
                .criterion(RecipeProvider.hasItem(Items.QUARTZ),
                        RecipeProvider.conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_ROD)));

        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_WOODEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_WOODEN_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_WOODEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_WOODEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_WOODEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_WOODEN_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_WOODEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_WOODEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_WOODEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_WOODEN_HOE)));
        

        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_STONE_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_STONE_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_STONE_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_STONE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_STONE_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_STONE_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_STONE_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_STONE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_STONE_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_STONE_HOE)));

        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_IRON_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_IRON_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_IRON_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_IRON_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_IRON_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_IRON_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_IRON_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_IRON_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_IRON_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_IRON_HOE)));

        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_GOLDEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_GOLDEN_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_GOLDEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_GOLDEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_GOLDEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_GOLDEN_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_GOLDEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_GOLDEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_GOLDEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_GOLDEN_HOE)));

        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_DIAMOND_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_DIAMOND_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_DIAMOND_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_DIAMOND_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_DIAMOND_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_DIAMOND_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_DIAMOND_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_DIAMOND_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_DIAMOND_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_DIAMOND_HOE)));

        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_WOODEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_WOODEN_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_WOODEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_WOODEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_WOODEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_WOODEN_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_WOODEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_WOODEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_WOODEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_WOODEN_HOE)));


        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_STONE_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_STONE_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_STONE_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_STONE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_STONE_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_STONE_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_STONE_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_STONE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_STONE_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_STONE_HOE)));

        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_IRON_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_IRON_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_IRON_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_IRON_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_IRON_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_IRON_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_IRON_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_IRON_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_IRON_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_IRON_HOE)));

        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_GOLDEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_GOLDEN_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_GOLDEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_GOLDEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_GOLDEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_GOLDEN_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_GOLDEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_GOLDEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_GOLDEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_GOLDEN_HOE)));

        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_DIAMOND_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_DIAMOND_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_DIAMOND_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_DIAMOND_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_DIAMOND_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_DIAMOND_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_DIAMOND_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_DIAMOND_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_DIAMOND_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_DIAMOND_HOE)));

        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_WOODEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_WOODEN_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_WOODEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_WOODEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_WOODEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_WOODEN_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_WOODEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_WOODEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_WOODEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_WOODEN_HOE)));


        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_STONE_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_STONE_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_STONE_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_STONE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_STONE_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_STONE_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_STONE_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_STONE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_STONE_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_STONE_HOE)));

        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_IRON_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_IRON_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_IRON_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_IRON_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_IRON_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_IRON_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_IRON_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_IRON_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_IRON_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_IRON_HOE)));

        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_GOLDEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_GOLDEN_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_GOLDEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_GOLDEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_GOLDEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_GOLDEN_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_GOLDEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_GOLDEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_GOLDEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_GOLDEN_HOE)));

        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_DIAMOND_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_DIAMOND_SWORD)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_DIAMOND_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_DIAMOND_PICKAXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_DIAMOND_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_DIAMOND_AXE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_DIAMOND_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_DIAMOND_SHOVEL)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_DIAMOND_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_DIAMOND_HOE)));
    }
}
