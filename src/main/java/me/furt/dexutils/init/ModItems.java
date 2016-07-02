package me.furt.dexutils.init;

import me.furt.dexutils.help.RegisterHelper;
import me.furt.dexutils.items.ItemCitrineGem;
import me.furt.dexutils.items.ItemCoin;
import me.furt.dexutils.items.ItemHearthstone;
import net.minecraft.item.Item;

public class ModItems {
	public static Item hearthstone = new ItemHearthstone()
			.setUnlocalizedName("hearthstone");
	public static Item citrine_gem = new ItemCitrineGem()
			.setUnlocalizedName("citrine_gem");
	public static Item coin = new ItemCoin().setUnlocalizedName("coin");

	public static void registerItems() {
		RegisterHelper.registerItem(hearthstone);
		//RegisterHelper.registerItem(citrine_gem);
		RegisterHelper.registerItem(coin);
	}

	public static void registerItemRenderer() {
		RegisterHelper.registerItemRenderer(hearthstone);
		//RegisterHelper.registerItemRenderer(citrine_gem);
		RegisterHelper.registerItemRenderer(coin);
	}
}
