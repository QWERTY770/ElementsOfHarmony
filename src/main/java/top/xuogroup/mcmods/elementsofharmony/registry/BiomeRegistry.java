package top.xuogroup.mcmods.elementsofharmony.registry;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.xuogroup.mcmods.elementsofharmony.biome.*;

public abstract class BiomeRegistry {

	 public static final DeferredRegister<Biome> BIOMES =
	 DeferredRegister.create(ForgeRegistries.BIOMES, "elementsofharmony");

	 public static final RegistryObject<Biome> biomeEEquestriaForest =
	 BIOMES.register("biome_e_equestria_forest", () -> new
	 BiomeEEquestriaForest(new Biome.Builder() .precipitation(Biome.RainType.SNOW)
	 .scale(0.15F) .temperature(1.0F)
	 .func_235097_a_(new BiomeAmbience.Builder()
			 .func_235246_b_(0x9DE7FF)
			 .func_235248_c_(0x205678)
			 .func_235239_a_(0xC9FFFD)
			 .func_235243_a_(MoodSoundAmbience.field_235027_b_)
			 .func_235238_a_())
	 .surfaceBuilder(SurfaceBuilder.DEFAULT,
	 SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG) .category(Biome.Category.FOREST)
	 .downfall(0.02F) .depth(0.12F) .parent(null) ));

	 public static final RegistryObject<Biome> biomeEEquestriaPlains =
	 BIOMES.register("biome_e_equestria_plains", () -> new
	 BiomeEEquestriaPlains(new Biome.Builder() .precipitation(Biome.RainType.RAIN)
	 .scale(0.05F) .temperature(1.2F)
	 .func_235097_a_(new BiomeAmbience.Builder()
			 .func_235246_b_(0x9DE7FF)
			 .func_235248_c_(0x205678)
			 .func_235239_a_(0xC9FFFD)
			 .func_235243_a_(MoodSoundAmbience.field_235027_b_)
			 .func_235238_a_())
	 .surfaceBuilder(SurfaceBuilder.DEFAULT,
	 SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG) .category(Biome.Category.PLAINS)
	 .downfall(0.4F) .depth(0.025F) .parent(null) ));


	 public static final RegistryObject<Biome> biomeEUrbanizedLand =
	 BIOMES.register("biome_e_urbanized_land", () -> new
	 BiomeEUrbanizedLand(new Biome.Builder()
	 .precipitation(Biome.RainType.NONE)
	 .scale(0.0F)
	 .temperature(1.0F)
	 .func_235097_a_(new BiomeAmbience.Builder()
			 .func_235246_b_(0x9DE7FF)
			 .func_235248_c_(0x205678)
			 .func_235239_a_(0xC9FFFD)
			 .func_235243_a_(MoodSoundAmbience.field_235027_b_)
			 .func_235238_a_())
	 .surfaceBuilder(SurfaceBuilder.DEFAULT, new
			 SurfaceBuilderConfig(Blocks.BRICKS.getDefaultState(),
	 Blocks.STONE.getDefaultState(), Blocks.GRAVEL.getDefaultState()))
	 .category(Biome.Category.PLAINS)
	 .downfall(0.0F)
	 .depth(0.001F)
	 .parent(null)
	 ));
	 
	 // Structures Not Finished Yet
	 
	 public static final RegistryObject<Biome> biomeEEquestriaMountain =
	 BIOMES.register("biome_e_equestria_mountain", () -> new
	 BiomeEEquestriaMountain(new Biome.Builder()
	 .precipitation(Biome.RainType.SNOW) .scale(0.5F) .temperature(0.2F)
			 .func_235097_a_(new BiomeAmbience.Builder()
					 .func_235246_b_(0x9DE7FF)
					 .func_235248_c_(0x205678)
					 .func_235239_a_(0xC9FFFD)
					 .func_235243_a_(MoodSoundAmbience.field_235027_b_)
					 .func_235238_a_())
	 .surfaceBuilder(SurfaceBuilder.MOUNTAIN,
	 SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG) .category(Biome.Category.FOREST)
	 .downfall(0.3F) .depth(1.0F) .parent(null) ));

	 public static final RegistryObject<Biome> biomeEEverfreeForest =
	 BIOMES.register("biome_e_everfree_forest", () -> new BiomeEEverfreeForest(new
	 Biome.Builder() .precipitation(Biome.RainType.SNOW) .scale(0.07F)
	 .temperature(0.2F) 	 .func_235097_a_(new BiomeAmbience.Builder()
					 .func_235246_b_(0x9DE7FF)
					 .func_235248_c_(0x205678)
					 .func_235239_a_(0xC9FFFD)
					 .func_235243_a_(MoodSoundAmbience.field_235027_b_)
					 .func_235238_a_())
	 .surfaceBuilder(SurfaceBuilder.DEFAULT,
	 SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG) .category(Biome.Category.FOREST)
	 .downfall(0.2F) .depth(0.14F) .parent(null) ));

}
