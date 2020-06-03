package top.xuogroup.mcmods.elementsofharmony.util;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;
import top.xuogroup.mcmods.elementsofharmony.biome.BiomeEEquestriaForest;
import top.xuogroup.mcmods.elementsofharmony.registry.BlockRegistry;

public abstract class BiomeFeatures {
    public static void addHarmonyMine(Biome biomeIn, int count, int baseline, int spread){
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockRegistry.blockELoyaltyMine.get().getDefaultState(),
                                3)
                ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(count, baseline, spread)))
        );
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockRegistry.blockELaughterMine.get().getDefaultState(),
                                3)
                ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(count, baseline, spread)))
        );
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockRegistry.blockEGenerosityMine.get().getDefaultState(),
                                3)
                ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(count, baseline, spread)))
        );
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockRegistry.blockEHonestyMine.get().getDefaultState(),
                                3)
                ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(count, baseline, spread)))
        );
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockRegistry.blockEKindnessMine.get().getDefaultState(),
                                3)
                ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(count, baseline, spread)))
        );
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockRegistry.blockEMagicMine.get().getDefaultState(),
                                3)
                ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(count, baseline, spread)))
        );
    }
    public static boolean isEquestriaBiomes(Biome biomeIn){
        return biomeIn instanceof BiomeEEquestriaForest;
    }
}
