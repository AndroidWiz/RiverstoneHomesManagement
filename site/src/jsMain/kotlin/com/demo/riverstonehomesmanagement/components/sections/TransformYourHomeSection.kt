package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.widgets.BorderedButton
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.styles.TransformHomeSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.TransformHomeTitleTextStyle
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
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgba
import org.jetbrains.compose.web.dom.Div

@Composable
fun TransformYourHomeSection(modifier: Modifier = Modifier) {
    Div(attrs = modifier.fillMaxSize().toAttrs()) {
        Box(
            modifier = modifier
                .overflow(Overflow.Visible) // ensures content doesn’t get hidden
                .backgroundImage(url(Res.BOTTOM_IMAGE))
                .backgroundRepeat(BackgroundRepeat.NoRepeat) // no repeating
                .backgroundPosition(BackgroundPosition.of(CSSPosition.Center))
                .backgroundSize(BackgroundSize.Cover)
                .backgroundAttachment(BackgroundAttachment.Scroll)
                .backgroundClip(BackgroundClip.PaddingBox),
            contentAlignment = Alignment.Center,
        ) {

            val ctx = rememberPageContext()

            // shadow overlay
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(rgba(0, 0, 0, 0.6))
            )

            // content
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .position(Position.Relative)
                    .padding(topBottom = 100.px, leftRight = 40.px),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(15.px)
            ) {

                SpanText(
                    text = "Transform Your Home Today",
                    modifier = TransformHomeTitleTextStyle.toModifier()
                )

                SpanText(
                    text = "Contact us now to start the journey towards your dream home with Riverstone Homes Management. Let’s build together.",
                    modifier = TransformHomeSubTitleTextStyle.toModifier()
                )

                Spacer()

                BorderedButton(
                    modifier = modifier,
                    onClick = { ctx.router.tryRoutingTo(Constants.CONTACT_ROUTE) },
                    buttonTitle = "Explore Now",
                    defaultBgColor = Color.White.rgb,
                    defaultBorderColor = Color.White.rgb,
                    hoveredBorderColor = Color.HoveredGreenButtonColor.rgb
                )
            }
        }
    }
}