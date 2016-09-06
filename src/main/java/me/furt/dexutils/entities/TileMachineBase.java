package me.furt.dexutils.entities;

import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;

public class TileMachineBase extends TileEntity implements ISidedInventory, IEnergyReceiver, ITickable {

	private boolean isPrivate = false;
	private boolean upgraded = false;
	private int energyMax = 500000;
	private int energyStored = 0;
	private int energyUsage = 500;
	private int speedMultiplierCurrent = 1;
	private int speedCurrent = 1;

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public boolean isUpgraded() {
		return upgraded;
	}

	public void setUpgraded(boolean upgraded) {
		this.upgraded = upgraded;
	}

	public int getEnergyMax() {
		return energyMax;
	}

	public void setEnergyMax(int energyMax) {
		this.energyMax = energyMax;
	}

	public int getEnergyStored() {
		return energyStored;
	}

	public void setEnergyStored(int energyStored) {
		this.energyStored = energyStored;
	}

	public int getEnergyUsage() {
		return energyUsage;
	}

	public void setEnergyUsage(int energyUsage) {
		this.energyUsage = energyUsage;
	}

	public int getSpeedMultiplierCurrent() {
		return speedMultiplierCurrent;
	}

	public void setSpeedMultiplierCurrent(int speedMultiplier) {
		this.speedMultiplierCurrent = speedMultiplier;
	}

	public int getSpeedCurrent() {
		return speedCurrent;
	}

	public void setSpeedCurrent(int speedCurrent) {
		this.speedCurrent = speedCurrent;
	}

	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void openInventory(EntityPlayer player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory(EntityPlayer player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getField(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setField(int id, int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFieldCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public boolean hasCustomName() {
		return false;
	}

	@Override
	public ITextComponent getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getSlotsForFace(EnumFacing side) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canInsertItem(int index, ItemStack itemStackIn,
			EnumFacing direction) {
		return false;
	}

	@Override
	public boolean canExtractItem(int index, ItemStack stack,
			EnumFacing direction) {
		return false;
	}

	@Override
	public int getEnergyStored(EnumFacing from) {
		return energyStored;
	}

	@Override
	public int getMaxEnergyStored(EnumFacing from) {
		return energyMax;
	}

	@Override
	public boolean canConnectEnergy(EnumFacing from) {
		return true;
	}

	@Override
	public int receiveEnergy(EnumFacing from, int maxReceive, boolean simulate) {
		if (!simulate)
		{
			if (energyStored <= energyMax
					- (energyUsage * speedCurrent * speedMultiplierCurrent))
			{
				energyStored += (energyUsage * speedCurrent * speedMultiplierCurrent);
				return (energyUsage * speedCurrent * speedMultiplierCurrent);
			}
			if (energyStored < energyMax)
			{
				int i = energyMax - energyStored;
				energyStored += i;
				return i;
			}
		}
		return 0;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
