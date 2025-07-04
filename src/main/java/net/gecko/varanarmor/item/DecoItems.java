package net.gecko.varanarmor.item;

import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.item.arrow.AmethystArrowItem;
import net.gecko.varanarmor.item.arrow.IronArrowItem;
import net.gecko.varanarmor.item.arrow.NetherArrowItem;
import net.gecko.varanarmor.item.arrow.QuartzArrowItem;
import net.gecko.varanarmor.item.components.DecoFoodComponents;
import net.gecko.varanarmor.item.components.DecoToolMaterials;
import net.gecko.varanarmor.item.tools.ClaymoreItem;
import net.gecko.varanarmor.item.tools.SickleItem;
import net.gecko.varanarmor.item.tools.fishing_rods.NautilusFishingRodItem;
import net.gecko.varanarmor.item.tools.fishing_rods.SquidFishingRodItem;
import net.gecko.varanarmor.item.fixes.FixedHoeItem;
import net.gecko.varanarmor.item.tools.bow.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoItems {
    public static final Item FLINT_ROD = registerItem("flint_rod",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item COPPER_ROD = registerItem("copper_rod",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_ROD = registerItem("quartz_rod",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item BRACED_STICK = registerItem("braced_stick",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item HEAVY_FLINT_ROD = registerItem("heavy_flint_rod",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item HEAVY_COPPER_ROD = registerItem("heavy_copper_rod",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item HEAVY_QUARTZ_ROD = registerItem("heavy_quartz_rod",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item GOLDEN_FEATHER = registerItem("golden_feather",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item SQUID_TENTACLES = registerItem("squid_tentacles",
            new Item(new Item.Settings().food(DecoFoodComponents.SQUID_TENTACLES).group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item GLOW_SQUID_TENTACLES = registerItem("glow_squid_tentacles",
            new Item(new Item.Settings().food(DecoFoodComponents.GLOW_SQUID_TENTACLES).group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COOKED_SQUID_TENTACLES = registerItem("cooked_squid_tentacles",
            new Item(new Item.Settings().food(DecoFoodComponents.COOKED_SQUID_TENTACLES).group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_WOODEN_SWORD = registerItem("flint_wooden_sword",
            new SwordItem(DecoToolMaterials.FLINT_WOOD, 3, -2.4F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_SHOVEL = registerItem("flint_wooden_shovel",
            new ShovelItem(DecoToolMaterials.FLINT_WOOD, 1.5F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_PICKAXE = registerItem("flint_wooden_pickaxe",
            new PickaxeItem(DecoToolMaterials.FLINT_WOOD, 1, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_AXE = registerItem("flint_wooden_axe",
            new AxeItem(DecoToolMaterials.FLINT_WOOD, 6.0F, -3.2F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_HOE = registerItem("flint_wooden_hoe",
            new FixedHoeItem(DecoToolMaterials.FLINT_WOOD,0, -3.0F,  new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item COPPER_WOODEN_SWORD = registerItem("copper_wooden_sword",
            new SwordItem(DecoToolMaterials.COPPER_WOOD, 3, -2.2F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_WOODEN_SHOVEL = registerItem("copper_wooden_shovel",
            new ShovelItem(DecoToolMaterials.COPPER_WOOD, 1.5F, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_WOODEN_PICKAXE = registerItem("copper_wooden_pickaxe",
            new PickaxeItem(DecoToolMaterials.COPPER_WOOD, 1, -2.6F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_WOODEN_AXE = registerItem("copper_wooden_axe",
            new AxeItem(DecoToolMaterials.COPPER_WOOD, 6.0F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_WOODEN_HOE = registerItem("copper_wooden_hoe",
            new FixedHoeItem(DecoToolMaterials.COPPER_WOOD,0, -2.0F,  new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_WOODEN_SWORD = registerItem("quartz_wooden_sword",
            new SwordItem(DecoToolMaterials.QUARTZ_WOOD, 3, -2.4F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_SHOVEL = registerItem("quartz_wooden_shovel",
            new ShovelItem(DecoToolMaterials.QUARTZ_WOOD, 1.5F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_PICKAXE = registerItem("quartz_wooden_pickaxe",
            new PickaxeItem(DecoToolMaterials.QUARTZ_WOOD, 1, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_AXE = registerItem("quartz_wooden_axe",
            new AxeItem(DecoToolMaterials.QUARTZ_WOOD, 6.0F, -3.2F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_HOE = registerItem("quartz_wooden_hoe",
            new FixedHoeItem(DecoToolMaterials.QUARTZ_WOOD,0, -3.0F,  new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_STONE_SWORD = registerItem("flint_stone_sword",
            new SwordItem(DecoToolMaterials.FLINT_STONE, 3, -2.4F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_SHOVEL = registerItem("flint_stone_shovel",
            new ShovelItem(DecoToolMaterials.FLINT_STONE, 1.5F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_PICKAXE = registerItem("flint_stone_pickaxe",
            new PickaxeItem(DecoToolMaterials.FLINT_STONE, 1, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_AXE = registerItem("flint_stone_axe",
            new AxeItem(DecoToolMaterials.FLINT_STONE, 7.0F, -3.2F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_HOE = registerItem("flint_stone_hoe",
            new FixedHoeItem(DecoToolMaterials.FLINT_STONE,-1, -2.0F,  new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item COPPER_STONE_SWORD = registerItem("copper_stone_sword",
            new SwordItem(DecoToolMaterials.COPPER_STONE, 3, -2.2F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_STONE_SHOVEL = registerItem("copper_stone_shovel",
            new ShovelItem(DecoToolMaterials.COPPER_STONE, 1.5F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_STONE_PICKAXE = registerItem("copper_stone_pickaxe",
            new PickaxeItem(DecoToolMaterials.COPPER_STONE, 1, -2.6F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_STONE_AXE = registerItem("copper_stone_axe",
            new AxeItem(DecoToolMaterials.COPPER_STONE, 7.0F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_STONE_HOE = registerItem("copper_stone_hoe",
            new FixedHoeItem(DecoToolMaterials.COPPER_STONE,-1, -1.0F,  new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_STONE_SWORD = registerItem("quartz_stone_sword",
            new SwordItem(DecoToolMaterials.QUARTZ_STONE, 3, -2.4F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_SHOVEL = registerItem("quartz_stone_shovel",
            new ShovelItem(DecoToolMaterials.QUARTZ_STONE, 1.5F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_PICKAXE = registerItem("quartz_stone_pickaxe",
            new PickaxeItem(DecoToolMaterials.QUARTZ_STONE, 1, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_AXE = registerItem("quartz_stone_axe",
            new AxeItem(DecoToolMaterials.QUARTZ_STONE, 7.0F, -3.2F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_HOE = registerItem("quartz_stone_hoe",
            new FixedHoeItem(DecoToolMaterials.QUARTZ_STONE,-1, -2.0F,  new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_GOLDEN_SWORD = registerItem("flint_golden_sword",
            new SwordItem(DecoToolMaterials.FLINT_GOLD, 3, -2.4F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_SHOVEL = registerItem("flint_golden_shovel",
            new ShovelItem(DecoToolMaterials.FLINT_GOLD, 1.5F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_PICKAXE = registerItem("flint_golden_pickaxe",
            new PickaxeItem(DecoToolMaterials.FLINT_GOLD, 1, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_AXE = registerItem("flint_golden_axe",
            new AxeItem(DecoToolMaterials.FLINT_GOLD, 6.0F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_HOE = registerItem("flint_golden_hoe",
            new FixedHoeItem(DecoToolMaterials.FLINT_GOLD, 0, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item COPPER_GOLDEN_SWORD = registerItem("copper_golden_sword",
            new SwordItem(DecoToolMaterials.COPPER_GOLD, 3, -2.2F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_GOLDEN_SHOVEL = registerItem("copper_golden_shovel",
            new ShovelItem(DecoToolMaterials.COPPER_GOLD, 1.5F, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_GOLDEN_PICKAXE = registerItem("copper_golden_pickaxe",
            new PickaxeItem(DecoToolMaterials.COPPER_GOLD, 1, -2.6F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_GOLDEN_AXE = registerItem("copper_golden_axe",
            new AxeItem(DecoToolMaterials.COPPER_GOLD, 6.0F, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_GOLDEN_HOE = registerItem("copper_golden_hoe",
            new FixedHoeItem(DecoToolMaterials.COPPER_GOLD, 0, -2.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_GOLDEN_SWORD = registerItem("quartz_golden_sword",
            new SwordItem(DecoToolMaterials.QUARTZ_GOLD, 3, -2.4F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_SHOVEL = registerItem("quartz_golden_shovel",
            new ShovelItem(DecoToolMaterials.QUARTZ_GOLD, 1.5F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_PICKAXE = registerItem("quartz_golden_pickaxe",
            new PickaxeItem(DecoToolMaterials.QUARTZ_GOLD, 1, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_AXE = registerItem("quartz_golden_axe",
            new AxeItem(DecoToolMaterials.QUARTZ_GOLD, 6.0F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_HOE = registerItem("quartz_golden_hoe",
            new FixedHoeItem(DecoToolMaterials.QUARTZ_GOLD, 0, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_IRON_SWORD = registerItem("flint_iron_sword",
            new SwordItem(DecoToolMaterials.FLINT_IRON, 3, -2.4F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_SHOVEL = registerItem("flint_iron_shovel",
            new ShovelItem(DecoToolMaterials.FLINT_IRON, 1.5F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_PICKAXE = registerItem("flint_iron_pickaxe",
            new PickaxeItem(DecoToolMaterials.FLINT_IRON, 1, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_AXE = registerItem("flint_iron_axe",
            new AxeItem(DecoToolMaterials.FLINT_IRON, 6.0F, -3.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_HOE = registerItem("flint_iron_hoe",
            new FixedHoeItem(DecoToolMaterials.FLINT_IRON, -2, -1.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item COPPER_IRON_SWORD = registerItem("copper_iron_sword",
            new SwordItem(DecoToolMaterials.COPPER_IRON, 3, -2.2F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_IRON_SHOVEL = registerItem("copper_iron_shovel",
            new ShovelItem(DecoToolMaterials.COPPER_IRON, 1.5F, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_IRON_PICKAXE = registerItem("copper_iron_pickaxe",
            new PickaxeItem(DecoToolMaterials.COPPER_IRON, 1, -2.6F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_IRON_AXE = registerItem("copper_iron_axe",
            new AxeItem(DecoToolMaterials.COPPER_IRON, 6.0F, -2.9F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_IRON_HOE = registerItem("copper_iron_hoe",
            new FixedHoeItem(DecoToolMaterials.COPPER_IRON, -2, 0.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_IRON_SWORD = registerItem("quartz_iron_sword",
            new SwordItem(DecoToolMaterials.QUARTZ_IRON, 3, -2.4F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_SHOVEL = registerItem("quartz_iron_shovel",
            new ShovelItem(DecoToolMaterials.QUARTZ_IRON, 1.5F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_PICKAXE = registerItem("quartz_iron_pickaxe",
            new PickaxeItem(DecoToolMaterials.QUARTZ_IRON, 1, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_AXE = registerItem("quartz_iron_axe",
            new AxeItem(DecoToolMaterials.QUARTZ_IRON, 6.0F, -3.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_HOE = registerItem("quartz_iron_hoe",
            new FixedHoeItem(DecoToolMaterials.QUARTZ_IRON, -2, -1.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_DIAMOND_SWORD = registerItem("flint_diamond_sword",
            new SwordItem(DecoToolMaterials.FLINT_DIAMOND, 3, -2.4F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_SHOVEL = registerItem("flint_diamond_shovel",
            new ShovelItem(DecoToolMaterials.FLINT_DIAMOND, 1.5F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_PICKAXE = registerItem("flint_diamond_pickaxe",
            new PickaxeItem(DecoToolMaterials.FLINT_DIAMOND, 1, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_AXE = registerItem("flint_diamond_axe",
            new AxeItem(DecoToolMaterials.FLINT_DIAMOND, 5.0F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_HOE = registerItem("flint_diamond_hoe",
            new FixedHoeItem(DecoToolMaterials.FLINT_DIAMOND, -3, 0.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item COPPER_DIAMOND_SWORD = registerItem("copper_diamond_sword",
            new SwordItem(DecoToolMaterials.COPPER_DIAMOND, 3, -2.2F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_DIAMOND_SHOVEL = registerItem("copper_diamond_shovel",
            new ShovelItem(DecoToolMaterials.COPPER_DIAMOND, 1.5F, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_DIAMOND_PICKAXE = registerItem("copper_diamond_pickaxe",
            new PickaxeItem(DecoToolMaterials.COPPER_DIAMOND, 1, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_DIAMOND_AXE = registerItem("copper_diamond_axe",
            new AxeItem(DecoToolMaterials.COPPER_DIAMOND, 5.0F, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_DIAMOND_HOE = registerItem("copper_diamond_hoe",
            new FixedHoeItem(DecoToolMaterials.COPPER_DIAMOND, -3, 1.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_DIAMOND_SWORD = registerItem("quartz_diamond_sword",
            new SwordItem(DecoToolMaterials.QUARTZ_DIAMOND, 3, -2.4F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_SHOVEL = registerItem("quartz_diamond_shovel",
            new ShovelItem(DecoToolMaterials.QUARTZ_DIAMOND, 1.5F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_PICKAXE = registerItem("quartz_diamond_pickaxe",
            new PickaxeItem(DecoToolMaterials.QUARTZ_DIAMOND, 1, -2.8F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_AXE = registerItem("quartz_diamond_axe",
            new AxeItem(DecoToolMaterials.QUARTZ_DIAMOND, 5.0F, -3.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_HOE = registerItem("quartz_diamond_hoe",
            new FixedHoeItem(DecoToolMaterials.QUARTZ_DIAMOND, -3, 0.0F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_NETHERITE_SWORD = registerItem("flint_netherite_sword",
            new SwordItem(DecoToolMaterials.FLINT_NETHERITE, 3, -2.4F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_SHOVEL = registerItem("flint_netherite_shovel",
            new ShovelItem(DecoToolMaterials.FLINT_NETHERITE, 1.5F, -3.0F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_PICKAXE = registerItem("flint_netherite_pickaxe",
            new PickaxeItem(DecoToolMaterials.FLINT_NETHERITE, 1, -2.8F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_AXE = registerItem("flint_netherite_axe",
            new AxeItem(DecoToolMaterials.FLINT_NETHERITE, 5.0F, -3.0F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_HOE = registerItem("flint_netherite_hoe",
            new FixedHoeItem(DecoToolMaterials.FLINT_NETHERITE, -4, 0.0F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item COPPER_NETHERITE_SWORD = registerItem("copper_netherite_sword",
            new SwordItem(DecoToolMaterials.COPPER_NETHERITE, 3, -2.2F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item COPPER_NETHERITE_SHOVEL = registerItem("copper_netherite_shovel",
            new ShovelItem(DecoToolMaterials.COPPER_NETHERITE, 1.5F, -2.8F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item COPPER_NETHERITE_PICKAXE = registerItem("copper_netherite_pickaxe",
            new PickaxeItem(DecoToolMaterials.COPPER_NETHERITE, 1, -2.4F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item COPPER_NETHERITE_AXE = registerItem("copper_netherite_axe",
            new AxeItem(DecoToolMaterials.COPPER_NETHERITE, 5.0F, -2.8F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item COPPER_NETHERITE_HOE = registerItem("copper_netherite_hoe",
            new FixedHoeItem(DecoToolMaterials.COPPER_NETHERITE, -4, 1.0F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item QUARTZ_NETHERITE_SWORD = registerItem("quartz_netherite_sword",
            new SwordItem(DecoToolMaterials.QUARTZ_NETHERITE, 3, -2.4F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_SHOVEL = registerItem("quartz_netherite_shovel",
            new ShovelItem(DecoToolMaterials.QUARTZ_NETHERITE, 1.5F, -3.0F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_PICKAXE = registerItem("quartz_netherite_pickaxe",
            new PickaxeItem(DecoToolMaterials.QUARTZ_NETHERITE, 1, -2.8F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_AXE = registerItem("quartz_netherite_axe",
            new AxeItem(DecoToolMaterials.QUARTZ_NETHERITE, 5.0F, -3.0F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_HOE = registerItem("quartz_netherite_hoe",
            new FixedHoeItem(DecoToolMaterials.QUARTZ_NETHERITE, -4, 0.0F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item WOODEN_SICKLE = registerItem("wooden_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_SICKLE = registerItem("flint_wooden_sickle",
            new SickleItem(DecoToolMaterials.FLINT_WOOD, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_WOODEN_SICKLE = registerItem("copper_wooden_sickle",
            new SickleItem(DecoToolMaterials.COPPER_WOOD, 1.75F, -1.9F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_SICKLE = registerItem("quartz_wooden_sickle",
            new SickleItem(DecoToolMaterials.QUARTZ_WOOD, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item STONE_SICKLE = registerItem("stone_sickle",
            new SickleItem(ToolMaterials.STONE, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_SICKLE = registerItem("flint_stone_sickle",
            new SickleItem(DecoToolMaterials.FLINT_STONE, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_STONE_SICKLE = registerItem("copper_stone_sickle",
            new SickleItem(DecoToolMaterials.COPPER_STONE, 1.75F, -1.9F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_SICKLE = registerItem("quartz_stone_sickle",
            new SickleItem(DecoToolMaterials.QUARTZ_STONE, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item GOLDEN_SICKLE = registerItem("golden_sickle",
            new SickleItem(ToolMaterials.GOLD, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_SICKLE = registerItem("flint_golden_sickle",
            new SickleItem(DecoToolMaterials.FLINT_GOLD, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_GOLDEN_SICKLE = registerItem("copper_golden_sickle",
            new SickleItem(DecoToolMaterials.COPPER_GOLD, 1.75F, -1.9F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_SICKLE = registerItem("quartz_golden_sickle",
            new SickleItem(DecoToolMaterials.QUARTZ_GOLD, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item IRON_SICKLE = registerItem("iron_sickle",
            new SickleItem(ToolMaterials.IRON, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_SICKLE = registerItem("flint_iron_sickle",
            new SickleItem(DecoToolMaterials.FLINT_IRON, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_IRON_SICKLE = registerItem("copper_iron_sickle",
            new SickleItem(DecoToolMaterials.COPPER_IRON, 1.75F, -1.9F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_SICKLE = registerItem("quartz_iron_sickle",
            new SickleItem(DecoToolMaterials.QUARTZ_IRON, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item DIAMOND_SICKLE = registerItem("diamond_sickle",
            new SickleItem(ToolMaterials.DIAMOND, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_SICKLE = registerItem("flint_diamond_sickle",
            new SickleItem(DecoToolMaterials.FLINT_DIAMOND, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_DIAMOND_SICKLE = registerItem("copper_diamond_sickle",
            new SickleItem(DecoToolMaterials.COPPER_DIAMOND, 1.75F, -1.9F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_SICKLE = registerItem("quartz_diamond_sickle",
            new SickleItem(DecoToolMaterials.QUARTZ_DIAMOND, 1.75F, -2.1F, new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item NETHERITE_SICKLE = registerItem("netherite_sickle",
            new SickleItem(ToolMaterials.NETHERITE, 1.75F, -2.1F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_SICKLE = registerItem("flint_netherite_sickle",
            new SickleItem(DecoToolMaterials.FLINT_NETHERITE, 1.75F, -2.1F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item COPPER_NETHERITE_SICKLE = registerItem("copper_netherite_sickle",
            new SickleItem(DecoToolMaterials.COPPER_NETHERITE, 1.75F, -1.9F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_SICKLE = registerItem("quartz_netherite_sickle",
            new SickleItem(DecoToolMaterials.QUARTZ_NETHERITE, 1.75F, -2.1F,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item WOODEN_CLAYMORE = registerItem("wooden_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_WOOD, 8, -3.4F, 600, 3,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_CLAYMORE = registerItem("flint_wooden_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_FLINT_WOOD, 8, -3.4F, 600, 3,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_WOODEN_CLAYMORE = registerItem("copper_wooden_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_COPPER_WOOD, 8, -3.2F, 600, 3,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_CLAYMORE = registerItem("quartz_wooden_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_QUARTZ_WOOD, 8, -3.4F, 600, 3,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item STONE_CLAYMORE = registerItem("stone_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_STONE, 9, -3.4F, 400, 3,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_CLAYMORE = registerItem("flint_stone_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_FLINT_STONE, 9, -3.4F, 400, 3,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_STONE_CLAYMORE = registerItem("copper_stone_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_COPPER_STONE, 9, -3.2F, 400, 3,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_CLAYMORE = registerItem("quartz_stone_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_QUARTZ_STONE, 9, -3.4F, 400, 3,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item GOLDEN_CLAYMORE = registerItem("golden_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_GOLD, 8, -3.4F, 200, 1,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_CLAYMORE = registerItem("flint_golden_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_FLINT_GOLD, 8, -3.4F, 200, 1,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_GOLDEN_CLAYMORE = registerItem("copper_golden_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_COPPER_GOLD, 8, -3.2F, 200, 1,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_CLAYMORE = registerItem("quartz_golden_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_QUARTZ_GOLD, 8, -3.4F, 200, 1,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item IRON_CLAYMORE = registerItem("iron_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_IRON, 8, -3.4F, 400, 2,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_CLAYMORE = registerItem("flint_iron_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_FLINT_IRON, 8, -3.4F, 400, 2,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_IRON_CLAYMORE = registerItem("copper_iron_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_COPPER_IRON, 8, -3.2F, 400, 2,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_CLAYMORE = registerItem("quartz_iron_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_QUARTZ_IRON, 8, -3.4F, 400, 2,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item DIAMOND_CLAYMORE = registerItem("diamond_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_DIAMOND, 7, -3.4F, 200, 2,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_CLAYMORE = registerItem("flint_diamond_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_FLINT_DIAMOND, 7, -3.4F, 200, 2,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_DIAMOND_CLAYMORE = registerItem("copper_diamond_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_COPPER_DIAMOND, 7, -3.2F, 200, 2,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_CLAYMORE = registerItem("quartz_diamond_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_QUARTZ_DIAMOND, 7, -3.4F, 200, 2,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item NETHERITE_CLAYMORE = registerItem("netherite_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_NETHERITE, 7, -3.4F, 200, 1,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_CLAYMORE = registerItem("flint_netherite_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_FLINT_NETHERITE, 7, -3.4F, 200, 1,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item COPPER_NETHERITE_CLAYMORE = registerItem("copper_netherite_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_COPPER_NETHERITE, 7, -3.2F, 200, 1,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_CLAYMORE = registerItem("quartz_netherite_claymore",
            new ClaymoreItem(DecoToolMaterials.HEAVY_QUARTZ_NETHERITE, 7, -3.4F, 200, 1,
                    new Item.Settings().group(DecoItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item WOODEN_BOW = registerItem("wooden_bow",
            new WoodenBowItem(new Item.Settings().maxDamage(90).group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_BOW = registerItem("copper_bow",
            new CopperBowItem(new Item.Settings().maxDamage(201).group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item DIAMOND_BOW = registerItem("diamond_bow",
            new DiamondBowItem(new Item.Settings().maxDamage(1787).group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item NETHERITE_BOW = registerItem("netherite_bow",
            new NetheriteBowItem(new Item.Settings().maxDamage(2218).group(DecoItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item BLAZING_BOW = registerItem("blazing_bow",
            new BlazingBowItem(new Item.Settings().maxDamage(522).group(DecoItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item SQUID_FISHING_ROD = registerItem("squid_fishing_rod",
            new SquidFishingRodItem(new Item.Settings().maxDamage(270).group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item NAUTILUS_FISHING_ROD = registerItem("nautilus_fishing_rod",
            new NautilusFishingRodItem(new Item.Settings().maxDamage(1686).group(DecoItemGroup.VARAN_ARMOR)));

    public static final Item IRON_ARROW = registerItem("iron_arrow",
            new IronArrowItem(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item AMETHYST_ARROW = registerItem("amethyst_arrow",
            new AmethystArrowItem(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_ARROW = registerItem("quartz_arrow",
            new QuartzArrowItem(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));
    public static final Item NETHER_ARROW = registerItem("nether_arrow",
            new NetherArrowItem(new Item.Settings().group(DecoItemGroup.VARAN_ARMOR)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VaranArmor.MOD_ID, name),item);
    }

    public static void registerDecoItems() {
        VaranArmor.LOGGER.debug("Registering Items for" + VaranArmor.MOD_ID);
    }
}
