package dev.jhseo.html_kts.api

import kotlinx.html.Tag

interface TemplatingService: RenderOrderingService, ScriptDataService {
    fun <T: Tag> T.yield(id: String? = null)

    fun <T: Tag> Tag.contentFor(id: String, body: T.()->Unit)

    fun Tag.render(renderOrder: RenderOrder, data: Map<String, Any?> = emptyMap())
}