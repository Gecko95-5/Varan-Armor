package net.gecko.varanarmor.util;

import net.gecko.varanarmor.VaranArmor;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ArmoryTags {
    public static class Blocks {

        public static final TagKey<Block> SICKLES_MINEABLE =
                createTag("mineable/sickle");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(Registry.BLOCK_KEY, Identifier.of(VaranArmor.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> HARVESTERS =
                createTag("harvesters");

        public static final TagKey<Item> AXES =
                createTag("axes");

        public static final TagKey<Item> SWORDS =
                createTag("swords");

        public static final TagKey<Item> BLADES =
                createTag("blades");

        public static final TagKey<Item> CUPCAKES =
                createTag("cupcakes");

        public static final TagKey<Item> DAGGERS =
                createTag("daggers");

        public static final TagKey<Item> CLAYMORES =
                createTag("claymores");

        public static final TagKey<Item> PICKAXES =
                createTag("pickaxes");

        public static final TagKey<Item> SINGLE_AXES =
                createTag("single_axes");

        public static final TagKey<Item> DOUBLE_AXES =
                createTag("double_axes");

        public static final TagKey<Item> SHOVELS =
                createTag("shovels");

        public static final TagKey<Item> HOES =
                createTag("hoes");

        public static final TagKey<Item> SICKLES =
                createTag("sickles");

        public static final TagKey<Item> WOODEN_AXES =
                createTag("wooden_axes");

        public static final TagKey<Item> WOODEN_SWORDS =
                createTag("wooden_swords");

        public static final TagKey<Item> WOODEN_DAGGERS =
                createTag("wooden_daggers");

        public static final TagKey<Item> WOODEN_CLAYMORES =
                createTag("wooden_claymores");

        public static final TagKey<Item> WOODEN_PICKAXES =
                createTag("wooden_pickaxes");

        public static final TagKey<Item> WOODEN_SINGLE_AXES =
                createTag("wooden_single_axes");

        public static final TagKey<Item> WOODEN_DOUBLE_AXES =
                createTag("wooden_double_axes");

        public static final TagKey<Item> WOODEN_SHOVELS =
                createTag("wooden_shovels");

        public static final TagKey<Item> WOODEN_HOES =
                createTag("wooden_hoes");

        public static final TagKey<Item> WOODEN_SICKLES =
                createTag("wooden_sickles");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(Registry.ITEM_KEY, Identifier.of(VaranArmor.MOD_ID, name));
        }
    }
}
