package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class ItemEMagicSword extends SwordItem {
    private static final IItemTier tireEMagic = new TireEMagic();
    public ItemEMagicSword(){
        super(tireEMagic, 3, -2.2F, new Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
