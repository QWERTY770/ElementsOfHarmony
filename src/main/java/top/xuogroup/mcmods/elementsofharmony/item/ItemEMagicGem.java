package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;

public class ItemEMagicGem extends Item {
    public ItemEMagicGem(){
        super(new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
