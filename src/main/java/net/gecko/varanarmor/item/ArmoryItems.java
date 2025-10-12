package net.gecko.varanarmor.item;

import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.item.armour.model.BracerSuitItem;
import net.gecko.varanarmor.item.armour.model.MiningGooglesItem;
import net.gecko.varanarmor.item.armour.model.ParachutePantsItem;
import net.gecko.varanarmor.item.armour.model.SwiftBootsItem;
import net.gecko.varanarmor.item.arrow.AmethystArrowItem;
import net.gecko.varanarmor.item.arrow.IronArrowItem;
import net.gecko.varanarmor.item.arrow.NetherArrowItem;
import net.gecko.varanarmor.item.arrow.QuartzArrowItem;
import net.gecko.varanarmor.item.components.ArmoryArmourMaterials;
import net.gecko.varanarmor.item.components.ArmoryFoodComponents;
import net.gecko.varanarmor.item.components.ArmoryToolMaterials;
import net.gecko.varanarmor.item.tools.DoubleAxeItem;
import net.gecko.varanarmor.item.tools.FixedHoeItem;
import net.gecko.varanarmor.item.tools.ClaymoreItem;
import net.gecko.varanarmor.item.tools.special.FirebrandItem;
import net.gecko.varanarmor.item.tools.SickleItem;
import net.gecko.varanarmor.item.tools.bow.*;
import net.gecko.varanarmor.item.tools.fishing_rods.NautilusFishingRodItem;
import net.gecko.varanarmor.item.tools.fishing_rods.SquidFishingRodItem;
import net.gecko.varanarmor.item.tools.special.PoisonDaggerItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ArmoryItems {
    public static final Item FLINT_ROD = registerItem("flint_rod",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item LAPIS_ROD = registerItem("lapis_rod",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_ROD = registerItem("quartz_rod",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item BRACED_STICK = registerItem("braced_stick",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item HEAVY_FLINT_ROD = registerItem("heavy_flint_rod",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item HEAVY_LAPIS_ROD = registerItem("heavy_lapis_rod",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item HEAVY_QUARTZ_ROD = registerItem("heavy_quartz_rod",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item GOLDEN_FEATHER = registerItem("golden_feather",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item WITHER_BONE = registerItem("wither_bone",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item POISONOUS_NEEDLE = registerItem("poisonous_needle",
            new Item(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item HARD_BOILED_EGG = registerItem("hard_boiled_egg",
            new Item(new Item.Settings().food(ArmoryFoodComponents.HARD_BOILED_EGG).maxCount(16).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FRIED_EGG = registerItem("fried_egg",
            new Item(new Item.Settings().food(ArmoryFoodComponents.FRIED_EGG).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item SQUID_TENTACLES = registerItem("squid_tentacles",
            new Item(new Item.Settings().food(ArmoryFoodComponents.SQUID_TENTACLES).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item GLOW_SQUID_TENTACLES = registerItem("glow_squid_tentacles",
            new Item(new Item.Settings().food(ArmoryFoodComponents.GLOW_SQUID_TENTACLES).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COOKED_SQUID_TENTACLES = registerItem("cooked_squid_tentacles",
            new Item(new Item.Settings().food(ArmoryFoodComponents.COOKED_SQUID_TENTACLES).group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_WOODEN_SWORD = registerItem("flint_wooden_sword",
            new SwordItem(ArmoryToolMaterials.FLINT_WOOD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_SHOVEL = registerItem("flint_wooden_shovel",
            new ShovelItem(ArmoryToolMaterials.FLINT_WOOD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_PICKAXE = registerItem("flint_wooden_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.FLINT_WOOD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_AXE = registerItem("flint_wooden_axe",
            new AxeItem(ArmoryToolMaterials.FLINT_WOOD, 6.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_HOE = registerItem("flint_wooden_hoe",
            new FixedHoeItem(ArmoryToolMaterials.FLINT_WOOD,0, -3.0F,  new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item LAPIS_WOODEN_SWORD = registerItem("lapis_wooden_sword",
            new SwordItem(ArmoryToolMaterials.LAPIS_WOOD, 3, -2.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_WOODEN_SHOVEL = registerItem("lapis_wooden_shovel",
            new ShovelItem(ArmoryToolMaterials.LAPIS_WOOD, 1.5F, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_WOODEN_PICKAXE = registerItem("lapis_wooden_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.LAPIS_WOOD, 1, -2.6F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_WOODEN_AXE = registerItem("lapis_wooden_axe",
            new AxeItem(ArmoryToolMaterials.LAPIS_WOOD, 6.0F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_WOODEN_HOE = registerItem("lapis_wooden_hoe",
            new FixedHoeItem(ArmoryToolMaterials.LAPIS_WOOD,0, -2.0F,  new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_WOODEN_SWORD = registerItem("quartz_wooden_sword",
            new SwordItem(ArmoryToolMaterials.QUARTZ_WOOD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_SHOVEL = registerItem("quartz_wooden_shovel",
            new ShovelItem(ArmoryToolMaterials.QUARTZ_WOOD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_PICKAXE = registerItem("quartz_wooden_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.QUARTZ_WOOD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_AXE = registerItem("quartz_wooden_axe",
            new AxeItem(ArmoryToolMaterials.QUARTZ_WOOD, 6.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_HOE = registerItem("quartz_wooden_hoe",
            new FixedHoeItem(ArmoryToolMaterials.QUARTZ_WOOD,0, -3.0F,  new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_STONE_SWORD = registerItem("flint_stone_sword",
            new SwordItem(ArmoryToolMaterials.FLINT_STONE, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_SHOVEL = registerItem("flint_stone_shovel",
            new ShovelItem(ArmoryToolMaterials.FLINT_STONE, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_PICKAXE = registerItem("flint_stone_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.FLINT_STONE, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_AXE = registerItem("flint_stone_axe",
            new AxeItem(ArmoryToolMaterials.FLINT_STONE, 7.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_HOE = registerItem("flint_stone_hoe",
            new FixedHoeItem(ArmoryToolMaterials.FLINT_STONE,-1, -2.0F,  new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item LAPIS_STONE_SWORD = registerItem("lapis_stone_sword",
            new SwordItem(ArmoryToolMaterials.LAPIS_STONE, 3, -2.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_STONE_SHOVEL = registerItem("lapis_stone_shovel",
            new ShovelItem(ArmoryToolMaterials.LAPIS_STONE, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_STONE_PICKAXE = registerItem("lapis_stone_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.LAPIS_STONE, 1, -2.6F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_STONE_AXE = registerItem("lapis_stone_axe",
            new AxeItem(ArmoryToolMaterials.LAPIS_STONE, 7.0F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_STONE_HOE = registerItem("lapis_stone_hoe",
            new FixedHoeItem(ArmoryToolMaterials.LAPIS_STONE,-1, -1.0F,  new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_STONE_SWORD = registerItem("quartz_stone_sword",
            new SwordItem(ArmoryToolMaterials.QUARTZ_STONE, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_SHOVEL = registerItem("quartz_stone_shovel",
            new ShovelItem(ArmoryToolMaterials.QUARTZ_STONE, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_PICKAXE = registerItem("quartz_stone_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.QUARTZ_STONE, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_AXE = registerItem("quartz_stone_axe",
            new AxeItem(ArmoryToolMaterials.QUARTZ_STONE, 7.0F, -3.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_HOE = registerItem("quartz_stone_hoe",
            new FixedHoeItem(ArmoryToolMaterials.QUARTZ_STONE,-1, -2.0F,  new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_GOLDEN_SWORD = registerItem("flint_golden_sword",
            new SwordItem(ArmoryToolMaterials.FLINT_GOLD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_SHOVEL = registerItem("flint_golden_shovel",
            new ShovelItem(ArmoryToolMaterials.FLINT_GOLD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_PICKAXE = registerItem("flint_golden_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.FLINT_GOLD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_AXE = registerItem("flint_golden_axe",
            new AxeItem(ArmoryToolMaterials.FLINT_GOLD, 6.0F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_HOE = registerItem("flint_golden_hoe",
            new FixedHoeItem(ArmoryToolMaterials.FLINT_GOLD, 0, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item LAPIS_GOLDEN_SWORD = registerItem("lapis_golden_sword",
            new SwordItem(ArmoryToolMaterials.LAPIS_GOLD, 3, -2.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_GOLDEN_SHOVEL = registerItem("lapis_golden_shovel",
            new ShovelItem(ArmoryToolMaterials.LAPIS_GOLD, 1.5F, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_GOLDEN_PICKAXE = registerItem("lapis_golden_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.LAPIS_GOLD, 1, -2.6F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_GOLDEN_AXE = registerItem("lapis_golden_axe",
            new AxeItem(ArmoryToolMaterials.LAPIS_GOLD, 6.0F, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_GOLDEN_HOE = registerItem("lapis_golden_hoe",
            new FixedHoeItem(ArmoryToolMaterials.LAPIS_GOLD, 0, -2.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_GOLDEN_SWORD = registerItem("quartz_golden_sword",
            new SwordItem(ArmoryToolMaterials.QUARTZ_GOLD, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_SHOVEL = registerItem("quartz_golden_shovel",
            new ShovelItem(ArmoryToolMaterials.QUARTZ_GOLD, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_PICKAXE = registerItem("quartz_golden_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.QUARTZ_GOLD, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_AXE = registerItem("quartz_golden_axe",
            new AxeItem(ArmoryToolMaterials.QUARTZ_GOLD, 6.0F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_HOE = registerItem("quartz_golden_hoe",
            new FixedHoeItem(ArmoryToolMaterials.QUARTZ_GOLD, 0, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_IRON_SWORD = registerItem("flint_iron_sword",
            new SwordItem(ArmoryToolMaterials.FLINT_IRON, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_SHOVEL = registerItem("flint_iron_shovel",
            new ShovelItem(ArmoryToolMaterials.FLINT_IRON, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_PICKAXE = registerItem("flint_iron_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.FLINT_IRON, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_AXE = registerItem("flint_iron_axe",
            new AxeItem(ArmoryToolMaterials.FLINT_IRON, 6.0F, -3.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_HOE = registerItem("flint_iron_hoe",
            new FixedHoeItem(ArmoryToolMaterials.FLINT_IRON, -2, -1.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item LAPIS_IRON_SWORD = registerItem("lapis_iron_sword",
            new SwordItem(ArmoryToolMaterials.LAPIS_IRON, 3, -2.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_IRON_SHOVEL = registerItem("lapis_iron_shovel",
            new ShovelItem(ArmoryToolMaterials.LAPIS_IRON, 1.5F, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_IRON_PICKAXE = registerItem("lapis_iron_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.LAPIS_IRON, 1, -2.6F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_IRON_AXE = registerItem("lapis_iron_axe",
            new AxeItem(ArmoryToolMaterials.LAPIS_IRON, 6.0F, -2.9F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_IRON_HOE = registerItem("lapis_iron_hoe",
            new FixedHoeItem(ArmoryToolMaterials.LAPIS_IRON, -2, 0.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_IRON_SWORD = registerItem("quartz_iron_sword",
            new SwordItem(ArmoryToolMaterials.QUARTZ_IRON, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_SHOVEL = registerItem("quartz_iron_shovel",
            new ShovelItem(ArmoryToolMaterials.QUARTZ_IRON, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_PICKAXE = registerItem("quartz_iron_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.QUARTZ_IRON, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_AXE = registerItem("quartz_iron_axe",
            new AxeItem(ArmoryToolMaterials.QUARTZ_IRON, 6.0F, -3.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_HOE = registerItem("quartz_iron_hoe",
            new FixedHoeItem(ArmoryToolMaterials.QUARTZ_IRON, -2, -1.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_DIAMOND_SWORD = registerItem("flint_diamond_sword",
            new SwordItem(ArmoryToolMaterials.FLINT_DIAMOND, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_SHOVEL = registerItem("flint_diamond_shovel",
            new ShovelItem(ArmoryToolMaterials.FLINT_DIAMOND, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_PICKAXE = registerItem("flint_diamond_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.FLINT_DIAMOND, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_AXE = registerItem("flint_diamond_axe",
            new AxeItem(ArmoryToolMaterials.FLINT_DIAMOND, 5.0F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_HOE = registerItem("flint_diamond_hoe",
            new FixedHoeItem(ArmoryToolMaterials.FLINT_DIAMOND, -3, 0.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item LAPIS_DIAMOND_SWORD = registerItem("lapis_diamond_sword",
            new SwordItem(ArmoryToolMaterials.LAPIS_DIAMOND, 3, -2.2F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_DIAMOND_SHOVEL = registerItem("lapis_diamond_shovel",
            new ShovelItem(ArmoryToolMaterials.LAPIS_DIAMOND, 1.5F, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_DIAMOND_PICKAXE = registerItem("lapis_diamond_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.LAPIS_DIAMOND, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_DIAMOND_AXE = registerItem("lapis_diamond_axe",
            new AxeItem(ArmoryToolMaterials.LAPIS_DIAMOND, 5.0F, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_DIAMOND_HOE = registerItem("lapis_diamond_hoe",
            new FixedHoeItem(ArmoryToolMaterials.LAPIS_DIAMOND, -3, 1.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item QUARTZ_DIAMOND_SWORD = registerItem("quartz_diamond_sword",
            new SwordItem(ArmoryToolMaterials.QUARTZ_DIAMOND, 3, -2.4F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_SHOVEL = registerItem("quartz_diamond_shovel",
            new ShovelItem(ArmoryToolMaterials.QUARTZ_DIAMOND, 1.5F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_PICKAXE = registerItem("quartz_diamond_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.QUARTZ_DIAMOND, 1, -2.8F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_AXE = registerItem("quartz_diamond_axe",
            new AxeItem(ArmoryToolMaterials.QUARTZ_DIAMOND, 5.0F, -3.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_HOE = registerItem("quartz_diamond_hoe",
            new FixedHoeItem(ArmoryToolMaterials.QUARTZ_DIAMOND, -3, 0.0F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item FLINT_NETHERITE_SWORD = registerItem("flint_netherite_sword",
            new SwordItem(ArmoryToolMaterials.FLINT_NETHERITE, 3, -2.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_SHOVEL = registerItem("flint_netherite_shovel",
            new ShovelItem(ArmoryToolMaterials.FLINT_NETHERITE, 1.5F, -3.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_PICKAXE = registerItem("flint_netherite_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.FLINT_NETHERITE, 1, -2.8F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_AXE = registerItem("flint_netherite_axe",
            new AxeItem(ArmoryToolMaterials.FLINT_NETHERITE, 5.0F, -3.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_HOE = registerItem("flint_netherite_hoe",
            new FixedHoeItem(ArmoryToolMaterials.FLINT_NETHERITE, -4, 0.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item LAPIS_NETHERITE_SWORD = registerItem("lapis_netherite_sword",
            new SwordItem(ArmoryToolMaterials.LAPIS_NETHERITE, 3, -2.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item LAPIS_NETHERITE_SHOVEL = registerItem("lapis_netherite_shovel",
            new ShovelItem(ArmoryToolMaterials.LAPIS_NETHERITE, 1.5F, -2.8F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item LAPIS_NETHERITE_PICKAXE = registerItem("lapis_netherite_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.LAPIS_NETHERITE, 1, -2.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item LAPIS_NETHERITE_AXE = registerItem("lapis_netherite_axe",
            new AxeItem(ArmoryToolMaterials.LAPIS_NETHERITE, 5.0F, -2.8F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item LAPIS_NETHERITE_HOE = registerItem("lapis_netherite_hoe",
            new FixedHoeItem(ArmoryToolMaterials.LAPIS_NETHERITE, -4, 1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item QUARTZ_NETHERITE_SWORD = registerItem("quartz_netherite_sword",
            new SwordItem(ArmoryToolMaterials.QUARTZ_NETHERITE, 3, -2.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_SHOVEL = registerItem("quartz_netherite_shovel",
            new ShovelItem(ArmoryToolMaterials.QUARTZ_NETHERITE, 1.5F, -3.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_PICKAXE = registerItem("quartz_netherite_pickaxe",
            new PickaxeItem(ArmoryToolMaterials.QUARTZ_NETHERITE, 1, -2.8F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_AXE = registerItem("quartz_netherite_axe",
            new AxeItem(ArmoryToolMaterials.QUARTZ_NETHERITE, 5.0F, -3.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_HOE = registerItem("quartz_netherite_hoe",
            new FixedHoeItem(ArmoryToolMaterials.QUARTZ_NETHERITE, -4, 0.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item FIREBRAND = registerItem("firebrand",
            new FirebrandItem(ArmoryToolMaterials.FIREBRAND, 7.0F, -3.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item WOODEN_DAGGER = registerItem("wooden_dagger",
            new SwordItem(ToolMaterials.WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_DAGGER = registerItem("flint_wooden_dagger",
            new SwordItem(ArmoryToolMaterials.FLINT_WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_WOODEN_DAGGER = registerItem("lapis_wooden_dagger",
            new SwordItem(ArmoryToolMaterials.LAPIS_WOOD, 1, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_DAGGER = registerItem("quartz_wooden_dagger",
            new SwordItem(ArmoryToolMaterials.QUARTZ_WOOD, 1, -1.4F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item STONE_DAGGER = registerItem("stone_dagger",
            new SwordItem(ToolMaterials.STONE, 0, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_DAGGER = registerItem("flint_stone_dagger",
            new SwordItem(ArmoryToolMaterials.FLINT_STONE, 0, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_STONE_DAGGER = registerItem("lapis_stone_dagger",
            new SwordItem(ArmoryToolMaterials.LAPIS_STONE, 0, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_DAGGER = registerItem("quartz_stone_dagger",
            new SwordItem(ArmoryToolMaterials.QUARTZ_STONE, 0, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item GOLDEN_DAGGER = registerItem("golden_dagger",
            new SwordItem(ToolMaterials.GOLD, 1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_DAGGER = registerItem("flint_golden_dagger",
            new SwordItem(ArmoryToolMaterials.FLINT_GOLD, 1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_GOLDEN_DAGGER = registerItem("lapis_golden_dagger",
            new SwordItem(ArmoryToolMaterials.LAPIS_GOLD, 1, -0.8F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_DAGGER = registerItem("quartz_golden_dagger",
            new SwordItem(ArmoryToolMaterials.QUARTZ_GOLD, 1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item IRON_DAGGER = registerItem("iron_dagger",
            new SwordItem(ToolMaterials.IRON, 0, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_DAGGER = registerItem("flint_iron_dagger",
            new SwordItem(ArmoryToolMaterials.FLINT_IRON, 0, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_IRON_DAGGER = registerItem("lapis_iron_dagger",
            new SwordItem(ArmoryToolMaterials.LAPIS_IRON, 0, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_DAGGER = registerItem("quartz_iron_dagger",
            new SwordItem(ArmoryToolMaterials.QUARTZ_IRON, 0, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",
            new SwordItem(ToolMaterials.DIAMOND, -1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_DAGGER = registerItem("flint_diamond_dagger",
            new SwordItem(ArmoryToolMaterials.FLINT_DIAMOND, -1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_DIAMOND_DAGGER = registerItem("lapis_diamond_dagger",
            new SwordItem(ArmoryToolMaterials.LAPIS_DIAMOND, -1, -0.8F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_DAGGER = registerItem("quartz_diamond_dagger",
            new SwordItem(ArmoryToolMaterials.QUARTZ_DIAMOND, -1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            new SwordItem(ToolMaterials.NETHERITE, -1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_NETHERITE_DAGGER = registerItem("flint_netherite_dagger",
            new SwordItem(ArmoryToolMaterials.FLINT_NETHERITE, -1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_NETHERITE_DAGGER = registerItem("lapis_netherite_dagger",
            new SwordItem(ArmoryToolMaterials.LAPIS_NETHERITE, -1, -0.8F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_NETHERITE_DAGGER = registerItem("quartz_netherite_dagger",
            new SwordItem(ArmoryToolMaterials.QUARTZ_NETHERITE, -1, -1.0F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item WOODEN_CLAYMORE = registerItem("wooden_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_CLAYMORE = registerItem("flint_wooden_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_FLINT_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_WOODEN_CLAYMORE = registerItem("lapis_wooden_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_LAPIS_WOOD, 9, -3.2F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_CLAYMORE = registerItem("quartz_wooden_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_QUARTZ_WOOD, 9, -3.4F, 600, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item STONE_CLAYMORE = registerItem("stone_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_STONE, 9, -3.4F, 400, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_CLAYMORE = registerItem("flint_stone_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_FLINT_STONE, 9, -3.4F, 400, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_STONE_CLAYMORE = registerItem("lapis_stone_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_LAPIS_STONE, 9, -3.2F, 400, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_CLAYMORE = registerItem("quartz_stone_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_QUARTZ_STONE, 9, -3.4F, 400, 3,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item GOLDEN_CLAYMORE = registerItem("golden_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_GOLD, 9, -3.4F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_CLAYMORE = registerItem("flint_golden_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_FLINT_GOLD, 9, -3.4F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_GOLDEN_CLAYMORE = registerItem("lapis_golden_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_LAPIS_GOLD, 9, -3.2F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_CLAYMORE = registerItem("quartz_golden_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_QUARTZ_GOLD, 9, -3.4F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item IRON_CLAYMORE = registerItem("iron_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_IRON, 8, -3.4F, 400, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_CLAYMORE = registerItem("flint_iron_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_FLINT_IRON, 8, -3.4F, 400, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_IRON_CLAYMORE = registerItem("lapis_iron_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_LAPIS_IRON, 8, -3.2F, 400, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_CLAYMORE = registerItem("quartz_iron_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_QUARTZ_IRON, 8, -3.4F, 400, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item DIAMOND_CLAYMORE = registerItem("diamond_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_DIAMOND, 7, -3.4F, 200, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_CLAYMORE = registerItem("flint_diamond_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_FLINT_DIAMOND, 7, -3.4F, 200, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_DIAMOND_CLAYMORE = registerItem("lapis_diamond_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_LAPIS_DIAMOND, 7, -3.2F, 200, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_CLAYMORE = registerItem("quartz_diamond_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_QUARTZ_DIAMOND, 7, -3.4F, 200, 2,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item NETHERITE_CLAYMORE = registerItem("netherite_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_NETHERITE, 7, -3.4F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_CLAYMORE = registerItem("flint_netherite_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_FLINT_NETHERITE, 7, -3.4F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item LAPIS_NETHERITE_CLAYMORE = registerItem("lapis_netherite_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_LAPIS_NETHERITE, 7, -3.2F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_CLAYMORE = registerItem("quartz_netherite_claymore",
            new ClaymoreItem(ArmoryToolMaterials.HEAVY_QUARTZ_NETHERITE, 7, -3.4F, 200, 1,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item WOODEN_DOUBLE_AXE = registerItem("wooden_double_axe",
            new DoubleAxeItem(ArmoryToolMaterials.HEAVY_WOOD, 6, -3.4F, 200, 0,25,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item WOODEN_SICKLE = registerItem("wooden_sickle",
            new SickleItem(ToolMaterials.WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_WOODEN_SICKLE = registerItem("flint_wooden_sickle",
            new SickleItem(ArmoryToolMaterials.FLINT_WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_WOODEN_SICKLE = registerItem("lapis_wooden_sickle",
            new SickleItem(ArmoryToolMaterials.LAPIS_WOOD, 1.75F, -1.9F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_WOODEN_SICKLE = registerItem("quartz_wooden_sickle",
            new SickleItem(ArmoryToolMaterials.QUARTZ_WOOD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item STONE_SICKLE = registerItem("stone_sickle",
            new SickleItem(ToolMaterials.STONE, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_STONE_SICKLE = registerItem("flint_stone_sickle",
            new SickleItem(ArmoryToolMaterials.FLINT_STONE, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_STONE_SICKLE = registerItem("lapis_stone_sickle",
            new SickleItem(ArmoryToolMaterials.LAPIS_STONE, 1.75F, -1.9F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_STONE_SICKLE = registerItem("quartz_stone_sickle",
            new SickleItem(ArmoryToolMaterials.QUARTZ_STONE, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item GOLDEN_SICKLE = registerItem("golden_sickle",
            new SickleItem(ToolMaterials.GOLD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_GOLDEN_SICKLE = registerItem("flint_golden_sickle",
            new SickleItem(ArmoryToolMaterials.FLINT_GOLD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_GOLDEN_SICKLE = registerItem("lapis_golden_sickle",
            new SickleItem(ArmoryToolMaterials.LAPIS_GOLD, 1.75F, -1.9F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_GOLDEN_SICKLE = registerItem("quartz_golden_sickle",
            new SickleItem(ArmoryToolMaterials.QUARTZ_GOLD, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item IRON_SICKLE = registerItem("iron_sickle",
            new SickleItem(ToolMaterials.IRON, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_IRON_SICKLE = registerItem("flint_iron_sickle",
            new SickleItem(ArmoryToolMaterials.FLINT_IRON, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_IRON_SICKLE = registerItem("lapis_iron_sickle",
            new SickleItem(ArmoryToolMaterials.LAPIS_IRON, 1.75F, -1.9F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_IRON_SICKLE = registerItem("quartz_iron_sickle",
            new SickleItem(ArmoryToolMaterials.QUARTZ_IRON, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item DIAMOND_SICKLE = registerItem("diamond_sickle",
            new SickleItem(ToolMaterials.DIAMOND, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item FLINT_DIAMOND_SICKLE = registerItem("flint_diamond_sickle",
            new SickleItem(ArmoryToolMaterials.FLINT_DIAMOND, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item LAPIS_DIAMOND_SICKLE = registerItem("lapis_diamond_sickle",
            new SickleItem(ArmoryToolMaterials.LAPIS_DIAMOND, 1.75F, -1.9F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item QUARTZ_DIAMOND_SICKLE = registerItem("quartz_diamond_sickle",
            new SickleItem(ArmoryToolMaterials.QUARTZ_DIAMOND, 1.75F, -2.1F, new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item NETHERITE_SICKLE = registerItem("netherite_sickle",
            new SickleItem(ToolMaterials.NETHERITE, 1.75F, -2.1F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item FLINT_NETHERITE_SICKLE = registerItem("flint_netherite_sickle",
            new SickleItem(ArmoryToolMaterials.FLINT_NETHERITE, 1.75F, -2.1F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item LAPIS_NETHERITE_SICKLE = registerItem("lapis_netherite_sickle",
            new SickleItem(ArmoryToolMaterials.LAPIS_NETHERITE, 1.75F, -1.9F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));
    public static final Item QUARTZ_NETHERITE_SICKLE = registerItem("quartz_netherite_sickle",
            new SickleItem(ArmoryToolMaterials.QUARTZ_NETHERITE, 1.75F, -2.1F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR).fireproof()));

    public static final Item SPINDTOX = registerItem("spindtox",
            new PoisonDaggerItem(ArmoryToolMaterials.SPINDTOX, 2, -1.2F,
                    new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

    public static final Item WOODEN_BOW = registerItem("wooden_bow",
            new WoodenBowItem(new Item.Settings().maxDamage(90).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item COPPER_BOW = registerItem("copper_bow",
            new CopperBowItem(new Item.Settings().maxDamage(201).group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item DIAMOND_BOW = registerItem("diamond_bow",
            new DiamondBowItem(new Item.Settings().maxDamage(1787).group(ArmoryItemGroup.VARAN_ARMOR)));
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
    public static final Item QUARTZ_ARROW = registerItem("quartz_arrow",
            new QuartzArrowItem(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));
    public static final Item NETHER_ARROW = registerItem("nether_arrow",
            new NetherArrowItem(new Item.Settings().group(ArmoryItemGroup.VARAN_ARMOR)));

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
