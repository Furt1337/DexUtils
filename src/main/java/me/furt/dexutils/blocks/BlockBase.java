package me.furt.dexutils.blocks;

import java.util.Random;

import me.furt.dexutils.DexUtils;
import me.furt.dexutils.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockBase extends Block {
	
	public BlockBase(float hardness, float resistance, String harvestType, int harvestLevel, float lightLevel, Material material) {
		super(material);
		this.setCreativeTab(DexUtils.coreTab);
		this.setSoundType(SoundType.STONE);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setHarvestLevel(harvestType, harvestLevel);
		this.setLightLevel(lightLevel);
	}

}
