package tv.mineinthebox.events;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import tv.mineinthebox.xEssentials;
import tv.mineinthebox.events.enumTypes.playerJoinEnum;

public class handler {
	xEssentials plugin;
	public handler(xEssentials plugin) {
		this.plugin = plugin;
	}
	
	public void getListener() {
		setListener(new playerJoin(playerJoinEnum.altmessage));
		setListener(new playerJoin(playerJoinEnum.isSafe));
		setListener(new playerJoin(playerJoinEnum.isWild));
		setListener(new playerJoin(playerJoinEnum.isXeph0re));
		setListener(new playerJoin(playerJoinEnum.welcomeMessage));
	}
	
	public void setListener(Listener listener) {
		Bukkit.getPluginManager().registerEvents(listener, plugin);
	}

}
