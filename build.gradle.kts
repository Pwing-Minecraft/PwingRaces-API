plugins {
id("java")
    id("maven-publish")
}

group = "net.pwing.races.api"
version = "1.5.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/public/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.12.2-R0.1-SNAPSHOT")
}


publishing {
    publications {
        create<MavenPublication>("library") {
            from(components.getByName("java"))
        }
    }
}
