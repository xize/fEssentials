package tv.mineinthebox.events.joinEvent;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import tv.mineinthebox.fileManager;

public class PlayerTaskEvent implements Listener {
	
	@EventHandler
	public void playerTaskCheck(PlayerJoinEvent e) {
		if(fileManager.file_exists(e.getPlayer().getName() + ".yml", fileManager.getDir() + File.separator + "players")){
			if(fileManager.isSet(e.getPlayer().getName() + ".yml", "taskCommand", fileManager.getDir() + File.separator + "players")) {
				String command = fileManager.getStringValue(e.getPlayer().getName() + ".yml", "taskCommand", fileManager.getDir() + File.separator + "players");
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
				fileManager.removeNode(e.getPlayer().getName() + ".yml", "taskCommand", fileManager.getDir() + File.separator + "players");
			}
		}
	}

}
