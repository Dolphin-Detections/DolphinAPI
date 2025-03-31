package me.astrix.dolphin.api.events;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.lang.reflect.Field;

public class DolphinEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    /**
     * Default constructor that sets the event to be asynchronous.
     */
    public DolphinEvent() {
        setAsync();
    }

    /**
     * Returns the list of event handlers.
     *
     * @return the HandlerList for this event
     */
    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * Returns the handlers for this event.
     *
     * @return the HandlerList for this event
     */
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Sets the event to be asynchronous by modifying the 'async' field.
     * Uses reflection to access and modify the field in the parent class.
     */
    private void setAsync() {
        try {
            // Access the 'async' field from the superclass of the superclass
            Class<?> clazz = getClass().getSuperclass().getSuperclass();
            Field asyncField = clazz.getDeclaredField("async");

            boolean access = asyncField.canAccess(this);
            asyncField.setAccessible(true);
            asyncField.set(this, true);
            asyncField.setAccessible(access);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            Bukkit.getLogger().severe("Failed to set event as asynchronous.");
        }
    }
}
