package org.mysticdev.us;

import org.bukkit.plugin.IllegalPluginAccessException;
import org.mysticdev.us.managers.storage.IDatabase;

public class DiscordSyncAPI {

    public static DiscordSyncAPI INSTANCE;

    public DiscordSyncAPI() {
    }

    public IDatabase getDatabaseManager() {
        throw new IllegalPluginAccessException("API is not registered");
    }

}

