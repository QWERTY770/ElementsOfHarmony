package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireEGenerosity;

public class ItemEGenerosityAxe extends AxeItem {
    private static final IItemTier tireEGenerosity = new TireEGenerosity();
    public ItemEGenerosityAxe(){
        super(tireEGenerosity, 6.0F, -2.6F, new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
