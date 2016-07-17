package me.furt.dexutils.commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
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
		if (sender instanceof EntityPlayer) {
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("spawn")) {

				} else if (args[0].equalsIgnoreCase("help")) {

				}

			} else if (args.length == 2) {
				if (args[0].equalsIgnoreCase("spawn")
						&& args[1].equalsIgnoreCase("set")) {

				}

			} else if (args.length == 3) {

			}
		}
	}

}
