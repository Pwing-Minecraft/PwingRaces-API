package net.pwing.races.api;

import net.pwing.races.api.race.RaceManager;

/**
 * Main class for the PwingRaces API
 *
 * @author Redned
 */
public class PwingRacesAPI {

    private static RaceManager raceManager;

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
}