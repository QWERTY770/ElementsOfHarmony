package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class ItemEMagicPickaxe extends PickaxeItem {
    private static final IItemTier tireEMagic = new TireEMagic();
    public ItemEMagicPickaxe(){
        super(tireEMagic, 1, -2.6F, new Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
