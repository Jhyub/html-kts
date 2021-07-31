package dev.jhseo.html_kts

import dev.jhseo.html_kts.compiler.HtmlKtsCompileConfig
import dev.jhseo.html_kts.evaluator.HtmlKtsEvaluateConfig
import kotlinx.html.Tag
import kotlin.script.experimental.annotations.KotlinScript
import kotlin.reflect.KFunction1

@KotlinScript(
    displayName = "html.kts script",
    fileExtension = "html.kts",
    compilationConfiguration = HtmlKtsCompileConfig::class,
    evaluationConfiguration = HtmlKtsEvaluateConfig::class,
)
abstract class HtmlKtsBase {
    val contents: MutableMap<String, Tag.()->Unit> = mutableMapOf()
}