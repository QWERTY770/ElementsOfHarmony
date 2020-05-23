package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class ItemEKindnessAxe extends AxeItem {
    private static final IItemTier tireEKindness = new TireEKindness();
    public ItemEKindnessAxe(){
        super(tireEKindness, 6.0F, -3.0F, new Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
