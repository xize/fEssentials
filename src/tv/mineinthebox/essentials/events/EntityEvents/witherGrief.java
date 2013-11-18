package tv.mineinthebox.essentials.events.EntityEvents;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Wither;
import org.bukkit.entity.WitherSkull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

public class witherGrief implements Listener {

	@EventHandler
	public void disableExplosionWithers(EntityExplodeEvent e) {
		if(e.getEntity() instanceof WitherSkull) {
			e.setCancelled(true);
		}
	}

	@EventHandler
	public void disableExplosionWither(EntityExplodeEvent e) {
		if(e.getEntity() instanceof Wither) {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void disableGrief(EntityChangeBlockEvent e) {
		if(e.getEntity().getType() == EntityType.WITHER) {
			e.setCancelled(true);
		}
	}

}
