package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireEMagic;

public class ItemEMagicSword extends SwordItem {
    private static final IItemTier tireEMagic = new TireEMagic();
    public ItemEMagicSword(){
        super(tireEMagic, 3, -2.2F, new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
