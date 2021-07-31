package dev.jhseo.html_kts.impl

import dev.jhseo.html_kts.api.RenderOrder
import dev.jhseo.html_kts.api.RenderOrderingService
import dev.jhseo.html_kts.impl.RenderOrderImpl.Companion.removeFirst

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

        internal fun RenderOrder.removeFirst(): RenderOrder {
            val removedList = renderOrder.toMutableList().apply { removeFirst() }
            return RenderOrderImpl(listOf(*removedList.toTypedArray()))
        }

        internal fun RenderOrder.isEmpty() = renderOrder.isEmpty()

        internal fun RenderOrder.getFirst(): String {
            return renderOrder.first()
        }
    }
}