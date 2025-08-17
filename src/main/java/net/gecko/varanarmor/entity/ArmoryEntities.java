package net.gecko.varanarmor.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.gecko.varanarmor.VaranArmor;
import net.gecko.varanarmor.entity.arrow.AmethystArrowEntity;
import net.gecko.varanarmor.entity.arrow.IronArrowEntity;
import net.gecko.varanarmor.entity.arrow.NetherArrowEntity;
import net.gecko.varanarmor.entity.arrow.QuartzArrowEntity;
import net.gecko.varanarmor.entity.bobbers.NautilusFishingBobberEntity;
import net.gecko.varanarmor.entity.bobbers.SquidFishingBobberEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ArmoryEntities {
//I got this code from Scouter456 Nether Depths Upgrade Mod https://github.com/Scouter456/Nether_Depths_Upgrade/tree/nether_depths_upgrade_1.19.2-fabric

    public static final EntityType<IronArrowEntity> IRON_ARROW = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(VaranArmor.MOD_ID, "iron_arrow"),
            FabricEntityTypeBuilder.<IronArrowEntity>create(SpawnGroup.MISC, IronArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build());

    public static final EntityType<AmethystArrowEntity> AMETHYST_ARROW = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(VaranArmor.MOD_ID, "amethyst_arrow"),
            FabricEntityTypeBuilder.<AmethystArrowEntity>create(SpawnGroup.MISC, AmethystArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build());

    public static final EntityType<QuartzArrowEntity> QUARTZ_ARROW = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(VaranArmor.MOD_ID, "quartz_arrow"),
            FabricEntityTypeBuilder.<QuartzArrowEntity>create(SpawnGroup.MISC, QuartzArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build());

    public static final EntityType<NetherArrowEntity> NETHER_ARROW = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(VaranArmor.MOD_ID, "nether_arrow"),
            FabricEntityTypeBuilder.<NetherArrowEntity>create(SpawnGroup.MISC, NetherArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build());

    public static final EntityType<SquidFishingBobberEntity> SQUID_BOBBER = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(VaranArmor.MOD_ID, "squid_bobber"),
            FabricEntityTypeBuilder.<SquidFishingBobberEntity>create(SpawnGroup.MISC, SquidFishingBobberEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F)).build());

    public static final EntityType<NautilusFishingBobberEntity> NAUTILUS_BOBBER = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(VaranArmor.MOD_ID, "nautilus_bobber"),
            FabricEntityTypeBuilder.<NautilusFishingBobberEntity>create(SpawnGroup.MISC, NautilusFishingBobberEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F)).build());

    public static void registerDecoEntities(){
        VaranArmor.LOGGER.info("Registering Deco Entities for " + VaranArmor.MOD_ID);
    }
}
