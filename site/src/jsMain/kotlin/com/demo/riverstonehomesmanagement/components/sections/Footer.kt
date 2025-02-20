package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.theme.Color
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.WhiteSpace
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.style.vars.color.ColorVar
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.Span
import com.demo.riverstonehomesmanagement.theme.toSitePalette
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.px

val FooterStyle = CssStyle.base {
    Modifier
//        .backgroundColor(colorMode.toSitePalette().nearBackground)
        .padding(topBottom = 1.5.cssRem, leftRight = 10.percent)
}

@Composable
fun Footer(breakpoint: Breakpoint, modifier: Modifier = Modifier) {
    Box(FooterStyle.toModifier().then(modifier), contentAlignment = Alignment.Center) {
        Span(Modifier.textAlign(TextAlign.Center).toAttrs()) {
            SpanText(
                text = "\u00A9 2025 Riverstone Homes Management",
                modifier = modifier
                    .fontFamily("Karla")
                    .fontSize(14.px)
                    .color(Color.ServiceSubTitleTextColor.rgb)
            )
        }
    }
}
