package net.gecko.varanarmor.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.entity.arrow.AmethystArrowEntity;
import net.gecko.varanarmor.entity.arrow.FlintArrowEntity;
import net.gecko.varanarmor.entity.arrow.QuartzArrowEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoEntities {

    public static final EntityType<FlintArrowEntity> FLINT_ARROW = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(VaranArmor.MOD_ID, "flint_arrow"),
            FabricEntityTypeBuilder.<FlintArrowEntity>create(SpawnGroup.MISC, FlintArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build());

    public static final EntityType<AmethystArrowEntity> AMETHYST_ARROW = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(VaranArmor.MOD_ID, "amethyst_arrow"),
            FabricEntityTypeBuilder.<AmethystArrowEntity>create(SpawnGroup.MISC, AmethystArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build());

    public static final EntityType<QuartzArrowEntity> QUARTZ_ARROW = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(VaranArmor.MOD_ID, "quartz_arrow"),
            FabricEntityTypeBuilder.<QuartzArrowEntity>create(SpawnGroup.MISC, QuartzArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build());
}
