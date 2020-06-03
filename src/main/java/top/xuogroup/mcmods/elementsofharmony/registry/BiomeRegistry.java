package top.xuogroup.mcmods.elementsofharmony.registry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import top.xuogroup.mcmods.elementsofharmony.biome.BiomeEEquestriaForest;

public abstract class BiomeRegistry {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, "elementsofharmony");

    public static final RegistryObject<Biome> biomeEEquestriaForest = BIOMES.register("biome_e_equestria_forest",
            () -> new BiomeEEquestriaForest(new Biome.Builder()
                    .precipitation(Biome.RainType.SNOW)
                    .scale(0.15F)
                    .temperature(1.0F)
                    .waterColor(0x7FDFFF).waterFogColor(0x25598A)
                    .surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG)
                    .category(Biome.Category.FOREST)
                    .downfall(0.02F)
                    .depth(0.12F)
                    .parent(null)
            ));


}
