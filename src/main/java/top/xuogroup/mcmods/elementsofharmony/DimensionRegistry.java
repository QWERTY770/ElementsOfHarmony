package top.xuogroup.mcmods.elementsofharmony;

import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionRegistry {
    public static final DeferredRegister<ModDimension> MOD_DIMENSION = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, "equestria");
    public static RegistryObject<ElementsOfHarmonyDimensions> equestriaDimension = MOD_DIMENSION.register("equestria_dimension", ElementsOfHarmonyDimensions::new);
}
