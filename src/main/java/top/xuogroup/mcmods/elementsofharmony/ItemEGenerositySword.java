package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class ItemEGenerositySword extends SwordItem {
    private static final IItemTier tireEGenerosity = new TireEGenerosity();
    public ItemEGenerositySword(){
        super(tireEGenerosity, 3, -1.6F, new Item.Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
