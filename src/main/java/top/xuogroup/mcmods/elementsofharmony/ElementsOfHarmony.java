package top.xuogroup.mcmods.elementsofharmony;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.xuogroup.mcmods.elementsofharmony.registry.BlockRegistry;
import top.xuogroup.mcmods.elementsofharmony.registry.BiomeRegistry;
import top.xuogroup.mcmods.elementsofharmony.registry.ItemRegistry;

@Mod("elementsofharmony")
public class ElementsOfHarmony {
    public ElementsOfHarmony() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BiomeRegistry.BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
        // Set Up Registry
    }
}
