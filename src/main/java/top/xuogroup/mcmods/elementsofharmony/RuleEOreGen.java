package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RuleEOreGen {
    @SubscribeEvent
    public static void onSetUpEvent(FMLCommonSetupEvent event){
        IForgeRegistry<Biome> biomesToRegister = ForgeRegistries.BIOMES; // For Future Development

        for (Biome biome : biomesToRegister) {
            if (!isEquestriaBiomes(biome)) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(
                                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                        BlockRegistry.blockELoyaltyMine.get().getDefaultState(),
                                        3)
                        ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(48, 6, 10)))
                );

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(
                                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                        BlockRegistry.blockELaughterMine.get().getDefaultState(),
                                        3)
                        ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(48, 6, 10)))
                );

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(
                                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                        BlockRegistry.blockEGenerosityMine.get().getDefaultState(),
                                        3)
                        ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(48, 6, 10)))
                );

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(
                                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                        BlockRegistry.blockEHonestyMine.get().getDefaultState(),
                                        3)
                        ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(48, 6, 10)))
                );

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(
                                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                        BlockRegistry.blockEKindnessMine.get().getDefaultState(),
                                        3)
                        ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(48, 6, 10)))
                );

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(
                                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                        BlockRegistry.blockEMagicMine.get().getDefaultState(),
                                        3)
                        ).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(48, 6, 10)))
                );
            }
        }
    }
    private static boolean isEquestriaBiomes(Biome biomeIn){
        return biomeIn instanceof BiomeEEquestriaForest;
    }
}
