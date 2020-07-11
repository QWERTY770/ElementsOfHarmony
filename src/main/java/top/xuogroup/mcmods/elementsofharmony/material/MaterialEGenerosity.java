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

public class MaterialEGenerosity implements IArmorMaterial {
    @Override @ParametersAreNonnullByDefault
    public int getDurability(EquipmentSlotType slotIn) {
        return 340;
    }
    @Override @ParametersAreNonnullByDefault
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return 10;
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
        return Ingredient.fromItems(ItemRegistry.itemEGenerosityGem.get());
    }

    @Override @OnlyIn(Dist.CLIENT) @Nonnull
    public String getName() {
        return "elementsofharmony:generosity";
    }

    @Override
    public float getToughness() {
        return 3.0F;
    }
	@Override
	public float func_230304_f_() {
		return 0.0F;
	}
}
