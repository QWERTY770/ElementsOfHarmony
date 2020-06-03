package top.xuogroup.mcmods.elementsofharmony.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import top.xuogroup.mcmods.elementsofharmony.registry.ModGroupRegistry;
import top.xuogroup.mcmods.elementsofharmony.material.MaterialELoyalty;

public class ItemELoyaltyNecklace extends ArmorItem {
    private static final IArmorMaterial materialELoyalty = new MaterialELoyalty();
    public ItemELoyaltyNecklace(){
        super(materialELoyalty, EquipmentSlotType.CHEST, new Item.Properties().group(ModGroupRegistry.elementsofharmonyGroup));
    }
}
