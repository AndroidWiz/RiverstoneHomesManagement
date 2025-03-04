package com.demo.riverstonehomesmanagement.theme.styles.about

import com.demo.riverstonehomesmanagement.theme.Color
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val TransformHomeSectionStyle = CssStyle {
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

val TransformHomeTitleTextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Rubik")
            .fontWeight(FontWeight.Medium)
            .fontSize(3.cssRem)
            .textAlign(TextAlign.Center)
            .color(Color.White.rgb)
    }

    Breakpoint.ZERO {
        Modifier.fontSize(3.cssRem.times(0.5))
    }
    Breakpoint.SM {
        Modifier.fontSize(3.cssRem.times(0.5))
    }
    Breakpoint.MD {
        Modifier.fontSize(3.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(3.cssRem.times(1.1))
    }
}

val TransformHomeSubTitleTextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Karla")
            .fontWeight(FontWeight.Light)
            .lineHeight(25.px)
            .fontSize(17.px)
            .textAlign(TextAlign.Center)
            .color(Color.White.rgb)
    }

    Breakpoint.ZERO {
        Modifier.fontSize(18.px.times(0.8))
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