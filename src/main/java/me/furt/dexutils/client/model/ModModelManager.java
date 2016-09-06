package me.furt.dexutils.client.model;

import java.util.HashSet;
import java.util.Set;

import me.furt.dexutils.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Furt on 09/06/2016.
 */
public class ModModelManager {
	public static final ModModelManager INSTANCE = new ModModelManager();

	private ModModelManager() {
	}

	public void registerAllModels() {
		registerBlockModels();
		registerItemModels();
	}

	private void registerBlockModels() {

	}

	private void registerBlockItemModel(Block block) {
		final Item item = Item.getItemFromBlock(block);
		if (item != null) {
			registerItemModel(item);
		}
	}

	private void registerBlockItemModel(Block block, String modelLocation) {
		final Item item = Item.getItemFromBlock(block);
		if (item != null) {
			registerItemModel(item, modelLocation);
		}
	}

	private void registerBlockItemModel(Block block, ModelResourceLocation fullModelLocation) {
		final Item item = Item.getItemFromBlock(block);
		if (item != null) {
			registerItemModel(item, fullModelLocation);
		}
	}

	private void registerBlockItemModelForMeta(Block block, int metadata, String variant) {
		final Item item = Item.getItemFromBlock(block);
		if (item != null) {
			registerItemModelForMeta(item, metadata, variant);
		}
	}

	private final Set<Item> itemsRegistered = new HashSet<>();

	private void registerItemModels() {
		// Register items with custom model names first
		//registerItemModel(ModItems, "dexutils:");
		registerItemModel(ModItems.CITRINE_GEM, "dexutils:citrine_gem");
		registerItemModel(ModItems.COIN_COPPER, "dexutils:coin_copper");
		registerItemModel(ModItems.COIN_SILVER, "dexutils:coin_silver");
		registerItemModel(ModItems.COIN_GOLD, "dexutils:coin_gold");
		registerItemModel(ModItems.HEARTHSTONE, "dexutils:hearthstone");
		registerItemModel(ModItems.WORLDSTONE, "dexutils:worldstone");
	}

	private void registerItemModel(Item item) {
		registerItemModel(item, item.getRegistryName().toString());
	}

	private void registerItemModel(Item item, String modelLocation) {
		final ModelResourceLocation fullModelLocation = new ModelResourceLocation(modelLocation, "inventory");
		registerItemModel(item, fullModelLocation);
	}

	private void registerItemModel(Item item, ModelResourceLocation fullModelLocation) {
		// Ensure the custom model is loaded and prevent the default model from being loaded
		ModelBakery.registerItemVariants(item, fullModelLocation);
		registerItemModel(item, MeshDefinitionFix.create(stack -> fullModelLocation));
	}

	private void registerItemModel(Item item, ItemMeshDefinition meshDefinition) {
		itemsRegistered.add(item);
		ModelLoader.setCustomMeshDefinition(item, meshDefinition);
	}

	private void registerItemModelForMeta(Item item, int metadata, String variant) {
		registerItemModelForMeta(item, metadata, new ModelResourceLocation(item.getRegistryName(), variant));
	}

	private void registerItemModelForMeta(Item item, int metadata, ModelResourceLocation modelResourceLocation) {
		itemsRegistered.add(item);
		ModelLoader.setCustomModelResourceLocation(item, metadata, modelResourceLocation);
	}
}
