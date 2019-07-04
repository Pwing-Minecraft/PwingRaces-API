package net.pwing.races.api.race.attribute;

import org.bukkit.entity.Player;

/**
 * RaceAttributeEffect API implementation
 *
 * @author Redned
 */
public abstract class RaceAttributeEffect {

    protected String name;

    /**
     * Constructs a new RaceAttributeEffect object
     *
     * @param name the name of the attribute effect
     */
    public RaceAttributeEffect(String name) {
        this.name = name;
    }

    /**
     * Runs the attribute effect for applying the attribute
     *
     * @param player the player to apply the attribute effect to
     * @param amount the amount to set the attribute effect to
     */
    public abstract void onAttributeApply(Player player, double amount);

    /**
     * Runs when the attribute is 'lost' or taken away.
     * Usually called when the player changes races, or
     * goes into a world where races are not allowed.
     *
     * @param player the player to remove the attribute effect from
     */
    public abstract void onAttributeLose(Player player);

    /**
     * Returns the name of the attribute effect
     *
     * @return the name of the attribute effect
     */
    public String getName() {
        return name;
    }
}
