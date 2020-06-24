package top.xuogroup.mcmods.elementsofharmony.biome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;

public class BiomeEEverfreeForest extends Biome{
	public BiomeEEverfreeForest(Builder biomeBuilder) {
        super(biomeBuilder);
        addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.END_CRYSTAL, 100, 1, 4));
        addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.EXPERIENCE_ORB, 100, 4, 12));
        addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.DRAGON_FIREBALL, 100, 1, 2));
        addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.WITHER_SKULL, 20, 1, 1));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BAT, 100, 1, 4));
        addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.ARROW, 20, 1, 2));
        addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.BLAZE, 20, 1, 2));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.ENDERMAN, 50, 1, 2));
        addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.FIREBALL, 20, 1, 2));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.EVOKER, 30, 1, 2));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CREEPER, 50, 1, 2));
        addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.EYE_OF_ENDER, 50, 1, 2));
        addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.EXPERIENCE_BOTTLE, 50, 1, 2));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.ILLUSIONER, 30, 1, 2));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SKELETON, 30, 1, 2));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.WITCH, 30, 1, 2));
        addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.WITHER_SKELETON, 20, 1, 1));
    }

}
