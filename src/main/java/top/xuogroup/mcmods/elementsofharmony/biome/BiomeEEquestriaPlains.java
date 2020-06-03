package top.xuogroup.mcmods.elementsofharmony.biome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import top.xuogroup.mcmods.elementsofharmony.util.BiomeFeatures;

public class BiomeEEquestriaPlains extends Biome {
    public BiomeEEquestriaPlains(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.HORSE, 18, 1, 6));
        BiomeFeatures.addHarmonyMine(this, 256, 5, 40);
    }
}
