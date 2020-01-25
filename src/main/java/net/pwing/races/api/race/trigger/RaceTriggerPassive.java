package net.pwing.races.api.race.trigger;

import org.bukkit.entity.Player;

/**
 * RaceTriggerManager API implementation
 *
 * @author Redned
 */
public abstract class RaceTriggerPassive {

    protected String name;

    public RaceTriggerPassive(String name) {
        this.name = name;
    }

    /**
     * Runs the trigger passive given the string.
     * Should not be called normally, instead use {@link #runPassive(Player, String)}
     *
     * @param player the player to run the trigger passive on
     * @param args the arguments
     */
    public void runTriggerPassive(Player player, String[] args) {
    }

    /**
     * @deprecated replaced with {@link #runTriggerPassive(Player, String[])};
     */
    @Deprecated
    public void runTriggerPassive(Player player, String str) {
        runTriggerPassive(player, str.split(" "));
    }

    /**
     * Safely runs the trigger passive given the string
     *
     * @param player the player to run the trigger passive on
     * @param str the config string
     */
    public void runPassive(Player player, String str) {
        String[] split = str.split(" ");

        if (!name.equalsIgnoreCase(split[0]))
            return;

        runTriggerPassive(player, split);
    }

    /**
     * Returns the name of the trigger passive
     *
     * @return the name of the trigger passive
     */
    public String getName() {
        return name;
    }
}