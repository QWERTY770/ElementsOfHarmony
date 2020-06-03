package top.xuogroup.mcmods.elementsofharmony.biome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import top.xuogroup.mcmods.elementsofharmony.util.BiomeFeatures;

public class BiomeEEquestriaForest extends Biome {

    public BiomeEEquestriaForest(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 24, 4, 8));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.DONKEY, 16, 4, 8));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.HORSE, 32, 6, 10));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 32, 4, 8));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 24, 4, 6));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PARROT, 16, 4, 8));
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
        DefaultBiomeFeatures.addOres(this);
    }
}
