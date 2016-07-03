package me.furt.dexutils.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

/**
 * Created by Furt on 5/30/2016.
 */
public class BaseDrop extends BlockBase {

	private Item drop;

	public BaseDrop(float hardness, float resistance, String harvestType,
			int harvestLevel, float lightLevel, Material material, Item drop) {
		super(hardness, resistance, harvestType, harvestLevel, lightLevel,
				material);
		this.drop = drop;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return drop;
	}

}
