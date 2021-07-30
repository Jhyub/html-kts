package dev.jhseo.html_kts.evaluator

import dev.jhseo.html_kts.api.HtmlTagConsumerService
import dev.jhseo.html_kts.api.TemplatingService
import kotlin.script.experimental.api.CompiledScript
import kotlin.script.experimental.jvm.BasicJvmScriptEvaluator

suspend fun BasicJvmScriptEvaluator.evaluate(compiledScript: CompiledScript, templating: TemplatingService, consumer: HtmlTagConsumerService) {
    invoke(compiledScript, HtmlKtsEvaluateConfig(templating, consumer))
}