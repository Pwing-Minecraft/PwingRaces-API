package net.pwing.races.api.module;

import java.util.Map;

/**
 * RaceModuleManager API implementation
 *
 * @author Redned
 */
public interface RaceModuleManager {

    /**
     * Enables the specified race module
     *
     * @param module the module to enable
     */
    void enableModule(RaceModule module);

    /**
     * Disables the specified race module
     *
     * @param module the module to disable
     */
    void disableModule(RaceModule module);

    /**
     * Returns a map of the loaded race modules
     *
     * Key: the name of the module
     * Value: the module object
     *
     * @return a map of the loaded race modules
     */
    Map<String, RaceModule> getModules();
}
