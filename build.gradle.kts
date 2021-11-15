import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
    java
}

group = "com.github.ixre"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
//    implementation("org.apache.hive:hive-common:3.1.2")
    implementation("org.apache.hive:hive-service:3.1.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.31")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}