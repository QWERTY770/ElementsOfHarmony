package top.xuogroup.mcmods.elementsofharmony.biome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import top.xuogroup.mcmods.elementsofharmony.util.BiomeFeatures;

public class BiomeEEquestriaPlains extends Biome {
    public BiomeEEquestriaPlains(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.DONKEY, 100, 12, 24));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.HORSE, 100, 8, 24));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 100, 12, 24));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 100, 12, 24));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 100, 8, 24));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CAT, 60, 4, 12));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.COW, 100, 4, 24));
        addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.COD, 100, 8, 24));
        addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.SALMON, 100, 8, 24));
        addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.SQUID, 100, 4, 24));
        BiomeFeatures.addHarmonyMine(this, 256, 5, 40);
        DefaultBiomeFeatures.addDoubleFlowers(this);
        DefaultBiomeFeatures.addCarvers(this);
        DefaultBiomeFeatures.addLakes(this);
        DefaultBiomeFeatures.addPlainsTallGrass(this);
        DefaultBiomeFeatures.addSeagrass(this);
        DefaultBiomeFeatures.addStoneVariants(this);
        DefaultBiomeFeatures.addOres(this);
        DefaultBiomeFeatures.addSedimentDisks(this);
        DefaultBiomeFeatures.addOakTreesFlowersGrass(this);
        DefaultBiomeFeatures.addMushrooms(this);
        DefaultBiomeFeatures.addReedsAndPumpkins(this);
        DefaultBiomeFeatures.addSprings(this);
        DefaultBiomeFeatures.addFreezeTopLayer(this);
    }
}
