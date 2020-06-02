package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class ItemEGenerosityNecklace extends ArmorItem {
    private static final IArmorMaterial materialEGenerosity = new MaterialEGenerosity();
    public ItemEGenerosityNecklace(){
        super(materialEGenerosity, EquipmentSlotType.CHEST, new Item.Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
