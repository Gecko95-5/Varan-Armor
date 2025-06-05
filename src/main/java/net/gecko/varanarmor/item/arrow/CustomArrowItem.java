package net.gecko.varanarmor.item.arrow;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

//I got this code from Creep3rCrafter Projectiles Mod https://github.com/creep3rcrafter/Projectiles/tree/1.19

public class CustomArrowItem extends ArrowItem {
    public CustomArrowItem(Settings settings) {
        super(settings);
    }

    @Override
    public PersistentProjectileEntity createArrow(@NotNull World world, @NotNull ItemStack stack, @NotNull LivingEntity shooter) {
        return super.createArrow(world, stack, shooter);
    }
}
