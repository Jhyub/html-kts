package dev.jhseo.html_kts.compiler

import kotlin.script.experimental.api.ResultWithDiagnostics
import kotlin.script.experimental.api.SourceCode
import kotlin.script.experimental.api.onSuccess
import kotlin.script.experimental.api.valueOrNull
import kotlin.script.experimental.jvm.defaultJvmScriptingHostConfiguration
import kotlin.script.experimental.jvm.impl.KJvmCompiledScript
import kotlin.script.experimental.jvmhost.JvmScriptCompiler

suspend fun compile(script: SourceCode) {
    val compiler = JvmScriptCompiler(defaultJvmScriptingHostConfiguration)
    val compileResult = compiler(script, HtmlKtsCompileConfig)
    val jvmCompiledScript = compileResult.valueOrNull() as? KJvmCompiledScript
    // Serialize jvmCompiledScript (which is serializable) and save to file / run file from evaluator
}