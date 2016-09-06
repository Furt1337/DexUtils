package me.furt.dexutils.items;

import me.furt.dexutils.DexUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by Furt on 7/16/2016.
 */
public class ItemWorldstone extends ItemBase {
	public ItemWorldstone() {
		super("worldstone");
		this.setMaxStackSize(1);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn,
			World worldIn, EntityPlayer playerIn, EnumHand hand) {
		if (worldIn.isRemote) {
            playerIn.openGui(DexUtils.instance, 0, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
        }
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}
}
