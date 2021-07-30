package dev.jhseo.html_kts.integration.ktor

import dev.jhseo.html_kts.api.RenderOrder
import io.ktor.application.*
import io.ktor.http.*

suspend fun ApplicationCall.respondHtmlKts(status: HttpStatusCode = HttpStatusCode.OK, renderOrder: RenderOrder, data: Map<String, Any?> = emptyMap()) {

}