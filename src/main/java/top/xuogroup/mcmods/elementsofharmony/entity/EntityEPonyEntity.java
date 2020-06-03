package top.xuogroup.mcmods.elementsofharmony.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

public class EntityEPonyEntity extends AnimalEntity {
    public EntityEPonyEntity(EntityType<? extends EntityEPonyEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Nullable @Override @ParametersAreNonnullByDefault
    public AgeableEntity createChild(AgeableEntity ageable) {
        return null;
    }
}
