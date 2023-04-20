package net.namu.awpmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.world.World;

public class AwpBulletEntity extends ArrowEntity {
    public AwpBulletEntity(EntityType<? extends ArrowEntity> entityType, World world) {
        super(entityType, world);
    }

    public AwpBulletEntity(World world, LivingEntity owner) {
        super(AwpModEntities.AWP_BULLET, world);
    }

    @Override
    protected void onHit(LivingEntity target) {
        target.setHealth(0);
    }

    @Override
    protected void initDataTracker() {

    }

    @Override
    public boolean cannotBeSilenced() {
        return super.cannotBeSilenced();
    }
}

