package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class ItemELoyaltyNecklace extends ArmorItem {
    private static final IArmorMaterial materialELoyalty = new MaterialELoyalty();
    public ItemELoyaltyNecklace(){
        super(materialELoyalty, EquipmentSlotType.CHEST, new Item.Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
