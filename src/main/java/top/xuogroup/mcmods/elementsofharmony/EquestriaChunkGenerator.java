package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorld;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.*;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class EquestriaChunkGenerator extends NoiseChunkGenerator<GenerationSettings> {
    private static final float[] field_222576_h = Util.make(new float[25], (p_222575_0_) -> {
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                float f = 10.0F / MathHelper.sqrt((float) (i * i + j * j) + 0.2F);
                p_222575_0_[i + 2 + (j + 2) * 5] = f;
            }
        }
    });
    private final boolean isAmplified;
    private final OctavesNoiseGenerator depthNoise;

    public EquestriaChunkGenerator(IWorld worldIn, BiomeProvider provider, GenerationSettings settingsIn){
        super(worldIn, provider, 4, 8, 256, settingsIn, true);
        this.isAmplified = worldIn.getWorldInfo().getGenerator() == WorldType.AMPLIFIED;
        this.depthNoise = new OctavesNoiseGenerator(this.randomSeed, 15, 0);
    }
    public static GenerationSettings createDefault() {
        GenerationSettings config = new GenerationSettings();
        config.setDefaultBlock(Blocks.STONE.getDefaultState());
        config.setDefaultFluid(Blocks.WATER.getDefaultState());
        return config;
    }
    @Override @ParametersAreNonnullByDefault
    public void generateSurface(WorldGenRegion region, IChunk chunk) {
        BlockState bedrock = Blocks.BEDROCK.getDefaultState();
        BlockState stone = Blocks.STONE.getDefaultState();
        BlockState grass_block = Blocks.GRASS_BLOCK.getDefaultState();
        BlockState dirt = Blocks.DIRT.getDefaultState();
        ChunkPos chunkpos = chunk.getPos();

        BlockPos.Mutable pos = new BlockPos.Mutable();

        int x;
        int z;

        for (x = 0; x < 16; x++) {
            for (z = 0; z < 16; z++) {
                chunk.setBlockState(pos.setPos(x, 0, z), bedrock, false);
            }
        }

        for (x = 0; x < 16; x++) {
            for (z = 0; z < 16; z++) {
                int realx = chunkpos.x * 16 + x;
                int realz = chunkpos.z * 16 + z;
                int height = (int) (65 + Math.sin(realx / 20.0f) * 4 + Math.cos(realz / 20.0f) * 4);
                for (int y = 1; y < height - 4; y++) {
                    chunk.setBlockState(pos.setPos(x, y, z), stone, false);
                }
                chunk.setBlockState(pos.setPos(x, height - 4, z), dirt, false);
                chunk.setBlockState(pos.setPos(x, height - 3, z), dirt, false);
                chunk.setBlockState(pos.setPos(x, height - 2, z), dirt, false);
                chunk.setBlockState(pos.setPos(x, height - 1, z), dirt, false);
                chunk.setBlockState(pos.setPos(x, height, z), grass_block, false);
            }
        }
    }
    @Override
    public int getGroundHeight() {
        return world.getSeaLevel() + 1;
    }
    @Override @ParametersAreNonnullByDefault
    public void makeBase(IWorld worldIn, IChunk chunkIn) {

    }
    @Override @ParametersAreNonnullByDefault
    public int func_222529_a(int p_222529_1_, int p_222529_2_, Heightmap.Type heightmapType) {
        return 0;
    }

    @Nonnull
    protected double[] getBiomeNoiseColumn(int noiseX, int noiseZ) {
        double[] adouble = new double[2];
        float f = 0.0F;
        float f1 = 0.0F;
        float f2 = 0.0F;
        int i = 2;
        int j = this.getSeaLevel();
        float f3 = this.biomeProvider.getNoiseBiome(noiseX, j, noiseZ).getDepth();

        for(int k = -2; k <= 2; ++k) {
            for(int l = -2; l <= 2; ++l) {
                Biome biome = this.biomeProvider.getNoiseBiome(noiseX + k, j, noiseZ + l);
                float f4 = biome.getDepth();
                float f5 = biome.getScale();
                if (this.isAmplified && f4 > 0.0F) {
                    f4 = 1.0F + f4 * 2.0F;
                    f5 = 1.0F + f5 * 4.0F;
                }

                float f6 = field_222576_h[k + 2 + (l + 2) * 5] / (f4 + 2.0F);
                if (biome.getDepth() > f3) {
                    f6 /= 2.0F;
                }

                f += f5 * f6;
                f1 += f4 * f6;
                f2 += f6;
            }
        }

        f = f / f2;
        f1 = f1 / f2;
        f = f * 0.9F + 0.1F;
        f1 = (f1 * 4.0F - 1.0F) / 8.0F;
        adouble[0] = (double)f1 + this.getNoiseDepthAt(noiseX, noiseZ);
        adouble[1] = (double)f;
        return adouble;
    }
    protected double func_222545_a(double p_222545_1_, double p_222545_3_, int p_222545_5_) {
        double d0 = 8.5D;
        double d1 = ((double)p_222545_5_ - (8.5D + p_222545_1_ * 8.5D / 8.0D * 4.0D)) * 12.0D * 128.0D / 256.0D / p_222545_3_;
        if (d1 < 0.0D) {
            d1 *= 4.0D;
        }

        return d1;
    }

    @ParametersAreNonnullByDefault
    protected void fillNoiseColumn(double[] noiseColumn, int noiseX, int noiseZ) {
        double d0 = (double)684.412F;
        double d1 = (double)684.412F;
        double d2 = 8.555149841308594D;
        double d3 = 4.277574920654297D;
        int i = -10;
        int j = 3;
        this.calcNoiseColumn(noiseColumn, noiseX, noiseZ, (double)684.412F, (double)684.412F, 8.555149841308594D, 4.277574920654297D, 3, -10);
    }

    private double getNoiseDepthAt(int noiseX, int noiseZ) {
        double d0 = this.depthNoise.getValue((double)(noiseX * 200), 10.0D, (double)(noiseZ * 200), 1.0D, 0.0D, true) * 65535.0D / 8000.0D;
        if (d0 < 0.0D) {
            d0 = -d0 * 0.3D;
        }

        d0 = d0 * 3.0D - 2.0D;
        if (d0 < 0.0D) {
            d0 = d0 / 28.0D;
        } else {
            if (d0 > 1.0D) {
                d0 = 1.0D;
            }

            d0 = d0 / 40.0D;
        }

        return d0;
    }

}
