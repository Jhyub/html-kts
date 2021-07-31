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
    implementation(kotlin("scripting-jvm"))
    implementation(kotlin("scripting-jvm-host"))
    compileOnly(kotlin("scripting-compiler"))
    implementation(kotlin("reflect"))

    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.3")
    compileOnly("io.ktor:ktor-server-core:1.6.1")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
