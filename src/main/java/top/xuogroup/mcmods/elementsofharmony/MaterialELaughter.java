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

public class MaterialELaughter implements IArmorMaterial {
    @Override @ParametersAreNonnullByDefault
    public int getDurability(EquipmentSlotType slotIn) {
        return 200;
    }
    @Override @ParametersAreNonnullByDefault
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return 8;
    }
    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override @Nonnull
    public SoundEvent getSoundEvent() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override @Nonnull
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(ItemRegistry.itemELaughterGem.get());
    }

    @Override @OnlyIn(Dist.CLIENT) @Nonnull
    public String getName() {
        return "laughter";
    }

    @Override
    public float getToughness() {
        return 3.0F;
    }
}
