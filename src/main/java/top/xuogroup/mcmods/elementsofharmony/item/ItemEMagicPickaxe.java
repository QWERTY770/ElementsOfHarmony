package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireEMagic;

public class ItemEMagicPickaxe extends PickaxeItem {
    private static final IItemTier tireEMagic = new TireEMagic();
    public ItemEMagicPickaxe(){
        super(tireEMagic, 1, -2.6F, new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
