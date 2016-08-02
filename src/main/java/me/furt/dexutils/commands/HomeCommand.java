package me.furt.dexutils.commands;

import me.furt.dexutils.db.Waypoint;
import me.furt.dexutils.db.Waypoint.Waypoints;
import me.furt.dexutils.help.Location;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

/**
 * Created by Furt on 6/23/2016.
 */
public class HomeCommand extends ModCommand {

	public HomeCommand(String commandName, String usage) {
		super(commandName, usage);
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender,
			String[] args) throws CommandException {
		if (sender instanceof EntityPlayer) {
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("list")) {
					sender.addChatMessage(new TextComponentString(
							TextFormatting.GOLD + "List not implemented."));
					return;
				} else {
					Waypoint w = new Waypoint((EntityPlayer) sender, args[0], Waypoints.HOME);
					Location l = w.getWaypoint();
					if (l != null) {
						((EntityPlayer) sender).setPositionAndUpdate(l.getX(),
								l.getY(), l.getZ());
						sender.addChatMessage(new TextComponentString(
								TextFormatting.GOLD + "Teleported to "
										+ w.waypointName + " location."));
						w.destroy();
						return;
					} else {
						sender.addChatMessage(new TextComponentString(
								TextFormatting.GOLD + w.waypointName
										+ " not found."));
						w.destroy();
					}
					return;
				}
			}
			if (args.length == 2) {
				if (args[0].equalsIgnoreCase("set")) {
					Waypoint w = new Waypoint((EntityPlayer) sender, args[1], Waypoints.HOME);
					if (w.setWaypoint()) {
						sender.addChatMessage(new TextComponentString(
								TextFormatting.GOLD + "New location set for "
										+ w.getWaypointName() + "."));
						w.destroy();
						return;
					}
				} else if (args[0].equalsIgnoreCase("del")) {
					Waypoint w = new Waypoint((EntityPlayer) sender, args[1], Waypoints.HOME);
					if (w.deleteWaypoint()) {
						sender.addChatMessage(new TextComponentString(
								TextFormatting.GOLD + "Deleted " + w.waypointName
										+ " location."));
						w.destroy();
						return;
					}
				}
			}
		}
	}

}
