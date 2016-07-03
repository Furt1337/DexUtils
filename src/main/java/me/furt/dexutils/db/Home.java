package me.furt.dexutils.db;

import me.furt.dexutils.DexUtils;
import me.furt.dexutils.help.Location;
import me.furt.mexdb.MexDB;
import me.furt.mexdb.exception.EmptyIndexException;
import me.furt.mexdb.system.Entry;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Furt on 6/23/2016.
 */
public class Home {

	public Location loc;
	public String index, pName, uuid, homeName;
	private MexDB db = DexUtils.homesDB;

	public Home(EntityPlayer player, String homeName) {
		this.homeName = homeName;
		this.uuid = player.getUniqueID().toString();
		this.pName = player.getDisplayNameString();
		this.index = uuid + ":" + homeName;
		this.loc = new Location(player);
	}

	public boolean setHome() {
		try {
			Entry addHome = new Entry(index);
			addHome.addValue("name", pName);
			addHome.addValue("x", loc.getX());
			addHome.addValue("y", loc.getY());
			addHome.addValue("z", loc.getZ());
			addHome.addValue("pitch", loc.getPitch());
			addHome.addValue("yaw", loc.getYaw());
			db.addEntry(addHome);
			return true;

		} catch (EmptyIndexException e) {
		}
		return false;
	}

	public boolean hasHome() {
		return db.hasIndex(index);
	}

	public Location getHome() {
		if (this.hasHome()) {
			Location l = new Location();
			l.setX(db.getDouble(index, "x"));
			l.setY(db.getDouble(index, "y"));
			l.setZ(db.getDouble(index, "z"));
			l.setPitch(db.getFloat(index, "pitch"));
			l.setYaw(db.getFloat(index, "yaw"));
			return l;
		}

		return null;

	}

	public boolean deleteHome() {
		return db.removeEntry(index);
	}

	// TODO implement home list
	public void getHomeList() {
	}

	public String getPlayerName() {
		return this.pName;
	}

	public String getPlayerUUID() {
		return this.uuid;
	}

	public String getHomeName() {
		return this.homeName;
	}

	public void destroy() {
		this.pName = null;
		this.homeName = null;
		this.index = null;
		this.loc = null;
		this.uuid = null;
		this.db = null;
	}

}
