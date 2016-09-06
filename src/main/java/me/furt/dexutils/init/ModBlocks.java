package me.furt.dexutils.init;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import javax.annotation.Nullable;

import me.furt.dexutils.blocks.BlockBase;
import me.furt.dexutils.blocks.BlockCitrineOre;
import me.furt.dexutils.blocks.BlockCitrineBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Furt on 6/5/2016.
 */
public class ModBlocks {
	public static final Set<Block> BLOCKS = new HashSet<>();
	
	public static Block CITRINE_ORE;
	public static Block CITRINE_BLOCK;

	static {
		CITRINE_ORE = registerBlock(new BlockCitrineOre());
		CITRINE_BLOCK = registerBlock(new BlockCitrineBlock());
	}
	
	public static void registerBlocks() {}
	
	protected static <BLOCK extends Block> BLOCK registerBlock(BLOCK block) {
		return registerBlock(block, ItemBlock::new);
	}
	
	protected static <BLOCK extends Block> BLOCK registerBlock(BLOCK block, @Nullable Function<BLOCK, ItemBlock> itemFactory) {
		GameRegistry.register(block);

		if (itemFactory != null) {
			final ItemBlock itemBlock = itemFactory.apply(block);

			GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
		}

		BLOCKS.add(block);
		return block;
	}
}
