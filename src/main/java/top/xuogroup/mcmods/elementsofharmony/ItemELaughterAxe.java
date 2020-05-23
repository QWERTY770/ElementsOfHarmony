package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class ItemELaughterAxe extends AxeItem {
    private static final IItemTier tireELaughter = new TireELaughter();
    public ItemELaughterAxe(){
        super(tireELaughter, 6.0F, -2.6F, new Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
