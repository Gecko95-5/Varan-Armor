package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varanarmor.block.ArmoryBlocks;
import net.gecko.varanarmor.item.ArmoryItems;
import net.gecko.varanarmor.util.ArmoryTags;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ArmoryRecipeGenerator extends FabricRecipeProvider {

    private static final List<ItemConvertible> SILVER_SMELTABLES = List.of(ArmoryItems.SLIVER_AXE,
            ArmoryItems.SLIVER_PICKAXE, ArmoryItems.SLIVER_SICKLE, ArmoryItems.SLIVER_CLAYMORE, ArmoryItems.SLIVER_SWORD,
            ArmoryItems.SLIVER_HOE, ArmoryItems.SLIVER_SHOVEL, ArmoryItems.SLIVER_DOUBLE_AXE, ArmoryItems.SLIVER_DAGGER,
            ArmoryItems.SLIVER_BOOTS, ArmoryItems.SLIVER_LEGGINGS, ArmoryItems.SLIVER_CHESTPLATE, ArmoryItems.SLIVER_HELMET);

    public ArmoryRecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }


    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, SILVER_SMELTABLES, ArmoryItems.SLIVER_NUGGET,
                0.25f, 200, "silver_nugget");
        offerBlasting(exporter, SILVER_SMELTABLES, ArmoryItems.SLIVER_NUGGET,
                0.25f, 100, "silver_nugget");

        ShapedRecipeJsonBuilder.create(ArmoryItems.IRON_ARROW,4)
                .pattern("X")
                .pattern("#")
                .pattern("Y")
                .input('X', Items.IRON_NUGGET)
                .input('#', Items.FLINT)
                .input('Y',Items.FEATHER)
                .criterion(RecipeProvider.hasItem(Items.IRON_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .criterion(RecipeProvider.hasItem(Items.FLINT),
                        RecipeProvider.conditionsFromItem(Items.FLINT))
                .criterion(RecipeProvider.hasItem(Items.FEATHER),
                        RecipeProvider.conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.IRON_ARROW)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.AMETHYST_ARROW,4)
                .pattern("X")
                .pattern("#")
                .pattern("Y")
                .input('X', Items.AMETHYST_SHARD)
                .input('#', Items.LAPIS_LAZULI)
                .input('Y',Items.FEATHER)
                .criterion(RecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        RecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(RecipeProvider.hasItem(Items.LAPIS_LAZULI),
                        RecipeProvider.conditionsFromItem(Items.LAPIS_LAZULI))
                .criterion(RecipeProvider.hasItem(Items.FEATHER),
                        RecipeProvider.conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.AMETHYST_ARROW)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.QUARTZ_ARROW,2)
                .pattern("X")
                .pattern("#")
                .pattern("Y")
                .input('X', Items.GHAST_TEAR)
                .input('#', Items.QUARTZ)
                .input('Y', ArmoryItems.GOLDEN_FEATHER)
                .criterion(RecipeProvider.hasItem(Items.GHAST_TEAR),
                        RecipeProvider.conditionsFromItem(Items.GHAST_TEAR))
                .criterion(RecipeProvider.hasItem(Items.QUARTZ),
                        RecipeProvider.conditionsFromItem(Items.QUARTZ))
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

        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_BOW)
                .pattern(" #X")
                .pattern("C X")
                .pattern(" #X")
                .input('X', Items.STRING)
                .input('#', Items.STICK)
                .input('C',ArmoryItems.SLIVER_INGOT)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_BOW)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.GOLDEN_BOW)
                .pattern(" #X")
                .pattern("C X")
                .pattern(" #X")
                .input('X', Items.STRING)
                .input('#', Items.STICK)
                .input('C',Items.GOLD_INGOT)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.GOLDEN_BOW)));

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

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ArmoryItems.SQUID_TENTACLES), ArmoryItems.COOKED_SQUID_TENTACLES,
                        0.35f, 200).criterion(hasItem(ArmoryItems.SQUID_TENTACLES), conditionsFromItem(ArmoryItems.SQUID_TENTACLES))
                .offerTo(exporter, new Identifier("cooked_squid_tentacles_form_squid_tentacles_from_smoking"));

        offerCookingRecipe(exporter, "campfire", RecipeSerializer.CAMPFIRE_COOKING, 600,
                ArmoryItems.SQUID_TENTACLES, ArmoryItems.COOKED_SQUID_TENTACLES,0.35f);

        ShapelessRecipeJsonBuilder.create(Items.INK_SAC,2)
                        .input(ArmoryItems.SQUID_TENTACLES)
                                .criterion(hasItem(ArmoryItems.SQUID_TENTACLES),conditionsFromItem(ArmoryItems.SQUID_TENTACLES))
                                        .offerTo(exporter, new Identifier("ink_sacs_from_tentacles"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ArmoryItems.GLOW_SQUID_TENTACLES), ArmoryItems.COOKED_SQUID_TENTACLES,
                0.35f, 200).criterion(hasItem(ArmoryItems.GLOW_SQUID_TENTACLES),conditionsFromItem(ArmoryItems.GLOW_SQUID_TENTACLES))
                .offerTo(exporter,new Identifier("cooked_squid_tentacles_form_glow_squid_tentacles"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ArmoryItems.GLOW_SQUID_TENTACLES), ArmoryItems.COOKED_SQUID_TENTACLES,
                        0.35f, 200).criterion(hasItem(ArmoryItems.GLOW_SQUID_TENTACLES), conditionsFromItem(ArmoryItems.GLOW_SQUID_TENTACLES))
                .offerTo(exporter, new Identifier("cooked_squid_tentacles_form_glow_squid_tentacles_from_smoking"));

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
                .input('/', ArmoryItems.BRACED_STICK)
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
                .group("wooden_sickles")
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.WOODEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.STONE_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', Items.STICK)
                .group("stone_sickles")
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STONE_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.GOLDEN_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.GOLD_INGOT)
                .input('#', Items.STICK)
                .group("golden_sickles")
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.GOLDEN_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.IRON_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('#', Items.STICK)
                .group("iron_sickles")
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.IRON_SICKLE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.DIAMOND_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.DIAMOND)
                .input('#', Items.STICK)
                .group("diamond_sickles")
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.DIAMOND_SICKLE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.DIAMOND_SICKLE, ArmoryItems.NETHERITE_SICKLE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.BRACED_STICK,2)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .input('#', Items.STICK)
                .input('X', Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.BRACED_STICK)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.WOODEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.PLANKS)
                .input('#', ArmoryItems.BRACED_STICK)
                .group("wooden_claymore")
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.WOODEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.STONE_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', ArmoryItems.BRACED_STICK)
                .group("stone_claymore")
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STONE_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.IRON_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.IRON_INGOT)
                .input('#', ArmoryItems.BRACED_STICK)
                .group("iron_claymore")
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.IRON_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.GOLDEN_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.GOLD_INGOT)
                .input('#', ArmoryItems.BRACED_STICK)
                .group("golden_claymore")
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.GOLDEN_CLAYMORE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.DIAMOND_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.DIAMOND)
                .input('#', ArmoryItems.BRACED_STICK)
                .group("diamond_claymore")
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.DIAMOND_CLAYMORE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.DIAMOND_CLAYMORE, ArmoryItems.NETHERITE_CLAYMORE);

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
                .group("wooden_daggers")
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.WOODEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.STONE_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', Items.STICK)
                .group("stone_daggers")
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STONE_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.IRON_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.IRON_INGOT)
                .input('#', Items.STICK)
                .group("iron_daggers")
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.IRON_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.GOLDEN_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.GOLD_INGOT)
                .input('#', Items.STICK)
                .group("golden_daggers")
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.GOLDEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.DIAMOND_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.DIAMOND)
                .input('#', Items.STICK)
                .group("diamond_daggers")
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.DIAMOND_DAGGER)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.DIAMOND_DAGGER, ArmoryItems.NETHERITE_DAGGER);

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
                .group("wooden_double_axes")
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.WOODEN_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.STONE_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('/', ArmoryItems.BRACED_STICK)
                .input('#', Items.STICK)
                .group("stone_double_axes")
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STONE_DOUBLE_AXE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.IRON_DOUBLE_AXE)
                .pattern("XXX")
                .pattern("X/X")
                .pattern(" # ")
                .input('X', Items.IRON_INGOT)
                .input('/', ArmoryItems.BRACED_STICK)
                .input('#', Items.STICK)
                .group("iron_double_axes")
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
                .group("golden_double_axes")
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
                .group("diamond_double_axes")
                .criterion(RecipeProvider.hasItem(Items.DIAMOND),
                        RecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.DIAMOND_DOUBLE_AXE)));

        offerNetheriteUpgradeRecipe(exporter, ArmoryItems.DIAMOND_DOUBLE_AXE, ArmoryItems.NETHERITE_DOUBLE_AXE);

        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .group("copper_swords")
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_SWORD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .group("copper_pickaxes")
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .group("copper_axes")
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .group("copper_shovels")
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .group("copper_hoes")
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .group("copper_dagger")
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_DAGGER)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', Items.COPPER_INGOT)
                .input('#', ArmoryItems.BRACED_STICK)
                .group("copper_claymore")
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
                .group("copper_double_axes")
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.COPPER_DOUBLE_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.COPPER_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', Items.COPPER_INGOT)
                .input('#', Items.STICK)
                .group("copper_sickles")
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
                .input(ArmoryItems.MOLTEN_IRON)
                .input(Items.GOLD_NUGGET)
                .input(Items.GOLD_NUGGET)
                .input(Items.GOLD_NUGGET)
                .criterion(RecipeProvider.hasItem(ArmoryItems.MOLTEN_IRON),
                        RecipeProvider.conditionsFromItem(ArmoryItems.MOLTEN_IRON))
                .offerTo(exporter, new Identifier("sliver_ingot_from_molten_iron"));

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
                .group("silver_swords")
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_SWORD)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .group("silver_pickaxes")
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_PICKAXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .group("silver_axes")
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .group("silver_shovels")
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_SHOVEL)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .group("silver_hoes")
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_HOE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .group("silver_dagger")
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_DAGGER)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_CLAYMORE)
                .pattern(" XX")
                .pattern("XXX")
                .pattern("#X ")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', ArmoryItems.BRACED_STICK)
                .group("silver_claymore")
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
                .group("silver_double_axes")
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_DOUBLE_AXE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_SICKLE)
                .pattern(" XX")
                .pattern("X X")
                .pattern(" # ")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .input('#', Items.STICK)
                .group("silver_sickles")
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_SICKLE)));

        offerReversibleCompactingRecipes(exporter, ArmoryItems.SLIVER_INGOT, ArmoryBlocks.SLIVER_BLOCK);

        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_HELMET)
                .pattern("XXX")
                .pattern("X X")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_HELMET)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_CHESTPLATE)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_LEGGINGS)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.SLIVER_BOOTS)
                .pattern("X X")
                .pattern("X X")
                .input('X', ArmoryItems.SLIVER_INGOT)
                .criterion(RecipeProvider.hasItem(ArmoryItems.SLIVER_INGOT),
                        RecipeProvider.conditionsFromItem(ArmoryItems.SLIVER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.SLIVER_BOOTS)));

        ShapelessRecipeJsonBuilder.create(ArmoryItems.BEEF_PIE)
                .input(Items.COOKED_BEEF)
                .input(Items.CARROT)
                .input(ArmoryItems.ONION)
                .input(Items.WHEAT)
                .criterion(RecipeProvider.hasItem(Items.COOKED_BEEF),
                        RecipeProvider.conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.BEEF_PIE)));

        ShapelessRecipeJsonBuilder.create(ArmoryItems.CHICKEN_PIE)
                .input(Items.COOKED_CHICKEN)
                .input(Items.POTATO)
                .input(ArmoryItems.ONION)
                .input(Items.WHEAT)
                .criterion(RecipeProvider.hasItem(Items.COOKED_CHICKEN),
                        RecipeProvider.conditionsFromItem(Items.COOKED_CHICKEN))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.CHICKEN_PIE)));

        ShapelessRecipeJsonBuilder.create(ArmoryItems.RAW_OMELET)
                .input(Items.EGG)
                .input(Items.BROWN_MUSHROOM)
                .input(ArmoryItems.ONION)
                .criterion(RecipeProvider.hasItem(ArmoryItems.ONION),
                        RecipeProvider.conditionsFromItem(ArmoryItems.ONION))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.RAW_OMELET)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ArmoryItems.RAW_OMELET), ArmoryItems.COOKED_OMELET,
                        0.35f, 200).criterion(hasItem(ArmoryItems.RAW_OMELET),conditionsFromItem(ArmoryItems.RAW_OMELET))
                .offerTo(exporter,new Identifier("cooked_omelet_form_smelting"));

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ArmoryItems.RAW_OMELET), ArmoryItems.COOKED_OMELET,
                        0.35f, 100).criterion(hasItem(ArmoryItems.RAW_OMELET), conditionsFromItem(ArmoryItems.RAW_OMELET))
                .offerTo(exporter, new Identifier("cooked_omelet_from_smoking"));

        offerCookingRecipe(exporter, "campfire", RecipeSerializer.CAMPFIRE_COOKING, 600,
                ArmoryItems.RAW_OMELET, ArmoryItems.COOKED_OMELET,0.35f);

        ShapedRecipeJsonBuilder.create(Items.SADDLE)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" - ")
                .input('#', ArmoryItems.TANNED_LEATHER)
                .input('X', Items.STRING)
                .input('-', Items.IRON_NUGGET)
                .criterion(RecipeProvider.hasItem(ArmoryItems.TANNED_LEATHER),
                        RecipeProvider.conditionsFromItem(ArmoryItems.TANNED_LEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.SADDLE)));

        ShapelessRecipeJsonBuilder.create(Items.NAME_TAG)
                .input(Items.STRING)
                .input(Items.INK_SAC)
                .input(Items.PAPER)
                .criterion(RecipeProvider.hasItem(Items.INK_SAC),
                        RecipeProvider.conditionsFromItem(Items.INK_SAC))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.NAME_TAG)));

        ShapelessRecipeJsonBuilder.create(Items.EXPERIENCE_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .input(Items.LAPIS_LAZULI)
                .input(Items.GLOWSTONE_DUST)
                .criterion(RecipeProvider.hasItem(Items.GLASS_BOTTLE),
                        RecipeProvider.conditionsFromItem(Items.GLASS_BOTTLE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.EXPERIENCE_BOTTLE)));

        ShapelessRecipeJsonBuilder.create(ArmoryItems.APPLE_PIE)
                .input(Items.APPLE)
                .input(Items.APPLE)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(RecipeProvider.hasItem(Items.APPLE),
                        RecipeProvider.conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.APPLE_PIE)));

        ShapelessRecipeJsonBuilder.create(ArmoryItems.BERRY_PIE)
                .input(Items.SWEET_BERRIES)
                .input(Items.GLOW_BERRIES)
                .input(Items.SUGAR)
                .input(Items.WHEAT)
                .criterion(RecipeProvider.hasItem(Items.SWEET_BERRIES),
                        RecipeProvider.conditionsFromItem(Items.SWEET_BERRIES))
                .criterion(RecipeProvider.hasItem(Items.GLOW_BERRIES),
                        RecipeProvider.conditionsFromItem(Items.GLOW_BERRIES))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.BERRY_PIE)));

        ShapedRecipeJsonBuilder.create(ArmoryItems.STALWART_HELMET)
                .pattern("#X#")
                .pattern("XHX")
                .input('X', ArmoryItems.IRON_PLATE)
                .input('#', ItemTags.WOOL)
                .input('H', Items.IRON_HELMET)
                .criterion(RecipeProvider.hasItem(ArmoryItems.IRON_PLATE),
                        RecipeProvider.conditionsFromItem(ArmoryItems.IRON_PLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STALWART_HELMET)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.STALWART_CHESTPLATE)
                .pattern("X X")
                .pattern("XCX")
                .pattern("X#X")
                .input('X', ArmoryItems.IRON_PLATE)
                .input('#', ItemTags.WOOL)
                .input('C', Items.IRON_CHESTPLATE)
                .criterion(RecipeProvider.hasItem(ArmoryItems.IRON_PLATE),
                        RecipeProvider.conditionsFromItem(ArmoryItems.IRON_PLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STALWART_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.STALWART_LEGGINGS)
                .pattern("#L#")
                .pattern("X X")
                .pattern("X X")
                .input('X', ArmoryItems.IRON_PLATE)
                .input('#', ItemTags.WOOL)
                .input('L', Items.IRON_LEGGINGS)
                .criterion(RecipeProvider.hasItem(ArmoryItems.IRON_PLATE),
                        RecipeProvider.conditionsFromItem(ArmoryItems.IRON_PLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STALWART_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(ArmoryItems.STALWART_BOOTS)
                .pattern("XBX")
                .pattern("X X")
                .input('X', ArmoryItems.IRON_PLATE)
                .input('B', Items.IRON_LEGGINGS)
                .criterion(RecipeProvider.hasItem(ArmoryItems.IRON_PLATE),
                        RecipeProvider.conditionsFromItem(ArmoryItems.IRON_PLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STALWART_BOOTS)));

        ShapelessRecipeJsonBuilder.create(ArmoryItems.STEEL_COMPOUND)
                .input(ArmoryItems.MOLTEN_IRON)
                .input(ArmoryItems.MOLTEN_IRON)
                .input(ArmoryItems.MOLTEN_IRON)
                .input(ArmoryItems.MOLTEN_IRON)
                .input(Items.RAW_COPPER_BLOCK)
                .input(Items.RAW_COPPER_BLOCK)
                .criterion(RecipeProvider.hasItem(ArmoryItems.MOLTEN_IRON),
                        RecipeProvider.conditionsFromItem(ArmoryItems.MOLTEN_IRON))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ArmoryItems.STEEL_COMPOUND)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ArmoryItems.STEEL_COMPOUND), ArmoryItems.STEEL_INGOT,
                        0.35f, 1000).criterion(hasItem(ArmoryItems.STEEL_COMPOUND),conditionsFromItem(ArmoryItems.STEEL_COMPOUND))
                .offerTo(exporter,new Identifier("steel_ingot_form_smelting"));

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(ArmoryItems.STEEL_COMPOUND), ArmoryItems.STEEL_INGOT,
                        0.35f, 500).criterion(hasItem(ArmoryItems.STEEL_COMPOUND),conditionsFromItem(ArmoryItems.STEEL_COMPOUND))
                .offerTo(exporter,new Identifier("steel_ingot_form_blasting"));

        offerSteelUpgradeRecipe(exporter, Items.IRON_SWORD, ArmoryItems.STEEL_SWORD);
        offerSteelUpgradeRecipe(exporter, Items.IRON_PICKAXE, ArmoryItems.STEEL_PICKAXE);
        offerSteelUpgradeRecipe(exporter, Items.IRON_AXE, ArmoryItems.STEEL_AXE);
        offerSteelUpgradeRecipe(exporter, Items.IRON_SHOVEL, ArmoryItems.STEEL_SHOVEL);
        offerSteelUpgradeRecipe(exporter, Items.IRON_HOE, ArmoryItems.STEEL_HOE);
        offerSteelUpgradeRecipe(exporter, ArmoryItems.IRON_CLAYMORE, ArmoryItems.STEEL_CLAYMORE);
        offerSteelUpgradeRecipe(exporter, ArmoryItems.IRON_SICKLE, ArmoryItems.STEEL_SICKLE);
        offerSteelUpgradeRecipe(exporter, ArmoryItems.IRON_DAGGER, ArmoryItems.STEEL_DAGGER);
        offerSteelUpgradeRecipe(exporter, ArmoryItems.IRON_DOUBLE_AXE, ArmoryItems.STEEL_DOUBLE_AXE);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.OAK_SWORD, ArmoryTags.Items.WOODEN_SWORDS, Items.OAK_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.OAK_PICKAXE, ArmoryTags.Items.WOODEN_PICKAXES, Items.OAK_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.OAK_AXE, ArmoryTags.Items.WOODEN_SINGLE_AXES, Items.OAK_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.OAK_SHOVEL, ArmoryTags.Items.WOODEN_SHOVELS, Items.OAK_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.OAK_HOE, ArmoryTags.Items.WOODEN_HOES, Items.OAK_PLANKS);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.OAK_CLAYMORE, ArmoryTags.Items.WOODEN_CLAYMORES, Items.OAK_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.OAK_SICKLE, ArmoryTags.Items.WOODEN_SICKLES, Items.OAK_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.OAK_DAGGER, ArmoryTags.Items.WOODEN_DAGGERS, Items.OAK_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.OAK_DOUBLE_AXE, ArmoryTags.Items.WOODEN_DOUBLE_AXES, Items.OAK_PLANKS);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.SPRUCE_SWORD, ArmoryTags.Items.WOODEN_SWORDS, Items.SPRUCE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.SPRUCE_PICKAXE, ArmoryTags.Items.WOODEN_PICKAXES, Items.SPRUCE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.SPRUCE_AXE, ArmoryTags.Items.WOODEN_SINGLE_AXES, Items.SPRUCE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.SPRUCE_SHOVEL, ArmoryTags.Items.WOODEN_SHOVELS, Items.SPRUCE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.SPRUCE_HOE, ArmoryTags.Items.WOODEN_HOES, Items.SPRUCE_PLANKS);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.SPRUCE_CLAYMORE, ArmoryTags.Items.WOODEN_CLAYMORES, Items.SPRUCE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.SPRUCE_SICKLE, ArmoryTags.Items.WOODEN_SICKLES, Items.SPRUCE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.SPRUCE_DAGGER, ArmoryTags.Items.WOODEN_DAGGERS, Items.SPRUCE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.SPRUCE_DOUBLE_AXE, ArmoryTags.Items.WOODEN_DOUBLE_AXES, Items.SPRUCE_PLANKS);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.BIRCH_SWORD, ArmoryTags.Items.WOODEN_SWORDS, Items.BIRCH_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.BIRCH_PICKAXE, ArmoryTags.Items.WOODEN_PICKAXES, Items.BIRCH_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.BIRCH_AXE, ArmoryTags.Items.WOODEN_SINGLE_AXES, Items.BIRCH_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.BIRCH_SHOVEL, ArmoryTags.Items.WOODEN_SHOVELS, Items.BIRCH_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.BIRCH_HOE, ArmoryTags.Items.WOODEN_HOES, Items.BIRCH_PLANKS);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.BIRCH_CLAYMORE, ArmoryTags.Items.WOODEN_CLAYMORES, Items.BIRCH_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.BIRCH_SICKLE, ArmoryTags.Items.WOODEN_SICKLES, Items.BIRCH_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.BIRCH_DAGGER, ArmoryTags.Items.WOODEN_DAGGERS, Items.BIRCH_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.BIRCH_DOUBLE_AXE, ArmoryTags.Items.WOODEN_DOUBLE_AXES, Items.BIRCH_PLANKS);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.JUNGLE_SWORD, ArmoryTags.Items.WOODEN_SWORDS, Items.JUNGLE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.JUNGLE_PICKAXE, ArmoryTags.Items.WOODEN_PICKAXES, Items.JUNGLE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.JUNGLE_AXE, ArmoryTags.Items.WOODEN_SINGLE_AXES, Items.JUNGLE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.JUNGLE_SHOVEL, ArmoryTags.Items.WOODEN_SHOVELS, Items.JUNGLE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.JUNGLE_HOE, ArmoryTags.Items.WOODEN_HOES, Items.JUNGLE_PLANKS);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.JUNGLE_CLAYMORE, ArmoryTags.Items.WOODEN_CLAYMORES, Items.JUNGLE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.JUNGLE_SICKLE, ArmoryTags.Items.WOODEN_SICKLES, Items.JUNGLE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.JUNGLE_DAGGER, ArmoryTags.Items.WOODEN_DAGGERS, Items.JUNGLE_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.JUNGLE_DOUBLE_AXE, ArmoryTags.Items.WOODEN_DOUBLE_AXES, Items.JUNGLE_PLANKS);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.ACACIA_SWORD, ArmoryTags.Items.WOODEN_SWORDS, Items.ACACIA_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.ACACIA_PICKAXE, ArmoryTags.Items.WOODEN_PICKAXES, Items.ACACIA_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.ACACIA_AXE, ArmoryTags.Items.WOODEN_SINGLE_AXES, Items.ACACIA_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.ACACIA_SHOVEL, ArmoryTags.Items.WOODEN_SHOVELS, Items.ACACIA_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.ACACIA_HOE, ArmoryTags.Items.WOODEN_HOES, Items.ACACIA_PLANKS);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.ACACIA_CLAYMORE, ArmoryTags.Items.WOODEN_CLAYMORES, Items.ACACIA_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.ACACIA_SICKLE, ArmoryTags.Items.WOODEN_SICKLES, Items.ACACIA_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.ACACIA_DAGGER, ArmoryTags.Items.WOODEN_DAGGERS, Items.ACACIA_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.ACACIA_DOUBLE_AXE, ArmoryTags.Items.WOODEN_DOUBLE_AXES, Items.ACACIA_PLANKS);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.CRIMSON_SWORD, ArmoryTags.Items.WOODEN_SWORDS, Items.CRIMSON_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.CRIMSON_PICKAXE, ArmoryTags.Items.WOODEN_PICKAXES, Items.CRIMSON_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.CRIMSON_AXE, ArmoryTags.Items.WOODEN_SINGLE_AXES, Items.CRIMSON_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.CRIMSON_SHOVEL, ArmoryTags.Items.WOODEN_SHOVELS, Items.CRIMSON_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.CRIMSON_HOE, ArmoryTags.Items.WOODEN_HOES, Items.CRIMSON_PLANKS);

        offerWoodenToolVariantRecipe(exporter, ArmoryItems.CRIMSON_CLAYMORE, ArmoryTags.Items.WOODEN_CLAYMORES, Items.CRIMSON_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.CRIMSON_SICKLE, ArmoryTags.Items.WOODEN_SICKLES, Items.CRIMSON_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.CRIMSON_DAGGER, ArmoryTags.Items.WOODEN_DAGGERS, Items.CRIMSON_PLANKS);
        offerWoodenToolVariantRecipe(exporter, ArmoryItems.CRIMSON_DOUBLE_AXE, ArmoryTags.Items.WOODEN_DOUBLE_AXES, Items.CRIMSON_PLANKS);
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
    public static void offerSteelUpgradeRecipe(Consumer<RecipeJsonProvider> exporter, Item input, Item output) {
        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(input), Ingredient.ofItems(ArmoryItems.STEEL_INGOT), output).criterion("has_steel_ingot", RecipeProvider.conditionsFromItem(ArmoryItems.STEEL_INGOT)).offerTo(exporter, RecipeProvider.getItemPath(output) + "_smithing");
    }
    public static void offerWoodenToolVariantRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output,
                                                    TagKey<Item> toolInput, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(output)
                .input('#', woodInput)
                .input('$', toolInput)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group(toolInput.toString())
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(output)));
    }
}
