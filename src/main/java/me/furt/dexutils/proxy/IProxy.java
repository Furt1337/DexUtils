package me.furt.dexutils.proxy;

import javax.annotation.Nullable;

import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Furt on 09/06/2016.
 */
public interface IProxy {
	void preInit();

	void init();

	void postInit();

}
