plugins {
    kotlin("jvm") version "1.8.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.8.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2") { exclude("org.junit.jupiter:junit-jupiter-api.assertions") }
    testImplementation("org.assertj:assertj-core:3.24.2")
}

java.sourceCompatibility = JavaVersion.VERSION_17

tasks.test {
    useJUnitPlatform()
}
