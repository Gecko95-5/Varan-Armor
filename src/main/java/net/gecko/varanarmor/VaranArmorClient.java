package net.gecko.varanarmor;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gecko.varanarmor.block.ArmoryBlocks;
import net.gecko.varanarmor.entity.ArmoryEntities;
import net.gecko.varanarmor.entity.renderer.CustomArrowRenderer;
import net.gecko.varanarmor.entity.renderer.NautilusBobberRenderer;
import net.gecko.varanarmor.entity.renderer.SquidBobberRenderer;
import net.gecko.varanarmor.entity.renderer.armour.BracerSuitRenderer;
import net.gecko.varanarmor.entity.renderer.armour.MiningGooglesRenderer;
import net.gecko.varanarmor.entity.renderer.armour.ParachutePantsRenderer;
import net.gecko.varanarmor.entity.renderer.armour.SwiftBootsRenderer;
import net.gecko.varanarmor.item.ArmoryItems;
import net.gecko.varanarmor.util.ArmoryModelPredicateProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class VaranArmorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ArmoryBlocks.ONIONS, RenderLayer.getCutout());
        ArmoryModelPredicateProvider.registerChangingModels();

        EntityRendererRegistry.register(ArmoryEntities.SQUID_BOBBER, SquidBobberRenderer::new);
        EntityRendererRegistry.register(ArmoryEntities.NAUTILUS_BOBBER, NautilusBobberRenderer::new);

        EntityRendererRegistry.register(ArmoryEntities.IRON_ARROW, ctx -> new CustomArrowRenderer
                (ctx, new Identifier(VaranArmor.MOD_ID,"textures/entity/projectiles/iron_arrow.png")));

        EntityRendererRegistry.register(ArmoryEntities.STEEL_ARROW, ctx -> new CustomArrowRenderer
                (ctx, new Identifier(VaranArmor.MOD_ID,"textures/entity/projectiles/steel_arrow.png")));

        EntityRendererRegistry.register(ArmoryEntities.AMETHYST_ARROW, ctx -> new CustomArrowRenderer
                (ctx, new Identifier(VaranArmor.MOD_ID,"textures/entity/projectiles/amethyst_arrow.png")));

        EntityRendererRegistry.register(ArmoryEntities.QUARTZ_ARROW, ctx -> new CustomArrowRenderer
                (ctx, new Identifier(VaranArmor.MOD_ID,"textures/entity/projectiles/quartz_arrow.png")));

        EntityRendererRegistry.register(ArmoryEntities.NETHER_ARROW, ctx -> new CustomArrowRenderer
                (ctx, new Identifier(VaranArmor.MOD_ID,"textures/entity/projectiles/nether_arrow.png")));

        GeoArmorRenderer.registerArmorRenderer(new SwiftBootsRenderer(), ArmoryItems.SWIFT_BOOTS);
        GeoArmorRenderer.registerArmorRenderer(new MiningGooglesRenderer(), ArmoryItems.MINING_GOOGLES);
        GeoArmorRenderer.registerArmorRenderer(new BracerSuitRenderer(), ArmoryItems.BRACER_SUIT);
        GeoArmorRenderer.registerArmorRenderer(new ParachutePantsRenderer(), ArmoryItems.PARACHUTE_PANTS);
    }
}
