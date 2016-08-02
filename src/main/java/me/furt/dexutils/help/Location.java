package me.furt.dexutils.help;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

/**
 * Created by Furt on 6/23/2016.
 */
public class Location {

	private Double x, y, z;
	private Float pitch, yaw;

	public Location() {
	}

	public Location(EntityPlayer player) {
		EntityPlayerMP p = (EntityPlayerMP) player;
		this.x = player.posX;
		this.y = player.posY;
		this.z = player.posZ;
		this.pitch = player.cameraPitch;
		this.yaw = player.cameraYaw;
	}

	public Location(String world, Double x, Double y, Double z, Float pitch, Float yaw) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.pitch = pitch;
		this.yaw = yaw;
	}

	}

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
