package dev.jhseo.html_kts.dsl

class RenderSetBuilder {
    val String.html: HtmlComponent
        get() = HtmlComponent("$this.html")

    val HtmlComponent.kts: HtmlKtsComponent
        get() = HtmlKtsComponent("$fileName.kts", mutableMapOf())

    operator fun HtmlKtsComponent.invoke(lambda: ChildrenBuilder.()->DslComponent): HtmlKtsComponent {
        val cb = ChildrenBuilder()
        val ret = cb.lambda()
        children = cb.children
        children[null] = ret
        return this
    }
}