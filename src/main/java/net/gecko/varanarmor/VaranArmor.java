package net.gecko.varanarmor;

import net.fabricmc.api.ModInitializer;
import net.gecko.varanarmor.block.ArmoryBlocks;
import net.gecko.varanarmor.effects.ArmoryEffects;
import net.gecko.varanarmor.entity.ArmoryEntities;
import net.gecko.varanarmor.item.ArmoryItems;
import net.gecko.varanarmor.util.ArmoryLootTableModifiers;
import net.gecko.varanarmor.util.ArmoryPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VaranArmor implements ModInitializer {
	public static final String MOD_ID = "varan-armor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ArmoryItems.registerArmoryItems();
		ArmoryEntities.registerArmoryEntities();
		ArmoryEffects.registerArmoryEffects();
		ArmoryPotions.registerPotions();
        ArmoryLootTableModifiers.modifyLootTables();
        ArmoryBlocks.registerArmoryBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}