package me.furt.dexutils.items;

import me.furt.dexutils.DexUtils;
import net.minecraft.item.Item;

/**
 * Created by Furt on 7/16/2016.
 */
public class ItemWorldstone extends Item {
	public ItemWorldstone() {
		super();
		this.setCreativeTab(DexUtils.coreTab);
		this.setMaxStackSize(1);
	}
}
