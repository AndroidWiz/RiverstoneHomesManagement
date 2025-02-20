package com.demo.riverstonehomesmanagement.pages

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.layouts.PageLayout
import com.demo.riverstonehomesmanagement.utils.Constants
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.dom.Div


@Page
@Composable
fun AboutPage() {
    PageLayout(Constants.ABOUT_PAGE_TITLE) {
//        Div(attrs = HeroContainerStyle.toModifier().toAttrs()) {
        Div {

            SpanText(text = Constants.ABOUT_PAGE_TITLE)

        }
    }
}