package ac.dolphin.anticheat.api;

import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * This project can't be redistributed without
 * authorization of the developer
 *
 * @author Watschin © 2025
 * @project DolphinAPI
 * @date 01/04/2025
 */

public final class DolphinAPI {

    /**
     * Checks if the anti-cheat system is enabled.
     * @return true if the anti-cheat is enabled, false otherwise
     */
    public static boolean isAntiCheatEnabled() {
        return false;
    }

    /**
     * Enables or disables the anti-cheat system.
     * @param enabled true to enable, false to disable
     */
    public static void setAntiCheatEnabled(boolean enabled) {

    }

    // Player Information
    /**
     * Retrieves the ping of the player.
     * @param player the player to query
     * @return the player's ping or -1 if unavailable
     */
    public static int getPing(Player player) {
        return -1;
    }

    /**
     * Checks if a player is lagging.
     * @param player the player to check
     * @return true if the player is lagging, false otherwise
     */
    public static boolean isLagging(Player player) {
        return false;
    }

    // Check States
    /**
     * Sets the state of a specific check.
     * @param checkName the name of the check
     * @param enabled true to enable, false to disable
     */
    public static void setCheckEnabled(String checkName, boolean enabled) {

    }

    /**
     * Sets the state of a specific check with type.
     * @param checkName the name of the check
     * @param type the type of check
     * @param enabled true to enable, false to disable
     */
    public static void setCheckEnabled(String checkName, String type, boolean enabled) {

    }

    // Configuration
    /**
     * Reloads the system configuration.
     */
    public static void reloadConfig() {

    }

    // Version Info
    /**
     * Retrieves the current version of the plugin.
     * @return the plugin version or null if unavailable
     */
    public static String getPluginVersion() {
        return null;
    }

    /**
     * Retrieves the server version.
     * @return the server version or null if unavailable
     */
    public static String getServerVersion() {
        return null;
    }

    // Player Exemptions
    /**
     * Exempts a player from checks for a specific duration.
     * @param player the player to exempt
     * @param durationTicks the duration of exemption in ticks
     */
    public static void exemptPlayer(Player player, int durationTicks) {

    }

    /**
     * Removes any exemptions for a player.
     * @param player the player to reset
     */
    public static void resetExempt(Player player) {

    }

    // Cloud Data
    /**
     * Retrieves the list of bans in a banwave from the cloud.
     * @return an unmodifiable list of ban IDs, or an empty list if no data
     */
    public static List<String> getBanWave() {
        return Collections.emptyList();
    }

    /**
     * Retrieves the logs for a player from the cloud.
     * @param playerUUID the UUID of the player
     * @return a map of log entries, or an empty map if no data
     */
    public static Map<String, Integer> getPlayerLogs(String playerUUID) {
        return Collections.emptyMap();
    }

    /**
     * Retrieves information about a specific ban from the cloud.
     * @param banID the identifier of the ban
     * @return an Optional containing the ban information, or empty if not found
     */
    public static Optional<String> getBanInfo(String banID) {
        return Optional.empty();
    }

    // Triggers
    /**
     * Calls a specific trigger for a player.
     * @param triggerID the identifier of the trigger
     * @param player the target player
     */
    public static void triggerForPlayer(long triggerID, Player player) {

    }

    /**
     * Calls a specific global trigger.
     * @param triggerID the identifier of the trigger
     */
    public static void triggerGlobal(long triggerID) {

    }

    // Notifications and Alerts
    /**
     * Sets the notification state for a player.
     * @param player the target player
     * @param enable true to enable notifications, false to disable
     */
    public static void setPlayerNotifications(Player player, boolean enable) {

    }

    /**
     * Sets the alert state for a player.
     * @param player the target player
     * @param enable true to enable alerts, false to disable
     */
    public static void setPlayerAlerts(Player player, boolean enable) {

    }

    /**
     * Checks if a player is using Bedrock Edition.
     * @param player the player to check
     * @return true if the player is on Bedrock Edition, false otherwise
     */
    public static boolean isBedrockPlayer(Player player) {
        return false;
    }

    /**
     * Retrieves a list of Bedrock player violations from the cloud.
     * @param playerUUID the UUID of the Bedrock player
     * @return a list of violation IDs or an empty list if no data
     */
    public static List<String> getBedrockPlayerViolations(String playerUUID) {
        return Collections.emptyList();
    }
}
