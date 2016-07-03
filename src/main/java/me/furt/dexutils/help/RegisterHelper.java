package me.furt.dexutils.help;

import me.furt.dexutils.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Furt on 6/5/2016.
 */
public class RegisterHelper {

	public static void registerBlock(Block block) {
		GameRegistry.register(block, new ResourceLocation(Reference.MODID,
				block.getUnlocalizedName().substring(5)));
	}

	public static void registerItem(Item item) {
		GameRegistry.register(item, new ResourceLocation(Reference.MODID, item
				.getUnlocalizedName().substring(5)));
	}

	public static void registerItemRenderer(Item item) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(Reference.MODID + ":"
								+ item.getUnlocalizedName().substring(5),
								"inventory"));
	}

	public static void registerBlockRenderer(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(Reference.MODID + ":"
								+ item.getUnlocalizedName().substring(5),
								"inventory"));
	}

}
