package top.xuogroup.mcmods.elementsofharmony.registry;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.xuogroup.mcmods.elementsofharmony.biome.BiomeEEquestriaForest;
import top.xuogroup.mcmods.elementsofharmony.biome.BiomeEEquestriaPlains;
import top.xuogroup.mcmods.elementsofharmony.biome.BiomeEUrbanizedLand;

public abstract class BiomeRegistry {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, "elementsofharmony");

    public static final RegistryObject<Biome> biomeEEquestriaForest = BIOMES.register("biome_e_equestria_forest",
            () -> new BiomeEEquestriaForest(new Biome.Builder()
                    .precipitation(Biome.RainType.SNOW)
                    .scale(0.15F)
                    .temperature(1.0F)
                    .waterColor(0x9DE7FF).waterFogColor(0x25598A)
                    .surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG)
                    .category(Biome.Category.FOREST)
                    .downfall(0.02F)
                    .depth(0.12F)
                    .parent(null)
            ));
    public static final RegistryObject<Biome> biomeEEquestriaPlains = BIOMES.register("biome_e_equestria_plains",
            () -> new BiomeEEquestriaPlains(new Biome.Builder()
                    .precipitation(Biome.RainType.RAIN)
                    .scale(0.05F)
                    .temperature(1.2F)
                    .waterColor(0xAEEBFF).waterFogColor(0x4581BA)
                    .surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG)
                    .category(Biome.Category.PLAINS)
                    .downfall(0.4F)
                    .depth(0.025F)
                    .parent(null)
            ));
    public static final RegistryObject<Biome> biomeEUrbanizedLand = BIOMES.register("biome_e_urbanized_land",
            () -> new BiomeEUrbanizedLand(new Biome.Builder()
                    .precipitation(Biome.RainType.NONE)
                    .scale(0.0F)
                    .temperature(1.0F)
                    .waterColor(0x9DE7FF).waterFogColor(0x25598A)
                    .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.BRICKS.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.GRAVEL.getDefaultState()))
                    .category(Biome.Category.PLAINS)
                    .downfall(0.0F)
                    .depth(0.001F)
                    .parent(null)
            ));

}
