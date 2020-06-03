package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;

public class ItemEMagicIngot extends Item {
    public ItemEMagicIngot(){
        super(new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
