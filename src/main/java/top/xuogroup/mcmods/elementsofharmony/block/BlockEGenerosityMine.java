package top.xuogroup.mcmods.elementsofharmony.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockEGenerosityMine extends Block {
    public BlockEGenerosityMine(){
        super(Properties.create(Material.ROCK).hardnessAndResistance(30).harvestTool(ToolType.get("pickaxe")).harvestLevel(3));
    }
}
