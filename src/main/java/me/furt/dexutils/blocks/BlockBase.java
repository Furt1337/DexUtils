package me.furt.dexutils.blocks;

import me.furt.dexutils.DexUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

	public BlockBase(Material materialIn, MapColor mapColor, String blockName) {
		super(materialIn, mapColor);
		setBlockName(this, blockName);
		setCreativeTab(DexUtils.coreTab);
	}
	
	public BlockBase(Material materialIn, String blockName) {
		this(materialIn, materialIn.getMaterialMapColor(), blockName);
	}
	
	public static void setBlockName(Block block, String blockName) {
		block.setRegistryName(blockName);
		block.setUnlocalizedName(block.getRegistryName().toString());
	}

}
