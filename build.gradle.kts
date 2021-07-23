import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.21"
}

group = "dev.jhseo"
version = "0.1.0"



tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}