package dev.jhseo.html_kts.api

import dev.jhseo.html_kts.HtmlKtsBase
import kotlinx.html.Tag

interface TemplatingService: ScriptDataService {
    suspend fun <T: Tag> T.yield(id: String? = null)

    fun <T: Tag> HtmlKtsBase.contentFor(id: String, body: T.()->Unit)

    fun Tag.render(renderSet: RenderSet, refineData: (Map<String, Any?>)->Map<String, Any?>)
}