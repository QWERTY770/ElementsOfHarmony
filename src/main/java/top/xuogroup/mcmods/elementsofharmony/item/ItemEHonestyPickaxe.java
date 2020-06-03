package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireEHonesty;

public class ItemEHonestyPickaxe extends PickaxeItem {
    private static final IItemTier tireEHonesty = new TireEHonesty();
    public ItemEHonestyPickaxe(){
        super(tireEHonesty, 1, -2.6F, new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
