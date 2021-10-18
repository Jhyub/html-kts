package dev.jhseo.html_kts.dsl

import dev.jhseo.html_kts.api.RenderSet

class HtmlKtsComponent(override val fileName: String, internal var children: MutableMap<String?, DslComponent>): DslComponent, RenderSet {
    override fun getFileNames(): Set<String> {
        return getTree().map { it.third }.toSet()
    }

    override fun getTree(): List<Triple<Int?, String?, String>> {
        val ret = mutableListOf<Triple<Int?, String?, String>>()

        fun recurse(parent: Int?, renderKeyword: String?, comp: DslComponent) {
            ret.add(Triple(parent, renderKeyword, comp.fileName))
            val idx = ret.size - 1
            if(comp is HtmlKtsComponent) {
                comp.children.forEach { (keyword, comp) ->
                    recurse(idx, keyword, comp)
                }
            }
        }

        recurse(null, null,this)

        return ret
    }
}