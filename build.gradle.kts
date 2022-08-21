buildscript {
    repositories {
        var bearerToken = System.getenv("LABYMOD_BEARER_TOKEN")

        if (bearerToken == null && project.hasProperty("net.labymod.distributor.bearer-token")) {
            bearerToken = project.property("net.labymod.distributor.bearer-token").toString()
        }

        maven("https://dist.labymod.net/api/v1/maven/release/") {
            name = "LabyMod Distributor"

            authentication {
                create<HttpHeaderAuthentication>("header")
            }

            credentials(HttpHeaderCredentials::class) {
                name = "Authorization"
                value = "Bearer $bearerToken"
            }
        }


        maven("https://repo.spongepowered.org/repository/maven-public") {
            name = "SpongePowered Repository"
        }

        mavenLocal()
    }

    dependencies {
        classpath("net.labymod.gradle", "addon", "0.2.42")
    }
}

plugins {
    id("java-library")
}

group = "com.github.l3nnartt.timoliaaddon"
version = "0.0.1"

plugins.apply("net.labymod.gradle.addon")

java.toolchain.languageVersion.set(JavaLanguageVersion.of(17))

subprojects {
    plugins.apply("java-library")
    plugins.apply("net.labymod.gradle.addon")

    repositories {
        maven("https://libraries.minecraft.net/")
        maven("https://repo.spongepowered.org/repository/maven-public/")
        mavenLocal()
    }

    tasks.compileJava {
        options.encoding = "UTF-8"
    }
}

addon {
    addonInfo {
        namespace("timolia")
        displayName("Timolia")
        author("L3nnart_")
        description("This Addon adds some Server Support Features for Timolia.de")
        version(System.getenv().getOrDefault("VERSION", "0.0.1"))
        iconUrl("https://dl.lennartloesche.de/timolia/logo.png", project(":core"))

        //you can add maven dependencies here. the dependencies will then be downloaded by labymod.
        //mavenDependencies().add(MavenDependency("https://repo.maven.apache.org/maven2/", "com.google.guava:guava:31.1-jre"))
    }
    
    internalRelease()
}
