package dev.jhseo.html_kts.dsl

class ChildrenBuilder {
    internal val children: MutableMap<String?, DslComponent> = mutableMapOf()

    infix fun String.renders(component: DslComponent) {
        children[this] = component
    }
}