package me.furt.dexutils.init;

import me.furt.dexutils.blocks.BaseDrop;
import me.furt.dexutils.blocks.BlockBase;
import me.furt.dexutils.help.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static Block citrine_ore = new BaseDrop(1.0F, 3.0F, "pickaxe", 1, 0F, Material.ROCK, ModItems.citrine_gem).setUnlocalizedName("citrine_ore");
	public static Block citrine_block = new BlockBase(1.0F, 3.0F, "pickaxe", 1, 0F, Material.ROCK).setUnlocalizedName("citrine_block");
	public static void registerBlocks() {
		RegisterHelper.registerBlock(citrine_ore);
		RegisterHelper.registerBlock(citrine_block);
	}

	public static void registerBlockRenderer() {
		RegisterHelper.registerBlockRenderer(citrine_ore);
		RegisterHelper.registerBlockRenderer(citrine_block);
	}
}
