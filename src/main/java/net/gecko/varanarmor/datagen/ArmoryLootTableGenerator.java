package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.block.ArmoryBlocks;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ArmoryLootTableGenerator extends SimpleFabricLootTableProvider {
    public ArmoryLootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        identifierBuilderBiConsumer.accept(new Identifier(VaranArmor.MOD_ID,"blocks/sliver_block"),
                BlockLootTableGenerator.drops(ArmoryBlocks.SLIVER_BLOCK));
    }
}
