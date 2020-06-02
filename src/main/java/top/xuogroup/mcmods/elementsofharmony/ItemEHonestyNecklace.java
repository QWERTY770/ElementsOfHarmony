package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class ItemEHonestyNecklace extends ArmorItem {
    private static final IArmorMaterial materialEHonesty = new MaterialEHonesty();
    public ItemEHonestyNecklace(){
        super(materialEHonesty, EquipmentSlotType.CHEST, new Item.Properties().group(GroupModGroup.elementsofharmonyGroup));
    }
}
