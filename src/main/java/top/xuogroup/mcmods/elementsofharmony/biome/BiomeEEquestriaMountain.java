package top.xuogroup.mcmods.elementsofharmony.biome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;

public class BiomeEEquestriaMountain extends Biome {

    public BiomeEEquestriaMountain(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 80, 4, 12));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.HORSE, 80, 2, 8));
    }
}
