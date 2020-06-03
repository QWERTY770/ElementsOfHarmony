package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireEKindness;

public class ItemEKindnessSword extends SwordItem {
    private static final IItemTier tireEKindness = new TireEKindness();
    public ItemEKindnessSword(){
        super(tireEKindness, 3, -2.2F, new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
