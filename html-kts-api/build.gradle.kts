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
    compileOnly(project(":html-kts-compiler"))
    compileOnly(project(":html-kts-evaluator"))
    compileOnly(kotlin("reflect")) // For compiler users only
    implementation(kotlin("scripting-jvm"))
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.3")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
