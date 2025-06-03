package net.gecko.varanarmor;

import net.fabricmc.api.ModInitializer;

import net.gecko.varanarmor.item.DecoItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VaranArmor implements ModInitializer {
	public static final String MOD_ID = "varan-armor";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DecoItems.registerDecoItems();

		LOGGER.info("Hello Fabric world!");
	}
}