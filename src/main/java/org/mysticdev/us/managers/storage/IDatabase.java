package org.mysticdev.us.managers.storage;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface IDatabase {

    void doUnsync(Player player);
    void doUnsync(String nick);
    void updateUser(User oldUser, User newUser);

    boolean isUserSynced(Player player);
    boolean isUserSynced(String nick);
    boolean isUserSynced(UUID uuid) ;
    boolean isBooster(Player player);
    boolean uuidExist(UUID uuid);

    User doSync(Player player, Key key);
    User findUser(Player player);
    User findUser(String nick);
    User findUser(UUID uuid);

    Key findKey(String key);

    String getDiscordUsers();
    String getName();
}
