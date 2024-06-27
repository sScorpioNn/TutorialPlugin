package ru.sscorpionn.tutorial;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            return false;
        }

        Player p = (Player) sender;

        String cmdName = command.getName().toLowerCase();

        switch (cmdName) {
            case "гдея":
                sendCoords(p);
                break;
            case "лох":
                killPlayer(p);
                break;
        }

        return true;
    }

    private void sendCoords(Player p) {
        Location loc = p.getLocation();

        p.sendMessage("Вы находитесь в мире " + ChatColor.GREEN + p.getWorld().getName() + ChatColor.WHITE + " на координатах " + ChatColor.GREEN + "X:" + loc.getBlockX() + " Y:" + loc.getBlockY() + " Z:" + loc.getBlockZ());
    }

    private void killPlayer(Player p) {
        if(!p.hasPermission("tutorial.lox")) {
            return;
        }
        p.sendMessage("Ну ты лошара");
        p.setHealth(0);
    }
}
