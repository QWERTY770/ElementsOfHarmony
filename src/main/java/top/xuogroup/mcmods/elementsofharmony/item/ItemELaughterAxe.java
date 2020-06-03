package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireELaughter;

public class ItemELaughterAxe extends AxeItem {
    private static final IItemTier tireELaughter = new TireELaughter();
    public ItemELaughterAxe(){
        super(tireELaughter, 6.0F, -2.6F, new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
