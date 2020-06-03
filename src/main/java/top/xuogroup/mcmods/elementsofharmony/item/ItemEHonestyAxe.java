package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireEHonesty;

public class ItemEHonestyAxe extends AxeItem {
    private static final IItemTier tireEHonesty = new TireEHonesty();
    public ItemEHonestyAxe(){
        super(tireEHonesty, 6.0F, -3.0F, new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
