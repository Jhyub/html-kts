package dev.jhseo.html_kts.api

import io.ktor.request.*
import kotlinx.html.Tag
import kotlinx.html.TagConsumer

interface HtmlKtsScriptReceiver: TagConsumer<String>, RenderOrderFactory {
    val request: ApplicationRequest
    val data: Map<String, Any?>

    fun Tag.yield(id: String? = null)

    fun <T: Tag> T.contentFor(id: String, block: T.() -> Unit)

    fun Tag.render(renderOrder: RenderOrder, data: Map<String, Any?> = emptyMap())
}