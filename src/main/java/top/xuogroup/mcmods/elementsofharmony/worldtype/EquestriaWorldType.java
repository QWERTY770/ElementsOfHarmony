package top.xuogroup.mcmods.elementsofharmony.worldtype;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;
import top.xuogroup.mcmods.elementsofharmony.registry.BiomeRegistry;

public class EquestriaWorldType extends WorldType{
	public EquestriaWorldType() {
        super("equestria_type");
    }
	@Override
    public ChunkGenerator<?> createChunkGenerator(World world) {
        OverworldGenSettings settings = new OverworldGenSettings();
        SingleBiomeProvider singleBiomeProvider = new SingleBiomeProvider(new SingleBiomeProviderSettings(world.getWorldInfo()).setBiome(BiomeRegistry.obsidianBiome.get()));
        return new OverworldChunkGenerator(world, singleBiomeProvider, settings);
    }
}
