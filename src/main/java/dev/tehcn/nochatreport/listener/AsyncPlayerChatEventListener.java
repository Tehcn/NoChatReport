package dev.tehcn.nochatreport.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

// import dev.tehcn.nochatreport.ChatMessage;
import dev.tehcn.nochatreport.NoChatReport;

public class AsyncPlayerChatEventListener implements Listener {
    private NoChatReport plugin;

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        // String message = "this message will overwrite any other message i hope";
        this.plugin.getLogger().info(player.getDisplayName() + " sent a message");
        // this.plugin.setLastChatMessageHash(new ChatMessage(player.getName(), message, message.hashCode()));
    }
}
