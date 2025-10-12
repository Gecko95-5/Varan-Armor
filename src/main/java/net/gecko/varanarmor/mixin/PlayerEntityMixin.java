package net.gecko.varanarmor.mixin;

import net.gecko.varanarmor.item.ArmoryItems;
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
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }
    @Inject(
            method = "tick",
            at = @At("TAIL"))
    private void tick_TAIL(CallbackInfo swift) {
        this.updateSwiftBoots();
        this.updateMiningGoogles();
        this.updateBracerSuitAttack();
        this.updateBracerSuitDefence();
        this.updateParachutePants();
    }


    @Unique
    private void updateSwiftBoots() {
        ItemStack itemStack = this.getEquippedStack(EquipmentSlot.FEET);
        if (itemStack.isOf(ArmoryItems.SWIFT_BOOTS) && this.isSprinting()) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1, false, false, true));
        }
    }

    @Unique
    private void updateMiningGoogles() {
        ItemStack itemStack = this.getEquippedStack(EquipmentSlot.HEAD);
        if (itemStack.isOf(ArmoryItems.MINING_GOOGLES)) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0, false, false, true));
        }
    }
        @Unique
        private void updateBracerSuitDefence() {
            ItemStack itemStack = this.getEquippedStack(EquipmentSlot.CHEST);
            if (itemStack.isOf(ArmoryItems.BRACER_SUIT) && this.getHealth() < this.getMaxHealth()/2) {
                this.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 0, false, false, true));
             }
        }
        @Unique
        private void updateBracerSuitAttack() {
        ItemStack itemStack = this.getEquippedStack(EquipmentSlot.CHEST);
        if (itemStack.isOf(ArmoryItems.BRACER_SUIT) && this.getHealth() > this.getMaxHealth()/2) {
        this.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0, false, false, true));
            }
        }
        @Unique
        private void updateParachutePants() {
        ItemStack itemStack = this.getEquippedStack(EquipmentSlot.LEGS);
        if (itemStack.isOf(ArmoryItems.PARACHUTE_PANTS) && this.onGround) {
        this.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 200, 0, false, false, true));
            }
        }
}
