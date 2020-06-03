package top.xuogroup.mcmods.elementsofharmony.eventhandler;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import top.xuogroup.mcmods.elementsofharmony.registry.BiomeRegistry;
import top.xuogroup.mcmods.elementsofharmony.util.BiomeFeatures;

import static top.xuogroup.mcmods.elementsofharmony.util.BiomeFeatures.isEquestriaBiomes;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusSubscriber {
    @SubscribeEvent
    public static void onSetUpEvent(FMLCommonSetupEvent event){
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(BiomeRegistry.biomeEEquestriaForest.get(), 5000));
        // Add Biomes

        // Sep ---------------------------------------------------------------------------------------------------------

        IForgeRegistry<Biome> biomesToRegister = ForgeRegistries.BIOMES;
        for (Biome biome : biomesToRegister) {
            if (!isEquestriaBiomes(biome)) {
                // Already Add This Feature For EQ Biomes
                BiomeFeatures.addHarmonyMine(biome, 48, 6 ,10);
            }
        }
        // Add Ore Generate Rules For Not EQ Biomes

    }
}
