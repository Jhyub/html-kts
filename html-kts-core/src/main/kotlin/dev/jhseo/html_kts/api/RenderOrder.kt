package dev.jhseo.html_kts.api

interface RenderOrder {
    val renderOrder: List<String>
}

interface RenderOrderFactory {
    fun String.self(): RenderOrder

    infix fun String.with(to: String): RenderOrder

    infix fun RenderOrder.with(to: String): RenderOrder
}