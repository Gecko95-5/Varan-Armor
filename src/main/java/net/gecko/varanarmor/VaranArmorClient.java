package net.gecko.varanarmor;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gecko.varanarmor.entity.DecoEntities;
import net.gecko.varanarmor.entity.renderer.CustomArrowRenderer;
import net.gecko.varanarmor.entity.renderer.NautilusBobberRenderer;
import net.gecko.varanarmor.entity.renderer.SquidBobberRenderer;
import net.gecko.varanarmor.entity.renderer.armour.SwiftBootsRenderer;
import net.gecko.varanarmor.item.DecoItems;
import net.gecko.varanarmor.util.DecoModelPredicateProvider;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class VaranArmorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        DecoModelPredicateProvider.registerChangingModels();

        EntityRendererRegistry.register(DecoEntities.SQUID_BOBBER, SquidBobberRenderer::new);
        EntityRendererRegistry.register(DecoEntities.NAUTILUS_BOBBER, NautilusBobberRenderer::new);

        EntityRendererRegistry.register(DecoEntities.IRON_ARROW, ctx -> new CustomArrowRenderer
                (ctx, new Identifier(VaranArmor.MOD_ID,"textures/entity/projectiles/iron_arrow.png")));

        EntityRendererRegistry.register(DecoEntities.AMETHYST_ARROW, ctx -> new CustomArrowRenderer
                (ctx, new Identifier(VaranArmor.MOD_ID,"textures/entity/projectiles/amethyst_arrow.png")));

        EntityRendererRegistry.register(DecoEntities.QUARTZ_ARROW, ctx -> new CustomArrowRenderer
                (ctx, new Identifier(VaranArmor.MOD_ID,"textures/entity/projectiles/quartz_arrow.png")));

        EntityRendererRegistry.register(DecoEntities.NETHER_ARROW, ctx -> new CustomArrowRenderer
                (ctx, new Identifier(VaranArmor.MOD_ID,"textures/entity/projectiles/nether_arrow.png")));

        GeoArmorRenderer.registerArmorRenderer(new SwiftBootsRenderer(), DecoItems.SWIFT_BOOTS);
    }
}
