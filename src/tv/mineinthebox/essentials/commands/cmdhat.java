package tv.mineinthebox.essentials.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import tv.mineinthebox.essentials.permissions.consolePermission;
import tv.mineinthebox.essentials.permissions.playerPermission;
public class cmdhat {
	public static boolean execute(CommandSender sender, String[] args, Command cmd) {
		if(cmd.getName().equalsIgnoreCase("hat")) {
			if(sender instanceof Player) {
				if(sender.hasPermission("xEssentials.command.hat")) {
					Player p = (Player) sender;
					changeHat(p);
				} else {
					playerPermission.getPermissionError(sender, cmd, args);
				}
			} else {
				consolePermission.getConsoleMessage(sender);
			}
		}
		return false;
	}
	
	public static boolean checkHat(Player p) {
		if(p.getInventory().getHelmet() != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean changeHat(Player p) {
		if(checkHat(p)) {
			if(p.getInventory().firstEmpty() == -1) {
				p.sendMessage(ChatColor.RED + "you need a empty slot, so we can backup your old helmet in your inventory");
				return true;
			} else {
				//the inventory has empty slots lets loop through them
				for(ItemStack item : p.getInventory().getContents()) {
					if(item == null) {
						p.getInventory().addItem(p.getInventory().getHelmet());
						//now find the item in hand and check the length;)
						if(p.getInventory().getItemInHand().getAmount() > 1) {
							p.getInventory().getItemInHand().setAmount(p.getInventory().getItemInHand().getAmount() - 1);
							// now instance a new in hand item.
							ItemStack hand = new ItemStack(p.getItemInHand());
							hand.setAmount(1);
							p.getInventory().setHelmet(null);
							p.getInventory().setHelmet(hand);
							return true;
						} else {
							//amount of item size is illegal
							ItemStack hand = new ItemStack(p.getItemInHand());
							hand.setAmount(1);
							p.getInventory().setHelmet(null);
							p.getInventory().setHelmet(hand);
							p.getInventory().setItemInHand(null);
							return true;
						}
					} else {
						//return nothing;)
					}
				}
			}
		} else {
			//so the helmet is not wearing, so we check the stack size from the hand.
			if(p.getInventory().getItemInHand().getAmount() > 1) {
				//the stack size is more than 1
				p.getInventory().getItemInHand().setAmount(p.getInventory().getItemInHand().getAmount() - 1);
				//now lets make a new instance of this;)
				ItemStack hand = new ItemStack(p.getInventory().getItemInHand());
				hand.setAmount(1);
				p.getInventory().setHelmet(hand);
				return true;
			} else {
				//this is one item.
				p.getInventory().setHelmet(p.getItemInHand());
				p.getInventory().setItemInHand(null);
				return true;
			}
		}
		return false;
	}
}
