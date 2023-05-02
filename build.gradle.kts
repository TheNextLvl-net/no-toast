import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("net.minecrell.plugin-yml.bukkit") version "0.5.1"
}

group = "net.thenextlvl.toast"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://repo.codemc.io/repository/maven-snapshots/")
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.19.3-R0.1-SNAPSHOT")
    implementation("com.github.retrooper.packetevents:spigot:2.0.0-20230424.152514-183")
}


tasks {
    shadowJar {
        minimize()
    }
}

bukkit {
    name = "NoToast"
    main = "net.thenextlvl.toast.NoToast"
    apiVersion = "1.19"
    load = BukkitPluginDescription.PluginLoadOrder.POSTWORLD
    website = "https://thenextlvl.net"
    authors = listOf("NonSwag")
}