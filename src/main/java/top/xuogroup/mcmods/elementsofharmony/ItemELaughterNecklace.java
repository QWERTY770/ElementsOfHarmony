package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class ItemELaughterNecklace extends ArmorItem {
    private static final IArmorMaterial materialELaughter = new MaterialELaughter();
    public ItemELaughterNecklace(){
        super(materialELaughter, EquipmentSlotType.CHEST, new Item.Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
