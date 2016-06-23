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
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemHearthstone extends Item {
	public ItemHearthstone() {
		super();
		this.setCreativeTab(DexUtils.coreTab);
		this.setMaxStackSize(1);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
		if(hand.equals(EnumHand.MAIN_HAND)) {
			Home h = new Home(playerIn, "home");
			Location l = h.getHome();
			if(l != null)
				playerIn.setPositionAndUpdate(l.getX(), l.getY(), l.getZ());
			
			h.destroy();
		}
        return new ActionResult(EnumActionResult.PASS, itemStackIn);
    }
	
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List list, boolean bool) {
		list.add("Right click to goto home location if set.");
		list.add(TextFormatting.GOLD + "Hearth is where you make it!");
	}
}
