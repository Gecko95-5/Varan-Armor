package net.gecko.varanarmor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko.varanarmor.item.DecoItems;
import net.gecko.varanarmor.util.DecoTags;
import net.minecraft.tag.ItemTags;

public class DecoItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public DecoItemTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(ItemTags.ARROWS)
                .add(DecoItems.IRON_ARROW)
                .add(DecoItems.AMETHYST_ARROW)
                .add(DecoItems.QUARTZ_ARROW)
                .add(DecoItems.NETHER_ARROW);

    getOrCreateTagBuilder(DecoTags.Items.SICKLES)
            .add(DecoItems.WOODEN_SICKLE);
    }
}
