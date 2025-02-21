package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.theme.Color
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun OurBeliefsSection(modifier: Modifier = Modifier) {
    Div {
        Box(
            modifier = Modifier.fillMaxWidth().padding(leftRight = 300.px).backgroundColor(Color.OurStoryBgColor.rgb),
            contentAlignment = Alignment.Center,
        ) {
            // content
            Column(
                modifier = modifier
                    .fillMaxSize(100.percent)
                    .position(Position.Relative)
                    .padding(topBottom = 100.px, leftRight = 40.px),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(15.px)
            ) {

                SpanText(
                    text = "Our Beliefs",
                    modifier = modifier
                        .fontFamily("Rubik")
                        .fontWeight(FontWeight.Medium)
                        .fontSize(3.cssRem)
                        .color(Color.ServiceTitleTextColor.rgb)
                )

                SpanText(
                    text = "Guided by a commitment to integrity and excellence, our core values define who we are and how we work.",
                    modifier = modifier
                        .fontFamily("Karla")
                        .fontWeight(FontWeight.Light)
                        .lineHeight(25.px)
                        .fontSize(17.px)
                        .textAlign(TextAlign.Center)
                        .color(Color.ServiceSubTitleTextColor.rgb)
                )
            }
        }
    }
}