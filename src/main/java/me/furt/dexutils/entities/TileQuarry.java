package me.furt.dexutils.entities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;

public class TileQuarry extends TileMachineBase {
	
	public TileQuarry() {
		
	}
	
	@Override
	public String getName() {
		return "Quarry";
	}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean canConnectEnergy(EnumFacing from) {
		if(from.equals(EnumFacing.UP)) return false;
		
		return true;
	}

}
