package dev.jhseo.html_kts.integration.ktor

import dev.jhseo.html_kts.api.RenderSet
import dev.jhseo.html_kts.dsl.RenderSetBuilder
import io.ktor.application.*
import io.ktor.http.*

suspend fun ApplicationCall.respondHtmlKts(status: HttpStatusCode = HttpStatusCode.OK, data: Map<String, Any?> = emptyMap(), renderSetLambda: RenderSetBuilder.()->RenderSet) {

}