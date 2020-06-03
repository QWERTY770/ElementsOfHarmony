package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;

public class ItemELoyaltyGem extends Item{
    public ItemELoyaltyGem(){
        super(new Item.Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
