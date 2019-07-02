package net.pwing.races.api.race.ability;

import net.pwing.races.api.race.Race;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.Collection;

/**
 * RaceAbilityManager API implementation
 *
 * @author Redned
 */
public interface RaceAbilityManager {

    /**
     * Loops through all the abilities and runs the abilities
     * that can be ran with met conditions (e.g. holding right item,
     * has it unlocked, has permission node, etc.)
     *
     * @param player the player to run the abilities for
     */
    void runAbilities(Player player);

    /**
     * Runs the ability for the player if they meet the proper conditions
     * (e.g. holding right item, has it unlocked, has permission node, etc.)
     *
     * @param player the player to run the ability for
     * @param ability the ability you want to run
     * @return if the ability ran properly
     */
    boolean runAbility(Player player, RaceAbility ability);

    /**
     * Returns a collection of the abilities the player can run.
     * Only checks for conditions from the config, so if the player
     * is holding a wrong item, it won't be taken into consideration
     * in this method.
     *
     * @param player the player to get the abilities from
     * @param race the race to get the abilities from
     * @return a collection of the abilities the player can run
     */
    Collection<RaceAbility> getApplicableAbilities(Player player, Race race);

    /**
     * Returns if the player has a cooldown with the
     * specified internal ability name
     *
     *
     * @param player the player to check
     * @param interalName the internal name of the ability to check
     * @return if the player has a cooldown
     */
    boolean hasCooldown(Player player, String interalName);

    /**
     * Returns the cooldown for the player with the specified
     * internal ability name
     *
     * @param player the player to check the cooldown for
     * @param internalName the internal name of the ability to check
     * @return the cooldown for the player
     */
    int getCooldown(Player player, String internalName);

    /**
     * Sets the cooldown for the player with the specified
     * internal ability name
     *
     * @param player the player to set the cooldown for
     * @param internalAbilityName the internal name of the ability to set the cooldown for
     * @param amount the amount to set the cooldown for
     */
    void setCooldown(Player player, String internalAbilityName, double amount);

    /**
     * Returns a new ability from a configuration file
     *
     * @param internalName the internal name of the ability
     * @param requirement the requirement for the ability
     * @param configPath the path to get the ability from
     * @param config the config file you want to get the ability from
     * @return a new ability from a configuration file
     */
    RaceAbility getAbility(String internalName, String requirement, String configPath, FileConfiguration config);
}
