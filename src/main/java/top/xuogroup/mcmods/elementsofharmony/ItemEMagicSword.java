package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class ItemEMagicSword extends SwordItem {
    private static final IItemTier iItemTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 2400;
        }

        @Override
        public float getEfficiency() {
            return 10.0F;
        }

        @Override
        public float getAttackDamage() {
            return 4.0F;
        }

        @Override
        public int getHarvestLevel() {
            return 5;
        }

        @Override
        public int getEnchantability() {
            return 50;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ItemRegistry.itemEMagicGem.get());
        }
    };
    public ItemEMagicSword(){
        super(iItemTier, 3, -0.0F, new Properties().group(ModGroup.elementsofharmonyGroup));
    }
}