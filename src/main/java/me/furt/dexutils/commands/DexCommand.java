package me.furt.dexutils.commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

/**
 * Created by Furt on 6/23/2016.
 */
public class DexCommand extends ModCommand {

	public DexCommand(String commandName, String usage) {
		super(commandName, usage);
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender,
			String[] args) throws CommandException {
		// TODO all OP type commands will go here
	}

}
