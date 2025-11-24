package net.gecko.varanarmor.mixin;

import net.gecko.varanarmor.item.ArmoryItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.entity.mob.PiglinBruteEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//I got this code from Charlyb01 SIHYWTCAMD Mod https://github.com/sf-inc/sihywtcamd/tree/1.20.1
@Mixin(PiglinBruteEntity.class)
public abstract class PiglinBruteEntityMixin extends AbstractPiglinEntity {

    public PiglinBruteEntityMixin(EntityType<? extends AbstractPiglinEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "initEquipment", at = @At("HEAD"), cancellable = true)
    private void useBetterEquipment(Random random, LocalDifficulty localDifficulty, CallbackInfo ci) {
        if (random.nextFloat() < 0.25F) {
            this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(ArmoryItems.FIREBRAND));
            ci.cancel();
        } else {
            this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(Items.GOLDEN_AXE));
            this.setEquipmentDropChance(EquipmentSlot.MAINHAND, 0.05f);
            ci.cancel();
        }
    }

    @Override
    public boolean tryAttack(Entity target) {
        ItemStack itemStack = this.getEquippedStack(EquipmentSlot.MAINHAND);
        if (itemStack.isOf(ArmoryItems.FIREBRAND)) {
            if (target.isOnFire()){
                target.playSound(SoundEvents.BLOCK_FIRE_EXTINGUISH, 1.0f, 1.0f);
                target.extinguish();
                target.damage(DamageSource.GENERIC,5);
            } else {
                target.setOnFireFor(5);
            }
        }
        return super.tryAttack(target);
    }
}
