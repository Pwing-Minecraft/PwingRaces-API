package net.pwing.races.api.module;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

/**
 * RaceModule API implementation. For creating modules,
 * just extend this class.
 *
 * @author Redned
 */
public abstract class RaceModule {

    protected JavaPlugin plugin;

    protected boolean enabled = false;

    protected String name;
    protected String version;
    protected String author;

    protected FileConfiguration config;

    /**
     * Sets up the config file for the module
     */
    public void setupModuleConfig() {
        File filePath = new File(plugin.getDataFolder() + "/modules/" + getName() + "/");
        if (!filePath.exists())
            filePath.mkdirs();

        File file = new File(filePath,  getName() + "Config.yml");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                plugin.getLogger().severe("Could not create " + getName() + "Config.yml !!!");
                e.printStackTrace();
            }
        }

        config = YamlConfiguration.loadConfiguration(file);
    }

    /**
     * Returns if the module is enabled
     *
     * @return if the module is enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets if the module is enabled
     *
     * @param enabled if the module is enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Returns the name of the module
     *
     * @return the name of the module
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the version of the module
     *
     * @return the version of the module
     */
    public String getVersion() {
        return version;
    }

    /**
     * Reutns the author of the module
     *
     * @return the author of the module
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the module config
     *
     * @return the module config
     */
    public FileConfiguration getModuleConfig() {
        return config;
    }

    /**
     * Called when a module is enabled
     */
    public abstract void onEnable();

    /**
     * Called when a module is disabled
     */
    public abstract void onDisable();
}

