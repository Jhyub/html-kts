package dev.jhseo.html_kts.api

import io.ktor.request.*

interface ScriptDataService {
    val request: ApplicationRequest
    val data: Map<String, Any?>
}