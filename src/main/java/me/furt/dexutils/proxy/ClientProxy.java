package me.furt.dexutils.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import me.furt.dexutils.Reference;
import me.furt.dexutils.init.ModBlocks;
import me.furt.dexutils.init.ModItems;
import me.furt.dexutils.items.ItemBase;

/**
 * Created by Furt on 5/30/2016.
 */
public class ClientProxy extends CommonProxy {

	@Override
	public void preinit(FMLPreInitializationEvent event) {

	}

	@Override
	public void init(FMLInitializationEvent event) {

	}

	@Override
	public void postinit(FMLPostInitializationEvent event) {

	}

	@Override
	public void registerRenderers() {
		ModItems.registerItemRenderer();
		ModBlocks.registerBlockRenderer();
	}

}
