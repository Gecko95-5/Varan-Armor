package net.gecko.varanarmor.item.tools.fishing_rods;

import net.gecko.varanarmor.entity.bobbers.NautilusFishingBobberEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.Objects;

public class NautilusFishingRodItem extends FishingRodItem {

    public NautilusFishingRodItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        int i;
        if (user.fishHook != null) {
            if (!world.isClient) {
                i = user.fishHook.use(itemStack);
                itemStack.damage(i, user, (p) -> p.sendToolBreakStatus(hand));
            }
            world.playSound(null, user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_FISHING_BOBBER_RETRIEVE, SoundCategory.NEUTRAL,
                    1.0F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
            user.emitGameEvent(GameEvent.ITEM_INTERACT_FINISH);
            Objects.requireNonNull(user.getAttributeInstance(EntityAttributes.GENERIC_LUCK)).setBaseValue(0.0);
        } else {
            world.playSound(null, user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_FISHING_BOBBER_THROW, SoundCategory.NEUTRAL,
                    0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
            if (!world.isClient) {
                i = EnchantmentHelper.getLure(itemStack);
                int j = EnchantmentHelper.getLuckOfTheSea(itemStack);
                Entity testEntity = new NautilusFishingBobberEntity(user, world, j, i);
                Objects.requireNonNull(user.getAttributeInstance(EntityAttributes.GENERIC_LUCK)).setBaseValue(20.0);
                world.spawnEntity(testEntity);
            }
            user.incrementStat(Stats.USED.getOrCreateStat(this));
            user.emitGameEvent(GameEvent.ITEM_INTERACT_START);
        }
        return TypedActionResult.success(itemStack, world.isClient());
    }
}
