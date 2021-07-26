package dev.jhseo.html_kts

import java.io.*
import kotlin.script.experimental.jvm.impl.KJvmCompiledScript

internal fun KJvmCompiledScript.serializeToFile(file: File) {
    val baos = ByteArrayOutputStream()
    val oos = ObjectOutputStream(baos)
    oos.writeObject(this)
    val serialized = baos.toByteArray()

    if (!file.exists()) file.createNewFile()
    FileOutputStream(file).run {
        write(serialized)
        close()
    }
    oos.close()
    baos.close()
}

internal fun KJvmCompiledScript.Companion.fromFile(file: File): KJvmCompiledScript {
    val fis = FileInputStream(file)
    val bais = ByteArrayInputStream(fis.readBytes())
    val ois = ObjectInputStream(bais)
    val result = ois.readObject() as KJvmCompiledScript
    ois.close()
    bais.close()
    fis.close()
    return result
}