package dev.jhseo.html_kts

import dev.jhseo.html_kts.compiler.compile
import java.io.File
import java.lang.IllegalArgumentException
import kotlin.script.experimental.host.toScriptSource
import kotlin.script.experimental.jvm.impl.KJvmCompiledScript
import kotlin.script.experimental.jvmhost.JvmScriptCompiler

fun findCompiledScript(name: String): KJvmCompiledScript? {
    val source = {}::class.java.getResource("/html/$name.html.kts.compiled")
    val sourceFile = source?.let { File(it.toURI()) }
    return sourceFile?.let { KJvmCompiledScript.fromFile(it) }
}

suspend fun JvmScriptCompiler.findAndCompileRawScript(name: String): KJvmCompiledScript? {
    val source = {}::class.java.getResource("/html/$name.html.kts")
    val sourceFile = source?.let { File(it.toURI()) }
    return sourceFile?.toScriptSource()?.let { this@findAndCompileRawScript.compile(it) }
}