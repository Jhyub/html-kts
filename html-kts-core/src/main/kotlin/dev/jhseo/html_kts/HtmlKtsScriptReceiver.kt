package dev.jhseo.html_kts

import io.ktor.request.*
import kotlinx.html.TagConsumer
import kotlinx.html.stream.createHTML

class HtmlKtsScriptReceiver(val request: ApplicationRequest?, val data: Map<String, Any?>): TagConsumer<String> by createHTML() {
}