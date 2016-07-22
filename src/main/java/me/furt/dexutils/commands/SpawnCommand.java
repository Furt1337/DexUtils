package me.furt.dexutils.commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class SpawnCommand extends ModCommand {

	public SpawnCommand(String commandName, String usage) {
		super(commandName, usage);
	}
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender,
			String[] args) throws CommandException {
		
	}

}
