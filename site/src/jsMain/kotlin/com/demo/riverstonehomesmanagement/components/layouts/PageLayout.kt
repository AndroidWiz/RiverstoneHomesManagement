package com.demo.riverstonehomesmanagement.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.demo.riverstonehomesmanagement.components.sections.Footer
import com.demo.riverstonehomesmanagement.components.sections.NavHeader
import com.demo.riverstonehomesmanagement.components.widgets.BackToTopButton
import com.demo.riverstonehomesmanagement.components.widgets.BackgroundImage
import com.demo.riverstonehomesmanagement.utils.Res
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
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

/*@Composable
fun PageLayout(title: String, content: @Composable ColumnScope.() -> Unit) {

    val breakpoint = rememberBreakpoint()

    LaunchedEffect(title) {
        document.title = "Riverstone Homes Management - $title"
    }

    Box(
        Modifier
            .fillMaxWidth()
            .minHeight(100.percent)
            // Create a box with two rows: the main content (fills as much space as it can) and the footer (which reserves
            // space at the bottom). "min-content" means the use the height of the row, which we use for the footer.
            // Since this box is set to *at least* 100%, the footer will always appear at least on the bottom but can be
            // pushed further down if the first row grows beyond the page.
            // Grids are powerful but have a bit of a learning curve. For more info, see:
            // https://css-tricks.com/snippets/css/complete-guide-grid/
            .gridTemplateRows { size(1.fr); size(minContent) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            // Isolate the content, because otherwise the absolute-positioned SVG above will render on top of it.
            // This is confusing but how browsers work. Read up on stacking contexts for more info.
            // https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_positioned_layout/Understanding_z-index/Stacking_context
            // Some people might have used z-index instead, but best practice is to avoid that if possible, because
            // as a site gets complex, Z-fighting can be a huge pain to track down.
            Modifier.fillMaxSize().gridRow(1),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column(
                PageContentStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                content()
            }
            BackToTopButton()
        }
        NavHeader(modifier = Modifier.position(Position.Fixed).top(0.px))
        // Associate the footer with the row that will get pushed off the bottom of the page if it can't fit.
        Footer(breakpoint, Modifier.fillMaxWidth().gridRow(2))
    }
}*/

@Composable
fun PageLayout(title: String, content: @Composable ColumnScope.() -> Unit) {

    val breakpoint = rememberBreakpoint()

    LaunchedEffect(title) {
        document.title = "Riverstone Homes Management - $title"
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
//        color = { rgb(255, 255, 255) } // Fixed light background color
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {
            NavHeader(modifier = Modifier.position(Position.Fixed).top(0.px))
            Div({ style { flex(1) } }) { content() }
            Footer(breakpoint = breakpoint, modifier = Modifier.fillMaxWidth().gridRow(2))
        }
    }
}

/*@Composable
fun PageLayout(title: String, content: @Composable ColumnScope.() -> Unit) {

    val breakpoint = rememberBreakpoint()

    LaunchedEffect(title) {
        document.title = "Riverstone Homes Management - $title"
    }

    Box(
        Modifier
            .fillMaxWidth()
            .minHeight(100.percent)
            .gridTemplateRows { size(1.fr); size(minContent) },
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
//                .margin { top((-400).px) }
                .margin { top((-1360).px) }
        ) {
            LandingImage(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .pointerEvents(PointerEvents.None)
                    .fillMaxSize()
//                    .background(rgba(0, 0, 0, 0.5))
                    .styleModifier {
                        property("height", "auto")
                    }
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .backgroundAttachment(BackgroundAttachment.Scroll)
                    .backgroundClip(BackgroundClip.PaddingBox)
                    .rowGap(32.px)
                    .padding(topBottom = 225.px, leftRight = 40.px)
                    .columnGap(0.px)
                    .backgroundRepeat(BackgroundRepeat.NoRepeat)
                    .backgroundSize(BackgroundSize.Cover)
                    .background(rgba(0, 0, 0, 0.67))
            )
        }

        Column(
            Modifier.fillMaxSize().gridRow(1),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            *//*NavHeader()
            Div(PageContentStyle.toAttrs()) {
                content()
            }*//*
            Column(
                PageContentStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                content()
            }
            BackToTopButton()
        }
        NavHeader(modifier = Modifier.position(Position.Fixed).top(0.px))
        // Associate the footer with the row that will get pushed off the bottom of the page if it can't fit.
        Footer(breakpoint = breakpoint, modifier = Modifier.fillMaxWidth().gridRow(2))
    }
}*/
