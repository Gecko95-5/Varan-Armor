package net.gecko.varanarmor.util;

import net.gecko.varanarmor.item.DecoItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class DecoModelPredicateProvider {
    public static void registerChangingModels(){
        registerBow(DecoItems.WOODEN_BOW);
        registerBow(DecoItems.COPPER_BOW);
        registerBow(DecoItems.DIAMOND_BOW);
        registerBow(DecoItems.NETHERITE_BOW);
        registerBow(DecoItems.BLAZING_BOW);
        registerFishingRod(DecoItems.SQUID_FISHING_ROD);
    }
    private static void registerBow(Item bow) {
        ModelPredicateProviderRegistry.register(bow, new Identifier("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0f;
                    }
                    if (entity.getActiveItem() != stack) {
                        return 0.0f;
                    }
                    return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;
                });

        ModelPredicateProviderRegistry.register(bow, new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem()
                        && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }
    private static void registerFishingRod(Item rod) {
        ModelPredicateProviderRegistry.register(rod, new Identifier("cast"), (stack, world, entity, seed) -> {
            boolean bl2;
            if (entity == null) {
                return 0.0f;
            }
            boolean bl = entity.getMainHandStack() == stack;
            boolean bl3 = bl2 = entity.getOffHandStack() == stack;
            if (entity.getMainHandStack().getItem() instanceof FishingRodItem) {
                bl2 = false;
            }
            return (bl || bl2) && entity instanceof PlayerEntity && ((PlayerEntity)entity).fishHook != null ? 1.0f : 0.0f;
        });
    }
}
