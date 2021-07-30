package dev.jhseo.html_kts.api

import kotlinx.html.HtmlTagMarker
import kotlinx.html.TagConsumer

@HtmlTagMarker
interface HtmlTagConsumerService: TagConsumer<String>