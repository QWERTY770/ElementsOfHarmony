package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireELoyalty;

public class ItemELoyaltyPickaxe extends PickaxeItem {
    private static final IItemTier tireELoyalty = new TireELoyalty();
    public ItemELoyaltyPickaxe(){
        super(tireELoyalty, 1, -2.2F, new Item.Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
