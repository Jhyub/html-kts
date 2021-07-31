package dev.jhseo.html_kts.api

import kotlinx.html.Tag

interface TemplatingService: RenderOrderingService, ScriptDataService {
    fun <T: Tag> T.yield(id: String? = null, refineData: (Map<String, Any?>)->Map<String, Any?>)

    fun <T: Tag> Tag.contentFor(id: String, body: T.()->Unit)

    fun Tag.render(renderOrder: RenderOrder, refineData: (Map<String, Any?>)->Map<String, Any?>)
}