package dev.jhseo.html_kts

import java.io.*
import kotlin.script.experimental.jvm.impl.KJvmCompiledScript

internal fun KJvmCompiledScript.serializeToFile(file: File) {
    val baos = ByteArrayOutputStream()
    val oos = ObjectOutputStream(baos)
    oos.writeObject(this)
    val serialized = baos.toByteArray()

    if (!file.exists()) file.createNewFile()
    FileOutputStream(file).write(serialized)
}

internal fun KJvmCompiledScript.Companion.fromFile(file: File): KJvmCompiledScript {
    val input = FileInputStream(file).readBytes()
    val bais = ByteArrayInputStream(input)
    val ois = ObjectInputStream(bais)
    return ois.readObject() as KJvmCompiledScript
}