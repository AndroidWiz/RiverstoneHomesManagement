package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.theme.Color
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
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorPalettes
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgba
import org.jetbrains.compose.web.dom.Text

@Composable
fun LandingSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            /*.height(600.px)
            .position(Position.Relative),*/
//            .padding(top = 100.px, bottom = 100.px, left = 40.px, right = 40.px)
//            .boxShadow(0.px, 0.px, color = rgba(0, 0, 0, 0.67)) // Simulate box-shadow
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

        // background Image
        /* Box(
             modifier = Modifier.fillMaxSize()
                 .backgroundImage(url(Res.LANDING_PAGE_IMAGE))
                 .backgroundSize(BackgroundSize.Cover)
                 .position(Position.Absolute)
         )*/

        // dark Overlay
        /* Box(
             modifier = Modifier
                 .fillMaxSize()
                 .backgroundColor(rgba(0, 0, 0, 0.6))
                 .position(Position.Absolute)
                 .zIndex(-1)
                 .translate(5.px, 5.px)
         )*/


        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(rgba(0, 0, 0, 0.6))
        )


        // content
        Column(
            modifier = Modifier.fillMaxWidth()
//                .backgroundImage(url(Res.LANDING_PAGE_IMAGE))
//                .backgroundSize(BackgroundSize.Cover)
//                .background(rgba(0, 0, 0, 0.67))
//                .padding { top(100.px) }
                .position(Position.Relative)
                .padding(topBottom = 150.px, leftRight = 40.px)
//                .margin { top(100.px) }
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(15.px)
        ) {
            SpanText(
                text = "Your Dream Home Awaits",
                modifier = Modifier
                    .fontFamily("Rubik")
                    .fontWeight(FontWeight.SemiBold)
                    .fontSize(4.cssRem)
                    .color(Colors.White)
            )

            SpanText(
                text = "Discover expert craftsmanship and personalized solutions for your residential needs anywhere in FL.",
                modifier = Modifier
                    .fontFamily("Karla")
                    .fontWeight(FontWeight.Light)
                    .lineHeight(25.px)
                    .fontSize(17.px)
                    .textAlign(TextAlign.Center)
                    .color(Colors.White)
                    .width(480.px)
            )

            Spacer()

            Button(
                onClick = { ctx.router.tryRoutingTo(Constants.CONTACT_ROUTE) },
                colorPalette = ColorPalettes.Green,
                modifier = Modifier.fontFamily("Karla").fontSize(16.px).color(Colors.White),
                size = ButtonSize.LG,
            ) {
                Text("Connect With Us")
            }
        }
    }
}