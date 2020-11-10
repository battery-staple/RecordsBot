import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "com.rohengiralt"
version = "0.0.1"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.jessecorbett:diskord:1.7.3")
    implementation("org.slf4j:slf4j-simple:1.6.1")
    implementation("com.uchuhimo:konf:0.23.0")
    testImplementation(kotlin("test-testng"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}