package net.kz_n.draelcraftbungee.util;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import javax.annotation.Nullable;
import java.util.Collection;

public class PluginMessageUtils {
    public static void sendCustomData(ProxiedPlayer player, String channel, @Nullable String stringInformation) {
        Collection<ProxiedPlayer> networkPlayers = ProxyServer.getInstance().getPlayers();
        // perform a check to see if globally are no players
        if ( networkPlayers == null || networkPlayers.isEmpty() )
        {
            return;
        }
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        if (stringInformation != null) out.writeUTF(stringInformation);

        // we send the data to the server
        // using ServerInfo the packet is being queued if there are no players in the server
        // using only the server to send data the packet will be lost if no players are in it
        player.getServer().getInfo().sendData(channel, out.toByteArray());
    }
}
