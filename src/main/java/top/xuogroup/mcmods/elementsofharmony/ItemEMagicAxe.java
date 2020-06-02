package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class ItemEMagicAxe extends AxeItem {
    private static final IItemTier tireEMagic = new TireEMagic();
    public ItemEMagicAxe(){
        super(tireEMagic, 6.0F, -3.0F, new Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
