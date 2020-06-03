package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireELoyalty;

public class ItemELoyaltyAxe extends AxeItem {
    private static final IItemTier tireELoyalty = new TireELoyalty();
    public ItemELoyaltyAxe(){
        super(tireELoyalty, 6.0F, -2.6F, new Item.Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
