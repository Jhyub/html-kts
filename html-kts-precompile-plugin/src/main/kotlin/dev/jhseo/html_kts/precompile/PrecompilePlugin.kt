package dev.jhseo.html_kts.precompile

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginConvention
import org.gradle.api.tasks.SourceSet

class PrecompilePlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.task("compileHtmlKts") {
            val javaPlugin = target.convention.getPlugin(JavaPluginConvention::class.java)
            val mainSourceSet = javaPlugin.sourceSets.getByName(SourceSet.MAIN_SOURCE_SET_NAME)
            val resources = mainSourceSet.resources
            resources.srcDirs.forEach {
                println(it.path)
            }
        }
    }
}