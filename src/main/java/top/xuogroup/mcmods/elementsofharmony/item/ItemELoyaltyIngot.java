package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;

public class ItemELoyaltyIngot extends Item {
    public ItemELoyaltyIngot(){
        super(new Item.Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
