package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class MaterialEMagic implements IArmorMaterial {
    @Override @ParametersAreNonnullByDefault
    public int getDurability(EquipmentSlotType slotIn) {
        return 360;
    }
    @Override @ParametersAreNonnullByDefault
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return 12;
    }
    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override @Nonnull
    public SoundEvent getSoundEvent() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override @Nonnull
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(ItemRegistry.itemEMagicGem.get());
    }

    @Override @OnlyIn(Dist.CLIENT) @Nonnull
    public String getName() {
        return "magic";
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }
}
