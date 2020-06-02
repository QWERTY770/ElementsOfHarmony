package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class ItemEHonestyAxe extends AxeItem {
    private static final IItemTier tireEHonesty = new TireEHonesty();
    public ItemEHonestyAxe(){
        super(tireEHonesty, 6.0F, -3.0F, new Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
