package tv.mineinthebox.events.leaveEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import tv.mineinthebox.xEssentialsMemory;

public class delLeaveMemory implements Listener {
	@EventHandler
	public void delPlayerMemory(PlayerQuitEvent e) {
		//first save and then quit
		xEssentialsMemory.updatePlayerConfig(e.getPlayer());
		xEssentialsMemory.returnPlayer(e.getPlayer()).clear();
		xEssentialsMemory.removePlayer(e.getPlayer());
	}
}
