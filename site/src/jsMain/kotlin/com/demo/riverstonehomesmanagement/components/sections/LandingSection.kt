package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.utils.Constants
import com.varabyte.kobweb.compose.css.TextAlign
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
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorPalettes
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun LandingSection() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center,
    ) {
        val ctx = rememberPageContext()

        // content
        Column(
            modifier = Modifier.fillMaxWidth().margin { top(100.px) },
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(15.px)
        ) {
            SpanText(
                text = "Your Dream Home Awaits",
                modifier = Modifier
                    .fontFamily("Rubik")
                    .fontSize(4.cssRem)
                    .color(Colors.White)
            )

            SpanText(
                text = "Discover expert craftsmanship and personalized solutions for your residential needs anywhere in FL.",
                modifier = Modifier
                    .fontFamily("Karla")
                    .fontSize(16.px)
                    .textAlign(TextAlign.Center)
                    .color(Colors.White)
                    .width(450.px)
            )

            Spacer()

            Button(
                onClick = { ctx.router.tryRoutingTo(Constants.CONTACT_ROUTE) },
                colorPalette = ColorPalettes.Green,
                modifier = Modifier.fontFamily("Karla").fontSize(16.px).color(Colors.White)
            ) {
                Text("Connect With Us")
            }
        }
    }
}