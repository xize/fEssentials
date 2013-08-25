package tv.mineinthebox.events;

import java.io.File;
import java.util.LinkedList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.BlockState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import tv.mineinthebox.fileManager;
import tv.mineinthebox.resources.bansystem.ban;
import tv.mineinthebox.resources.vanish.vanishApi;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.flags.DefaultFlag;
import com.sk89q.worldguard.protection.flags.StateFlag.State;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;

import eu.supertowns.town.supertowns;
import eu.supertowns.town.api.coreApi.flagType;

public class playerLeave implements Listener {

	@EventHandler
	public void firefly(PlayerQuitEvent e) {
		if(playermove.firefly.contains(e.getPlayer().getName())) {
			playermove.firefly.remove(e.getPlayer().getName());
		}
	}
	
	@EventHandler
	public void saveLocation(PlayerQuitEvent e) {
		Location loc = e.getPlayer().getLocation();
		fileManager.writeFile(e.getPlayer().getName() + ".yml", "location.x", loc.getX(), fileManager.getDir() + File.separator + "players");
		fileManager.writeFile(e.getPlayer().getName() + ".yml", "location.y", loc.getY(), fileManager.getDir() + File.separator + "players");
		fileManager.writeFile(e.getPlayer().getName() + ".yml", "location.z", loc.getZ(), fileManager.getDir() + File.separator + "players");
		fileManager.writeFile(e.getPlayer().getName() + ".yml", "location.yaw", loc.getYaw(), fileManager.getDir() + File.separator + "players");
		fileManager.writeFile(e.getPlayer().getName() + ".yml", "location.world", loc.getWorld().getName(), fileManager.getDir() + File.separator + "players");
	}
	
	@EventHandler
	public void torch(PlayerQuitEvent e) {
		if(playermove.isTorch(e.getPlayer())) {
			if(playermove.list.containsKey(e.getPlayer())) {
				LinkedList<BlockState> list = playermove.list.get(e.getPlayer());
				list.clear();
				playermove.list.remove(e.getPlayer());
			}
		}
	}

	@EventHandler
	public void saveInv(PlayerQuitEvent e) {
		if(fileManager.getBooleanValue("player.yml", "save-playerInventory", fileManager.getDir())) {
			fileManager.writeFile(e.getPlayer().getName() + ".yml", "inv", e.getPlayer().getInventory().getContents(), fileManager.getDir() + File.separator + "inventory");
		}
	}

	@EventHandler
	public void LeaveMessage(PlayerQuitEvent e) {
		if(ban.isBanned(e.getPlayer())) {
			e.setQuitMessage("");	
			return;
		}
		if(vanishApi.isVanished(e.getPlayer())) {
			e.setQuitMessage("");	
			return;
		}
		if(Bukkit.getPluginManager().isPluginEnabled("WorldGuard")) {
			WorldGuardPlugin wg = (WorldGuardPlugin) Bukkit.getPluginManager().getPlugin("WorldGuard");
			if(e.getPlayer().hasPermission("xEssentials.isStaff")) {
				for(ProtectedRegion region : wg.getRegionManager(e.getPlayer().getWorld()).getApplicableRegions(e.getPlayer().getLocation())) {
					if(region.getFlag(DefaultFlag.MOB_SPAWNING) == State.DENY) {
						e.setQuitMessage(ChatColor.RED + "Whoosh!" + ChatColor.GRAY + " staff member " + ChatColor.GREEN + e.getPlayer().getName() + ChatColor.GRAY + " has left the game safely!");
						return;
					}
				}
				e.setQuitMessage(ChatColor.RED + "Whoosh!" + ChatColor.GRAY + " staff member " + ChatColor.GREEN + e.getPlayer().getName() + ChatColor.GRAY + " has left the game in wild!");
				return;
			} else {
				for(ProtectedRegion region : wg.getRegionManager(e.getPlayer().getWorld()).getApplicableRegions(e.getPlayer().getLocation())) {
					if(region.getFlag(DefaultFlag.MOB_SPAWNING) == State.DENY) {
						e.setQuitMessage("Whoosh! " + ChatColor.GREEN + e.getPlayer().getName() + ChatColor.GRAY + " has left the game safely!");
						return;
					}
				}
				e.setQuitMessage(ChatColor.RED + "Whoosh! " + ChatColor.GREEN + e.getPlayer().getName() + ChatColor.GRAY + " has left the game in wild!");
				return;
			}
		} else {
			e.setQuitMessage(ChatColor.GREEN + e.getPlayer().getName() + " has left!");
		}
		if(Bukkit.getPluginManager().isPluginEnabled("supertowns")) {
			supertowns supert = (supertowns) Bukkit.getPluginManager().getPlugin("supertowns");
			if(supert.getCoreApi().checkTown(e.getPlayer().getLocation().getChunk().getX(), e.getPlayer().getLocation().getChunk().getZ(), e.getPlayer().getWorld())) {
				String townName = supert.getCoreApi().getTownNameOnLocation(e.getPlayer().getLocation().getChunk().getX(), e.getPlayer().getLocation().getChunk().getZ(), e.getPlayer().getWorld());
				if(supert.getCoreApi().returnFlagTypes(townName, flagType.hostile_mob_spawn)) {
					if(e.getPlayer().hasPermission("xEssentials.isStaff")) {
						e.setQuitMessage(ChatColor.RED + "Whoosh!" + ChatColor.GRAY + " staff member " + ChatColor.GREEN + e.getPlayer().getName() + ChatColor.GRAY + " has left the game safely!");
						return;
					} else {
						e.setQuitMessage("Whoosh! " + ChatColor.GREEN + e.getPlayer().getName() + ChatColor.GRAY + " has left the game safely!");
						return;
					}
				} else {
					if(e.getPlayer().hasPermission("xEssentials.isStaff")) {
						e.setQuitMessage(ChatColor.RED + "Whoosh!" + ChatColor.GRAY + " staff member " + ChatColor.GREEN + e.getPlayer().getName() + ChatColor.GRAY + " has left the game in wild!");
						return;
					} else {
						e.setQuitMessage(ChatColor.RED + "Whoosh! " + ChatColor.GREEN + e.getPlayer().getName() + ChatColor.GRAY + " has left the game in wild!");
						return;
					}
				}
			} else {
				if(e.getPlayer().hasPermission("xEssentials.isStaff")) {
					e.setQuitMessage(ChatColor.RED + "Whoosh!" + ChatColor.GRAY + " staff member " + ChatColor.GREEN + e.getPlayer().getName() + ChatColor.GRAY + " has left the game in wild!");
					return;
				} else {
					e.setQuitMessage(ChatColor.RED + "Whoosh! " + ChatColor.GREEN + e.getPlayer().getName() + ChatColor.GRAY + " has left the game in wild!");
					return;
				}
			}
		}
	}

}
