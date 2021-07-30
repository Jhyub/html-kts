package dev.jhseo.html_kts.impl

import dev.jhseo.html_kts.api.HtmlTagConsumerService
import kotlinx.html.TagConsumer
import kotlinx.html.stream.createHTML

class HtmlTagConsumerServiceImpl(tagConsumer: TagConsumer<String> = createHTML())
    : HtmlTagConsumerService, TagConsumer<String> by tagConsumer