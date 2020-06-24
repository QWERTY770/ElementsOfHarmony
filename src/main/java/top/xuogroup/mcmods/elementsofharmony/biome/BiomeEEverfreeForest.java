package top.xuogroup.mcmods.elementsofharmony.biome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import top.xuogroup.mcmods.elementsofharmony.util.BiomeFeatures;

public class BiomeEEverfreeForest extends Biome{
	public BiomeEEverfreeForest(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.BAT, 100, 1, 4));
        addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ENDERMAN, 100, 1, 2));
        addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.EVOKER, 100, 1, 2));
        addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.CREEPER, 100, 1, 2));
        addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ILLUSIONER, 100, 1, 2));
        addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SKELETON, 100, 1, 2));
        addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.WITCH, 100, 1, 2));
        addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.WITHER_SKELETON, 100, 1, 1));
        addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.PHANTOM, 100, 1, 2));
        addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 100, 1, 2));

        BiomeFeatures.addHarmonyMine(this, 512, 5, 64);
        DefaultBiomeFeatures.addDoubleFlowers(this);
        DefaultBiomeFeatures.addCarvers(this);
        DefaultBiomeFeatures.addLakes(this);
        DefaultBiomeFeatures.addSeagrass(this);
        DefaultBiomeFeatures.addStoneVariants(this);
        DefaultBiomeFeatures.addOres(this);
        DefaultBiomeFeatures.addSedimentDisks(this);
        DefaultBiomeFeatures.addExtraGoldOre(this);
        DefaultBiomeFeatures.addExtraEmeraldOre(this);
        DefaultBiomeFeatures.addOakTreesFlowersGrass(this);
        DefaultBiomeFeatures.addMushrooms(this);
        DefaultBiomeFeatures.addReedsAndPumpkins(this);
        DefaultBiomeFeatures.addSprings(this);
        DefaultBiomeFeatures.addFreezeTopLayer(this);
        DefaultBiomeFeatures.addBirchTrees(this);
        DefaultBiomeFeatures.addForestTrees(this);
    }

}
