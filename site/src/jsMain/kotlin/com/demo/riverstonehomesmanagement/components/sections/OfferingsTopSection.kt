package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.utils.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.url
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgba


@Composable
fun OfferingsTopSection(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .overflow(Overflow.Visible) // ensures content doesn’t get hidden
            .backgroundImage(url(Res.LANDING_PAGE_IMAGE))
            .backgroundRepeat(BackgroundRepeat.NoRepeat) // no repeating
            .backgroundPosition(BackgroundPosition.of(CSSPosition.Center))
            .backgroundSize(BackgroundSize.Cover)
            .backgroundAttachment(BackgroundAttachment.Scroll)
            .backgroundClip(BackgroundClip.PaddingBox),
        contentAlignment = Alignment.Center,
    ) {
        // shadow overlay
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(rgba(0, 0, 0, 0.6))
        )

        // content
        Column(
            modifier = modifier.fillMaxWidth()
                .position(Position.Relative)
                .padding(topBottom = 100.px, leftRight = 40.px),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(15.px)
        ) {
            SpanText(
                text = "Our Services",
                modifier = modifier
                    .fontFamily("Rubik")
                    .fontWeight(FontWeight.SemiBold)
                    .fontSize(4.cssRem)
                    .color(Colors.White)
            )
        }
    }
}