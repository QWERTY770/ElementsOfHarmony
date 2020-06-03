package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireELaughter;

public class ItemELaughterSword extends SwordItem {
    private static final IItemTier tireELaughter = new TireELaughter();
    public ItemELaughterSword(){
        super(tireELaughter, 3, -1.6F, new Item.Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
