package dev.jhseo.html_kts.impl

import dev.jhseo.html_kts.api.HtmlKtsScriptReceiver
import dev.jhseo.html_kts.api.RenderOrder
import dev.jhseo.html_kts.api.RenderOrderFactory
import io.ktor.request.ApplicationRequest
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.stream.createHTML

class HtmlKtsScriptReceiverImpl(
    override val request: ApplicationRequest,
    override val data: Map<String, Any?>
    ): HtmlKtsScriptReceiver, TagConsumer<String> by createHTML(), RenderOrderFactory by RenderOrderImpl {
    override fun Tag.yield(id: String?) {
        TODO("Not yet implemented")
    }

    override fun <T : Tag> T.contentFor(id: String, block: T.() -> Unit) {
        TODO("Not yet implemented")
    }

    override fun Tag.render(renderOrder: RenderOrder, data: Map<String, Any?>) {
        TODO("Not yet implemented")
    }
}