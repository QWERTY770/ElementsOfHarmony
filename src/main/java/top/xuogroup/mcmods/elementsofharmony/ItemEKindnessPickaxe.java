package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class ItemEKindnessPickaxe extends PickaxeItem {
    private static final IItemTier Kindness = new TireEKindness();
    public ItemEKindnessPickaxe(){
        super(Kindness, 1, -2.6F, new Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
