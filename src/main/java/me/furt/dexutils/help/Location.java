package me.furt.dexutils.help;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

/**
 * Created by Furt on 6/23/2016.
 */
public class Location {

	private String dim;
	private Double x, y, z;
	private Float pitch, yaw;

	public Location() {
	}

	public Location(EntityPlayer player) {
		this.dim = player.worldObj.getWorldInfo().getWorldName();
		EntityPlayerMP p = (EntityPlayerMP) player;
		this.x = player.posX;
		this.y = player.posY;
		this.z = player.posZ;
		this.pitch = player.cameraPitch;
		this.yaw = player.cameraYaw;
	}

	public Location(String dim, Double x, Double y, Double z, Float pitch, Float yaw) {
		this.dim = dim;
		this.x = x;
		this.y = y;
		this.z = z;
		this.pitch = pitch;
		this.yaw = yaw;
	}

	public String getDim() {
		return dim;
	}

	public void setDim(String dim) {
		this.dim = dim;
	}

	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}

	public Double getZ() {
		return z;
	}

	public Float getPitch() {
		return pitch;
	}

	public Float getYaw() {
		return yaw;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public void setZ(Double z) {
		this.z = z;
	}

	public void setPitch(Float pitch) {
		this.pitch = pitch;
	}

	public void setYaw(Float yaw) {
		this.yaw = yaw;
	}
}
