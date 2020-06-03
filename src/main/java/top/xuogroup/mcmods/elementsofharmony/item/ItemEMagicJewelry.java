package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;

public class ItemEMagicJewelry extends Item {
    public ItemEMagicJewelry(){
        super(new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
