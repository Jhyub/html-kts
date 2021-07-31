import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    `java-gradle-plugin`
}

group = "dev.jhseo"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":html-kts-core"))
    implementation(kotlin("scripting-compiler"))
}

gradlePlugin {
    plugins {
        create("htmlKtsPrecompilePlugin") {
            id = "dev.jhseo.html_kts.precompile"
            implementationClass = "dev.jhseo.html_kts.precompile.PrecompilePlugin"
        }
    }
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}