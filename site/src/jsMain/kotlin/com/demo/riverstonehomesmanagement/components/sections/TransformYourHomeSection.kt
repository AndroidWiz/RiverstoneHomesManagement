package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.widgets.BorderedButton
import com.demo.riverstonehomesmanagement.components.widgets.ServiceItem
import com.demo.riverstonehomesmanagement.models.getAllServices
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.styles.about.TransformHomeSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.about.TransformHomeTitleTextStyle
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
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorPalettes
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgba
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

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
                    /*modifier = modifier
                        .fontFamily("Rubik")
                        .fontWeight(FontWeight.Medium)
                        .fontSize(3.cssRem)
                        .color(Color.White.rgb)*/
                )

                SpanText(
                    text = "Contact us now to start the journey towards your dream home with Riverstone Homes Management. Let’s build together.",
                    modifier = TransformHomeSubTitleTextStyle.toModifier()
                    /*modifier = modifier
                        .fontFamily("Karla")
                        .fontWeight(FontWeight.Light)
                        .lineHeight(25.px)
                        .fontSize(17.px)
                        .textAlign(TextAlign.Center)
                        .color(Color.White.rgb)*/
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
                /*Button(
                    onClick = { ctx.router.tryRoutingTo(Constants.CONTACT_ROUTE) },
                    colorPalette = ColorPalettes.Green,
                    modifier = Modifier.fontFamily("Karla").fontSize(16.px).color(Colors.White),
                    size = ButtonSize.LG,
                ) {
                    Text("Explore Now")
                }*/
            }
        }
    }
}