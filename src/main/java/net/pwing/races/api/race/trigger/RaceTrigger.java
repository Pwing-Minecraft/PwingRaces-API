package net.pwing.races.api.race.trigger;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import net.pwing.races.api.PwingRacesAPI;
import net.pwing.races.api.race.trigger.condition.RaceCondition;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.*;

/**
 * RaceTrigger API implementation
 *
 * @author Redned
 */
public class RaceTrigger {

    private String internalName;
    private String requirement;
    private String trigger;

    private int delay;
    private int chance;

    private Multimap<String, RaceTriggerPassive> passives;
    private Multimap<String, RaceCondition> conditions;

    /**
     * Constructs a new RaceTrigger object
     *
     * @param internalName the internal name of the race trigger
     * @param configPath the path to load the trigger from
     * @param config the config to load the trigger from
     * @param requirement the trigger requirement (e.g. none, level requirement or skillpoint)
     */
    public RaceTrigger(String internalName, String configPath, FileConfiguration config, String requirement) {
        this.internalName = internalName;
        this.requirement = requirement;

        loadDataFromConfig(configPath, config);
    }

    /**
     * Loads the trigger from the config
     *
     * @param configPath the path to load the trigger from
     * @param config the config to load the trigger from
     */
    private void loadDataFromConfig(String configPath, FileConfiguration config) {
        this.trigger = config.getString(configPath + ".trigger");
        this.delay = config.getInt(configPath + ".delay");
        this.chance = config.getInt(configPath + ".chance", 100);

        this.passives = ArrayListMultimap.create();
        for (String passive : config.getStringList(configPath + ".run-passives")) {
            String passiveName = passive.split(" ")[0];
            if (PwingRacesAPI.getTriggerManager().getTriggerPassives().containsKey(passiveName)) {
                this.passives.put(passive, PwingRacesAPI.getTriggerManager().getTriggerPassives().get(passiveName));
            }
        }

        this.conditions = ArrayListMultimap.create();
        for (String condition : config.getStringList(configPath + ".conditions")) {
            String conditionName = condition.split(" ")[0];
            if (PwingRacesAPI.getTriggerManager().getConditions().containsKey(conditionName)) {
                this.conditions.put(condition, PwingRacesAPI.getTriggerManager().getConditions().get(conditionName));
            }
        }
    }

    /**
     * Returns the internal (config) name of the trigger
     *
     * @return the internal (config) name of the trigger
     */
    public String getInternalName() {
        return internalName;
    }

    /**
     * Sets the internal (config) name of the trigger
     *
     * @param internalName the internal (config) name of the trigger
     */
    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    /**
     * Returns the requirement for the trigger
     * (e.g. none, level requirement or skillpoint requirement)
     *
     * @return the requirement for the trigger
     */
    public String getRequirement() {
        return requirement;
    }

    /**
     * Sets the requirement for the trigger
     *
     * @param requirement the requirement for the trigger
     */
    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    /**
     * Returns the full trigger string
     *
     * @return the full trigger string
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the full trigger string
     *
     * @param trigger the full trigger string
     */
    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    /**
     * Returns the delay of the trigger
     *
     * @return the delay of the trigger
     */
    public int getDelay() {
        return delay;
    }

    /**
     * Sets the delay for the trigger
     *
     * @param delay the delay of the trigger
     */
    public void setDelay(int delay) {
        this.delay = delay;
    }

    /**
     * Returns the chance this trigger has to run
     *
     * @return the chance this trigger has to run
     */
    public int getChance() {
        return chance;
    }

    /**
     * Sets the chance that this trigger will run
     *
     * @param chance the chance that this trigger will run
     */
    public void setChance(int chance) {
        this.chance = chance;
    }

    /**
     * Returns the trigger passives
     *
     * @return the trigger passives
     */
    public Collection<RaceTriggerPassive> getPassives() {
        return Collections.unmodifiableCollection(passives.values());
    }

    /**
     * Returns the passive (string) value from the given
     * {@link RaceTriggerPassive}
     *
     * @param passive the trigger passive
     * @return the passive value from the given trigger passive
     */
    public Optional<String> getPassiveValue(RaceTriggerPassive passive) {
        for (Map.Entry<String, RaceTriggerPassive> entry : passives.entries()) {
            if (entry.getValue().equals(passive))
                return Optional.of(entry.getKey());
        }
        return Optional.empty();
    }

    /**
     * Returns the conditions of the trigger
     *
     * @return the conditions of the trigger
     */
    public Collection<RaceCondition> getConditions() {
        return Collections.unmodifiableCollection(conditions.values());
    }

    /**
     * Returns the condition (string) value from the given
     * {@link RaceCondition}
     *
     * @param condition the condition
     * @return the condition value from the given condition
     */
    public Optional<String> getConditionValue(RaceCondition condition) {
        for (Map.Entry<String, RaceCondition> entry : conditions.entries()) {
            if (entry.getValue().equals(condition))
                return Optional.of(entry.getKey());
        }
        return Optional.empty();
    }
}