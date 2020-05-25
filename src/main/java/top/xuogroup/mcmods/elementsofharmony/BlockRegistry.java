package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "elementsofharmony");

    public static RegistryObject<Block> blockELoyaltyMine = BLOCKS.register("block_e_loyalty_mine", BlockELoyaltyMine::new);
    public static RegistryObject<Block> blockELaughterMine = BLOCKS.register("block_e_laughter_mine", BlockELaughterMine::new);
    public static RegistryObject<Block> blockEGenerosityMine = BLOCKS.register("block_e_generosity_mine", BlockEGenerosityMine::new);
    public static RegistryObject<Block> blockEHonestyMine = BLOCKS.register("block_e_honesty_mine", BlockEHonestyMine::new);
    public static RegistryObject<Block> blockEKindnessMine = BLOCKS.register("block_e_kindness_mine", BlockEKindnessMine::new);
    public static RegistryObject<Block> blockEMagicMine = BLOCKS.register("block_e_magic_mine", BlockEMagicMine::new);
    // Register Six Ores

    // Sep -------------------------------------------------------------------------------------------------------------

    public static RegistryObject<Block> blockEEquestriaPortal = BLOCKS.register("block_e_equestria_portal", BlockEEquestriaPortal::new);
}
