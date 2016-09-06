package me.furt.dexutils;

import java.io.File;

import me.furt.dexutils.commands.HomeCommand;
import me.furt.dexutils.init.ModBlocks;
import me.furt.dexutils.init.ModItems;
import me.furt.dexutils.init.ModRecipes;
import me.furt.dexutils.proxy.ClientProxy;
import me.furt.dexutils.proxy.CommonProxy;
import me.furt.dexutils.proxy.IProxy;
import me.furt.mexdb.MexDB;
import me.furt.mexdb.system.Entry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.SidedProxy;

/**
 * Created by Furt on 5/30/2016.
 */
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class DexUtils {

	public static MexDB waypointDB;

	@Instance(Reference.MODID)
	public static DexUtils instance;

	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static IProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.preInit(event);
		
		// waypointDB = new MexDB(DimensionManager.getCurrentSaveRootDirectory()
		// + File.separator + Reference.MODID, "waypoint");
		// waypointDB.autopush(true);
		
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		
		proxy.preInit();
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.registerRecipes();
		
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}

	@EventHandler
	public void loadComplete(FMLLoadCompleteEvent event) {

	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		waypointDB = new MexDB(DimensionManager.getCurrentSaveRootDirectory()
				.getPath() + File.separator + Reference.MODID, "waypoint");
		waypointDB.autopush(true);
		event.registerServerCommand(new HomeCommand("dex", "'setspawn', "));
		event.registerServerCommand(new HomeCommand("home",
				"'set <name>', 'del <name>'"));
		event.registerServerCommand(new HomeCommand("spawn", "<world>"));
	}

	public static CreativeTabs coreTab = new CreativeTabs(Reference.MODID) {
		@Override
		public Item getTabIconItem() {
			return null;
		}

		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(ModItems.HEARTHSTONE, 1);
		}
	};

}
