package materialui.icons.components.brightness7twotone

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.Brightness7TwoTone
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.brightness7TwoTone(
    vararg classMap: Pair<SvgIconStyle, String>,
    block: SvgIconElementBuilder<SVG>.() -> Unit
) = child(SvgIconElementBuilder(Brightness7TwoTone, classMap.toList()) { SVG(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.brightness7TwoTone(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(Brightness7TwoTone, classMap.toList(), factory).apply(block).create())
