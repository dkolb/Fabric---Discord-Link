package fr.arthurbambou.fdlink.versionhelpers.minecraft;

import java.util.List;

public interface MinecraftServer {

    String getMotd();

    int getPlayerCount();

    int getMaxPlayerCount();

    List<PlayerEntity> getPlayers();

    void sendMessageToAll(MessagePacket messagePacket);

    String getIp();
}
