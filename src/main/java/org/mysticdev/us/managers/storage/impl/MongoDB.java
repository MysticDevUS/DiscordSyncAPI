package org.mysticdev.us.managers.storage.impl;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.mysticdev.us.managers.storage.IDatabase;
import org.mysticdev.us.managers.storage.Key;
import org.mysticdev.us.managers.storage.User;

import java.util.UUID;

public class MongoDB implements IDatabase {

    @Override
    public void doUnsync(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public void doUnsync(String nick) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public void updateUser(User oldUser, User newUser) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public boolean isUserSynced(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public boolean isUserSynced(String nick) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public boolean isUserSynced(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public boolean isBooster(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public boolean uuidExist(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public User doSync(Player player, Key key) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public User findUser(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }


    @Override
    public User findUser(String nick) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public User findUser(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public Key findKey(String key) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public String getDiscordUsers(){
        throw new IllegalPluginAccessException("API is not registered");

    }

    @Override
    public String getName() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
