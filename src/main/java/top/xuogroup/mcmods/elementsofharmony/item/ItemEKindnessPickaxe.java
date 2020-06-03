package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.tire.TireEKindness;

public class ItemEKindnessPickaxe extends PickaxeItem {
    private static final IItemTier Kindness = new TireEKindness();
    public ItemEKindnessPickaxe(){
        super(Kindness, 1, -2.6F, new Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
