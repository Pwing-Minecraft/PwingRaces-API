package net.pwing.races.api.race.trigger.condition;

import org.bukkit.entity.Player;

/**
 * RaceCondition API implementation
 *
 * @author Redned
 */
public interface RaceCondition {

    /**
     * Checks if the condition is able to be ran
     *
     * @param player the player to check
     * @param args the arguments of the condition
     *
     * @return if the condition is able to be ran
     */
    boolean check(Player player, String[] args);
}
