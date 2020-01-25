package net.pwing.races.api.race.trigger;

import net.pwing.races.api.race.trigger.condition.RaceCondition;

import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * RaceTriggerManager API implementation
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
     * This method does nothing, so running it is pointless
     *
     * @deprecated use {@link #runTriggerPassives(Player, RaceTrigger)};
     */
    @Deprecated
    default void runTriggerPassives(Player player, List<RaceTriggerPassive> passives) {
    }

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

    /**
     * Returns a map of all the registered trigger
     * conditions with key being the name of the
     * condition
     *
     * Key: the name of the condition
     * Value: the condition
     *
     * @return a map of all the registered trigger conditions
     */
    Map<String, RaceCondition> getConditions();

    /**
     * Returns a map of the trigger passives with the key
     * being the name of the trigger passive
     *
     * Key: the name of the trigger passive
     * Value: the trigger passive
     *
     * @return a map of the trigger passives
     */
    Map<String, RaceTriggerPassive> getTriggerPassives();
}
