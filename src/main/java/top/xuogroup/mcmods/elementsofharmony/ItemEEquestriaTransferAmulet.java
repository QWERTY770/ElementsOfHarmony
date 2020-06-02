package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

public class ItemEEquestriaTransferAmulet extends Item {
    public ItemEEquestriaTransferAmulet(){
        super(new Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
