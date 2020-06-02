package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class ItemEKindnessSword extends SwordItem {
    private static final IItemTier tireEKindness = new TireEKindness();
    public ItemEKindnessSword(){
        super(tireEKindness, 3, -2.2F, new Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
