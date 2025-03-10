package com.demo.riverstonehomesmanagement.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.demo.riverstonehomesmanagement.components.sections.Footer
import com.demo.riverstonehomesmanagement.components.sections.NavHeader
import com.demo.riverstonehomesmanagement.components.widgets.BackgroundImage
import com.demo.riverstonehomesmanagement.utils.Res
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

val PageContentStyle = CssStyle {
    base { Modifier.fillMaxSize().padding(leftRight = 2.cssRem, top = 4.cssRem) }
    Breakpoint.MD { Modifier.maxWidth(60.cssRem) }
}

@Composable
fun LandingImage(modifier: Modifier) {

    BackgroundImage(
        src = Res.LANDING_PAGE_IMAGE,
        modifier = modifier,
        cropHeight = 550
    )
}


@Composable
fun PageLayout(title: String, content: @Composable ColumnScope.() -> Unit) {

    val breakpoint = rememberBreakpoint()

    LaunchedEffect(title) {
        document.title = "Riverstone Homes Management - $title"
    }

    Surface(
        modifier = Modifier.fillMaxWidth().overflow(Overflow.Hidden),
//        color = { rgb(255, 255, 255) } // Fixed light background color
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {
            NavHeader(
                modifier = Modifier.position(Position.Fixed).top(0.px).zIndex(1).maxWidth(100.percent),
                breakpoint = breakpoint
            )
            Div({
                style {
                    flex(1)
                    maxWidth(100.percent)
                }
            }) { content() }
            Footer(breakpoint = breakpoint, modifier = Modifier.fillMaxWidth().gridRow(2))
        }
    }
}

