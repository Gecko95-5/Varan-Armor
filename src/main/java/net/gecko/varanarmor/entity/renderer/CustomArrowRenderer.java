package net.gecko.varanarmor.entity.renderer;


import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.util.Identifier;

//I got this code from YarikProgs Projectiles Mod https://github.com/YarikProgs/ArosFletching/tree/1.19.2-fabric
public class CustomArrowRenderer extends ProjectileEntityRenderer<PersistentProjectileEntity> {
	private final Identifier texture;

	public CustomArrowRenderer(EntityRendererFactory.Context context, Identifier texture) {
		super(context);
		this.texture = texture;
	}

	public Identifier getTexture(PersistentProjectileEntity ArrowEntity) {
		return texture;
	}
}
