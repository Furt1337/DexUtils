package me.furt.dexutils.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

/**
 * Created by Furt on 6/23/2016.
 */
public class ModCommand extends CommandBase {
	private String commandName, usage;

	public ModCommand(String commandName, String usage) {
		this.commandName = commandName;
		this.usage = usage;
	}

	@Override
	public String getCommandName() {
		return this.commandName;
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return this.commandName + " " + this.usage;
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		return true;

	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender,
			String[] args) throws CommandException {

	}

}
