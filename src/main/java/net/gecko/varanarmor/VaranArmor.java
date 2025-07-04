package net.gecko.varanarmor;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.gecko.varanarmor.item.DecoItems;
import net.minecraft.server.network.ServerPlayerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VaranArmor implements ModInitializer {
	public static final String MOD_ID = "varan-armor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DecoItems.registerDecoItems();

		LOGGER.info("Hello Fabric world!");
	}
}