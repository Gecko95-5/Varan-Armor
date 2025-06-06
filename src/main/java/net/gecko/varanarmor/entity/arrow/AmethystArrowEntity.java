package net.gecko.varanarmor.entity.arrow;

import net.gecko.varanarmor.entity.DecoEntities;
import net.gecko.varanarmor.item.DecoItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AmethystArrowEntity extends PersistentProjectileEntity {

    public AmethystArrowEntity(EntityType<? extends AmethystArrowEntity> entityType, World world) {
        super(entityType, world);
    }

    public AmethystArrowEntity(World world, LivingEntity owner) {
        super(DecoEntities.AMETHYST_ARROW, owner, world);
    }

    public AmethystArrowEntity(World world, double x, double y, double z) {
        super(DecoEntities.AMETHYST_ARROW, x, y, z, world);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.inGround && this.inGroundTime != 0 && this.inGroundTime >= 600) {
            this.world.sendEntityStatus(this, (byte)0);
        }
    }

    @Override
    protected ItemStack asItemStack() {
        return new ItemStack(DecoItems.AMETHYST_ARROW);
    }

    @Override
    public void setDamage(double damage) {
        super.setDamage(damage + 1);
    }
}
