package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;

public class ItemELoyaltyJewelry extends Item {
    public ItemELoyaltyJewelry(){
        super(new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
