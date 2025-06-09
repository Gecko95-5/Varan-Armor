package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.gecko.varanarmor.item.DecoItems;
import net.gecko.varanarmor.util.DecoLootTables;
import net.minecraft.item.Items;
import net.minecraft.item.map.MapIcon;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.EntityPropertiesLootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.*;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.predicate.entity.FishingHookPredicate;
import net.minecraft.tag.StructureTags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class DecoFishingLootTableGenerator extends SimpleFabricLootTableProvider {
    public DecoFishingLootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.FISHING);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        identifierBuilderBiConsumer.accept(DecoLootTables.SUPER_FISHING_GAMEPLAY, LootTable.builder()
                        .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                                        .with(LootTableEntry.builder(DecoLootTables.SUPER_FISHING_AQUATIC_GAMEPLAY).weight(35).quality(-1))
                                        .with(LootTableEntry.builder(DecoLootTables.SUPER_FISHING_TREASURE_GAMEPLAY).weight(15).quality(4)
                                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS,
                                                EntityPredicate.Builder.create().typeSpecific(FishingHookPredicate.of(true)))))
                                        .with(LootTableEntry.builder(DecoLootTables.SUPER_FISHING_FISH_GAMEPLAY).weight(50).quality(-2))));

        identifierBuilderBiConsumer.accept(DecoLootTables.SUPER_FISHING_FISH_GAMEPLAY, LootTable.builder()
                        .pool(LootPool.builder()
                                        .with(ItemEntry.builder(Items.COD).weight(30))
                                        .with(ItemEntry.builder(Items.SALMON).weight(50))
                                        .with(ItemEntry.builder(Items.TROPICAL_FISH).weight(5))
                                        .with(ItemEntry.builder(Items.PUFFERFISH).weight(15))));

        identifierBuilderBiConsumer.accept(DecoLootTables.SUPER_FISHING_AQUATIC_GAMEPLAY, LootTable.builder()
                        .pool(LootPool.builder()
                                .with(ItemEntry.builder(Items.SEAGRASS).weight(15))
                                .with(ItemEntry.builder(Items.INK_SAC).weight(10).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(10.0F))))
                                .with(ItemEntry.builder(Items.FISHING_ROD).weight(10)
                                        .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.0F, 0.5F))))
                                .with(ItemEntry.builder(Items.BONE_MEAL).weight(10))
                                .with(ItemEntry.builder(Items.GLOW_INK_SAC).weight(7).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(5.0F))))
                                .with(ItemEntry.builder(Items.SEA_PICKLE).weight(7))
                                .with(ItemEntry.builder(DecoItems.SQUID_TENTACLES).weight(7))
                                .with(ItemEntry.builder(DecoItems.GLOW_SQUID_TENTACLES).weight(7))
                                .with(ItemEntry.builder(Items.KELP).weight(5))
                                .with(ItemEntry.builder(Items.SCUTE).weight(5))
                                .with(ItemEntry.builder(Items.NAUTILUS_SHELL).weight(5))
                                .with(ItemEntry.builder(Items.PRISMARINE_SHARD).weight(5))
                                .with(ItemEntry.builder(Items.PRISMARINE_CRYSTALS).weight(2))
                                .with(LootTableEntry.builder(DecoLootTables.AQUATIC_FISHING_CORAL_GAMEPLAY).weight(2).quality(2))
                                .with(ItemEntry.builder(DecoItems.SQUID_FISHING_ROD).weight(2)
                                        .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.0F, 0.7F))))
                                .with(ItemEntry.builder(Items.FISHING_ROD).weight(1)
                                        .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.0F, 0.5F)))
                                        .apply(EnchantWithLevelsLootFunction.builder(ConstantLootNumberProvider.create(15.0F))))));

        identifierBuilderBiConsumer.accept(DecoLootTables.SUPER_FISHING_TREASURE_GAMEPLAY, LootTable.builder()
                        .pool(LootPool.builder()
                                .with(ItemEntry.builder(Items.FISHING_ROD).weight(20)
                                        .apply(EnchantWithLevelsLootFunction.builder(ConstantLootNumberProvider.create(30.0F))
                                        .allowTreasureEnchantments()))
                                .with(ItemEntry.builder(DecoItems.COPPER_BOW).weight(20)
                                        .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.0F, 0.1F)))
                                        .apply(EnchantWithLevelsLootFunction.builder(ConstantLootNumberProvider.create(30.0F))
                                        .allowTreasureEnchantments()))
                                .with(ItemEntry.builder(Items.CROSSBOW).weight(20)
                                        .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.0F, 0.3F)))
                                        .apply(EnchantWithLevelsLootFunction.builder(ConstantLootNumberProvider.create(15.0F))
                                                .allowTreasureEnchantments()))
                                .with(ItemEntry.builder(Items.MAP).weight(20)
                                        .apply(ExplorationMapLootFunction.builder()
                                                .withDestination(StructureTags.ON_TREASURE_MAPS)
                                                .withDecoration(MapIcon.Type.RED_X)
                                                .withZoom((byte)1).withSkipExistingChunks(false))
                                        .apply(SetNameLootFunction.builder(Text.translatable("filled_map.buried_treasure"))))
                                .with(ItemEntry.builder(Items.BOOK).weight(5)
                                        .apply(EnchantWithLevelsLootFunction.builder(ConstantLootNumberProvider.create(30.0F))
                                                .allowTreasureEnchantments()))
                                .with(ItemEntry.builder(Items.EXPERIENCE_BOTTLE).weight(5))
                                .with(ItemEntry.builder(DecoItems.SQUID_FISHING_ROD).weight(5)
                                        .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.0F, 0.3F)))
                                        .apply(EnchantWithLevelsLootFunction.builder(ConstantLootNumberProvider.create(20.0F))
                                                .allowTreasureEnchantments()))
                                .with(ItemEntry.builder(Items.TRIDENT).weight(5)
                                        .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.5F, 0.9F)))
                                        .apply(EnchantWithLevelsLootFunction.builder(ConstantLootNumberProvider.create(10.0F))))));


        identifierBuilderBiConsumer.accept(DecoLootTables.AQUATIC_FISHING_CORAL_GAMEPLAY, LootTable.builder()
                .pool(LootPool.builder()
                        .with(ItemEntry.builder(Items.DEAD_TUBE_CORAL_FAN).weight(8))
                        .with(ItemEntry.builder(Items.DEAD_BRAIN_CORAL_FAN).weight(8))
                        .with(ItemEntry.builder(Items.DEAD_BUBBLE_CORAL_FAN).weight(8))
                        .with(ItemEntry.builder(Items.DEAD_FIRE_CORAL_FAN).weight(8))
                        .with(ItemEntry.builder(Items.DEAD_HORN_CORAL_FAN).weight(8))
                        .with(ItemEntry.builder(Items.TUBE_CORAL_FAN).weight(5))
                        .with(ItemEntry.builder(Items.BRAIN_CORAL_FAN).weight(5))
                        .with(ItemEntry.builder(Items.BUBBLE_CORAL_FAN).weight(5))
                        .with(ItemEntry.builder(Items.FIRE_CORAL_FAN).weight(5))
                        .with(ItemEntry.builder(Items.HORN_CORAL_FAN).weight(5))
                        .with(ItemEntry.builder(Items.DEAD_TUBE_CORAL).weight(5))
                        .with(ItemEntry.builder(Items.DEAD_BRAIN_CORAL).weight(5))
                        .with(ItemEntry.builder(Items.DEAD_BUBBLE_CORAL).weight(5))
                        .with(ItemEntry.builder(Items.DEAD_FIRE_CORAL).weight(5))
                        .with(ItemEntry.builder(Items.DEAD_HORN_CORAL).weight(5))
                        .with(ItemEntry.builder(Items.TUBE_CORAL).weight(2))
                        .with(ItemEntry.builder(Items.BRAIN_CORAL).weight(2))
                        .with(ItemEntry.builder(Items.BUBBLE_CORAL).weight(2))
                        .with(ItemEntry.builder(Items.FIRE_CORAL).weight(2))
                        .with(ItemEntry.builder(Items.HORN_CORAL).weight(2))
                ));
    }
}
