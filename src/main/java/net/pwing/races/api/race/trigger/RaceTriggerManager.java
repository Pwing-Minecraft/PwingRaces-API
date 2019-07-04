package net.pwing.races.api.race.trigger;

import java.util.Collection;
import java.util.List;

import org.bukkit.entity.Player;

/**
 * RaceTrigger API implementation
 *
 * @author Redned
 */
public interface RaceTriggerManager {

    /**
     * Runs the triggers for the given trigger string
     *
     * @param player the player to run the trigger(s) for
     * @param trigger the trigger string
     */
    void runTriggers(Player player, String trigger);

    /**
     * Runs the task triggers for the given trigger string and tick
     *
     * @param player the player to run the trigger(s) for
     * @param trigger the trigger string
     * @param ticks the amount of ticks
     */
    void runTaskTriggers(Player player, String trigger, int ticks);

    /**
     * Returns a collection of the triggers that can
     * run from the config of the player's active race.
     *
     * @param player the player to check triggers for
     * @param trigger the trigger to check
     * @return a collection of triggers that can run
     */
    Collection<RaceTrigger> getApplicableTriggers(Player player, String trigger);

    /**
     * Returns a collection of applicable task triggers
     *
     * @param player the player to check task triggers for
     * @return a collection of triggers that can run
     */
    Collection<RaceTrigger> getApplicableTaskTriggers(Player player);

    /**
     * Runs the trigger passives for the given trigger
     *
     * @param player the player to run the passives for
     * @param trigger the trigger to receive the passives from
     */
    void runTriggerPassives(Player player, RaceTrigger trigger);

    /**
     * Runs the trigger passives from the given string list
     *
     * @param player the player to run the passives for
     * @param passives a string list of the trigger passives
     */
    void runTriggerPassives(Player player, List<String> passives);
    /**
     * Returns if the specified trigger is on delay
     *
     * @param player the player to check the delay for
     * @param trigger the trigger to check the delay for
     * @return if the specified trigger is on delay
     */
    boolean hasDelay(Player player, String trigger);

    /**
     * Sets the active delay for the specified trigger
     *
     * @param player the player to set the delay for
     * @param trigger the trigger to set the delay for
     * @param delay the delay
     */
    void setDelay(Player player, String trigger, int delay);
}
