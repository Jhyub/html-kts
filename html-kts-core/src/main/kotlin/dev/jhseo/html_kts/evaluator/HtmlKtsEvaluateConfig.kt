package dev.jhseo.html_kts.evaluator

import dev.jhseo.html_kts.api.HtmlTagConsumerService
import dev.jhseo.html_kts.api.TemplatingService
import kotlin.script.experimental.api.ScriptEvaluationConfiguration
import kotlin.script.experimental.api.implicitReceivers


class HtmlKtsEvaluateConfig(private val templating: TemplatingService, private val consumer: HtmlTagConsumerService) : ScriptEvaluationConfiguration(
    {
        implicitReceivers(consumer, templating)
    }
)