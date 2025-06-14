package ac.dolphin.anticheat.api.events.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ac.dolphin.anticheat.api.events.DolphinEvent;
import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * This project can't be redistributed without
 * authorization of the developer
 *
 * @author Watschin © 2025
 * @project DolphinAPI
 * @date 04/04/2025
 */

@Getter
@RequiredArgsConstructor
public class DolphinBanWaveEvent extends DolphinEvent {

    private final CommandSender initiator;
    private final List<String> players;
    private final BanWaveState state;
    private final boolean timely;

    @Setter
    private boolean cancelled = false;

    public enum BanWaveState {
        STARTED,
        STOPPED,
        PLAYER_BANNED
    }
}
