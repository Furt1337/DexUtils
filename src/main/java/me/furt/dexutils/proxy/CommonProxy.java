package me.furt.dexutils.proxy;

import java.util.ArrayList;

import me.furt.dexutils.DexUtils;
import me.furt.dexutils.gui.WaypointGui;
import me.furt.dexutils.gui.handler.GuiHandler;
import me.furt.dexutils.init.ModBlocks;
import me.furt.dexutils.init.ModItems;
import me.furt.dexutils.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Furt on 5/30/2016.
 */
public class CommonProxy implements IProxy {

	public void preInit() {}

	public void init() {}

	public void postInit() {}
}
