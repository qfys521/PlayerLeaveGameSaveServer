package cn.qfys521.playerleavegamesaveserver;

import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerLeaveGameSaveServer extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventInteractor(), this);
        getLogger().info("插件启动中。。。。。");
        getLogger().info("作者: qfys521");
    }

    @Override
    public void onDisable() {
        getLogger().info("插件卸载中。。。。。");
        getLogger().info("感谢您的使用。");
    }

}
