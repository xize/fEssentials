package tv.mineinthebox.events.chatEvent;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import tv.mineinthebox.xEssentials;
import tv.mineinthebox.resources.timeunit.timeunits;

@SuppressWarnings("deprecation")
public class muteManager implements Listener {
	
	@EventHandler
	public void getMutes(PlayerChatEvent e) {
		if(xEssentials.mem.returnPlayer(e.getPlayer()).containsKey("muted")) {
			if(!timeunits.isOverTime((Long) xEssentials.mem.returnPlayer(e.getPlayer()).get("muted"))) {
				e.getPlayer().sendMessage(ChatColor.GREEN + "you are muted for " + timeunits.getElapsedTime((Long) xEssentials.mem.returnPlayer(e.getPlayer()).get("muted")));
				e.setCancelled(true);
			} else {
				xEssentials.mem.returnPlayer(e.getPlayer()).remove("muted");
				xEssentials.mem.updatePlayerConfig(e.getPlayer());
			}
		}
	}

}