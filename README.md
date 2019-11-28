![PwingRaces](https://i.imgur.com/rPz6bf3.png)

Pwing Races API
==
This repository serves as a public API for those wanting to create addons or hooks to Pwing Races without having to purchase the plugin. 
On its own, this API will not do anything for you, so attempting to compile and run this as a plugin won't get you very far.

How to Use:
===
The API for PwingRaces is quite expansive, and there is a lot to cover. 
Because of this, most of the information can be found in the [PwingRaces API Wiki](https://github.com/Pwing-Minecraft/PwingRaces-API/wiki). However, a basic rundown is given below.

The bulk of the PwingRaces API is broken down into 8 different managers listed below.

* RaceManager
  * RaceAbilityManager
  * RaceAttributeManager
  * RaceLevelManager
  * RacePermissionManager
  * RaceSkilltreeManager
  * RaceTriggerManager
  
* RaceModuleManager

If you want to access these managers, the class you will want to use is the [`PwingRacesAPI`](https://github.com/Pwing-Minecraft/PwingRaces-API/blob/master/src/main/java/net/pwing/races/api/PwingRacesAPI.java) class.
Take a look inside the repository to view what each method does.

### Code Example:
```java
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        RaceManager raceManager = PwingRacesAPI.getRaceManager();
        RacePlayer racePlayer = raceManager.getRacePlayer(player);
        player.sendMessage("Your active race is currently: " + racePlayer.getRace().getName());
    }
```

### Creating Abilities
View the [Creating Abilities](https://github.com/Pwing-Minecraft/PwingRaces-API/wiki/Creating-Abilities) page on the wiki.

### Calling Triggers and Creating Trigger Passives
View the [Manipulating Triggers](https://github.com/Pwing-Minecraft/PwingRaces-API/wiki/Creating-Abilities) page on the wiki.

### Creating Custom Attributes
View the [Creating Custom Attributes](https://github.com/Pwing-Minecraft/PwingRaces-API/wiki/Creating-Custom-Attributes) page on the wiki.

How to Import:
===

### Maven:

Add the repository:
```xml
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
```

Add the dependency:
```xml
    <dependency>
        <groupId>com.github.Pwing-Minecraft</groupId>
        <artifactId>PwingRaces-API</artifactId>
        <version>-SNAPSHOT</version>
        <scope>provided</scope>
    </dependency>
```

### Gradle:

Add the repository:
```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

Add the dependency:
```gradle
  dependencies {
    implementation 'com.github.Pwing-Minecraft:PwingRaces-API:Tag'
  }
```
