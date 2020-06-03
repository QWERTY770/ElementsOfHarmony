package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.material.MaterialEMagic;

public class ItemEMagicCrown extends ArmorItem {
    private static final IArmorMaterial materialEMagic = new MaterialEMagic();
    public ItemEMagicCrown(){
        super(materialEMagic, EquipmentSlotType.HEAD, new Item.Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
