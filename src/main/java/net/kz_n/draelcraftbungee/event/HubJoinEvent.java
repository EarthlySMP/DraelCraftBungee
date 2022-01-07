package net.kz_n.draelcraftbungee.event;

import net.md_5.bungee.api.event.PluginMessageEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class HubJoinEvent implements Listener {

    @EventHandler
    public void onHubJoin(PluginMessageEvent event) {
        System.out.println(new String(event.getData()));
        System.out.println("tag"+event.getTag());
    }
}
