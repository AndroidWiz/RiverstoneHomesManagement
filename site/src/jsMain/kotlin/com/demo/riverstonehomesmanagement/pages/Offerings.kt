package com.demo.riverstonehomesmanagement.pages

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.layouts.PageLayout
import com.demo.riverstonehomesmanagement.utils.Constants
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div


@Page
@Composable
fun OfferingsPage() {
    PageLayout(Constants.OFFERINGS_PAGE_TITLE) {
        Div(attrs = HeroContainerStyle.toModifier().toAttrs()) {
//        Div {

            Box(modifier = Modifier.padding(top = 300.px).margin(left = 100.px)) {
                SpanText(text = Constants.OFFERINGS_PAGE_TITLE)
            }


        }
    }
}