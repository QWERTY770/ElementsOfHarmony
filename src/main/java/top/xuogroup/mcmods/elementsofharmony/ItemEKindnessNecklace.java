package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class ItemEKindnessNecklace extends ArmorItem {
    private static final IArmorMaterial materialEKindness = new MaterialEKindness();
    public ItemEKindnessNecklace(){
        super(materialEKindness, EquipmentSlotType.CHEST, new Item.Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
