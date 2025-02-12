package com.demo.riverstonehomesmanagement.components.widgets

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*
import org.w3c.dom.SMOOTH
import org.w3c.dom.ScrollBehavior
import org.w3c.dom.ScrollToOptions

val ArrowUpStyle = CssStyle.base {
    Modifier
        .fontFamily("Rubik")
        .fontWeight(FontWeight.Light)
        .fontSize(1.4.cssRem)
}


/*val BackToTopButtonStyle = CssStyle {
//    hover.also { Modifier.translateY((-10).px) }
    base {
        Modifier
            .size(50.px)
            .borderRadius(100.percent)
            .margin(
                right = 40.px,
                bottom = 40.px
            )
            .cursor(Cursor.Pointer)
            .styleModifier {
                property("pointer-events", "auto")
            }
            .transition(
                CSSTransition(
                    property = "translate",
                    duration = 200.ms,
                    timingFunction = AnimationTimingFunction.Ease
                )
            )
    }
    hover {
        Modifier.translateY((-10).px)
    }
}*/

@OptIn(ExperimentalComposeWebApi::class)
val BackToTopButtonStyle = CssStyle {
    base {
        Modifier
            .size(50.px)
            .borderRadius(100.percent)
            .margin(
                right = 40.px,
                bottom = 40.px
            )
            .cursor(Cursor.Pointer)
            .styleModifier {
                property("pointer-events", "auto")
            }
            .transition(Transition.Companion.of(property = "transform", duration = 200.ms))

    }

    hover {
        Modifier.translateY((-10).px)
    }
}

val FadeInKeyFrames = Keyframes {
    0.percent {
        Modifier
            .opacity(0)
    }
    100.percent {
        Modifier
            .opacity(1)
    }
}


@Composable
fun BackToTopButton() {
    var scroll: Double? by remember { mutableStateOf(null) }

    LaunchedEffect(Unit) {
        window.addEventListener(type = "scroll", callback = {
            scroll = document.documentElement?.scrollTop
        })
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .position(Position.Fixed)
            .zIndex(1)
            .pointerEvents(PointerEvents.None),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        val show = scroll != null && scroll!! > 400.0

        val buttonColor = when (ColorMode.current) {
            ColorMode.LIGHT -> Colors.Black
            ColorMode.DARK -> Colors.White
        }
        val arrowColor = when (ColorMode.current) {
            ColorMode.LIGHT -> Colors.White
            ColorMode.DARK -> Colors.White
        }

        Box(
            modifier = BackToTopButtonStyle
                .toModifier()
                .backgroundColor(buttonColor)
                .visibility(if (show) Visibility.Visible else Visibility.Hidden)
                .onClick {
                    document.documentElement?.scroll(ScrollToOptions(top = 0.0, behavior = ScrollBehavior.SMOOTH))
                }
                .then(
                    if (show) {
                        Modifier.animation(
                            FadeInKeyFrames.toAnimation(
                                null,
                                duration = 1.5.s,
                                timingFunction = AnimationTimingFunction.EaseInOut
                            )
                        )
                    } else {
                        Modifier
                    }
                ),
            contentAlignment = Alignment.Center
        ) {
            SpanText(
                text = "↑",
                modifier = ArrowUpStyle.toModifier().color(arrowColor)
            )
        }
    }
}