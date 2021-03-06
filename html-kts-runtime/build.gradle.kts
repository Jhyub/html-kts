import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

group = "dev.jhseo"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(kotlin("scripting-jvm"))
    compileOnly(kotlin("scripting-jvm-host"))
    compileOnly(project(":html-kts-core"))
    compileOnly("io.ktor:ktor-server-core:1.6.1")
    compileOnly("org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.3")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
