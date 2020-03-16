package net.pwing.races.api.module;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * RaceModule API implementation. For creating modules,
 * just extend this class.
 *
 * @author Redned
 */
public abstract class RaceModule {

    protected Plugin plugin;

    protected boolean enabled = false;

    protected String name;
    protected String version;
    protected String author;

    protected FileConfiguration config;

    /**
     * Sets up the config file for the module
     */
    public void setupModuleConfig() {
        try {
            Path moduleDir = Paths.get(plugin.getDataFolder().toString(), "modules", getName());
            if (Files.notExists(moduleDir)) {
                Files.createDirectories(moduleDir);
            }
            Path modulePath = Paths.get(moduleDir.toString(), getName() + "Config.yml");
            if (Files.notExists(modulePath)) {
                Files.createFile(modulePath);
            }
            config = YamlConfiguration.loadConfiguration(Files.newBufferedReader(modulePath));
        } catch (IOException e) {
            plugin.getLogger().severe("Could not create " + getName() + "Config.yml !!!");
            e.printStackTrace();
        }
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

