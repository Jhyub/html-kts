package dev.jhseo.html_kts.impl

import dev.jhseo.html_kts.api.RenderOrder
import dev.jhseo.html_kts.api.RenderOrderingService

class RenderOrderImpl(override val renderOrder: List<String>): RenderOrder {
    companion object : RenderOrderingService {
        override fun String.self(): RenderOrder {
            return RenderOrderImpl(listOf(this@self))
        }

        override fun String.with(to: String): RenderOrder {
            return RenderOrderImpl(listOf(to, this@with))
        }

        override fun RenderOrder.with(to: String): RenderOrder {
            return RenderOrderImpl(listOf(to, *this@with.renderOrder.toTypedArray()))
        }
    }
}