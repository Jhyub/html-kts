package dev.jhseo.html_kts.impl

import dev.jhseo.html_kts.HtmlKtsBase
import dev.jhseo.html_kts.api.*
import dev.jhseo.html_kts.evaluator.evaluate
import dev.jhseo.html_kts.findCompiledScript
import dev.jhseo.html_kts.impl.RenderOrderImpl.Companion.getFirst
import dev.jhseo.html_kts.impl.RenderOrderImpl.Companion.isEmpty
import dev.jhseo.html_kts.impl.RenderOrderImpl.Companion.removeFirst
import kotlinx.html.Tag
import kotlin.script.experimental.api.ScriptEvaluator

class TemplatingServiceImpl(scriptDataService: ScriptDataService, private val leftRenderOrder: RenderOrder, private val evaluator: ScriptEvaluator):
    TemplatingService,
    RenderOrderingService by RenderOrderImpl.Companion,
    ScriptDataService by scriptDataService {
    private var nextScript: HtmlKtsBase? = null

    // TODO() : move by launching coroutine inside init
    private suspend fun evaluateNextRenderOrder() {
        if(!leftRenderOrder.isEmpty() && nextScript == null) {
            val scriptDataService = ScriptDataServiceImpl(request, data)
            val templatingService = TemplatingServiceImpl(
                scriptDataService,
                leftRenderOrder.removeFirst(),
                evaluator
            )
            nextScript = evaluator.evaluate(findCompiledScript(leftRenderOrder.getFirst()), templatingService, HtmlTagConsumerServiceImpl()).returnValue.scriptInstance!! as HtmlKtsBase
        }
    }

    override suspend fun <T : Tag> T.yield(id: String?) {
        evaluateNextRenderOrder()
        if(id != null) {
            val content = nextScript?.contents?.get(id) as (T.()->Unit)?
            content?.invoke(this)
        } else {
            TODO()
        }
    }

    override fun <T: Tag> HtmlKtsBase.contentFor(id: String, body: T.() -> Unit) {
        contents[id] = body as Tag.() -> Unit
    }

    override fun Tag.render(renderOrder: RenderOrder, refineData: (Map<String, Any?>) -> Map<String, Any?>) {
        TODO("Not yet implemented")
    }
}