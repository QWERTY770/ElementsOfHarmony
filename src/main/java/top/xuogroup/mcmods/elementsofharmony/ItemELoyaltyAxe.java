package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class ItemELoyaltyAxe extends AxeItem {
    private static final IItemTier tireELoyalty = new TireELoyalty();
    public ItemELoyaltyAxe(){
        super(tireELoyalty, 6.0F, -2.6F, new Item.Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
