package me.furt.dexutils.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Furt on 09/06/2016.
 */
public class ModRecipes {
	public static void registerRecipes() {
		registerRecipeClasses();
		addCraftingRecipes();
	}

	private static void addCraftingRecipes() {
		GameRegistry.addSmelting(ModBlocks.CITRINE_ORE, new ItemStack(
				ModItems.CITRINE_GEM), 0.35f);
		GameRegistry.addRecipe(new ItemStack(ModItems.HEARTHSTONE), "CAC",
				"ABA", "CAC", 'A', Items.QUARTZ, 'B', Blocks.LAPIS_BLOCK, 'C',
				Blocks.STONE);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.CITRINE_BLOCK), "AAA",
				"AAA", "AAA", 'A', ModItems.CITRINE_GEM);
		GameRegistry.addRecipe(new ItemStack(ModItems.CITRINE_GEM, 9), "A",
				'A', ModBlocks.CITRINE_BLOCK);

	}

	private static void registerRecipeClasses() {}

}
