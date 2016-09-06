package me.furt.dexutils.init;

import java.util.HashSet;
import java.util.Set;

import me.furt.dexutils.items.ItemCitrineGem;
import me.furt.dexutils.items.ItemCoin;
import me.furt.dexutils.items.ItemCoinCopper;
import me.furt.dexutils.items.ItemCoinGold;
import me.furt.dexutils.items.ItemCoinSilver;
import me.furt.dexutils.items.ItemHearthstone;
import me.furt.dexutils.items.ItemWorldstone;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Furt on 6/5/2016.
 */
public class ModItems {
	public static final Set<Item> ITEMS = new HashSet<>();
	
	public static Item HEARTHSTONE;
	public static Item WORLDSTONE;
	public static Item CITRINE_GEM;
	public static Item COIN_GOLD;
	public static Item COIN_SILVER;
	public static Item COIN_COPPER;
	
	static {
		HEARTHSTONE = registerItem(new ItemHearthstone());
		WORLDSTONE = registerItem(new ItemWorldstone());
		CITRINE_GEM = registerItem(new ItemCitrineGem());
		COIN_GOLD = registerItem(new ItemCoinGold());
		COIN_SILVER = registerItem(new ItemCoinSilver());
		COIN_COPPER = registerItem(new ItemCoinCopper());
	}
	
	public static void registerItems() {}
	
	private static <T extends Item> T registerItem(T item) {
		GameRegistry.register(item);
		ITEMS.add(item);

		return item;
	}
}
