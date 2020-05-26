package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class TireEHonesty implements IItemTier {
    @Override
    public int getMaxUses() {
        return 420;
    }

    @Override
    public float getEfficiency() {
        return 20.0F;
    }

    @Override
    public float getAttackDamage() {
        return 18.0F;
    }

    @Override
    public int getHarvestLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override @Nonnull
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(ItemRegistry.itemEHonestyGem.get());
    }
}
