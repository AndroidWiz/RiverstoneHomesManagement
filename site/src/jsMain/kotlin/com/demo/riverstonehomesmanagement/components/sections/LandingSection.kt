package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.widgets.BorderedButton
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.styles.LandingSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.LandingTitleTextStyle
import com.demo.riverstonehomesmanagement.utils.Constants
import com.demo.riverstonehomesmanagement.utils.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.url
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgba

@Composable
fun LandingSection(breakpoint: Breakpoint) {

    // padding and alignment dynamically
    val padding = when (breakpoint) {
        Breakpoint.SM -> Modifier.padding(topBottom = 80.px, leftRight = 20.px) // small screens
        Breakpoint.MD -> Modifier.padding(topBottom = 120.px, leftRight = 30.px)
        else -> Modifier.padding(topBottom = 150.px, leftRight = 40.px) // default, large screen
    }

    Box(
        modifier = Modifier
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
        val ctx = rememberPageContext()

        // dark Overlay
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(rgba(0, 0, 0, 0.6))
        )


        // content
        Column(
            modifier = Modifier.fillMaxWidth()
                .position(Position.Relative)
                .then(padding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(
                when (breakpoint) {
                    Breakpoint.SM, Breakpoint.MD -> 10.px
                    else -> 15.px
                }
            )
        ) {
            SpanText(
                text = "Your Dream Home Awaits",
                modifier = LandingTitleTextStyle.toModifier()
            )

            SpanText(
                text = "Discover expert craftsmanship and personalized solutions for your residential needs anywhere in FL.",
                modifier = LandingSubTitleTextStyle.toModifier()
                    .width(
                        when (breakpoint) {
                            Breakpoint.ZERO,
                            Breakpoint.SM -> 250.px

                            else -> 550.px
                        }
                    )
            )

            Spacer()

            BorderedButton(
                modifier = Modifier,
                onClick = { ctx.router.tryRoutingTo(Constants.CONTACT_ROUTE) },
                buttonTitle = "Connect With Us",
                defaultBgColor = Color.HoveredGreenButtonColor.rgb,
                hoveredBgColor = Color.UnHoveredGreenButtonColor.rgb,
                defaultTextColor = Color.White.rgb,
                hoveredTextColor = Color.White.rgb,
                defaultBorderColor = Colors.Transparent,
                hoveredBorderColor = Color.UnHoveredGreenButtonColor.rgb
            )
        }
    }
}