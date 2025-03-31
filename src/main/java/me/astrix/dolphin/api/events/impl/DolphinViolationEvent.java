package me.astrix.dolphin.api.events.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import me.astrix.dolphin.api.events.DolphinEvent;
import org.bukkit.entity.Player;

@Getter
@RequiredArgsConstructor
public class DolphinViolationEvent extends DolphinEvent {

    private final Player player;
    private final String checkName;
    private final String checkType;
    private final String customCheckName;
    private final String customCheckType;
    private final String category;
    private final String debug;
    private final String description;
    private final boolean experimental;
    private final int violation;

    @Setter
    private boolean cancelled = false;
}
