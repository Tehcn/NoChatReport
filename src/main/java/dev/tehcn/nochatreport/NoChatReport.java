package dev.tehcn.nochatreport;

import org.bukkit.plugin.java.JavaPlugin;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;

import dev.tehcn.nochatreport.packet.ChatOutListener; 

public class NoChatReport extends JavaPlugin {
    private ProtocolManager manager;
    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC!");
        this.manager = ProtocolLibrary.getProtocolManager();

        setupPacketListeners();
    }

    private void setupPacketListeners() {
        manager.addPacketListener(new ChatOutListener(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }
}
