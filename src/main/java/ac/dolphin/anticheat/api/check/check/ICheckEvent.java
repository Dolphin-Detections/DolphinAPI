package ac.dolphin.anticheat.api.check.check;

/**
 * This project can't be redistributed without
 * authorization of the developer
 *
 * @author Watschin © 2025
 * @project DolphinAPI
 * @date 30/5/2025
 */

public interface ICheckEvent {

    void onPacket(Object packet);

    void onPacketReach(Object packet);

    void onTimer(Object timerData);

    void onServerTick(Object context);

    void onClientTransaction(Object context, long timestamp);

    void onPrediction(Object predictionData);

    void onVelocityDetection(Object velocityData);

    void onReach(Object reachData);

    void onBetterClientTransaction();
}
