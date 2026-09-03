plugins {
    id("java-library")
    id("maven-publish")
}

group = "dev.cordor"
version = "1.0.2"

publishing {
    publications {
        create<MavenPublication>("craftColoursLibrary") {
            from(components["java"])
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/cordor/CraftColours")
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}