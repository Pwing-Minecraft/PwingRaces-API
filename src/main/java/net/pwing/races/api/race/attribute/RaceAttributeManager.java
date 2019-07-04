package net.pwing.races.api.race.attribute;

import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.Map;

/**
 * RaceAttributeManager API implementation
 *
 * @author Redned
 */
public interface RaceAttributeManager {

    /**
     * Applies the attribute bonuses of the player's current
     * race to the player
     *
     * @param player the player to apply the attributes to
     */
    void applyAttributeBonuses(Player player);

    /**
     * Removes the attribute bonuses of the player's current
     * race to the player
     *
     * @param player the player to remove the attributes from
     */
    void removeAttributeBonuses(Player player);

    /**
     * Returns the attribute bonus for the specified attribute string
     *
     * @param player the player to get the bonus from
     * @param attribute the attribute to get the bonus of
     * @return the attribute bonus for the specified attribute string
     */
    double getAttributeBonus(Player player, String attribute);


    /**
     * Returns a collection of attributes that can be
     * applied from the config of the player's active race.
     *
     * @param player the player to get the attributes from
     * @return a collection of attributes that can be applied
     */
    Collection<RaceAttribute> getApplicableAttributes(Player player);

    /**
     * Returns the map of all the race attribute effects with
     * the key being the name of it
     *
     * Key: the attribute effect name
     * Value: the RaceAttributeEffect object
     *
     * @return the map of all the race attribute effects
     */
    Map<String, RaceAttributeEffect> getAttributeEffects();
}
