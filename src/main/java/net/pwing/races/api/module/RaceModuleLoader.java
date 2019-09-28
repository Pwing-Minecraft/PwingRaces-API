package net.pwing.races.api.module;

/**
 * RaceModuleLoader API implementation
 *
 * @author Redned
 */
public interface RaceModuleLoader {

    /**
     * Loads all the modules in the 'modules' directory
     */
    void loadModules();

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
}
