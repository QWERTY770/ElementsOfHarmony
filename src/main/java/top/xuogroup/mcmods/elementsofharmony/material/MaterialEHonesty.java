package top.xuogroup.mcmods.elementsofharmony.material;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import top.xuogroup.mcmods.elementsofharmony.registry.ItemRegistry;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class MaterialEHonesty implements IArmorMaterial {
    @Override @ParametersAreNonnullByDefault
    public int getDurability(EquipmentSlotType slotIn) {
        return 340;
    }
    @Override @ParametersAreNonnullByDefault
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return 12;
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
        return Ingredient.fromItems(ItemRegistry.itemEHonestyGem.get());
    }

    @Override @OnlyIn(Dist.CLIENT) @Nonnull
    public String getName() {
        return "honesty";
    }

    @Override
    public float getToughness() {
        return 4.0F;
    }
}
