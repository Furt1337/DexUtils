package me.furt.dexutils.items;

import java.util.List;

import me.furt.dexutils.DexUtils;
import me.furt.dexutils.Reference;
import me.furt.dexutils.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Furt on 5/30/2016.
 */
public class ItemBase extends Item {
	public String itemName;

	public ItemBase(String name, int stackSize) {
		this.setUnlocalizedName(Reference.MODID + "." + name);
		this.setCreativeTab(DexUtils.coreTab);
		this.setMaxStackSize(stackSize);
		this.itemName = name;
		GameRegistry.register(this, new ResourceLocation(Reference.MODID + ":"
				+ getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {

		return this.getUnlocalizedName();
	}
}