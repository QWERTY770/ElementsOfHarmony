package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireEMagic;

public class ItemEMagicAxe extends AxeItem {
    private static final IItemTier tireEMagic = new TireEMagic();
    public ItemEMagicAxe(){
        super(tireEMagic, 6.0F, -3.0F, new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
