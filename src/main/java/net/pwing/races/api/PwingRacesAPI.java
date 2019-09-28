package net.pwing.races.api;

import net.pwing.races.api.module.RaceModuleManager;
import net.pwing.races.api.race.RaceManager;
import net.pwing.races.api.race.ability.RaceAbilityManager;
import net.pwing.races.api.race.attribute.RaceAttributeManager;
import net.pwing.races.api.race.level.RaceLevelManager;
import net.pwing.races.api.race.permission.RacePermissionManager;
import net.pwing.races.api.race.skilltree.RaceSkilltreeManager;
import net.pwing.races.api.race.trigger.RaceTriggerManager;

/**
 * Main class for the PwingRaces API
 *
 * @author Redned
 */
public class PwingRacesAPI {

    private static RaceManager raceManager;
    private static RaceModuleManager moduleManager;

    /**
     * Returns the race manager
     *
     * @return the race manager
     */
    public static RaceManager getRaceManager() {
        return raceManager;
    }

    /**
     * Sets the race manager, called on server startup
     *
     * @param raceManager the race manager
     */
    public static void setRaceManager(RaceManager raceManager) {
        if (PwingRacesAPI.raceManager != null) {
            throw new UnsupportedOperationException("Cannot redefine singleton RaceManager!");
        }

        PwingRacesAPI.raceManager = raceManager;
    }

    /**
     * Returns the module manager
     *
     * @return the module manager
     */
    public static RaceModuleManager getModuleManager() {
        return moduleManager;
    }

    /**
     * Sets the module manager, called on server startup
     *
     * @param moduleManager the module manager
     */
    public static void setModuleManager(RaceModuleManager moduleManager) {
        if (PwingRacesAPI.moduleManager != null) {
            throw new UnsupportedOperationException("Cannot redefine singleton RaceModuleManager!");
        }

        PwingRacesAPI.moduleManager = moduleManager;
    }

    /**
     * Returns the ability manager
     *
     * @return the ability manager
     */
    public static RaceAbilityManager getAbilityManager() {
        return raceManager.getAbilityManager();
    }

    /**
     * Returns the attribute manager
     *
     * @return the attribute manager
     */
    public static RaceAttributeManager getAttributeManager() {
        return raceManager.getAttributeManager();
    }

    /**
     * Returns the level manager
     *
     * @return the level manager
     */
    public static RaceLevelManager getLevelManager() {
        return raceManager.getLevelManager();
    }

    /**
     * Returns the permission manager
     *
     * @return the permission manager
     */
    public static RacePermissionManager getPermissionManager() {
        return raceManager.getPermissionManager();
    }

    /**
     * Returns the skilltree manager
     *
     * @return the skilltree manager
     */
    public static RaceSkilltreeManager getSkilltreeManager() {
        return raceManager.getSkilltreeManager();
    }

    /**
     * Returns the trigger manager
     *
     * @return the trigger manager
     */
    public static RaceTriggerManager getTriggerManager() {
        return raceManager.getTriggerManager();
    }
}