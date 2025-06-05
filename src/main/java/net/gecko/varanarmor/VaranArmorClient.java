package net.gecko.varanarmor;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gecko.varanarmor.entity.DecoEntities;
import net.gecko.varanarmor.entity.renderer.FlintArrowEntityRenderer;
import net.gecko.varanarmor.util.DecoModelPredicateProvider;

public class VaranArmorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        DecoModelPredicateProvider.registerChangingModels();

        EntityRendererRegistry.register(DecoEntities.FLINT_ARROW, FlintArrowEntityRenderer::new);
        
    }
}
