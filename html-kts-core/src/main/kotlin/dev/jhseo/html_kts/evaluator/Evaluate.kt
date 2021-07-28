package dev.jhseo.html_kts.evaluator

import dev.jhseo.html_kts.api.HtmlKtsScriptReceiver
import kotlin.script.experimental.api.CompiledScript
import kotlin.script.experimental.jvm.BasicJvmScriptEvaluator

suspend fun BasicJvmScriptEvaluator.evaluate(compiledScript: CompiledScript, receiver: HtmlKtsScriptReceiver) {
    invoke(compiledScript, HtmlKtsEvaluateConfig(receiver))
}