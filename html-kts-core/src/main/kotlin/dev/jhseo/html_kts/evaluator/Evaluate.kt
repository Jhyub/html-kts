package dev.jhseo.html_kts.evaluator

import dev.jhseo.html_kts.api.HtmlTagConsumerService
import dev.jhseo.html_kts.api.TemplatingService
import kotlin.script.experimental.api.CompiledScript
import kotlin.script.experimental.api.EvaluationResult
import kotlin.script.experimental.api.ScriptEvaluator
import kotlin.script.experimental.api.valueOrThrow

suspend fun ScriptEvaluator.evaluate(
    compiledScript: CompiledScript,
    templating: TemplatingService,
    consumer: HtmlTagConsumerService
): EvaluationResult {
    return invoke(compiledScript, HtmlKtsEvaluateConfig(templating, consumer)).valueOrThrow()
}