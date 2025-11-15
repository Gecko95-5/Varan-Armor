package net.gecko.varanarmor.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.gecko.varanarmor.item.ArmoryItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ArmoryLootTableModifiers {

    private static final Identifier SQUID_ID =
            new Identifier("minecraft", "entities/squid");

    private static final Identifier GLOW_SQUID_ID =
            new Identifier("minecraft", "entities/glow_squid");

    private static final Identifier CAVE_SPIDER_ID =
            new Identifier("minecraft", "entities/cave_spider");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (SQUID_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f))
                        .with(ItemEntry.builder(ArmoryItems.SQUID_TENTACLES))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (GLOW_SQUID_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f))
                        .with(ItemEntry.builder(ArmoryItems.GLOW_SQUID_TENTACLES))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (CAVE_SPIDER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(ArmoryItems.POISONOUS_NEEDLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
