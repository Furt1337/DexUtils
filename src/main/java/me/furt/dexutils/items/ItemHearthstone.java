package me.furt.dexutils.items;

import java.util.List;

import me.furt.dexutils.DexUtils;
import me.furt.dexutils.db.Home;
import me.furt.dexutils.help.Location;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemHearthstone extends Item {
	public ItemHearthstone() {
		super();
		this.setCreativeTab(DexUtils.coreTab);
		this.setMaxStackSize(1);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn,
			World worldIn, EntityPlayer playerIn, EnumHand hand) {
		// TODO this should only happen once and not get spammed
		if (hand.equals(EnumHand.MAIN_HAND)) {
			Home h = new Home(playerIn, "home");
			if (playerIn.isSneaking()) {
				h.setHome();
				playerIn.addChatMessage(new TextComponentString(
						TextFormatting.GOLD + "Home location is set."));
			} else {
				Location l = h.getHome();
				if (l != null) {
					playerIn.setPositionAndUpdate(l.getX(), l.getY(), l.getZ());
					playerIn.addChatMessage(new TextComponentString(
							TextFormatting.GOLD + "Teleporting to home location."));
				} else {
					playerIn.addChatMessage(new TextComponentString(
							TextFormatting.GOLD + "Home location is not set."));
					playerIn.addChatMessage(new TextComponentString(
							TextFormatting.GOLD
									+ "To set home hold shift and right click."));
				}
			}

			h.destroy();
			return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
		}
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}

	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List list,
			boolean bool) {
		list.add("Right click to goto home location if set.");
		list.add(TextFormatting.GOLD + "Hearth is where you make it!");
	}
}
