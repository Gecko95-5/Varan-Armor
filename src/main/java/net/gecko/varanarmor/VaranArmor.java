package net.gecko.varanarmor;

import net.fabricmc.api.ModInitializer;
import net.gecko.varanarmor.entity.ArmoryEntities;
import net.gecko.varanarmor.item.ArmoryItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VaranArmor implements ModInitializer {
	public static final String MOD_ID = "varan-armor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ArmoryItems.registerDecoItems();
		ArmoryEntities.registerDecoEntities();

		LOGGER.info("Hello Fabric world!");
	}
}