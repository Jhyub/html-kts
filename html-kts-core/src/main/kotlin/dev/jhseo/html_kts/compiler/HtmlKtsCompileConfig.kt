package dev.jhseo.html_kts.compiler

import kotlin.script.experimental.api.*
import kotlin.script.experimental.jvm.dependenciesFromCurrentContext
import kotlin.script.experimental.jvm.jvm

object HtmlKtsCompileConfig : ScriptCompilationConfiguration(
    {
        defaultImports("kotlinx.html.*")
        implicitReceivers(
            KotlinType(dev.jhseo.html_kts.HtmlKtsScriptReceiver::class)
        )
        jvm {
            dependenciesFromCurrentContext("html-kts-core", "kotlinx-html-jvm", "ktor-server-core-jvm")
        }
        ide {
            acceptedLocations(ScriptAcceptedLocation.Sources)
        }
    }
)