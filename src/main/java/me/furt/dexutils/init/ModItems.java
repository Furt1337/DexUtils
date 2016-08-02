package me.furt.dexutils.init;

import me.furt.dexutils.help.RegisterHelper;
import me.furt.dexutils.items.ItemCitrineGem;
import me.furt.dexutils.items.ItemCoin;
import me.furt.dexutils.items.ItemHearthstone;
import me.furt.dexutils.items.ItemWorldstone;
import net.minecraft.item.Item;

/**
 * Created by Furt on 6/5/2016.
 */
public class ModItems {
	public static Item hearthstone = new ItemHearthstone()
			.setUnlocalizedName("hearthstone");
	public static Item worldstone = new ItemWorldstone()
			.setUnlocalizedName("worldstone");
	public static Item citrine_gem = new ItemCitrineGem()
			.setUnlocalizedName("citrine_gem");
	public static Item coinGold = new ItemCoin()
			.setUnlocalizedName("coin_gold");
	public static Item coinSilver = new ItemCoin()
			.setUnlocalizedName("coin_silver");
	public static Item coinCopper = new ItemCoin()
			.setUnlocalizedName("coin_copper");

	public static void registerItems() {
		RegisterHelper.registerItem(hearthstone);
		RegisterHelper.registerItem(worldstone);
		// RegisterHelper.registerItem(citrine_gem);
		RegisterHelper.registerItem(coinGold);
		RegisterHelper.registerItem(coinSilver);
		RegisterHelper.registerItem(coinCopper);
	}

	public static void registerItemRenderer() {
		RegisterHelper.registerItemRenderer(hearthstone);
		RegisterHelper.registerItemRenderer(worldstone);
		// RegisterHelper.registerItemRenderer(citrine_gem);
		RegisterHelper.registerItemRenderer(coinGold);
		RegisterHelper.registerItemRenderer(coinSilver);
		RegisterHelper.registerItemRenderer(coinCopper);
	}
}
