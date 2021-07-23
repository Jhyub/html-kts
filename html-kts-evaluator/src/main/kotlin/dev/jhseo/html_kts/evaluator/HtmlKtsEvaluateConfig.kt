package dev.jhseo.html_kts.evaluator

import io.ktor.request.*
import kotlinx.html.stream.createHTML
import kotlin.script.experimental.api.ScriptEvaluationConfiguration
import kotlin.script.experimental.api.implicitReceivers
import kotlin.script.experimental.api.providedProperties

class HtmlKtsEvaluateConfig(request: ApplicationRequest, data: Map<String, Any?>): ScriptEvaluationConfiguration(
    {
        implicitReceivers(createHTML())
        providedProperties("request" to request, "data" to data)
    }
)