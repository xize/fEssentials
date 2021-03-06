package tv.mineinthebox.essentials.permissions;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class playerPermission {
	
	public static void getPermissionError(CommandSender sender, Command cmd, String[] args) {
		if(cmd.getName().equalsIgnoreCase("sethome")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.sethome");
		} else if(cmd.getName().equalsIgnoreCase("home")) {
			if(args.length == 2) {
				sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.homes.convert");
			} else {
				sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.home");	
			}
		} else if(cmd.getName().equalsIgnoreCase("setspawn")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.setspawn");
		} else if(cmd.getName().equalsIgnoreCase("spawn")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.spawn");
		} else if(cmd.getName().equalsIgnoreCase("vanish")) {
			if(args.length == 0) {
				sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.vanish");
			} else if(args.length == 1) {
				if(args[0].equalsIgnoreCase("nopickup")) {
					sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + " " + args[0] + "\n" + ChatColor.GRAY + "permission: xEssentials.command.vanish.nopickup");
				}
			}
		} else if(cmd.getName().equalsIgnoreCase("firefly")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.firefly");
		} else if(cmd.getName().equalsIgnoreCase("spawner")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.spawner");
		} else if(cmd.getName().equalsIgnoreCase("gamemode")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.gamemode");
		} else if(cmd.getName().equalsIgnoreCase("modreq")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.modreq");
		} else if(cmd.getName().equalsIgnoreCase("spawnmob")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.spawnmob");
		} else if(cmd.getName().equalsIgnoreCase("invsee")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.invsee");
		} else if(cmd.getName().equalsIgnoreCase("warp")) {
			if(args.length == 0) {
				sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.warp");	
			} else if(args.length == 1) {
				sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.warp");
			} else if(args.length == 2) {
				sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.warp.admin");
			}
		} else if(cmd.getName().equalsIgnoreCase("setwarp")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.setwarp");
		} else if(cmd.getName().equalsIgnoreCase("torch")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.torch");
		} else if(cmd.getName().equalsIgnoreCase("warps")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.warps");
		} else if(cmd.getName().equalsIgnoreCase("delwarp")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.delwarp");
		} else if(cmd.getName().equalsIgnoreCase("ban")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.ban");
		} else if(cmd.getName().equalsIgnoreCase("unban")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.unban");
		} else if(cmd.getName().equalsIgnoreCase("claim")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.claim");
		} else if(cmd.getName().equalsIgnoreCase("check")) {
			if(args.length == 0) {
				sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.check");
			} else if(args.length == 1) {
				if(args[0].equalsIgnoreCase("help")) {
					sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + " " + args[0] + "\n" + ChatColor.GRAY + "permission: xEssentials.command.check");
				} else if(args[0].equalsIgnoreCase("list")) {
					sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + " " + args[0] + "\n" + ChatColor.GRAY + "permission: xEssentials.command.check.admin");
				} else {
					sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + " " + args[0] + "\n" + ChatColor.GRAY + "permission: xEssentials.command.check.admin");
				}
			}
		} else if(cmd.getName().equalsIgnoreCase("done")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.done");
		} else if(cmd.getName().equalsIgnoreCase("hometp")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.hometp");
		} else if(cmd.getName().equalsIgnoreCase("tphere")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.tphere");
		} else if(cmd.getName().equalsIgnoreCase("tpa")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.tpa");
		} else if(cmd.getName().equalsIgnoreCase("tpahere")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.tpahere");
		} else if(cmd.getName().equalsIgnoreCase("mute")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.mute");
		} else if(cmd.getName().equalsIgnoreCase("unmute")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.unmute");
		} else if(cmd.getName().equalsIgnoreCase("xessentials")) {
			if(args.length == 0) {
				sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.xEssentials");
			} else if(args.length == 1) {
				if(args[0].equalsIgnoreCase("reload")) {
					sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + args[0] + "\n" + ChatColor.GRAY + "permission: xEssentials.command.reload");
				} else {
					sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + args[0] + "\n" + ChatColor.GRAY + "permission: xEssentials.command.xEssentials");
				}
			}
		} else if(cmd.getName().equalsIgnoreCase("gc")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.gc");
		} else if(cmd.getName().equalsIgnoreCase("homeinvite")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.homeinvite");
		} else if(cmd.getName().equalsIgnoreCase("back")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.back");
		} else if(cmd.getName().equalsIgnoreCase("broadcast")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.broadcast");
		} else if(cmd.getName().equalsIgnoreCase("task")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.isStaff");
		} else if(cmd.getName().equalsIgnoreCase("boom")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.boom");
		} else if(cmd.getName().equalsIgnoreCase("hat")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.hat");
		} else if(cmd.getName().equalsIgnoreCase("ghost")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.ghost");
		} else if(cmd.getName().equalsIgnoreCase("motd")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.motd");
		} else if(cmd.getName().equalsIgnoreCase("hand")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.hand");
		} else if(cmd.getName().equalsIgnoreCase("heal")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.heal");
		} else if(cmd.getName().equalsIgnoreCase("tp-id")) {
			sender.sendMessage(ChatColor.RED + "you are not allowed to use this command! /" + cmd.getName() + "\n" + ChatColor.GRAY + "permission: xEssentials.command.tpid");
		}
	}

}
