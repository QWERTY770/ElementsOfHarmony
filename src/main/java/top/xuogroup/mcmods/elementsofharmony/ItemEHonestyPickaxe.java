package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class ItemEHonestyPickaxe extends PickaxeItem {
    private static final IItemTier tireEHonesty = new TireEHonesty();
    public ItemEHonestyPickaxe(){
        super(tireEHonesty, 1, -2.6F, new Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
