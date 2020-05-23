package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class ItemEGenerosityAxe extends AxeItem {
    private static final IItemTier tireEGenerosity = new TireEGenerosity();
    public ItemEGenerosityAxe(){
        super(tireEGenerosity, 6.0F, -2.6F, new Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
