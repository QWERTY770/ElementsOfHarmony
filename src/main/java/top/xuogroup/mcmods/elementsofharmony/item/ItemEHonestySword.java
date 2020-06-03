package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireEHonesty;

public class ItemEHonestySword extends SwordItem {
    private static final IItemTier tireEHonesty = new TireEHonesty();
    public ItemEHonestySword(){
        super(tireEHonesty, 3, -2.2F, new Item.Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
