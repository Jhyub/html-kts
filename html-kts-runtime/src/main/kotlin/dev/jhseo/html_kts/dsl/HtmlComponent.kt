package dev.jhseo.html_kts.dsl

import dev.jhseo.html_kts.api.RenderSet

class HtmlComponent(override val fileName: String): DslComponent, RenderSet {
    override fun getFileNames(): Set<String> {
        return setOf(fileName)
    }

    override fun getTree(): List<Triple<Int?, String?, String>> {
        return listOf(Triple(null, null, fileName))
    }
}