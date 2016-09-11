package me.furt.dexutils.db;

import me.furt.dexutils.util.Location;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Furt on 6/30/2016.
 */
public class Player {

	private EntityPlayer player;
	private Location loc;
	private String uuid;

	public Player(EntityPlayer player) {
		this.player = player;
		this.uuid = player.getUniqueID().toString();
		this.loc = new Location(player);
	}

	// TODO this will store all usefull player info
	// like first join, new display name & old display name, etc.

}
