package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public enum MaterialExtended implements IArmorMaterial {
    LOYALTY("loyalty", 35, new int[]{0, 10, 0, 0}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.8F, () -> {
        return Ingredient.fromItems(ItemRegistry.itemELoyaltyGem.get());
    }),
    LAUGHTER("laughter", 35, new int[]{0, 10, 0, 0}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.8F, () -> {
        return Ingredient.fromItems(ItemRegistry.itemELaughterGem.get());
    }),
    GENEROSITY("generosity", 40, new int[]{0, 15, 0, 0}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.2F, () -> {
        return Ingredient.fromItems(ItemRegistry.itemEGenerosityGem.get());
    }),
    HONESTY("honesty", 40, new int[]{0, 18, 0, 0}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.2F, () -> {
        return Ingredient.fromItems(ItemRegistry.itemEHonestyGem.get());
    }),
    KINDNESS("kindness", 35, new int[]{0, 10, 0, 0}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.8F, () -> {
        return Ingredient.fromItems(ItemRegistry.itemEKindnessGem.get());
    }),
    MAGIC("magic", 30, new int[]{0, 7, 0, 0}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F, () -> {
        return Ingredient.fromItems(ItemRegistry.itemEMagicGem.get());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;

    private MaterialExtended(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, SoundEvent equipSoundIn, float toughnessIn, Supplier<Ingredient> repairMaterialSupplier) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountsIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = equipSoundIn;
        this.toughness = toughnessIn;
        this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    @Nonnull
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT) @Nonnull
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }
}
