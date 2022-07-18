package dev.tehcn.nochatreport.packet;

import java.util.logging.Level;

import org.bukkit.plugin.Plugin;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;

import dev.tehcn.nochatreport.NoChatReport;

public class ChatOutListener extends PacketAdapter {

    private NoChatReport plugin;

    public ChatOutListener(NoChatReport plugin) {
        super((Plugin) plugin, ListenerPriority.MONITOR, new PacketType[] { PacketType.Play.Server.CHAT });
        this.plugin = plugin;
    }
    
    @Override
    public void onPacketSending(PacketEvent event) {
        if(!this.plugin.isEnabled() || event.isCancelled()) return;
        try {
            PacketContainer container = event.getPacket().deepClone();
            plugin.getLogger().log(Level.CONFIG, container.getChatComponents().toString());
        } catch(Exception e) {
            this.plugin.getLogger().warning("Caught exception: " + e.toString());
        }
    }
}
