package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireELaughter;

public class ItemELaughterPickaxe extends PickaxeItem {
    private static final IItemTier tireELaughter = new TireELaughter();
    public ItemELaughterPickaxe(){
        super(tireELaughter, 1, -2.2F, new Item.Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }

}
