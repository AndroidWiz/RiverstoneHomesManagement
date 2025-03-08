package com.demo.riverstonehomesmanagement.pages

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.layouts.PageLayout
import com.demo.riverstonehomesmanagement.components.sections.ContactTopSection
import com.demo.riverstonehomesmanagement.components.sections.ReachOutSection
import com.demo.riverstonehomesmanagement.components.sections.TransformYourHomeSection
import com.demo.riverstonehomesmanagement.utils.Constants
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.minWidth
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vw
import org.jetbrains.compose.web.dom.Div


/*@Page
@Composable
fun ContactPage() {

    val breakpoint = rememberBreakpoint()

    PageLayout(Constants.CONTACT_PAGE_TITLE) {
        Div {
            Box {
                Column(
                    verticalArrangement = Arrangement.spacedBy(20.px)
                ) {
                    ContactTopSection(breakpoint = breakpoint)
                    ReachOutSection(breakpoint = breakpoint)
                    TransformYourHomeSection()
                }
            }
        }

    }
}*/

@Page
@Composable
fun ContactPage() {
    val breakpoint = rememberBreakpoint()

    PageLayout(Constants.CONTACT_PAGE_TITLE) {
        Div(attrs = Modifier.fillMaxWidth().minWidth(100.vw).toAttrs()) {
            Row(Modifier.fillMaxWidth().minWidth(100.vw)) {
                Box(Modifier.fillMaxWidth().minWidth(100.vw)) {
                    Column(
                        modifier = Modifier.fillMaxWidth().minWidth(100.vw), // Apply to Column too
                        verticalArrangement = Arrangement.spacedBy(20.px)
                    ) {
                        ContactTopSection(breakpoint = breakpoint)
                        ReachOutSection(breakpoint = breakpoint)
                        TransformYourHomeSection()
                    }
                }
            }
        }
    }
}
