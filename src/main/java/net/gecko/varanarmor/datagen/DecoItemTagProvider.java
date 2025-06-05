package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varanarmor.item.DecoItems;
import net.minecraft.tag.ItemTags;

public class DecoItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DecoItemTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ItemTags.ARROWS)
                .add(DecoItems.FLINT_ARROW);
    }
}
