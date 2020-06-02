package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import top.xuogroup.mcmods.elementsofharmony.fastly.FastlyBiomeFeatures;

public class BiomeEEquestriaForest extends Biome {

    public BiomeEEquestriaForest(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 12, 1, 2));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.DONKEY, 4, 1, 2));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.HORSE, 16, 2, 4));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 16, 2, 4));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 8, 1, 4));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PARROT, 4, 2, 8));
        FastlyBiomeFeatures.addHarmonyMine(this, 256, 5, 59);
        DefaultBiomeFeatures.addCarvers(this);
        DefaultBiomeFeatures.addForestTrees(this);
        DefaultBiomeFeatures.addOres(this);
        DefaultBiomeFeatures.addExtraGoldOre(this);
        DefaultBiomeFeatures.addSprings(this);
        DefaultBiomeFeatures.addBerryBushes(this);
    }
}
