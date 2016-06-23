package me.furt.dexutils.items;

import me.furt.dexutils.DexUtils;
import net.minecraft.item.Item;

public class ItemCoin extends Item {

	public ItemCoin() {
		super();
		this.setCreativeTab(DexUtils.coreTab);
		this.setMaxStackSize(64);
	}

}
