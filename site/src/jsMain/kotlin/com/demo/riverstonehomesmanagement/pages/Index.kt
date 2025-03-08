package com.demo.riverstonehomesmanagement.pages

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.layouts.PageLayout
import com.demo.riverstonehomesmanagement.components.sections.*
import com.demo.riverstonehomesmanagement.utils.Constants
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

// Container that has a tagline and grid on desktop, and just the tagline on mobile
val HeroContainerStyle = CssStyle {
    base { Modifier.fillMaxWidth().gap(2.cssRem) }
//    Breakpoint.MD { Modifier.margin { top(20.vh) } }
}


@Page
@Composable
fun HomePage() {

    val breakpoint = rememberBreakpoint()

    PageLayout(Constants.HOME_PAGE_TITLE) {
//        Div(attrs = HeroContainerStyle.toModifier().toAttrs()) {
//            LandingSection()

        Row(
            Modifier.fillMaxWidth()
        ) {
            Box {
                Column(
                    verticalArrangement = Arrangement.spacedBy(20.px)
                ) {
                    LandingSection(breakpoint = breakpoint)
                    /*when (breakpoint) {
                        Breakpoint.ZERO,
                        Breakpoint.SM,
                        Breakpoint.MD -> {
                            Spacer()
                        }

                        else -> {
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                            Spacer()
                        }
                    }*/

                    ServicesSection(breakpoint = breakpoint)
                    OurStoryHomeSection(breakpoint = breakpoint)
                    WhyChooseUsSection(breakpoint = breakpoint)
                    TransformYourHomeSection()
                }
            }
        }
    }
}
