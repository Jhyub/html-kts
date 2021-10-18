package dev.jhseo.html_kts.api

interface RenderSet {
    fun getFileNames(): Set<String>

    // Parent Index, Render Keyword, File Name
    fun getTree(): List<Triple<Int?, String?, String>>
}