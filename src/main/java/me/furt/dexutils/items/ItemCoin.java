package me.furt.dexutils.items;

import me.furt.dexutils.DexUtils;
import net.minecraft.item.Item;

/**
 * Created by Furt on 5/30/2016.
 */
public class ItemCoin extends Item {

	public ItemCoin() {
		super();
		this.setCreativeTab(DexUtils.coreTab);
		this.setMaxStackSize(64);
	}

}
