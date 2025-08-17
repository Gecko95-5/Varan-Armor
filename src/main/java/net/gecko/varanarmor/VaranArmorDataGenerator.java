package net.gecko.varanarmor;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.gecko.varanarmor.datagen.ArmoryBlockTagProvider;
import net.gecko.varanarmor.datagen.ArmoryItemTagProvider;
import net.gecko.varanarmor.datagen.ArmoryModelProvider;
import net.gecko.varanarmor.datagen.ArmoryRecipeGenerator;

public class VaranArmorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		fabricDataGenerator.addProvider(ArmoryItemTagProvider::new);
		fabricDataGenerator.addProvider(ArmoryModelProvider::new);
		fabricDataGenerator.addProvider(ArmoryRecipeGenerator::new);
		fabricDataGenerator.addProvider(ArmoryBlockTagProvider::new);
		fabricDataGenerator.addProvider(ArmoryBlockTagProvider::new);
	}
}
