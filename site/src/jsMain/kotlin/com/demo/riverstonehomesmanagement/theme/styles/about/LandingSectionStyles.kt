package com.demo.riverstonehomesmanagement.theme.styles.about

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val LandingSectionStyle = CssStyle {
    base {
        Modifier
            .width(100.percent)
            .height(100.vh)
    }

    Breakpoint.ZERO {
        Modifier
            .width(100.percent)
            .height(90.percent)
    }

    Breakpoint.MD {
        Modifier
            .width(100.percent)
            .height(80.vh)
    }

    Breakpoint.LG {
        Modifier
            .width(100.percent)
            .height(80.vh)
    }
}

val LandingTitleTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(4.25.cssRem)
            .fontFamily("Rubik")
            .fontWeight(FontWeight.SemiBold)
            .color(Colors.White)
    }

    Breakpoint.SM {
        Modifier.fontSize(4.25.cssRem.times(0.5))
    }
    Breakpoint.MD {
        Modifier.fontSize(4.25.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(4.25.cssRem.times(1.1))
    }
}

val LandingSubTitleTextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Karla")
            .fontWeight(FontWeight.Light)
            .lineHeight(25.px)
            .fontSize(18.px)
            .textAlign(TextAlign.Center)
            .color(Colors.White)
            .width(550.px)
    }

    Breakpoint.SM {
        Modifier.fontSize(18.px.times(0.8))
    }
    Breakpoint.MD {
        Modifier.fontSize(18.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(18.px.times(1.1))
    }
}