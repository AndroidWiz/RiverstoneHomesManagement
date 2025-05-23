package com.demo.riverstonehomesmanagement.pages

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.layouts.PageLayout
import com.demo.riverstonehomesmanagement.components.sections.AboutTopSection
import com.demo.riverstonehomesmanagement.components.sections.OurBeliefsSection
import com.demo.riverstonehomesmanagement.components.sections.OurStoryAboutSection
import com.demo.riverstonehomesmanagement.components.sections.TransformYourHomeSection
import com.demo.riverstonehomesmanagement.utils.Constants
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div


@Page
@Composable
fun AboutPage() {
    val breakpoint = rememberBreakpoint()
    PageLayout(Constants.ABOUT_PAGE_TITLE) {
        Div {
            Row(
                Modifier.fillMaxWidth()
            ) {
                Box {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(20.px)
                    ) {
                        AboutTopSection(breakpoint = breakpoint)
                        OurStoryAboutSection(breakpoint = breakpoint)
                        OurBeliefsSection(breakpoint = breakpoint)
                        TransformYourHomeSection()
                    }
                }
            }

        }
    }
}