package net.gecko.varanarmor.mixin;

import net.gecko.varanarmor.item.DecoItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }
    @Inject(
            method = "tick",
            at = @At("TAIL"))
    protected void injectTickMethod() {
        this.updateSwiftBoots();
    }

    @Unique
    private void updateSwiftBoots() {
        ItemStack itemStack = this.getEquippedStack(EquipmentSlot.FEET);
        if (itemStack.isOf(DecoItems.SWIFT_BOOTS) && !this.isSprinting()) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0, false, false, true));
        }
    }
}
