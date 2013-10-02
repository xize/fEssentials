package tv.mineinthebox.events.leaveEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import tv.mineinthebox.resources.ghostfactory.ghost;

public class ghostLeave implements Listener {
	
	@EventHandler
	public void RemoveFromTeam(PlayerQuitEvent e) {
		ghost.removePlayerFromTeam(e.getPlayer());
	}
	
	@EventHandler
	public void RemoveGhost(PlayerQuitEvent e) {
		if(ghost.isGhost(e.getPlayer().getName())) {
			ghost.removeGhost(e.getPlayer());
		}
	}

}
