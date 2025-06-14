package ac.dolphin.anticheat.api.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

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
public final class BanData {

    private final String profile;
    private final LocalDate date;
    private final String reason;
}
