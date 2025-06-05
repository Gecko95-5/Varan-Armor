package net.gecko.varanarmor.entity.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.gecko.varanarmor.entity.arrow.FlintArrowEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class FlintArrowEntityRenderer extends ProjectileEntityRenderer<FlintArrowEntity> {
	public static final Identifier TEXTURE = new Identifier("textures/entity/projectiles/flint_arrow.png");

	public FlintArrowEntityRenderer(EntityRendererFactory.Context context) {
		super(context);
	}

	public Identifier getTexture(FlintArrowEntity flintArrowEntity) {
		return TEXTURE;
	}
}
