package com.demo.riverstonehomesmanagement.components.widgets

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.models.Beliefs
import com.demo.riverstonehomesmanagement.theme.Color
import com.varabyte.kobweb.compose.css.AlignSelf
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun BeliefItem(
    beliefs: Beliefs,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .margin(leftRight = 50.px),
        contentAlignment = Alignment.TopCenter,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.px),
        ) {
            SpanText(
                text = beliefs.title,
                modifier = modifier
                    .fontFamily("Rubik")
                    .fontWeight(FontWeight.Medium)
                    .fontSize(1.5.cssRem)
                    .color(Color.ServiceTitleTextColor.rgb)
                    .alignSelf(AlignSelf.Center)
            )

            SpanText(
                text = beliefs.description,
                modifier = modifier
                    .fillMaxWidth()
                    .fontFamily("Karla")
                    .fontWeight(FontWeight.Light)
                    .lineHeight(25.px)
                    .fontSize(17.px)
//                    .textAlign(TextAlign.Start)
                    .color(Color.ServiceSubTitleTextColor.rgb)
                    .alignSelf(AlignSelf.Stretch)
            )
        }
    }
}