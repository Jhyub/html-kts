package dev.jhseo.html_kts.impl

import dev.jhseo.html_kts.api.RenderOrder
import dev.jhseo.html_kts.api.RenderOrderingService
import dev.jhseo.html_kts.api.ScriptDataService
import dev.jhseo.html_kts.api.TemplatingService
import kotlinx.html.Tag

class TemplatingServiceImpl(scriptDataService: ScriptDataService):
    TemplatingService,
    RenderOrderingService by RenderOrderImpl.Companion,
    ScriptDataService by scriptDataService {
    override fun <T : Tag> T.yield(id: String?) {
        TODO("Not yet implemented")
    }

    override fun <T : Tag> Tag.contentFor(id: String, body: T.() -> Unit) {
        TODO("Not yet implemented")
    }

    override fun Tag.render(renderOrder: RenderOrder, data: Map<String, Any?>) {
        TODO("Not yet implemented")
    }
}