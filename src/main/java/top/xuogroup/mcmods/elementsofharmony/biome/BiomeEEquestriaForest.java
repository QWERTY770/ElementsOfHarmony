package top.xuogroup.mcmods.elementsofharmony.biome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import top.xuogroup.mcmods.elementsofharmony.util.BiomeFeatures;

public class BiomeEEquestriaForest extends Biome {

    public BiomeEEquestriaForest(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 80, 10, 20));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.DONKEY, 80, 10, 20));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.HORSE, 100, 8, 20));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 100, 10, 16));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 80, 10, 20));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PARROT, 100, 8, 20));
        addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.COD, 100, 6, 16));
        addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.SALMON, 100, 6, 12));
        addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.SQUID, 100, 4, 8));
        BiomeFeatures.addHarmonyMine(this, 512, 5, 59);
        DefaultBiomeFeatures.addCarvers(this);
        DefaultBiomeFeatures.addLakes(this);
        DefaultBiomeFeatures.addDefaultFlowers(this);
        DefaultBiomeFeatures.addBirchTrees(this);
        DefaultBiomeFeatures.addGrass(this);
        DefaultBiomeFeatures.addOakTreesFlowersGrass(this);
        DefaultBiomeFeatures.addSprings(this);
        DefaultBiomeFeatures.addScatteredSpruceTrees(this);
        DefaultBiomeFeatures.addScatteredOakTrees(this);
        DefaultBiomeFeatures.addForestTrees(this);
        DefaultBiomeFeatures.addSeagrass(this);
        DefaultBiomeFeatures.addBerryBushes(this);
        DefaultBiomeFeatures.addOres(this);
        DefaultBiomeFeatures.addStoneVariants(this);
        DefaultBiomeFeatures.addReedsAndPumpkins(this);
    }
}
