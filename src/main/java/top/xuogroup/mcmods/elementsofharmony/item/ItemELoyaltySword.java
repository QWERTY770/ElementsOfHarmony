package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireELoyalty;

public class ItemELoyaltySword extends SwordItem {
    private static final IItemTier tireELoyalty = new TireELoyalty();
    public ItemELoyaltySword() {
        super(tireELoyalty, 3, -1.6F, new Item.Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
