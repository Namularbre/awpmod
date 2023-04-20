package net.namu.awpmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AwpModEntities {
    public static final EntityType<AwpBulletEntity> AWP_BULLET = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier("awpmod", "awp_bullet"),
            FabricEntityTypeBuilder.<AwpBulletEntity>create(SpawnGroup.MISC, AwpBulletEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(64)
                    .trackedUpdateRate(4)
                    .build()
    );
}

