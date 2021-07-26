package dev.jhseo.html_kts.evaluator

import dev.jhseo.html_kts.HtmlKtsScriptReceiver
import kotlin.script.experimental.api.ScriptEvaluationConfiguration
import kotlin.script.experimental.api.implicitReceivers

class HtmlKtsEvaluateConfig(receiver: HtmlKtsScriptReceiver) : ScriptEvaluationConfiguration(
    {
        implicitReceivers(receiver)
    }
)