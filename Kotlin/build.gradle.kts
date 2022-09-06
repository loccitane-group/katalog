plugins {
    kotlin("jvm") version "1.7.10"
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.7.10")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.7.10")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testImplementation("org.assertj:assertj-core:3.23.1")
}

java.sourceCompatibility = JavaVersion.VERSION_17

tasks.test {
    useJUnitPlatform()
}
