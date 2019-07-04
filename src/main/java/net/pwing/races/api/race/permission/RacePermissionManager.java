package net.pwing.races.api.race.permission;

import java.util.Collection;

import org.bukkit.entity.Player;

/**
 * RacePermissionPermission API implementation
 *
 * @author Redned
 */
public interface RacePermissionManager {

    /**
     * Applies all the applicable permissions specified in a race to a player
     *
     * @param player the player to apply permissions to
     */
    void applyPermissions(Player player);

    /**
     * Returns a collection of the permissions the player can be
     * given/revoked from the config of the player's active race.
     *
     * @param player the player to get the permissions from
     * @return a collection of the permissions the player can be given/revoked
     */
    Collection<RacePermission> getApplicablePermissions(Player player);
}
