package dev.jhseo.html_kts.compiler

import kotlin.script.experimental.api.SourceCode
import kotlin.script.experimental.api.valueOrNull
import kotlin.script.experimental.jvm.impl.KJvmCompiledScript
import kotlin.script.experimental.jvmhost.JvmScriptCompiler

suspend fun JvmScriptCompiler.compile(script: SourceCode): KJvmCompiledScript {
    val compileResult = invoke(script, HtmlKtsCompileConfig)
    return compileResult.valueOrNull() as? KJvmCompiledScript ?: throw IllegalArgumentException("Script ${script.name} compilation failed")
}