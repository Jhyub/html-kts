package dev.jhseo.html_kts.evaluator

import io.ktor.request.*
import kotlin.script.experimental.api.CompiledScript
import kotlin.script.experimental.jvm.BasicJvmScriptEvaluator

suspend fun evaluate(compiledScript: CompiledScript, request: ApplicationRequest, data: Map<String, Any?>) {
    val evaluator = BasicJvmScriptEvaluator()
    evaluator(compiledScript, HtmlKtsEvaluateConfig(request, data))
}