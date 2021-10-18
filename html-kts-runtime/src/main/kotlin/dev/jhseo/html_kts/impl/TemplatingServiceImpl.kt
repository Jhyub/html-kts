package dev.jhseo.html_kts.impl


import dev.jhseo.html_kts.HtmlKtsBase
import dev.jhseo.html_kts.api.*
import kotlinx.html.Tag
import kotlin.script.experimental.api.ScriptEvaluator

class TemplatingServiceImpl(scriptDataService: ScriptDataService, private val evaluator: ScriptEvaluator):
    TemplatingService,
    ScriptDataService by scriptDataService {
    private var nextScript: HtmlKtsBase? = null

    override suspend fun <T : Tag> T.yield(id: String?) {
        TODO("Not yet implemented")
    }

    override fun <T: Tag> HtmlKtsBase.contentFor(id: String, body: T.() -> Unit) {
        TODO("Not yet implemented")
    }

    override fun Tag.render(renderSet: RenderSet, refineData: (Map<String, Any?>) -> Map<String, Any?>) {
        TODO("Not yet implemented")
    }
}