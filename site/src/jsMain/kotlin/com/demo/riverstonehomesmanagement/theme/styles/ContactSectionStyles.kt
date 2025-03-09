package com.demo.riverstonehomesmanagement.theme.styles

import com.demo.riverstonehomesmanagement.theme.Color
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val ContactTopSectionStyle = CssStyle {
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

val ContactTopTitleTextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Rubik")
            .fontWeight(FontWeight.SemiBold)
            .fontSize(4.cssRem)
            .textAlign(TextAlign.Center)
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

val ContactTitleTextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Rubik")
            .fontWeight(FontWeight.Medium)
            .fontSize(3.cssRem)
            .textAlign(TextAlign.Center)
            .color(Color.ServiceTitleTextColor.rgb)
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

val ContactSubTitleTextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Karla")
            .fontWeight(FontWeight.Light)
            .lineHeight(25.px)
            .fontSize(17.px)
            .textAlign(TextAlign.Center)
            .color(Color.ServiceSubTitleTextColor.rgb)
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

val ReachOutTitleTextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Rubik")
            .fontWeight(FontWeight.Medium)
            .fontSize(1.5.cssRem)
            .color(Color.ServiceTitleTextColor.rgb)
    }

    Breakpoint.ZERO {
        Modifier.fontSize(1.75.cssRem.times(0.8))
    }
    Breakpoint.SM {
        Modifier.fontSize(1.75.cssRem.times(0.8))
    }
    Breakpoint.MD {
        Modifier.fontSize(1.75.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(1.75.cssRem.times(1.1))
    }
}

val ReachOutSubTitleTextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Rubik")
            .fontWeight(FontWeight.Medium)
            .fontSize(20.px)
            .color(Color.ServiceTitleTextColor.rgb)
    }

    Breakpoint.ZERO {
        Modifier.fontSize(20.px.times(0.8))
    }
    Breakpoint.SM {
        Modifier.fontSize(20.px.times(0.8))
    }
    Breakpoint.MD {
        Modifier.fontSize(20.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(20.px.times(1.1))
    }
}

val ReachOutDescriptionTextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Karla")
            .fontWeight(FontWeight.Light)
            .lineHeight(19.px)
            .fontSize(17.px)
            .textAlign(TextAlign.Justify)
            .color(Color.ServiceSubTitleTextColor.rgb)
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