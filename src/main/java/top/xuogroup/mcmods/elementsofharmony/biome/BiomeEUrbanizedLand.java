package top.xuogroup.mcmods.elementsofharmony.biome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import top.xuogroup.mcmods.elementsofharmony.util.BiomeFeatures;

public class BiomeEUrbanizedLand extends Biome {
    public BiomeEUrbanizedLand(Builder biomeBuilder){
        super(biomeBuilder);
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 80, 10, 20));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 100, 10, 16));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PARROT, 100, 8, 20));
        BiomeFeatures.addHarmonyMine(this, 512, 5, 59);
        DefaultBiomeFeatures.addSprings(this);
        DefaultBiomeFeatures.addOres(this);
    }

}
