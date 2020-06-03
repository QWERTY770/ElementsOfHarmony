package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;

public class ItemEHonestyGem extends Item {
    public ItemEHonestyGem(){
        super(new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
