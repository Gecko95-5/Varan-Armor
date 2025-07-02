package net.gecko.varanarmor.util;

import net.gecko.varanarmor.VaranArmor;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoTags {
    public static class Items {
        public static final TagKey<Item> SICKLES =
                createTag("sickles");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(Registry.ITEM_KEY, Identifier.of(VaranArmor.MOD_ID, name));
        }
    }
}
