package modding.coreadditions.Listeners;

import modding.coreadditions.Main;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class GreenTextListener implements Listener {
    private final Main plugin;
    FileConfiguration config;
    public GreenTextListener(Main plugin) {this.plugin = plugin;}
    @EventHandler
    public void onPlayerChat(PlayerChatEvent event) {
        if(event.getMessage().startsWith(">")) {
            event.setMessage(ChatColor.GREEN + event.getMessage());
        }
    }
}

