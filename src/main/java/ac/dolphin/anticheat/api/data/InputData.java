package ac.dolphin.anticheat.api.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * This project can't be redistributed without
 * authorization of the developer
 *
 * @author Wachin © 2025
 * @project DolphinAPI
 * @date 31/5/2025
 */

@Getter
@RequiredArgsConstructor
public final class InputData {

    private final String uuid;
    private final String player;
    private final String check;
    private final String checkType;
    private final double violation;
    private final boolean experimental;
    private final int ping;
    private final String checkData;
    private final LocalDate currentDate;
    private final LocalDate loginDate;
    private final LocalTime loginTime;
    private final String banWave;
}
