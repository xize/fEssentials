package tv.mineinthebox.events.teleportEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

import tv.mineinthebox.resources.tpback.back;

public class teleportBack implements Listener {
	
	@EventHandler
	public void onTeleportSafe(PlayerTeleportEvent e) {
		if(e.getPlayer().hasPermission("xEssentials.command.back")) {
			back.setBack(e.getFrom(), e.getPlayer().getName());	
		}
	}

}
