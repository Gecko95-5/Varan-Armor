package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varanarmor.item.ArmoryItems;
import net.gecko.varanarmor.util.ArmoryTags;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ArmoryRecipeGenerator extends FabricRecipeProvider {
    public ArmoryRecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_ROD,4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.FLINT)
                .criterion(RecipeProvider.hasItem(Items.FLINT),
                        RecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_ROD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_ROD,4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.LAPIS_LAZULI)
                .criterion(RecipeProvider.hasItem(Items.LAPIS_LAZULI),
                        RecipeProvider.conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_ROD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_ROD,4)
                .pattern("#")
                .pattern("#")
                .input('#', Items.QUARTZ)
                .criterion(RecipeProvider.hasItem(Items.QUARTZ),
                        RecipeProvider.conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_ROD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_WOODEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_WOODEN_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_WOODEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_WOODEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_WOODEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_WOODEN_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_WOODEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_WOODEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_WOODEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_WOODEN_HOE)));
        

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_STONE_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_STONE_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_STONE_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_STONE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_STONE_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_STONE_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_STONE_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_STONE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_STONE_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_STONE_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_IRON_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_IRON_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_IRON_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_IRON_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_IRON_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_IRON_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_IRON_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_IRON_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_IRON_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_IRON_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_GOLDEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_GOLDEN_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_GOLDEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_GOLDEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_GOLDEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_GOLDEN_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_GOLDEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_GOLDEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_GOLDEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_GOLDEN_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_DIAMOND_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_DIAMOND_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_DIAMOND_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_DIAMOND_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_DIAMOND_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_DIAMOND_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_DIAMOND_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_DIAMOND_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_DIAMOND_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_DIAMOND_HOE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.FLINT_DIAMOND_SWORD, ArmoryItems.FLINT_NETHERITE_SWORD);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.FLINT_DIAMOND_PICKAXE, ArmoryItems.FLINT_NETHERITE_PICKAXE);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.FLINT_DIAMOND_SHOVEL, ArmoryItems.FLINT_NETHERITE_SHOVEL);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.FLINT_DIAMOND_AXE, ArmoryItems.FLINT_NETHERITE_AXE);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.FLINT_DIAMOND_HOE, ArmoryItems.FLINT_NETHERITE_HOE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_WOODEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_WOODEN_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_WOODEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_WOODEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_WOODEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_WOODEN_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_WOODEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_WOODEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_WOODEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_WOODEN_HOE)));


        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_STONE_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_STONE_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_STONE_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_STONE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_STONE_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_STONE_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_STONE_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_STONE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_STONE_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_STONE_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_IRON_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_IRON_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_IRON_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_IRON_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_IRON_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_IRON_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_IRON_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_IRON_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_IRON_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_IRON_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_GOLDEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_GOLDEN_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_GOLDEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_GOLDEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_GOLDEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_GOLDEN_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_GOLDEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_GOLDEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_GOLDEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_GOLDEN_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_DIAMOND_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_DIAMOND_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_DIAMOND_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_DIAMOND_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_DIAMOND_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_DIAMOND_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_DIAMOND_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_DIAMOND_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_DIAMOND_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_DIAMOND_HOE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.LAPIS_DIAMOND_SWORD, ArmoryItems.LAPIS_NETHERITE_SWORD);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.LAPIS_DIAMOND_PICKAXE, ArmoryItems.LAPIS_NETHERITE_PICKAXE);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.LAPIS_DIAMOND_SHOVEL, ArmoryItems.LAPIS_NETHERITE_SHOVEL);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.LAPIS_DIAMOND_AXE, ArmoryItems.LAPIS_NETHERITE_AXE);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.LAPIS_DIAMOND_HOE, ArmoryItems.LAPIS_NETHERITE_HOE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_WOODEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_WOODEN_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_WOODEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_WOODEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_WOODEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_WOODEN_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_WOODEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_WOODEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_WOODEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_WOODEN_HOE)));


        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_STONE_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_STONE_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_STONE_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_STONE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_STONE_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_STONE_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_STONE_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_STONE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_STONE_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_STONE_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_IRON_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_IRON_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_IRON_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_IRON_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_IRON_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_IRON_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_IRON_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_IRON_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_IRON_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_IRON_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_GOLDEN_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_GOLDEN_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_GOLDEN_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_GOLDEN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_GOLDEN_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_GOLDEN_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_GOLDEN_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_GOLDEN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_GOLDEN_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_GOLDEN_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_DIAMOND_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_DIAMOND_SWORD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_DIAMOND_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_DIAMOND_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_DIAMOND_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_DIAMOND_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_DIAMOND_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_DIAMOND_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_DIAMOND_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_DIAMOND_HOE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.QUARTZ_DIAMOND_SWORD, ArmoryItems.QUARTZ_NETHERITE_SWORD);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.QUARTZ_DIAMOND_PICKAXE, ArmoryItems.QUARTZ_NETHERITE_PICKAXE);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.QUARTZ_DIAMOND_SHOVEL, ArmoryItems.QUARTZ_NETHERITE_SHOVEL);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.QUARTZ_DIAMOND_AXE, ArmoryItems.QUARTZ_NETHERITE_AXE);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.QUARTZ_DIAMOND_HOE, ArmoryItems.QUARTZ_NETHERITE_HOE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.IRON_ARROW,4)
                .pattern("X")
                .pattern("#")
                .pattern("Y")
                .input('X', Items.IRON_NUGGET)
                .input('#', ArmoryItems.FLINT_ROD)
                .input('Y',Items.FEATHER)
                .criterion(RecipeProvider.hasItem(Items.IRON_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .criterion(RecipeProvider.hasItem(ArmoryItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(ArmoryItems.FLINT_ROD))
                .criterion(RecipeProvider.hasItem(Items.FEATHER),
                        RecipeProvider.conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.IRON_ARROW)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.AMETHYST_ARROW,4)
                .pattern("X")
                .pattern("#")
                .pattern("Y")
                .input('X', Items.AMETHYST_SHARD)
                .input('#', ArmoryItems.LAPIS_ROD)
                .input('Y',Items.FEATHER)
                .criterion(RecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        RecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(RecipeProvider.hasItem(ArmoryItems.LAPIS_ROD),
                        RecipeProvider.conditionsFromItem(ArmoryItems.LAPIS_ROD))
                .criterion(RecipeProvider.hasItem(Items.FEATHER),
                        RecipeProvider.conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.AMETHYST_ARROW)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_ARROW,2)
                .pattern("X")
                .pattern("#")
                .pattern("Y")
                .input('X', Items.GHAST_TEAR)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .input('Y', ArmoryItems.GOLDEN_FEATHER)
                .criterion(RecipeProvider.hasItem(Items.GHAST_TEAR),
                        RecipeProvider.conditionsFromItem(Items.GHAST_TEAR))
                .criterion(RecipeProvider.hasItem(ArmoryItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(ArmoryItems.QUARTZ_ROD))
                .criterion(RecipeProvider.hasItem(ArmoryItems.GOLDEN_FEATHER),
                        RecipeProvider.conditionsFromItem(ArmoryItems.GOLDEN_FEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_ARROW)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.NETHER_ARROW,2)
                .pattern("X")
                .pattern("#")
                .pattern("Y")
                .input('X', Items.NETHER_WART)
                .input('#', Items.NETHER_BRICK)
                .input('Y', ArmoryItems.GOLDEN_FEATHER)
                .criterion(RecipeProvider.hasItem(Items.NETHER_WART),
                        RecipeProvider.conditionsFromItem(Items.NETHER_WART))
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(ArmoryItems.GOLDEN_FEATHER),
                        RecipeProvider.conditionsFromItem(ArmoryItems.GOLDEN_FEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.NETHER_ARROW)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.WOODEN_BOW)
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
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.WOODEN_BOW)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LEATHER_BOW)
                .pattern(" #X")
                .pattern("C X")
                .pattern(" #X")
                .input('X', Items.STRING)
                .input('#', Items.STICK)
                .input('C',ArmoryItems.TANNED_LEATHER)
                .criterion(RecipeProvider.hasItem(ArmoryItems.TANNED_LEATHER),
                        RecipeProvider.conditionsFromItem(ArmoryItems.TANNED_LEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LEATHER_BOW)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_BOW)
                .pattern(" #X")
                .pattern("C X")
                .pattern(" #X")
                .input('X', Items.STRING)
                .input('#', Items.STICK)
                .input('C',Items.COPPER_INGOT)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_BOW)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.DIAMOND_BOW)
                .pattern(" #X")
                .pattern("C &")
                .pattern(" #X")
                .input('X', Items.STRING)
                .input('&', Items.GLOWSTONE_DUST)
                .input('#', Items.STICK)
                .input('C',Items.DIAMOND)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.DIAMOND_BOW)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.DIAMOND_BOW, ArmoryItems.NETHERITE_BOW);

        ShapedRecipeJsonBuilder.create(ArmoryItems.GOLDEN_FEATHER,4)
                .pattern("###")
                .pattern("#F#")
                .pattern("###")
                .input('#', Items.GOLD_NUGGET)
                .input('F',Items.FEATHER)
                .criterion(RecipeProvider.hasItem(Items.GOLD_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.GOLDEN_FEATHER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.BLAZING_BOW)
                .pattern(" #X")
                .pattern("C &")
                .pattern(" #X")
                .input('X', Items.STRING)
                .input('&', Items.GLOWSTONE_DUST)
                .input('#', Items.BLAZE_ROD)
                .input('C',Items.MAGMA_CREAM)
                .criterion(RecipeProvider.hasItem(Items.BLAZE_ROD),
                        RecipeProvider.conditionsFromItem(Items.BLAZE_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.BLAZING_BOW)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ArmoryItems.SQUID_TENTACLES), ArmoryItems.COOKED_SQUID_TENTACLES,
                0.35f, 200).criterion(hasItem(ArmoryItems.SQUID_TENTACLES),conditionsFromItem(ArmoryItems.SQUID_TENTACLES))
                .offerTo(exporter,new Identifier("cooked_squid_tentacles_form_squid_tentacles"));

        ShapelessRecipeJsonBuilder.create(Items.INK_SAC,2)
                        .input(ArmoryItems.SQUID_TENTACLES)
                                .criterion(hasItem(ArmoryItems.SQUID_TENTACLES),conditionsFromItem(ArmoryItems.SQUID_TENTACLES))
                                        .offerTo(exporter, new Identifier("ink_sacs_from_tentacles"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ArmoryItems.GLOW_SQUID_TENTACLES), ArmoryItems.COOKED_SQUID_TENTACLES,
                0.35f, 200).criterion(hasItem(ArmoryItems.GLOW_SQUID_TENTACLES),conditionsFromItem(ArmoryItems.GLOW_SQUID_TENTACLES))
                .offerTo(exporter,new Identifier("cooked_squid_tentacles_form_glow_squid_tentacles"));

        ShapelessRecipeJsonBuilder.create(Items.GLOW_INK_SAC,2)
                .input(ArmoryItems.GLOW_SQUID_TENTACLES)
                .criterion(hasItem(ArmoryItems.GLOW_SQUID_TENTACLES),conditionsFromItem(ArmoryItems.GLOW_SQUID_TENTACLES))
                .offerTo(exporter, new Identifier("glow_ink_sacs_from_tentacles"));

        ShapedRecipeJsonBuilder.create(ArmoryItems.SQUID_FISHING_ROD)
                .pattern("  #")
                .pattern(" /X")
                .pattern("# -")
                .input('X', Items.STRING)
                .input('/', ArmoryItems.BRACED_STICK)
                .input('#', ArmoryItems.SQUID_TENTACLES)
                .input('-',Items.GLOW_INK_SAC)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SQUID_TENTACLES),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SQUID_TENTACLES))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SQUID_FISHING_ROD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.NAUTILUS_FISHING_ROD)
                .pattern("  #")
                .pattern(" /G")
                .pattern("#-X")
                .input('X', Items.STRING)
                .input('/', ArmoryItems.HEAVY_QUARTZ_ROD)
                .input('#', Items.NAUTILUS_SHELL)
                .input('G', Items.GLOWSTONE_DUST)
                .input('-',Items.HEART_OF_THE_SEA)
                .criterion(RecipeProvider.hasItem(Items.HEART_OF_THE_SEA),
                        RecipeProvider.conditionsFromItem(Items.HEART_OF_THE_SEA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.NAUTILUS_FISHING_ROD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.WOODEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', Items.STICK)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.WOODEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.STONE_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', Items.STICK)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STONE_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.GOLDEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.GOLDEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.IRON_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.IRON_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.DIAMOND_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.DIAMOND_SICKLE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.DIAMOND_SICKLE, ArmoryItems.NETHERITE_SICKLE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_WOODEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_WOODEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_STONE_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_STONE_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_GOLDEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_GOLDEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_IRON_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_IRON_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_DIAMOND_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_DIAMOND_SICKLE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_WOODEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_WOODEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_STONE_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_STONE_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_GOLDEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_GOLDEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_IRON_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_IRON_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_DIAMOND_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_DIAMOND_SICKLE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_WOODEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_WOODEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_STONE_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_STONE_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_GOLDEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_GOLDEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_IRON_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_IRON_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_DIAMOND_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_DIAMOND_SICKLE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.FLINT_DIAMOND_SICKLE, ArmoryItems.FLINT_NETHERITE_SICKLE);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.LAPIS_DIAMOND_SICKLE, ArmoryItems.LAPIS_NETHERITE_SICKLE);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.QUARTZ_DIAMOND_SICKLE, ArmoryItems.QUARTZ_NETHERITE_SICKLE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.BRACED_STICK,2)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .input('#', Items.STICK)
                .input('X', Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.BRACED_STICK)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.HEAVY_FLINT_ROD)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .input('#', ArmoryItems.FLINT_ROD)
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .criterion(RecipeProvider.hasItem(ArmoryItems.FLINT_ROD),
                        RecipeProvider.conditionsFromItem(ArmoryItems.FLINT_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.HEAVY_FLINT_ROD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.HEAVY_LAPIS_ROD)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .input('#', ArmoryItems.LAPIS_ROD)
                .input('X', Items.IRON_NUGGET)
                .criterion(RecipeProvider.hasItem(ArmoryItems.LAPIS_ROD),
                        RecipeProvider.conditionsFromItem(ArmoryItems.LAPIS_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.HEAVY_LAPIS_ROD)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.HEAVY_QUARTZ_ROD)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .input('#', ArmoryItems.QUARTZ_ROD)
                .input('X', Items.DIAMOND)
                .criterion(RecipeProvider.hasItem(ArmoryItems.QUARTZ_ROD),
                        RecipeProvider.conditionsFromItem(ArmoryItems.QUARTZ_ROD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.HEAVY_QUARTZ_ROD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.WOODEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.BRACED_STICK)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.WOODEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.STONE_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.BRACED_STICK)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STONE_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.IRON_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.BRACED_STICK)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.IRON_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.GOLDEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.BRACED_STICK)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.GOLDEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.DIAMOND_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.BRACED_STICK)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.DIAMOND_CLAYMORE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.DIAMOND_CLAYMORE, ArmoryItems.NETHERITE_CLAYMORE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_WOODEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.HEAVY_FLINT_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_WOODEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_STONE_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.HEAVY_FLINT_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_STONE_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_IRON_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.HEAVY_FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_IRON_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_GOLDEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.HEAVY_FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_GOLDEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_DIAMOND_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.HEAVY_FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_DIAMOND_CLAYMORE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_WOODEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.HEAVY_LAPIS_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_WOODEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_STONE_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.HEAVY_LAPIS_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_STONE_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_IRON_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.HEAVY_LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_IRON_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_GOLDEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.HEAVY_LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_GOLDEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_DIAMOND_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.HEAVY_LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_DIAMOND_CLAYMORE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_WOODEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.HEAVY_QUARTZ_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_WOODEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_STONE_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.HEAVY_QUARTZ_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_STONE_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_IRON_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.HEAVY_QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_IRON_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_GOLDEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.HEAVY_QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_GOLDEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_DIAMOND_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.HEAVY_QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_DIAMOND_CLAYMORE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.FLINT_DIAMOND_CLAYMORE, ArmoryItems.FLINT_NETHERITE_CLAYMORE);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.LAPIS_DIAMOND_CLAYMORE, ArmoryItems.LAPIS_NETHERITE_CLAYMORE);
        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.QUARTZ_DIAMOND_CLAYMORE, ArmoryItems.QUARTZ_NETHERITE_CLAYMORE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.SWIFT_BOOTS)
                .pattern("#Y#")
                .pattern("XYX")
                .input('X', Items.RABBIT_FOOT)
                .input('#', Items.LAPIS_LAZULI)
                .input('Y', ArmoryItems.GOLDEN_FEATHER)
                .criterion(RecipeProvider.hasItem(Items.RABBIT_FOOT),
                        RecipeProvider.conditionsFromItem(Items.RABBIT_FOOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SWIFT_BOOTS)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.EGG), ArmoryItems.HARD_BOILED_EGG,
                        0.35f, 200).criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(exporter, new Identifier("hard_boiled_egg_from_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.EGG), ArmoryItems.HARD_BOILED_EGG,
                        0.35f, 200).criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(exporter, new Identifier("hard_boiled_egg_from_smoking"));

        offerCookingRecipe(exporter, "campfire", RecipeSerializer.CAMPFIRE_COOKING, 600,
                Items.EGG, ArmoryItems.FRIED_EGG,0.35f);

        ShapelessRecipeJsonBuilder.create(ArmoryItems.WITHER_BONE)
                .input(Items.COAL)
                .input(Items.BONE)
                .input(Items.NETHER_WART)
                .criterion(RecipeProvider.hasItem(Items.NETHER_WART),
                        RecipeProvider.conditionsFromItem(Items.NETHER_WART))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.WITHER_BONE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.WOODEN_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', ItemTags.PLANKS)
                .input('#', Items.STICK)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.WOODEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.STONE_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', Items.STICK)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STONE_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.IRON_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.IRON_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.IRON_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.GOLDEN_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.GOLD_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.GOLDEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.DIAMOND_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.DIAMOND)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.DIAMOND_DAGGER)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.DIAMOND_DAGGER, ArmoryItems.NETHERITE_DAGGER);

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_WOODEN_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_WOODEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_STONE_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_STONE_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_IRON_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_IRON_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_GOLDEN_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_GOLDEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_DIAMOND_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_DIAMOND_DAGGER)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.FLINT_DIAMOND_DAGGER, ArmoryItems.FLINT_NETHERITE_DAGGER);

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_WOODEN_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_WOODEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_STONE_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_STONE_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_IRON_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_IRON_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_GOLDEN_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_GOLDEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_DIAMOND_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_DIAMOND_DAGGER)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.LAPIS_DIAMOND_DAGGER, ArmoryItems.LAPIS_NETHERITE_DAGGER);

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_WOODEN_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_WOODEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_STONE_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_STONE_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_IRON_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_IRON_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_GOLDEN_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_GOLDEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_DIAMOND_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_DIAMOND_DAGGER)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.QUARTZ_DIAMOND_DAGGER, ArmoryItems.QUARTZ_NETHERITE_DAGGER);

        ShapedRecipeJsonBuilder.create(ArmoryItems.MINING_GOOGLES)
                .pattern("#X#")
                .pattern("X X")
                .pattern(" X ")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.AMETHYST_SHARD)
                .criterion(RecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        RecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.MINING_GOOGLES)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.BRACER_SUIT)
                .pattern("# #")
                .pattern("XWX")
                .pattern("X-X")
                .input('X', Items.IRON_BARS)
                .input('#', Items.IRON_BLOCK)
                .input('-', Items.SCUTE)
                .input('W', Items.BLAZE_POWDER)
                .criterion(RecipeProvider.hasItem(Items.SCUTE),
                        RecipeProvider.conditionsFromItem(Items.SCUTE))
                .criterion(RecipeProvider.hasItem(Items.BLAZE_POWDER),
                        RecipeProvider.conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.BRACER_SUIT)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.PARACHUTE_PANTS)
                .pattern("###")
                .pattern("X X")
                .pattern("X X")
                .input('X', ItemTags.WOOL)
                .input('#', Items.PHANTOM_MEMBRANE)
                .criterion(RecipeProvider.hasItem(Items.PHANTOM_MEMBRANE),
                        RecipeProvider.conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.PARACHUTE_PANTS)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.WOODEN_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('/', ArmoryItems.BRACED_STICK)
                .input('#', Items.STICK)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.WOODEN_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.STONE_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('/', ArmoryItems.BRACED_STICK)
                .input('#', Items.STICK)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STONE_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.IRON_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('/', ArmoryItems.BRACED_STICK)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.IRON_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.GOLDEN_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('/', ArmoryItems.BRACED_STICK)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.GOLDEN_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.DIAMOND_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('/', ArmoryItems.BRACED_STICK)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.DIAMOND_DOUBLE_AXE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.DIAMOND_DOUBLE_AXE, ArmoryItems.NETHERITE_DOUBLE_AXE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_WOODEN_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('/', ArmoryItems.HEAVY_FLINT_ROD)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_WOODEN_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_STONE_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('/', ArmoryItems.HEAVY_FLINT_ROD)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_STONE_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_IRON_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('/', ArmoryItems.HEAVY_FLINT_ROD)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_IRON_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_GOLDEN_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('/', ArmoryItems.HEAVY_FLINT_ROD)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_GOLDEN_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_DIAMOND_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('/', ArmoryItems.HEAVY_FLINT_ROD)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_DIAMOND_DOUBLE_AXE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.FLINT_DIAMOND_DOUBLE_AXE, ArmoryItems.FLINT_NETHERITE_DOUBLE_AXE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_WOODEN_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('/', ArmoryItems.HEAVY_LAPIS_ROD)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_WOODEN_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_STONE_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('/', ArmoryItems.HEAVY_LAPIS_ROD)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_STONE_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_IRON_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('/', ArmoryItems.HEAVY_LAPIS_ROD)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_IRON_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_GOLDEN_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('/', ArmoryItems.HEAVY_LAPIS_ROD)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_GOLDEN_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_DIAMOND_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('/', ArmoryItems.HEAVY_LAPIS_ROD)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_DIAMOND_DOUBLE_AXE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.LAPIS_DIAMOND_DOUBLE_AXE, ArmoryItems.LAPIS_NETHERITE_DOUBLE_AXE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_WOODEN_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', ItemTags.PLANKS)
                .input('/', ArmoryItems.HEAVY_QUARTZ_ROD)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_WOODEN_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_STONE_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('/', ArmoryItems.HEAVY_QUARTZ_ROD)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_STONE_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_IRON_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('/', ArmoryItems.HEAVY_QUARTZ_ROD)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_IRON_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_GOLDEN_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('/', ArmoryItems.HEAVY_QUARTZ_ROD)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_GOLDEN_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_DIAMOND_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('/', ArmoryItems.HEAVY_QUARTZ_ROD)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_DIAMOND_DOUBLE_AXE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.QUARTZ_DIAMOND_DOUBLE_AXE, ArmoryItems.QUARTZ_NETHERITE_DOUBLE_AXE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_SWORD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_DAGGER)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.BRACED_STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('/', ArmoryItems.BRACED_STICK)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_DOUBLE_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_SICKLE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_HELMET)
                .pattern("XXX")
                .pattern("X X")
                .input('X', Items.COPPER_INGOT)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_HELMET)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_CHESTPLATE)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', Items.COPPER_INGOT)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_LEGGINGS)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.COPPER_INGOT)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_BOOTS)
                .pattern("X X")
                .pattern("X X")
                .input('X', Items.COPPER_INGOT)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_BOOTS)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.LEATHER), ArmoryItems.TANNED_LEATHER,
                        0.35f, 200).criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, new Identifier("tanned_leather_from_smelting"));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_COPPER_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_COPPER_SWORD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_COPPER_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_COPPER_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_COPPER_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_COPPER_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_COPPER_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_COPPER_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_COPPER_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_COPPER_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_COPPER_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_COPPER_DAGGER)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_COPPER_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.HEAVY_FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_COPPER_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_COPPER_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('/', ArmoryItems.HEAVY_FLINT_ROD)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_COPPER_DOUBLE_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.FLINT_COPPER_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.FLINT_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.FLINT_COPPER_SICKLE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_COPPER_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_COPPER_SWORD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_COPPER_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_COPPER_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_COPPER_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_COPPER_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_COPPER_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_COPPER_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_COPPER_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_COPPER_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_COPPER_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_COPPER_DAGGER)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_COPPER_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.HEAVY_LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_COPPER_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_COPPER_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('/', ArmoryItems.HEAVY_LAPIS_ROD)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_COPPER_DOUBLE_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.LAPIS_COPPER_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.LAPIS_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.LAPIS_COPPER_SICKLE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_COPPER_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_COPPER_SWORD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_COPPER_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_COPPER_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_COPPER_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_COPPER_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_COPPER_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_COPPER_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_COPPER_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_COPPER_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_COPPER_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_COPPER_DAGGER)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_COPPER_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.HEAVY_QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_COPPER_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_COPPER_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('/', ArmoryItems.HEAVY_QUARTZ_ROD)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_COPPER_DOUBLE_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_COPPER_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.QUARTZ_ROD)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.QUARTZ_COPPER_SICKLE)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.IRON_INGOT), ArmoryItems.MOLTEN_IRON,
                        0.35f, 200).criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("molten_iron_from_smelting"));

        ShapedRecipeJsonBuilder.create(ArmoryItems.IRON_PLATE)
                .pattern("XXX")
                .input('X', ArmoryItems.MOLTEN_IRON)
                .criterion(RecipeProvider.hasItem(ArmoryItems.MOLTEN_IRON),
                        RecipeProvider.conditionsFromItem(ArmoryItems.MOLTEN_IRON))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.IRON_PLATE)));

        ShapelessRecipeJsonBuilder.create(ArmoryItems.SLIVER_INGOT)
                .input(Items.IRON_INGOT)
                .input(Items.LAPIS_LAZULI)
                .input(Items.GOLD_NUGGET)
                .input(Items.GOLD_NUGGET)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_INGOT)));

        ShapelessRecipeJsonBuilder.create(ArmoryItems.SLIVER_NUGGET,9)
                        .input(ArmoryItems.SLIVER_INGOT)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_NUGGET)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_INGOT)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ArmoryItems.SLIVER_NUGGET)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier("sliver_ingot_from_sliver_nuggets"));

        ShapedRecipeJsonBuilder.create(ArmoryItems.HIGHLAND_HELMET)
                .pattern("X#X")
                .pattern("X X")
                .input('X', ArmoryItems.IRON_PLATE)
                .input('#', ArmoryItems.TANNED_LEATHER)
                .criterion(RecipeProvider.hasItem(ArmoryItems.IRON_PLATE),
                        RecipeProvider.conditionsFromItem(ArmoryItems.IRON_PLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.HIGHLAND_HELMET)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.HIGHLAND_CHESTPLATE)
                .pattern("X X")
                .pattern("X#X")
                .pattern("#-#")
                .input('X', ArmoryItems.IRON_PLATE)
                .input('#', ArmoryItems.TANNED_LEATHER)
                .input('-', Items.IRON_NUGGET)
                .criterion(RecipeProvider.hasItem(ArmoryItems.IRON_PLATE),
                        RecipeProvider.conditionsFromItem(ArmoryItems.IRON_PLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.HIGHLAND_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.HIGHLAND_LEGGINGS)
                .pattern("#X#")
                .pattern("X X")
                .pattern("# #")
                .input('X', ArmoryItems.IRON_PLATE)
                .input('#', ArmoryItems.TANNED_LEATHER)
                .criterion(RecipeProvider.hasItem(ArmoryItems.IRON_PLATE),
                        RecipeProvider.conditionsFromItem(ArmoryItems.IRON_PLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.HIGHLAND_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.HIGHLAND_BOOTS)
                .pattern("X X")
                .pattern("# #")
                .input('X', ArmoryItems.IRON_PLATE)
                .input('#', ArmoryItems.TANNED_LEATHER)
                .criterion(RecipeProvider.hasItem(ArmoryItems.IRON_PLATE),
                        RecipeProvider.conditionsFromItem(ArmoryItems.IRON_PLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.HIGHLAND_BOOTS)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_APPLE)
                .pattern("XXX")
                .pattern("XAX")
                .pattern("XXX")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('A', Items.APPLE)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_APPLE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_BEETROOT)
                .pattern("XXX")
                .pattern("XBX")
                .pattern("XXX")
                .input('X', ArmoryItems.SLIVER_NUGGET)
                .input('B', Items.BEETROOT)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_NUGGET),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_BEETROOT)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.CUPCAKE,2)
                .pattern("A")
                .pattern("B")
                .pattern("C")
                .input('A', Items.MILK_BUCKET)
                .input('B', Items.SUGAR)
                .input('C', Items.WHEAT)
                .criterion(RecipeProvider.hasItem(Items.MILK_BUCKET),
                        RecipeProvider.conditionsFromItem(Items.MILK_BUCKET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.CUPCAKE)));

        offerCupcakeRecipe(exporter, ArmoryItems.WHITE_CUPCAKE, Items.WHITE_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.WHITE_CUPCAKE, Items.WHITE_DYE, "dyed_white_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.LIGHT_GRAY_CUPCAKE, Items.LIGHT_GRAY_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.LIGHT_GRAY_CUPCAKE, Items.LIGHT_GRAY_DYE, "dyed_light_gray_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.GRAY_CUPCAKE, Items.GRAY_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.GRAY_CUPCAKE, Items.GRAY_DYE, "dyed_gray_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.BLACK_CUPCAKE, Items.BLACK_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.BLACK_CUPCAKE, Items.BLACK_DYE, "dyed_black_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.RED_CUPCAKE, Items.RED_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.RED_CUPCAKE, Items.RED_DYE, "dyed_red_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.BROWN_CUPCAKE, Items.BROWN_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.BROWN_CUPCAKE, Items.BROWN_DYE, "dyed_brown_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.ORANGE_CUPCAKE, Items.ORANGE_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.ORANGE_CUPCAKE, Items.ORANGE_DYE, "dyed_orange_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.YELLOW_CUPCAKE, Items.YELLOW_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.YELLOW_CUPCAKE, Items.YELLOW_DYE, "dyed_yellow_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.LIME_CUPCAKE, Items.LIME_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.LIME_CUPCAKE, Items.LIME_DYE, "dyed_lime_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.GREEN_CUPCAKE, Items.GREEN_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.GREEN_CUPCAKE, Items.GREEN_DYE, "dyed_green_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.CYAN_CUPCAKE, Items.CYAN_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.CYAN_CUPCAKE, Items.CYAN_DYE, "dyed_cyan_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.LIGHT_BLUE_CUPCAKE, Items.LIGHT_BLUE_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.LIGHT_BLUE_CUPCAKE, Items.LIGHT_BLUE_DYE, "dyed_light_blue_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.BLUE_CUPCAKE, Items.BLUE_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.BLUE_CUPCAKE, Items.BLUE_DYE, "dyed_blue_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.PURPLE_CUPCAKE, Items.PURPLE_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.PURPLE_CUPCAKE, Items.PURPLE_DYE, "dyed_purple_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.MAGENTA_CUPCAKE, Items.MAGENTA_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.MAGENTA_CUPCAKE, Items.MAGENTA_DYE, "dyed_magenta_cupcake");
        offerCupcakeRecipe(exporter, ArmoryItems.PINK_CUPCAKE, Items.PINK_DYE);
        offerColouredCupcakeRecipe(exporter, ArmoryItems.PINK_CUPCAKE, Items.PINK_DYE, "dyed_pink_cupcake");

        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_SWORD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_DAGGER)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', ArmoryItems.BRACED_STICK)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('/', ArmoryItems.BRACED_STICK)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_DOUBLE_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_SICKLE)));
    }
    public static void offerCupcakeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible dyeInput) {
        ShapedRecipeJsonBuilder.create(output,2)
                .input('A', Items.MILK_BUCKET)
                .input('B', Items.SUGAR)
                .input('C', Items.WHEAT)
                .input('D', dyeInput)
                .pattern(" A")
                .pattern("DB")
                .pattern(" C")
                .group("cupcake")
                .criterion(RecipeProvider.hasItem(Items.MILK_BUCKET),
                        RecipeProvider.conditionsFromItem(Items.MILK_BUCKET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(output)));
    }
    public static void offerColouredCupcakeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible dyeInput,
                                                  String dyedRecipeName) {
        ShapelessRecipeJsonBuilder.create(output)
                .input(ArmoryTags.Items.CUPCAKES)
                .input(dyeInput)
                .group("cupcake")
                .criterion("has_cupcake", RecipeProvider.conditionsFromTag(ArmoryTags.Items.CUPCAKES))
                .offerTo(exporter, new Identifier(dyedRecipeName));
    }
}
