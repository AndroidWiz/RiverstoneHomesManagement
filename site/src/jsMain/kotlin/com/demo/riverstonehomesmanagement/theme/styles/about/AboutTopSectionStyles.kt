package com.demo.riverstonehomesmanagement.theme.styles.about

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val AboutTopSectionStyle = CssStyle {
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

val AboutTopTitleTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(4.cssRem)
            .fontFamily("Rubik")
            .textAlign(TextAlign.Center)
            .fontWeight(FontWeight.SemiBold)
            .color(Colors.White)
    }

    Breakpoint.ZERO {
        Modifier.fontSize(4.cssRem.times(0.5))
    }
    Breakpoint.SM {
        Modifier.fontSize(4.cssRem.times(0.5))
    }
    Breakpoint.MD {
        Modifier.fontSize(4.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(4.cssRem.times(1.1))
    }
}