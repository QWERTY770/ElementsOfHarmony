package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.EggEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

public class ItemEEquestriaTransferAmulet extends Item {
    public ItemEEquestriaTransferAmulet(){
        super(new Properties().group(ModGroup.elementsofharmonyGroup));
    }
    @Nonnull @ParametersAreNonnullByDefault
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        playerIn.addStat(Stats.ITEM_USED.get(this));
        if (!playerIn.abilities.isCreativeMode) {
            itemstack.shrink(1);
        }
        if (!worldIn.isRemote) {
            playerIn.changeDimension(Objects.requireNonNull(DimensionType.getById(2)));
        }
        return ActionResult.resultSuccess(itemstack);
    }
}
