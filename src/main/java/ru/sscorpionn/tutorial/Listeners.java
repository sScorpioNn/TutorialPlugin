package ru.sscorpionn.tutorial;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.util.Vector;

public class Listeners implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage(event.getPlayer().getDisplayName() + " зашел на сервер!");
    }

    @EventHandler
    public void onSheepShear(PlayerShearEntityEvent event) {
        Entity sheep = event.getEntity();
        if(sheep instanceof Sheep) {
            sheep.setVelocity(new Vector(0, 0.5, 0));
        }
    }
}
