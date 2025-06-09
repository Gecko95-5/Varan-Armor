package net.gecko.varanarmor.util;
import com.google.common.collect.Sets;
import net.gecko.varanarmor.VaranArmor;
import net.minecraft.util.Identifier;

import java.util.Set;

public class DecoLootTables {
    private static final Set<Identifier> DECO_LOOT_TABLES = Sets.<Identifier>newHashSet();
    public static final Identifier SUPER_FISHING_GAMEPLAY = registerLootTables("gameplay/super_fishing");
    public static final Identifier SUPER_FISHING_AQUATIC_GAMEPLAY = registerLootTables("gameplay/super_fishing/aquatic");
    public static final Identifier AQUATIC_FISHING_CORAL_GAMEPLAY = registerLootTables("gameplay/super_fishing/aquatic/coral");
    public static final Identifier SUPER_FISHING_TREASURE_GAMEPLAY = registerLootTables("gameplay/super_fishing/treasure");
    public static final Identifier SUPER_FISHING_FISH_GAMEPLAY = registerLootTables("gameplay/super_fishing/fish");


    private static Identifier registerLootTables(String id) {
        return registerLootTable(new Identifier(VaranArmor.MOD_ID, id));
    }

    private static Identifier registerLootTable(Identifier id) {
        if (DECO_LOOT_TABLES.add(id)) {
            return id;
        } else {
            throw new IllegalArgumentException(id + " is already a registered built-in loot table");
        }
    }

    public static void registerDecoLootTables() {
        VaranArmor.LOGGER.debug("Registering Loot Tables for" + VaranArmor.MOD_ID);
    }
}
