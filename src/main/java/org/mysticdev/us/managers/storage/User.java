package org.mysticdev.us.managers.storage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter @AllArgsConstructor @Setter
public class User {
    private String nick;
    private String uuid;
    private String idDiscord;
    private String usernameDiscord;
    private String coins;
    private String rank;
    private boolean temporaryRank;
    private boolean firstTime;
    private boolean alreadyBoost;
    private boolean booster;
}
