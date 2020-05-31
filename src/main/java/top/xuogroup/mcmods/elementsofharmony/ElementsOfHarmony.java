package top.xuogroup.mcmods.elementsofharmony;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("elementsofharmony")
public class ElementsOfHarmony {

    public ElementsOfHarmony() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        DimensionRegistry.MOD_DIMENSION.register(FMLJavaModLoadingContext.get().getModEventBus());
        // Set Up Registry
    }
}
