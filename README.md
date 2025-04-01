
# DolphinAPI - Official Documentation

**DolphinAPI** is an interface designed to provide access and control over the Dolphin AntiCheat system. This API allows you to manage cheat detection checks, retrieve player performance metrics, and handle events related to sanctions and violations. It also includes features for detecting and managing Bedrock players.

## Installation
To integrate DolphinAPI into your project, follow these steps:
1. Ensure that the Dolphin plugin is installed on your Bukkit/Spigot server.
2. Include the API in your project by adding the corresponding dependency.

## Key Features

### Enabling and Disabling Anti-Cheat
```java
boolean status = DolphinAPI.isAnticheatEnabled();
DolphinAPI.setAnticheatEnabled(true);
```

### Retrieving Player Latency
```java
int ping = DolphinAPI.getPing(player);
boolean lagging = DolphinAPI.isLagging(player);
```

### Configuring Checks
```java
DolphinAPI.setCheckEnabled("Fly", true);
DolphinAPI.setCheckEnabled("Speed", "Movement", false);
```

### Reloading Configuration
```java
DolphinAPI.reloadConfig();
```

### Version Information
```java
String pluginVersion = DolphinAPI.getPluginVersion();
String serverVersion = DolphinAPI.getServerVersion();
```

### Managing Exemptions
```java
DolphinAPI.exemptPlayer(player, 200);  // Exempt player for 200 ticks
DolphinAPI.resetExempt(player);  // Reset exemptions for the player
```

### Cloud-Based Queries
```java
List<String> bans = DolphinAPI.getBanwave();
Map<String, Integer> logs = DolphinAPI.getPlayerLogs(player.getUniqueId().toString());
Optional<String> banInfo = DolphinAPI.getBanInfo("ban123");
```

### Executing Specific Triggers
```java
DolphinAPI.triggerForPlayer(12345L, player);
DolphinAPI.triggerGlobal(67890L);
```

### Notification and Alert Settings
```java
DolphinAPI.setPlayerNotifications(player, true);
DolphinAPI.setPlayerAlerts(player, false);
```

### Bedrock Support

#### Checking if a Player is on Bedrock
```java
boolean isBedrock = DolphinAPI.isBedrockPlayer(player);
```

#### Retrieving Bedrock Player Violations
```java
List<String> bedrockViolations = DolphinAPI.getBedrockPlayerViolations(player.getUniqueId().toString());
```

## Available Events

### `DolphinPunishEvent`
This event is triggered when a player is punished by the anti-cheat system.

#### Event Details:
- `Player getPlayer()`: Returns the player being punished.
- `String getBanID()`: Retrieves the ban ID.
- `String getCheckName()`: Retrieves the name of the triggered check.
- `String getCheckType()`: Retrieves the type of the triggered check.
- `int getPing()`: Returns the player's ping at the time of punishment.
- `void setCancelled(boolean cancelled)`: Allows cancellation of the punishment.

#### Example Usage:
```java
@EventHandler
public void onPunish(DolphinPunishEvent event) {
    Player player = event.getPlayer();
    if (event.getPing() > 100) {
        event.setCancelled(true);
        player.sendMessage("Your punishment has been prevented due to high ping.");
    }
}
```

### `DolphinViolationEvent`
This event is triggered when a player violates an anti-cheat check.

#### Event Details:
- `Player getPlayer()`: Returns the player involved in the violation.
- `String getCheckName()`: Retrieves the name of the check that was triggered.
- `String getCheckType()`: Retrieves the type of check that was triggered.
- `String getCustomCheckName()`: Retrieves a custom check name if applicable.
- `String getCustomCheckType()`: Retrieves a custom check type if applicable.
- `String getCategory()`: Retrieves the category of the violation.
- `String getDebug()`: Retrieves debug information related to the violation.
- `String getDescription()`: Retrieves a description of the violation.
- `boolean isExperimental()`: Indicates if the violation is from an experimental check.
- `int getViolation()`: Retrieves the violation level.
- `void setCancelled(boolean cancelled)`: Allows cancellation of the violation action.

#### Example Usage:
```java
@EventHandler
public void onViolation(DolphinViolationEvent event) {
    Player player = event.getPlayer();
    String checkName = event.getCheckName();
    int violationLevel = event.getViolation();

    player.sendMessage("Warning: " + checkName + " violation detected! Level: " + violationLevel);

    if (violationLevel > 5) {
        event.setCancelled(true);
        player.sendMessage("Your violation was too high and has been blocked.");
    }
}
```

### `DolphinBedrockViolationEvent`
This event is triggered when a player using Bedrock Edition violates an anti-cheat check.

#### Event Details:
- `Player getPlayer()`: Returns the Bedrock player involved in the violation.
- `String getCheckName()`: Retrieves the name of the check that was triggered.
- `String getCheckType()`: Retrieves the type of check that was triggered.
- `String getCategory()`: Retrieves the category of the violation.
- `String getDebug()`: Retrieves debug information related to the violation.
- `String getDescription()`: Retrieves a description of the violation.
- `int getViolation()`: Retrieves the violation level.
- `void setCancelled(boolean cancelled)`: Allows cancellation of the violation action.

#### Example Usage:
```java
@EventHandler
public void onBedrockViolation(DolphinBedrockViolationEvent event) {
    Player player = event.getPlayer();
    String checkName = event.getCheckName();

    player.sendMessage("Warning: Bedrock player triggered " + checkName);

    if (event.getViolation() > 3) {
        event.setCancelled(true);
        player.sendMessage("Your action has been blocked due to high violation level.");
    }
}
```