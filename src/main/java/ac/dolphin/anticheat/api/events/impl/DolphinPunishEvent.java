package ac.dolphin.anticheat.api.events.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ac.dolphin.anticheat.api.events.DolphinEvent;
import org.bukkit.entity.Player;

/**
 * This project can't be redistributed without
 * authorization of the developer
 *
 * @author Watschin © 2025
 * @project DolphinAPI
 * @date 01/04/2025
 */

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
