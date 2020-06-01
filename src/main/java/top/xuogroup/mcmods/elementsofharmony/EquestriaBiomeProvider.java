package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;

import javax.annotation.Nonnull;
import java.util.*;

public class EquestriaBiomeProvider extends BiomeProvider {
    private static final List<Biome> BIOMES = new ArrayList<>(Arrays.asList(Biomes.PLAINS, Biomes.FOREST, Biomes.OCEAN));
    private final Random random;

    protected EquestriaBiomeProvider() {
        super(new HashSet<>(BIOMES));
        random = new Random();
    }

    @Override @Nonnull
    public Biome getNoiseBiome(int x, int y, int z) {
        return BIOMES.get(random.nextInt(3));
    }
}
