package net.gecko.varanarmor;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.gecko.varanarmor.datagen.DecoItemTagProvider;
import net.gecko.varanarmor.datagen.DecoModelProvider;
import net.gecko.varanarmor.datagen.DecoRecipeGenerator;

public class VaranArmorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		fabricDataGenerator.addProvider(DecoItemTagProvider::new);
		fabricDataGenerator.addProvider(DecoModelProvider::new);
		fabricDataGenerator.addProvider(DecoRecipeGenerator::new);
	}
}
