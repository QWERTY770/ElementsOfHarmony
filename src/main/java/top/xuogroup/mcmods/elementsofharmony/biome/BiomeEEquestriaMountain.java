package top.xuogroup.mcmods.elementsofharmony.biome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import top.xuogroup.mcmods.elementsofharmony.util.BiomeFeatures;

public class BiomeEEquestriaMountain extends Biome {

    public BiomeEEquestriaMountain(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 100, 4, 12));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.HORSE, 100, 2, 8));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 60, 4, 4));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CAT, 40, 1, 4));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.WOLF, 60, 1, 4));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 80, 1, 4));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.COW, 60, 2, 8));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.DONKEY, 50, 2, 8));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.FOX, 60, 4, 8));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PARROT, 80, 4, 12));
        addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.COD, 60, 6, 16));
        addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.SALMON, 60, 6, 12));
        addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.SQUID, 60, 4, 8));
        BiomeFeatures.addHarmonyMine(this, 256, 6, 64);
        DefaultBiomeFeatures.addDefaultFlowers(this);
        DefaultBiomeFeatures.addGrass(this);
        DefaultBiomeFeatures.addCarvers(this);
        DefaultBiomeFeatures.addScatteredOakAndSpruceTrees(this);
        DefaultBiomeFeatures.addSprings(this);
        DefaultBiomeFeatures.addSeagrass(this);
        DefaultBiomeFeatures.addBirchTrees(this);
        DefaultBiomeFeatures.addOakTreesFlowersGrass(this);
        DefaultBiomeFeatures.addExtraGoldOre(this);
        DefaultBiomeFeatures.addOres(this);
        DefaultBiomeFeatures.addExtraDefaultFlowers(this);
        DefaultBiomeFeatures.addMushrooms(this);
        DefaultBiomeFeatures.addExtraReedsAndPumpkins(this);
        DefaultBiomeFeatures.addForestTrees(this);
        DefaultBiomeFeatures.addBerryBushes(this);
    }
}
