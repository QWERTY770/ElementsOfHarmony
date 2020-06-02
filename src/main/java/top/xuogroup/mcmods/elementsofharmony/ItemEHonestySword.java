package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class ItemEHonestySword extends SwordItem {
    private static final IItemTier tireEHonesty = new TireEHonesty();
    public ItemEHonestySword(){
        super(tireEHonesty, 3, -2.2F, new Item.Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
