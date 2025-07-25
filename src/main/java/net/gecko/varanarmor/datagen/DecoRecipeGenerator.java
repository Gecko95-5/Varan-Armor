package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varanarmor.item.DecoItems;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
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

        offerNetheriteUpgradeRecipe(exporter, DecoItems.FLINT_DIAMOND_SWORD,DecoItems.FLINT_NETHERITE_SWORD);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.FLINT_DIAMOND_PICKAXE,DecoItems.FLINT_NETHERITE_PICKAXE);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.FLINT_DIAMOND_SHOVEL,DecoItems.FLINT_NETHERITE_SHOVEL);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.FLINT_DIAMOND_AXE,DecoItems.FLINT_NETHERITE_AXE);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.FLINT_DIAMOND_HOE,DecoItems.FLINT_NETHERITE_HOE);

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

        offerNetheriteUpgradeRecipe(exporter, DecoItems.COPPER_DIAMOND_SWORD,DecoItems.COPPER_NETHERITE_SWORD);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.COPPER_DIAMOND_PICKAXE,DecoItems.COPPER_NETHERITE_PICKAXE);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.COPPER_DIAMOND_SHOVEL,DecoItems.COPPER_NETHERITE_SHOVEL);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.COPPER_DIAMOND_AXE,DecoItems.COPPER_NETHERITE_AXE);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.COPPER_DIAMOND_HOE,DecoItems.COPPER_NETHERITE_HOE);

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

        offerNetheriteUpgradeRecipe(exporter, DecoItems.QUARTZ_DIAMOND_SWORD,DecoItems.QUARTZ_NETHERITE_SWORD);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.QUARTZ_DIAMOND_PICKAXE,DecoItems.QUARTZ_NETHERITE_PICKAXE);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.QUARTZ_DIAMOND_SHOVEL,DecoItems.QUARTZ_NETHERITE_SHOVEL);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.QUARTZ_DIAMOND_AXE,DecoItems.QUARTZ_NETHERITE_AXE);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.QUARTZ_DIAMOND_HOE,DecoItems.QUARTZ_NETHERITE_HOE);

        ShapedRecipeJsonBuilder.create(DecoItems.IRON_ARROW,4)
                .pattern("X")
                .pattern("#")
                .pattern("Y")
                .input('X', Items.IRON_NUGGET)
                .input('#', DecoItems.FLINT_ROD)
                .input('Y',Items.FEATHER)
                .criterion(RecipeProvider.hasItem(Items.IRON_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .criterion(RecipeProvider.hasItem(Items.FEATHER),
                        RecipeProvider.conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.IRON_ARROW)));

        ShapedRecipeJsonBuilder.create(DecoItems.AMETHYST_ARROW,4)
                .pattern("X")
                .pattern("#")
                .pattern("Y")
                .input('X', Items.AMETHYST_SHARD)
                .input('#', DecoItems.COPPER_ROD)
                .input('Y',Items.FEATHER)
                .criterion(RecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        RecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .criterion(RecipeProvider.hasItem(Items.FEATHER),
                        RecipeProvider.conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.AMETHYST_ARROW)));

        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_ARROW,2)
                .pattern("X")
                .pattern("#")
                .pattern("Y")
                .input('X', Items.GHAST_TEAR)
                .input('#', DecoItems.QUARTZ_ROD)
                .input('Y', DecoItems.GOLDEN_FEATHER)
                .criterion(RecipeProvider.hasItem(Items.GHAST_TEAR),
                        RecipeProvider.conditionsFromItem(Items.GHAST_TEAR))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .criterion(RecipeProvider.hasItem(DecoItems.GOLDEN_FEATHER),
                        RecipeProvider.conditionsFromItem(DecoItems.GOLDEN_FEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_ARROW)));

        ShapedRecipeJsonBuilder.create(DecoItems.NETHER_ARROW,2)
                .pattern("X")
                .pattern("#")
                .pattern("Y")
                .input('X', Items.NETHER_WART)
                .input('#', Items.NETHER_BRICK)
                .input('Y', DecoItems.GOLDEN_FEATHER)
                .criterion(RecipeProvider.hasItem(Items.NETHER_WART),
                        RecipeProvider.conditionsFromItem(Items.NETHER_WART))
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(DecoItems.GOLDEN_FEATHER),
                        RecipeProvider.conditionsFromItem(DecoItems.GOLDEN_FEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.NETHER_ARROW)));

        ShapedRecipeJsonBuilder.create(DecoItems.WOODEN_BOW)
                .pattern(" #X")
                .pattern("C X")
                .pattern(" #X")
                .input('X', Items.STRING)
                .input('#', Items.STICK)
                .input('C',ItemTags.LOGS)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.WOODEN_BOW)));

        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_BOW)
                .pattern(" #X")
                .pattern("C X")
                .pattern(" #X")
                .input('X', Items.STRING)
                .input('#', Items.STICK)
                .input('C',Items.COPPER_INGOT)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_BOW)));

        ShapedRecipeJsonBuilder.create(DecoItems.DIAMOND_BOW)
                .pattern(" #X")
                .pattern("C &")
                .pattern(" #X")
                .input('X', Items.STRING)
                .input('&', Items.GLOWSTONE_DUST)
                .input('#', Items.STICK)
                .input('C',Items.DIAMOND)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .criterion(RecipeProvider.hasItem(Items.GLOWSTONE_DUST),
                        RecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.DIAMOND_BOW)));

        offerNetheriteUpgradeRecipe(exporter, DecoItems.DIAMOND_BOW,DecoItems.NETHERITE_BOW);

        ShapedRecipeJsonBuilder.create(DecoItems.GOLDEN_FEATHER,4)
                .pattern("###")
                .pattern("#F#")
                .pattern("###")
                .input('#', Items.GOLD_NUGGET)
                .input('F',Items.FEATHER)
                .criterion(RecipeProvider.hasItem(Items.IRON_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .criterion(RecipeProvider.hasItem(Items.FEATHER),
                        RecipeProvider.conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.GOLDEN_FEATHER)));

        ShapedRecipeJsonBuilder.create(DecoItems.BLAZING_BOW)
                .pattern(" #X")
                .pattern("C &")
                .pattern(" #X")
                .input('X', Items.STRING)
                .input('&', Items.GLOWSTONE_DUST)
                .input('#', Items.BLAZE_ROD)
                .input('C',Items.MAGMA_CREAM)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .criterion(RecipeProvider.hasItem(Items.GLOWSTONE_DUST),
                        RecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion(RecipeProvider.hasItem(Items.BLAZE_ROD),
                        RecipeProvider.conditionsFromItem(Items.BLAZE_ROD))
                .criterion(RecipeProvider.hasItem(Items.MAGMA_CREAM),
                        RecipeProvider.conditionsFromItem(Items.MAGMA_CREAM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.BLAZING_BOW)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoItems.SQUID_TENTACLES), DecoItems.COOKED_SQUID_TENTACLES,
                0.35f, 200).criterion(hasItem(DecoItems.SQUID_TENTACLES),conditionsFromItem(DecoItems.SQUID_TENTACLES))
                .offerTo(exporter,new Identifier("cooked_squid_tentacles_form_squid_tentacles"));

        ShapelessRecipeJsonBuilder.create(Items.INK_SAC,2)
                        .input(DecoItems.SQUID_TENTACLES)
                                .criterion(hasItem(DecoItems.SQUID_TENTACLES),conditionsFromItem(DecoItems.SQUID_TENTACLES))
                                        .offerTo(exporter, new Identifier("ink_sacs_from_tentacles"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoItems.GLOW_SQUID_TENTACLES), DecoItems.COOKED_SQUID_TENTACLES,
                0.35f, 200).criterion(hasItem(DecoItems.GLOW_SQUID_TENTACLES),conditionsFromItem(DecoItems.GLOW_SQUID_TENTACLES))
                .offerTo(exporter,new Identifier("cooked_squid_tentacles_form_glow_squid_tentacles"));

        ShapelessRecipeJsonBuilder.create(Items.GLOW_INK_SAC,2)
                .input(DecoItems.GLOW_SQUID_TENTACLES)
                .criterion(hasItem(DecoItems.GLOW_SQUID_TENTACLES),conditionsFromItem(DecoItems.GLOW_SQUID_TENTACLES))
                .offerTo(exporter, new Identifier("glow_ink_sacs_from_tentacles"));

        ShapedRecipeJsonBuilder.create(DecoItems.SQUID_FISHING_ROD)
                .pattern("  #")
                .pattern(" /X")
                .pattern("# -")
                .input('X', Items.STRING)
                .input('/', DecoItems.BRACED_STICK)
                .input('#', DecoItems.SQUID_TENTACLES)
                .input('-',Items.GLOW_INK_SAC)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .criterion(RecipeProvider.hasItem(DecoItems.BRACED_STICK),
                        RecipeProvider.conditionsFromItem(DecoItems.BRACED_STICK))
                .criterion(RecipeProvider.hasItem(DecoItems.SQUID_TENTACLES),
                        RecipeProvider.conditionsFromItem(DecoItems.SQUID_TENTACLES))
                .criterion(RecipeProvider.hasItem(Items.GLOW_INK_SAC),
                        RecipeProvider.conditionsFromItem(Items.GLOW_INK_SAC))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.SQUID_FISHING_ROD)));

        ShapedRecipeJsonBuilder.create(DecoItems.NAUTILUS_FISHING_ROD)
                .pattern("  #")
                .pattern(" /G")
                .pattern("#-X")
                .input('X', Items.STRING)
                .input('/', DecoItems.HEAVY_QUARTZ_ROD)
                .input('#', Items.NAUTILUS_SHELL)
                .input('G', Items.GLOWSTONE_DUST)
                .input('-',Items.HEART_OF_THE_SEA)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .criterion(RecipeProvider.hasItem(DecoItems.HEAVY_QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.HEAVY_QUARTZ_ROD))
                .criterion(RecipeProvider.hasItem(Items.NAUTILUS_SHELL),
                        RecipeProvider.conditionsFromItem(Items.NAUTILUS_SHELL))
                .criterion(RecipeProvider.hasItem(Items.GLOWSTONE_DUST),
                        RecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion(RecipeProvider.hasItem(Items.HEART_OF_THE_SEA),
                        RecipeProvider.conditionsFromItem(Items.HEART_OF_THE_SEA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.NAUTILUS_FISHING_ROD)));

        ShapedRecipeJsonBuilder.create(DecoItems.WOODEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.WOODEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.STONE_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.STONE_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.GOLDEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.GOLDEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.IRON_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.IRON_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.DIAMOND_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.DIAMOND_SICKLE)));

        offerNetheriteUpgradeRecipe(exporter, DecoItems.DIAMOND_SICKLE,DecoItems.NETHERITE_SICKLE);

        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_WOODEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_WOODEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_STONE_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_STONE_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_GOLDEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_GOLDEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_IRON_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_IRON_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_DIAMOND_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_DIAMOND_SICKLE)));

        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_WOODEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_WOODEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_STONE_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_STONE_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_GOLDEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_GOLDEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_IRON_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_IRON_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_DIAMOND_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_DIAMOND_SICKLE)));

        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_WOODEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_WOODEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_STONE_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_STONE_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_GOLDEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_GOLDEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_IRON_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_IRON_SICKLE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_DIAMOND_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(RecipeProvider.hasItem(DecoItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_DIAMOND_SICKLE)));

        offerNetheriteUpgradeRecipe(exporter, DecoItems.FLINT_DIAMOND_SICKLE,DecoItems.FLINT_NETHERITE_SICKLE);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.COPPER_DIAMOND_SICKLE,DecoItems.COPPER_NETHERITE_SICKLE);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.QUARTZ_DIAMOND_SICKLE,DecoItems.QUARTZ_NETHERITE_SICKLE);

        ShapedRecipeJsonBuilder.create(DecoItems.BRACED_STICK,2)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .input('#', Items.STICK)
                .input('X', Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.BRACED_STICK)));
        ShapedRecipeJsonBuilder.create(DecoItems.HEAVY_FLINT_ROD)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .input('#', DecoItems.FLINT_ROD)
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .criterion(RecipeProvider.hasItem(DecoItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.HEAVY_FLINT_ROD)));
        ShapedRecipeJsonBuilder.create(DecoItems.HEAVY_COPPER_ROD)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .input('#', DecoItems.COPPER_ROD)
                .input('X', Items.IRON_NUGGET)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .criterion(RecipeProvider.hasItem(Items.IRON_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.HEAVY_COPPER_ROD)));
        ShapedRecipeJsonBuilder.create(DecoItems.HEAVY_QUARTZ_ROD)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .input('#', DecoItems.COPPER_ROD)
                .input('X', Items.DIAMOND)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_ROD),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_ROD))
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.HEAVY_QUARTZ_ROD)));

        ShapedRecipeJsonBuilder.create(DecoItems.WOODEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.BRACED_STICK)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.WOODEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.STONE_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.BRACED_STICK)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.STONE_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.IRON_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.BRACED_STICK)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.IRON_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.GOLDEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.BRACED_STICK)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.GOLDEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.DIAMOND_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.BRACED_STICK)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.DIAMOND_CLAYMORE)));

        offerNetheriteUpgradeRecipe(exporter, DecoItems.DIAMOND_CLAYMORE,DecoItems.NETHERITE_CLAYMORE);

        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_WOODEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.HEAVY_FLINT_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_WOODEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_STONE_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.HEAVY_FLINT_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_STONE_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_IRON_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.HEAVY_FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_IRON_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_GOLDEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.HEAVY_FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_GOLDEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.FLINT_DIAMOND_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.HEAVY_FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.FLINT_DIAMOND_CLAYMORE)));

        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_WOODEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.HEAVY_COPPER_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_WOODEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_STONE_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.HEAVY_COPPER_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_STONE_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_IRON_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.HEAVY_COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_IRON_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_GOLDEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.HEAVY_COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_GOLDEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.COPPER_DIAMOND_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.HEAVY_COPPER_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.COPPER_DIAMOND_CLAYMORE)));

        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_WOODEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.PLANKS)
                .input('#', DecoItems.HEAVY_QUARTZ_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_WOODEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_STONE_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', DecoItems.HEAVY_QUARTZ_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_STONE_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_IRON_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.IRON_INGOT)
                .input('#', DecoItems.HEAVY_QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_IRON_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_GOLDEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.GOLD_INGOT)
                .input('#', DecoItems.HEAVY_QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_GOLDEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(DecoItems.QUARTZ_DIAMOND_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.DIAMOND)
                .input('#', DecoItems.HEAVY_QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.QUARTZ_DIAMOND_CLAYMORE)));

        offerNetheriteUpgradeRecipe(exporter, DecoItems.FLINT_DIAMOND_CLAYMORE,DecoItems.FLINT_NETHERITE_CLAYMORE);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.COPPER_DIAMOND_CLAYMORE,DecoItems.COPPER_NETHERITE_CLAYMORE);
        offerNetheriteUpgradeRecipe(exporter, DecoItems.QUARTZ_DIAMOND_CLAYMORE,DecoItems.QUARTZ_NETHERITE_CLAYMORE);

        ShapedRecipeJsonBuilder.create(DecoItems.SWIFT_BOOTS)
                .pattern("#Y#")
                .pattern("XYX")
                .input('X', Items.RABBIT_FOOT)
                .input('#', Items.LAPIS_LAZULI)
                .input('Y', DecoItems.GOLDEN_FEATHER)
                .criterion(RecipeProvider.hasItem(Items.RABBIT_FOOT),
                        RecipeProvider.conditionsFromItem(Items.RABBIT_FOOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.SWIFT_BOOTS)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.EGG), DecoItems.HARD_BOILED_EGG,
                        0.35f, 200).criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(exporter, new Identifier("hard_boiled_egg_from_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.EGG), DecoItems.HARD_BOILED_EGG,
                        0.35f, 200).criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(exporter, new Identifier("hard_boiled_egg_from_smoking"));

        offerCookingRecipe(exporter, "campfire", RecipeSerializer.CAMPFIRE_COOKING, 600,Items.EGG, DecoItems.FRIED_EGG,0.35f);

        ShapelessRecipeJsonBuilder.create(DecoItems.WITHER_BONE)
                .input(Items.COAL)
                .input(Items.BONE)
                .input(Items.NETHER_WART)
                .criterion(RecipeProvider.hasItem(Items.NETHER_WART),
                        RecipeProvider.conditionsFromItem(Items.NETHER_WART))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.WITHER_BONE)));
    }
}
