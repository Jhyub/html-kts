package dev.jhseo.html_kts.compiler

import io.ktor.request.*
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.full.createType
import kotlin.script.experimental.api.*
import kotlin.script.experimental.jvm.dependenciesFromCurrentContext
import kotlin.script.experimental.jvm.jvm

object HtmlKtsCompileConfig : ScriptCompilationConfiguration(
    {
        defaultImports("kotlinx.html.*")
        implicitReceivers(
            kotlinx.html.TagConsumer::class
                .createType(listOf(KTypeProjection(KVariance.INVARIANT, String::class.createType())))
        )
        providedProperties(
            "request" to ApplicationRequest::class.createType(),
            "data" to Map::class.createType(
                listOf(
                    KTypeProjection(KVariance.INVARIANT, String::class.createType()),
                    KTypeProjection(KVariance.INVARIANT, Any::class.createType(nullable = true))
                )
            )
        )
        jvm {
            dependenciesFromCurrentContext("kotlinx-html-jvm")
        }
        ide {
            acceptedLocations(ScriptAcceptedLocation.Sources)
        }
    }
)