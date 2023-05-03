package cn.qfys521.playerleavegamesaveserver;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventInteractor implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void OnLeave(PlayerQuitEvent event){
        ConsoleCommandSender commandSender = Bukkit.getServer().getConsoleSender();
        commandSender.sendMessage("\u00a7b正在保存。\u00a7r");
        Bukkit.getServer().dispatchCommand(commandSender,"save-all");
        commandSender.sendMessage("\u00a7b已尝试保存。\u00a7r");

    }
}
