package net.gecko.varanarmor.item.arrow;

import net.gecko.varanarmor.entity.arrow.NetherArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class NetherArrowItem extends CustomArrowItem {

    public NetherArrowItem(Settings settings) {
        super(settings);
    }

    @Override
    public PersistentProjectileEntity createArrow(@NotNull World world, @NotNull ItemStack stack, @NotNull LivingEntity shooter) {
        NetherArrowEntity arrowEntity = new NetherArrowEntity(world, shooter);
        arrowEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
        return arrowEntity;
    }
}
