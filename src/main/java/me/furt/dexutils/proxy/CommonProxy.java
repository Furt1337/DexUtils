package me.furt.dexutils.proxy;

import java.util.ArrayList;

import me.furt.dexutils.init.ModBlocks;
import me.furt.dexutils.init.ModItems;
import me.furt.dexutils.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Furt on 5/30/2016.
 */
public class CommonProxy {

	public void preinit(FMLPreInitializationEvent event) {
		// Items

	}

	public void init(FMLInitializationEvent event) {
		// Recipes
		GameRegistry.addRecipe(new ItemStack(ModBlocks.citrine_block), "AAA",
				"AAA", "AAA", 'A', ModItems.citrine_gem);
	}

	public void postinit(FMLPostInitializationEvent event) {
	}

	public void registerRenderers() {

	}
}
