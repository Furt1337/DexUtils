package me.furt.dexutils.gui.handler;

import me.furt.dexutils.gui.WaypointGui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int WAYPOINT_GUI = 0;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == WAYPOINT_GUI)
	        return new WaypointGui(player);
	    return null;
	}

}
