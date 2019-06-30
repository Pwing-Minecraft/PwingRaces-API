![PwingRaces](https://i.imgur.com/rPz6bf3.png)

Pwing Races API
==
This repository serves as a public API for those wanting to create addons or hooks to Pwing Races without having to purchase the plugin. 
On its own, this API will not do anything for you, so attempting to compile and run this as a plugin won't get you very far.

**NOTE:** This API is not complete and still has a LONG way to go.

How to Use:
===

Coming soon...


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
