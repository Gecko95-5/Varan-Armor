package net.gecko.varanarmor.item.arrow;

import net.gecko.varanarmor.entity.arrow.AmethystArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class AmethystArrowItem extends CustomArrowItem {


    public AmethystArrowItem(Settings settings) {
        super(settings);
    }


    @Override
    public PersistentProjectileEntity createArrow(@NotNull World world, @NotNull ItemStack stack, @NotNull LivingEntity shooter) {
        AmethystArrowEntity arrowEntity = new AmethystArrowEntity(world, shooter);
        arrowEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
        return arrowEntity;
    }
}
