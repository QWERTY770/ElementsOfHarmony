package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class ItemEGenerosityPickaxe extends PickaxeItem {
    private static final IItemTier tireEGenerosity = new TireEGenerosity();
    public ItemEGenerosityPickaxe(){
        super(tireEGenerosity, 1, -2.2F, new Item.Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
