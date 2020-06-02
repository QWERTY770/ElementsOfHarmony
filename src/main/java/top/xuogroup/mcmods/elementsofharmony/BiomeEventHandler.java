package top.xuogroup.mcmods.elementsofharmony;

import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BiomeEventHandler {
    @SubscribeEvent
    public static void onSetUpEvent(FMLCommonSetupEvent event){
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(BiomeRegistry.biomeEEquestriaForest.get(), 4000));
    }
}
