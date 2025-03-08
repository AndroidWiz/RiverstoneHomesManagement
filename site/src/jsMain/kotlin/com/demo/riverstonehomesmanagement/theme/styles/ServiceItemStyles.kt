package com.demo.riverstonehomesmanagement.theme.styles

import com.demo.riverstonehomesmanagement.theme.Color
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*

val ServiceItemStyle = CssStyle {
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

val ServiceItemTitleTextStyle = CssStyle {
    base {
        Modifier
            .fontFamily("Rubik")
            .fontWeight(FontWeight.Medium)
            .fontSize(1.75.cssRem)
            .color(Color.ServiceTitleTextColor.rgb)
    }

    Breakpoint.ZERO {
        Modifier.fontSize(1.75.cssRem.times(0.6))
    }
    Breakpoint.SM {
        Modifier.fontSize(1.75.cssRem.times(0.6))
    }
    Breakpoint.MD {
        Modifier.fontSize(1.75.cssRem)
    }
    Breakpoint.LG {
        Modifier.fontSize(1.75.cssRem.times(1.1))
    }
}

val ServiceItemSubTitleTextStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .fontFamily("Karla")
            .fontWeight(FontWeight.Light)
            .lineHeight(25.px)
            .fontSize(17.px)
            .color(Color.ServiceSubTitleTextColor.rgb)
    }

    Breakpoint.ZERO {
        Modifier.fontSize(17.px.times(0.8))
    }
    Breakpoint.SM {
        Modifier.fontSize(17.px.times(0.8))
    }
    Breakpoint.MD {
        Modifier.fontSize(17.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(17.px.times(1.1))
    }
}