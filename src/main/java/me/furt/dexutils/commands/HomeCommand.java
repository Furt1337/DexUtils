package me.furt.dexutils.commands;

import me.furt.dexutils.db.Home;
import me.furt.dexutils.help.Location;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

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
					Home h = new Home((EntityPlayer) sender, args[0]);
					Location l = h.getHome();
					if (l != null) {
						((EntityPlayer) sender).setPositionAndUpdate(l.getX(),
								l.getY(), l.getZ());
						sender.addChatMessage(new TextComponentString(
								TextFormatting.GOLD + "Teleported to "
										+ h.homeName + " location."));
						h.destroy();
						return;
					} else {
						sender.addChatMessage(new TextComponentString(
								TextFormatting.GOLD + h.homeName
										+ " not found."));
						h.destroy();
					}
					return;
				}
			}
			if (args.length == 2) {
				if (args[0].equalsIgnoreCase("set")) {
					Home h = new Home((EntityPlayer) sender, args[1]);
					if (h.setHome()) {
						sender.addChatMessage(new TextComponentString(
								TextFormatting.GOLD + "New location set for "
										+ h.getHomeName() + "."));
						h.destroy();
						return;
					}
				} else if (args[0].equalsIgnoreCase("del")) {
					Home h = new Home((EntityPlayer) sender, args[1]);
					if (h.deleteHome()) {
						sender.addChatMessage(new TextComponentString(
								TextFormatting.GOLD + "Deleted " + h.homeName
										+ " location."));
						h.destroy();
						return;
					}
				}
			}
		}
	}

}
