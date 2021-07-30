package dev.jhseo.html_kts.compiler

import dev.jhseo.html_kts.api.HtmlTagConsumerService
import dev.jhseo.html_kts.api.TemplatingService
import kotlin.script.experimental.api.*
import kotlin.script.experimental.jvm.dependenciesFromCurrentContext
import kotlin.script.experimental.jvm.jvm

object HtmlKtsCompileConfig : ScriptCompilationConfiguration(
    {
        defaultImports("kotlinx.html.*")
        implicitReceivers(
            HtmlTagConsumerService::class, TemplatingService::class
        )
        jvm {
            dependenciesFromCurrentContext("html-kts-core", "kotlinx-html-jvm", "ktor-server-core-jvm")
        }
        ide {
            acceptedLocations(ScriptAcceptedLocation.Sources)
        }
    }
)