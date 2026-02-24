package net.gecko.varanarmor.item;

import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.block.ArmoryBlocks;
import net.gecko.varanarmor.item.armour.model.BracerSuitItem;
import net.gecko.varanarmor.item.armour.model.MiningGooglesItem;
import net.gecko.varanarmor.item.armour.model.ParachutePantsItem;
import net.gecko.varanarmor.item.armour.model.SwiftBootsItem;
import net.gecko.varanarmor.item.arrow.*;
import net.gecko.varanarmor.item.components.ArmoryArmourMaterials;
import net.gecko.varanarmor.item.components.ArmoryFoodComponents;
import net.gecko.varanarmor.item.components.ArmoryToolMaterials;
import net.gecko.varanarmor.item.tools.ClaymoreItem;
import net.gecko.varanarmor.item.tools.DoubleAxeItem;
import net.gecko.varanarmor.item.tools.FixedHoeItem;
import net.gecko.varanarmor.item.tools.SickleItem;
import net.gecko.varanarmor.item.tools.bow.*;
import net.gecko.varanarmor.item.tools.fishing_rods.NautilusFishingRodItem;
import net.gecko.varanarmor.item.tools.fishing_rods.SquidFishingRodItem;
import net.gecko.varanarmor.item.tools.special.FirebrandItem;
import net.gecko.varanarmor.item.tools.special.HeartstealerItem;
import net.gecko.varanarmor.item.tools.special.ObsidastromItem;
import net.gecko.varanarmor.item.tools.special.SpindtoxItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ArmoryItems {

    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item STEEL_COMPOUND = registerItem("steel_compound",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item BRACED_STICK = registerItem("braced_stick",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item GOLDEN_FEATHER = registerItem("golden_feather",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item TANNED_LEATHER = registerItem("tanned_leather",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item WITHER_BONE = registerItem("wither_bone",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item MOLTEN_IRON = registerItem("molten_iron",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item IRON_PLATE = registerItem("iron_plate",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item POISONOUS_NEEDLE = registerItem("poisonous_needle",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item ONION_SEEDS = registerItem("onion_seeds",
            new AliasedBlockItem(ArmoryBlocks.ONIONS,new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item ONION = registerItem("onion",
            new Item(new Item.Settings().food(ArmoryFoodComponents.ONION).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item RAW_OMELET = registerItem("raw_omelet",
            new Item(new Item.Settings().food(ArmoryFoodComponents.RAW_OMELET).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item COOKED_OMELET = registerItem("cooked_omelet",
            new Item(new Item.Settings().food(ArmoryFoodComponents.OMELET).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SILVER_BEETROOT = registerItem("silver_beetroot",
            new Item(new Item.Settings().food(ArmoryFoodComponents.SILVER_BEETROOT).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SILVER_APPLE = registerItem("silver_apple",
            new Item(new Item.Settings().food(ArmoryFoodComponents.SILVER_APPLE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item ENCHANTED_SILVER_APPLE = registerItem("enchanted_silver_apple",
            new EnchantedGoldenAppleItem(new Item.Settings().food(ArmoryFoodComponents.ENCHANTED_SILVER_APPLE).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SQUID_TENTACLES = registerItem("squid_tentacles",
            new Item(new Item.Settings().food(ArmoryFoodComponents.SQUID_TENTACLES).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item GLOW_SQUID_TENTACLES = registerItem("glow_squid_tentacles",
            new Item(new Item.Settings().food(ArmoryFoodComponents.GLOW_SQUID_TENTACLES).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COOKED_SQUID_TENTACLES = registerItem("cooked_squid_tentacles",
            new Item(new Item.Settings().food(ArmoryFoodComponents.COOKED_SQUID_TENTACLES).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item CHICKEN_PIE = registerItem("chicken_pie",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CHICKEN_PIE).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item BEEF_PIE = registerItem("beef_pie",
            new Item(new Item.Settings().food(ArmoryFoodComponents.BEEF_PIE).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item APPLE_PIE = registerItem("apple_pie",
            new Item(new Item.Settings().food(ArmoryFoodComponents.APPLE_PIE).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item BERRY_PIE = registerItem("berry_pie",
            new Item(new Item.Settings().food(ArmoryFoodComponents.BERRY_PIE).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item CUPCAKE = registerItem("cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item WHITE_CUPCAKE = registerItem("white_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item ORANGE_CUPCAKE = registerItem("orange_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item MAGENTA_CUPCAKE = registerItem("magenta_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LIGHT_BLUE_CUPCAKE = registerItem("light_blue_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item YELLOW_CUPCAKE = registerItem("yellow_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LIME_CUPCAKE = registerItem("lime_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item PINK_CUPCAKE = registerItem("pink_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item GRAY_CUPCAKE = registerItem("gray_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LIGHT_GRAY_CUPCAKE = registerItem("light_gray_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item CYAN_CUPCAKE = registerItem("cyan_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item PURPLE_CUPCAKE = registerItem("purple_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item BLUE_CUPCAKE = registerItem("blue_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item BROWN_CUPCAKE = registerItem("brown_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item GREEN_CUPCAKE = registerItem("green_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item RED_CUPCAKE = registerItem("red_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item BLACK_CUPCAKE = registerItem("black_cupcake",
            new Item(new Item.Settings().food(ArmoryFoodComponents.CUPCAKE).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item HARD_BOILED_EGG = registerItem("hard_boiled_egg",
            new Item(new Item.Settings().food(ArmoryFoodComponents.HARD_BOILED_EGG).maxCount(16).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FRIED_EGG = registerItem("fried_egg",
            new Item(new Item.Settings().food(ArmoryFoodComponents.FRIED_EGG).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item OAK_SWORD = registerItem("oak_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item OAK_SHOVEL = registerItem("oak_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item OAK_PICKAXE = registerItem("oak_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item OAK_AXE = registerItem("oak_axe",
            new AxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item OAK_HOE = registerItem("oak_hoe",
            new FixedHoeItem(ToolMaterials.WOOD, 0, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SPRUCE_SWORD = registerItem("spruce_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SPRUCE_SHOVEL = registerItem("spruce_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SPRUCE_PICKAXE = registerItem("spruce_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SPRUCE_AXE = registerItem("spruce_axe",
            new AxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SPRUCE_HOE = registerItem("spruce_hoe",
            new FixedHoeItem(ToolMaterials.WOOD, 0, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item BIRCH_SWORD = registerItem("birch_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item BIRCH_SHOVEL = registerItem("birch_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item BIRCH_PICKAXE = registerItem("birch_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item BIRCH_AXE = registerItem("birch_axe",
            new AxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item BIRCH_HOE = registerItem("birch_hoe",
            new FixedHoeItem(ToolMaterials.WOOD, 0, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item JUNGLE_SWORD = registerItem("jungle_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item JUNGLE_SHOVEL = registerItem("jungle_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item JUNGLE_PICKAXE = registerItem("jungle_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item JUNGLE_AXE = registerItem("jungle_axe",
            new AxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item JUNGLE_HOE = registerItem("jungle_hoe",
            new FixedHoeItem(ToolMaterials.WOOD, 0, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item ACACIA_SWORD = registerItem("acacia_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item ACACIA_SHOVEL = registerItem("acacia_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item ACACIA_PICKAXE = registerItem("acacia_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item ACACIA_AXE = registerItem("acacia_axe",
            new AxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item ACACIA_HOE = registerItem("acacia_hoe",
            new FixedHoeItem(ToolMaterials.WOOD, 0, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item DARK_OAK_SWORD = registerItem("dark_oak_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DARK_OAK_SHOVEL = registerItem("dark_oak_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DARK_OAK_PICKAXE = registerItem("dark_oak_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DARK_OAK_AXE = registerItem("dark_oak_axe",
            new AxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DARK_OAK_HOE = registerItem("dark_oak_hoe",
            new FixedHoeItem(ToolMaterials.WOOD, 0, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item MANGROVE_SWORD = registerItem("mangrove_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item MANGROVE_SHOVEL = registerItem("mangrove_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item MANGROVE_PICKAXE = registerItem("mangrove_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item MANGROVE_AXE = registerItem("mangrove_axe",
            new AxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item MANGROVE_HOE = registerItem("mangrove_hoe",
            new FixedHoeItem(ToolMaterials.WOOD, 0, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item CRIMSON_SWORD = registerItem("crimson_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item CRIMSON_SHOVEL = registerItem("crimson_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item CRIMSON_PICKAXE = registerItem("crimson_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item CRIMSON_AXE = registerItem("crimson_axe",
            new AxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item CRIMSON_HOE = registerItem("crimson_hoe",
            new FixedHoeItem(ToolMaterials.WOOD, 0, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item WARPED_SWORD = registerItem("warped_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item WARPED_SHOVEL = registerItem("warped_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item WARPED_PICKAXE = registerItem("warped_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item WARPED_AXE = registerItem("warped_axe",
            new AxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item WARPED_HOE = registerItem("warped_hoe",
            new FixedHoeItem(ToolMaterials.WOOD, 0, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ArmoryToolMaterials.COPPER, 3, -2.3F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ArmoryToolMaterials.COPPER, 1.5F, -2.9F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.COPPER, 1, -2.7F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ArmoryToolMaterials.COPPER, 7.0F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new FixedHoeItem(ArmoryToolMaterials.COPPER,-1, -2.0F,  new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new SwordItem(ArmoryToolMaterials.SILVER, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SILVER_SHOVEL = registerItem("silver_shovel",
            new ShovelItem(ArmoryToolMaterials.SILVER, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.SILVER, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SILVER_AXE = registerItem("silver_axe",
            new AxeItem(ArmoryToolMaterials.SILVER, 6.0F, -3.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SILVER_HOE = registerItem("silver_hoe",
            new FixedHoeItem(ArmoryToolMaterials.SILVER, -2, -1.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ArmoryToolMaterials.STEEL, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ArmoryToolMaterials.STEEL, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.STEEL, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ArmoryToolMaterials.STEEL, 5.0F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new FixedHoeItem(ArmoryToolMaterials.STEEL, -2, -1.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item HEARTSTEALER = registerItem("heartstealer",
            new HeartstealerItem(ArmoryToolMaterials.HEARTSTEALER, 2, -2.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FIREBRAND = registerItem("firebrand",
            new FirebrandItem(ArmoryToolMaterials.FIREBRAND, 7.0F, -3.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item WOODEN_DAGGER = registerItem("wooden_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item WOODEN_CLAYMORE = registerItem("wooden_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item WOODEN_DOUBLE_AXE = registerItem("wooden_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_WOOD, 7, -3.4F, 500, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item WOODEN_SICKLE = registerItem("wooden_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item OAK_DAGGER = registerItem("oak_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item OAK_CLAYMORE = registerItem("oak_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item OAK_DOUBLE_AXE = registerItem("oak_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_WOOD, 7, -3.4F, 500, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item OAK_SICKLE = registerItem("oak_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SPRUCE_DAGGER = registerItem("spruce_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SPRUCE_CLAYMORE = registerItem("spruce_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SPRUCE_DOUBLE_AXE = registerItem("spruce_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_WOOD, 7, -3.4F, 500, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SPRUCE_SICKLE = registerItem("spruce_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item BIRCH_DAGGER = registerItem("birch_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item BIRCH_CLAYMORE = registerItem("birch_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item BIRCH_DOUBLE_AXE = registerItem("birch_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_WOOD, 7, -3.4F, 500, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item BIRCH_SICKLE = registerItem("birch_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item JUNGLE_DAGGER = registerItem("jungle_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item JUNGLE_CLAYMORE = registerItem("jungle_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item JUNGLE_DOUBLE_AXE = registerItem("jungle_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_WOOD, 7, -3.4F, 500, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item JUNGLE_SICKLE = registerItem("jungle_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item ACACIA_DAGGER = registerItem("acacia_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item ACACIA_CLAYMORE = registerItem("acacia_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item ACACIA_DOUBLE_AXE = registerItem("acacia_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_WOOD, 7, -3.4F, 500, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item ACACIA_SICKLE = registerItem("acacia_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item DARK_OAK_DAGGER = registerItem("dark_oak_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DARK_OAK_CLAYMORE = registerItem("dark_oak_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DARK_OAK_DOUBLE_AXE = registerItem("dark_oak_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_WOOD, 7, -3.4F, 500, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DARK_OAK_SICKLE = registerItem("dark_oak_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item MANGROVE_DAGGER = registerItem("mangrove_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item MANGROVE_CLAYMORE = registerItem("mangrove_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item MANGROVE_DOUBLE_AXE = registerItem("mangrove_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_WOOD, 7, -3.4F, 500, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item MANGROVE_SICKLE = registerItem("mangrove_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item CRIMSON_DAGGER = registerItem("crimson_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item CRIMSON_CLAYMORE = registerItem("crimson_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item CRIMSON_DOUBLE_AXE = registerItem("crimson_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_WOOD, 7, -3.4F, 500, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item CRIMSON_SICKLE = registerItem("crimson_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item WARPED_DAGGER = registerItem("warped_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item WARPED_CLAYMORE = registerItem("warped_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item WARPED_DOUBLE_AXE = registerItem("warped_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_WOOD, 7, -3.4F, 500, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item WARPED_SICKLE = registerItem("warped_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item STONE_DAGGER = registerItem("stone_dagger",
            new SwordItem(ToolMaterials.STONE, 0, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STONE_CLAYMORE = registerItem("stone_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_STONE, 9, -3.4F, 400, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STONE_DOUBLE_AXE = registerItem("stone_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_STONE, 7, -3.4F, 300, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STONE_SICKLE = registerItem("stone_sickle",
            new SickleItem(ToolMaterials.STONE, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item GOLDEN_DAGGER = registerItem("golden_dagger",
            new SwordItem(ToolMaterials.GOLD, 1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item GOLDEN_CLAYMORE = registerItem("golden_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_GOLD, 9, -3.4F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item GOLDEN_DOUBLE_AXE = registerItem("golden_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_GOLD, 7, -3.4F, 100, 0,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item GOLDEN_SICKLE = registerItem("golden_sickle",
            new SickleItem(ToolMaterials.GOLD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item IRON_DAGGER = registerItem("iron_dagger",
            new SwordItem(ToolMaterials.IRON, 0, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item IRON_CLAYMORE = registerItem("iron_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_IRON, 8, -3.4F, 400, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item IRON_DOUBLE_AXE = registerItem("iron_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_IRON, 6, -3.4F, 300, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item IRON_SICKLE = registerItem("iron_sickle",
            new SickleItem(ToolMaterials.IRON, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",
            new SwordItem(ToolMaterials.DIAMOND, -1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DIAMOND_CLAYMORE = registerItem("diamond_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_DIAMOND, 7, -3.4F, 200, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DIAMOND_DOUBLE_AXE = registerItem("diamond_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_DIAMOND, 6, -3.4F, 300, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DIAMOND_SICKLE = registerItem("diamond_sickle",
            new SickleItem(ToolMaterials.DIAMOND, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            new SwordItem(ToolMaterials.NETHERITE, -1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item NETHERITE_CLAYMORE = registerItem("netherite_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_NETHERITE, 7, -3.4F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item NETHERITE_DOUBLE_AXE = registerItem("netherite_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_NETHERITE, 5, -3.4F, 100, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item NETHERITE_SICKLE = registerItem("netherite_sickle",
            new SickleItem(ToolMaterials.NETHERITE, 1.75F, -2.1F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item COPPER_DAGGER = registerItem("copper_dagger",
            new SwordItem(ArmoryToolMaterials.COPPER, 0, -1.1F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_CLAYMORE = registerItem("copper_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_COPPER, 9, -3.3F, 600, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_DOUBLE_AXE = registerItem("copper_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_COPPER, 7, -3.3F, 500, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_SICKLE = registerItem("copper_sickle",
            new SickleItem(ArmoryToolMaterials.COPPER, 1.75F, -2.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SILVER_DAGGER = registerItem("silver_dagger",
            new SwordItem(ArmoryToolMaterials.SILVER, 0, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SILVER_CLAYMORE = registerItem("silver_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_SILVER, 8, -3.4F, 300, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SILVER_DOUBLE_AXE = registerItem("silver_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_SILVER, 6, -3.4F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SILVER_SICKLE = registerItem("silver_sickle",
            new SickleItem(ArmoryToolMaterials.SILVER, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item STEEL_DAGGER = registerItem("steel_dagger",
            new SwordItem(ArmoryToolMaterials.STEEL, -1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_CLAYMORE = registerItem("steel_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_STEEL, 7, -3.4F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_DOUBLE_AXE = registerItem("steel_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_STEEL, 6, -3.4F, 300, 0,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_SICKLE = registerItem("steel_sickle",
            new SickleItem(ArmoryToolMaterials.STEEL, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SPINDTOX = registerItem("spindtox",
            new SpindtoxItem(ArmoryToolMaterials.SPINDTOX, 2, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item OBSIDASTROM = registerItem("obsidastrom",
            new ObsidastromItem(ArmoryToolMaterials.OBSIDASTROM, 7, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item WOODEN_BOW = registerItem("wooden_bow",
            new WoodenBowItem(new Item.Settings().maxDamage(90).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LEATHER_BOW = registerItem("leather_bow",
            new LeatherBowItem(new Item.Settings().maxDamage(201).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item GOLDEN_BOW = registerItem("golden_bow",
            new GoldenBowItem(new Item.Settings().maxDamage(49).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_BOW = registerItem("copper_bow",
            new CopperBowItem(new Item.Settings().maxDamage(293).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SILVER_BOW = registerItem("silver_bow",
            new SilverBowItem(new Item.Settings().maxDamage(585).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DIAMOND_BOW = registerItem("diamond_bow",
            new DiamondBowItem(new Item.Settings().maxDamage(1787).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_BOW = registerItem("steel_bow",
            new SteelBowItem(new Item.Settings().maxDamage(2024).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item NETHERITE_BOW = registerItem("netherite_bow",
            new NetheriteBowItem(new Item.Settings().maxDamage(2218).group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item BLAZING_BOW = registerItem("blazing_bow",
            new BlazingBowItem(new Item.Settings().maxDamage(522).group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item SQUID_FISHING_ROD = registerItem("squid_fishing_rod",
            new SquidFishingRodItem(new Item.Settings().maxDamage(270).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item NAUTILUS_FISHING_ROD = registerItem("nautilus_fishing_rod",
            new NautilusFishingRodItem(new Item.Settings().maxDamage(1686).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item IRON_ARROW = registerItem("iron_arrow",
            new IronArrowItem(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item AMETHYST_ARROW = registerItem("amethyst_arrow",
            new AmethystArrowItem(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_ARROW = registerItem("steel_arrow",
            new SteelArrowItem(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_ARROW = registerItem("quartz_arrow",
            new QuartzArrowItem(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item NETHER_ARROW = registerItem("nether_arrow",
            new NetherArrowItem(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ArmoryArmourMaterials.COPPER, EquipmentSlot.HEAD,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ArmoryArmourMaterials.COPPER, EquipmentSlot.CHEST,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ArmoryArmourMaterials.COPPER, EquipmentSlot.LEGS,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ArmoryArmourMaterials.COPPER, EquipmentSlot.FEET,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SILVER_HELMET = registerItem("silver_helmet",
            new ArmorItem(ArmoryArmourMaterials.SILVER, EquipmentSlot.HEAD,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate",
            new ArmorItem(ArmoryArmourMaterials.SILVER, EquipmentSlot.CHEST,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SILVER_LEGGINGS = registerItem("silver_leggings",
            new ArmorItem(ArmoryArmourMaterials.SILVER, EquipmentSlot.LEGS,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item SILVER_BOOTS = registerItem("silver_boots",
            new ArmorItem(ArmoryArmourMaterials.SILVER, EquipmentSlot.FEET,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ArmoryArmourMaterials.STEEL, EquipmentSlot.HEAD,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ArmoryArmourMaterials.STEEL, EquipmentSlot.CHEST,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ArmoryArmourMaterials.STEEL, EquipmentSlot.LEGS,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ArmoryArmourMaterials.STEEL, EquipmentSlot.FEET,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item HIGHLAND_HELMET = registerItem("highland_helmet",
            new ArmorItem(ArmoryArmourMaterials.HIGHLAND, EquipmentSlot.HEAD,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item HIGHLAND_CHESTPLATE = registerItem("highland_chestplate",
            new ArmorItem(ArmoryArmourMaterials.HIGHLAND, EquipmentSlot.CHEST,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item HIGHLAND_LEGGINGS = registerItem("highland_leggings",
            new ArmorItem(ArmoryArmourMaterials.HIGHLAND, EquipmentSlot.LEGS,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item HIGHLAND_BOOTS = registerItem("highland_boots",
            new ArmorItem(ArmoryArmourMaterials.HIGHLAND, EquipmentSlot.FEET,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item STALWART_HELMET = registerItem("stalwart_helmet",
            new ArmorItem(ArmoryArmourMaterials.STALWART, EquipmentSlot.HEAD,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STALWART_CHESTPLATE = registerItem("stalwart_chestplate",
            new ArmorItem(ArmoryArmourMaterials.STALWART, EquipmentSlot.CHEST,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STALWART_LEGGINGS = registerItem("stalwart_leggings",
            new ArmorItem(ArmoryArmourMaterials.STALWART, EquipmentSlot.LEGS,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item STALWART_BOOTS = registerItem("stalwart_boots",
            new ArmorItem(ArmoryArmourMaterials.STALWART, EquipmentSlot.FEET,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item MINING_GOOGLES = registerItem("mining_googles",
            new MiningGooglesItem(ArmoryArmourMaterials.GOOGLES, EquipmentSlot.HEAD,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item BRACER_SUIT = registerItem("bracer_suit",
            new BracerSuitItem(ArmoryArmourMaterials.BRACER, EquipmentSlot.CHEST,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item PARACHUTE_PANTS = registerItem("parachute_pants",
            new ParachutePantsItem(ArmoryArmourMaterials.PARACHUTE, EquipmentSlot.LEGS,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SWIFT_BOOTS = registerItem("swift_boots",
            new SwiftBootsItem(ArmoryArmourMaterials.SWIFT, EquipmentSlot.FEET,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VaranArmor.MOD_ID, name),item);
    }

    public static void registerArmoryItems() {
        VaranArmor.LOGGER.debug("Registering Items for" + VaranArmor.MOD_ID);
    }
}
