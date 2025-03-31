package me.astrix.dolphin.api.events.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import me.astrix.dolphin.api.events.DolphinEvent;
import org.bukkit.entity.Player;

@Getter
@RequiredArgsConstructor
public class DolphinPunishEvent extends DolphinEvent {

    private final Player player;
    private final String banID;
    private final String checkName;
    private final String checkType;
    private final int ping;

    @Setter
    private boolean cancelled = false;
}
