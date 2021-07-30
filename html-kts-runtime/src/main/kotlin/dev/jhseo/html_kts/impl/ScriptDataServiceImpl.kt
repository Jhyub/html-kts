package dev.jhseo.html_kts.impl

import dev.jhseo.html_kts.api.ScriptDataService
import io.ktor.request.*

class ScriptDataServiceImpl(override val request: ApplicationRequest, override val data: Map<String, Any?>)
    : ScriptDataService