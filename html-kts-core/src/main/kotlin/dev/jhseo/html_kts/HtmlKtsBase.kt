package dev.jhseo.html_kts

import dev.jhseo.html_kts.compiler.HtmlKtsCompileConfig
import dev.jhseo.html_kts.evaluator.HtmlKtsEvaluateConfig
import kotlin.script.experimental.annotations.KotlinScript

@KotlinScript(
    displayName = "html.kts script",
    fileExtension = "html.kts",
    compilationConfiguration = HtmlKtsCompileConfig::class,
    evaluationConfiguration = HtmlKtsEvaluateConfig::class,
)
abstract class HtmlKtsBase