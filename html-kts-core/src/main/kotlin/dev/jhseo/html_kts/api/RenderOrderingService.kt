package dev.jhseo.html_kts.api

interface RenderOrderingService {
    fun String.self(): RenderOrder

    infix fun String.with(to: String): RenderOrder

    infix fun RenderOrder.with(to: String): RenderOrder
}