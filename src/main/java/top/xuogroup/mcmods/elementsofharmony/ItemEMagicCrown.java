package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class ItemEMagicCrown extends ArmorItem {
    private static final IArmorMaterial materialEMagic = new MaterialEMagic();
    public ItemEMagicCrown(){
        super(materialEMagic, EquipmentSlotType.HEAD, new Item.Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
