package dev.jhseo.html_kts.evaluator

import dev.jhseo.html_kts.HtmlKtsScriptReceiver
import kotlin.script.experimental.api.CompiledScript
import kotlin.script.experimental.jvm.BasicJvmScriptEvaluator

suspend fun evaluate(compiledScript: CompiledScript, receiver: HtmlKtsScriptReceiver) {
    val evaluator = BasicJvmScriptEvaluator()
    evaluator(compiledScript, HtmlKtsEvaluateConfig(receiver))
}