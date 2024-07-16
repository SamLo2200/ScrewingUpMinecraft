package com.itdognorights.screwingupminecraft.handlers;

import com.itdognorights.screwingupminecraft.ScrewingUpMinecraft;
import com.sun.tools.javac.Main;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class StoneCutterHandler implements Listener {
    
    @EventHandler
    public void onStoneCutterPlace(PlayerJoinEvent event) {
        event.setJoinMessage("Welcome to this server!");

    }
}
