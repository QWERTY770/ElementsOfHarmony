package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import javax.annotation.Nonnull;

public class TireEMagic implements IItemTier {
    @Override
    public int getMaxUses() {
        return 1500;
    }

    @Override
    public float getEfficiency() {
        return 20.0F;
    }

    @Override
    public float getAttackDamage() {
        return 13.0F;
    }

    @Override
    public int getHarvestLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 50;
    }

    @Override @Nonnull
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(ItemRegistry.itemEMagicGem.get());
    }
}