package com.demo.riverstonehomesmanagement.components.widgets

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.models.Services
import com.demo.riverstonehomesmanagement.theme.Color
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun ServiceItem(service: Services, modifier: Modifier = Modifier) {
    val breakpoint = rememberBreakpoint()

    Row(
        modifier = modifier.fillMaxWidth().margin { topBottom(20.px) },
//        modifier = modifier.fillMaxWidth().margin(topBottom = 20.px, leftRight = (-50).px),
        horizontalArrangement = Arrangement.spacedBy(100.px),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        ServiceImage(
            src = service.image,
            modifier = modifier
//                .margin(left = (-120).px)
                .size(500.px)
                .aspectRatio(1f)
                .objectFit(ObjectFit.Cover)
                .clip(shape = Rect(10.px)),
        )


        Column(
//            modifier = modifier.margin(right = (-150).px),
            verticalArrangement = Arrangement.spacedBy(20.px)
        ) {
            SpanText(
                text = service.title.uppercase(),
                modifier = modifier
                    .fontFamily("Rubik")
                    .fontWeight(FontWeight.Medium)
                    .fontSize(1.75.cssRem)
                    .color(Color.ServiceTitleTextColor.rgb)
            )

            SpanText(
                text = service.description,
                modifier = modifier
                    .fillMaxWidth()
                    .fontFamily("Karla")
                    .fontWeight(FontWeight.Light)
                    .lineHeight(25.px)
                    .fontSize(17.px)
                    .textAlign(TextAlign.Start)
                    .color(Color.ServiceSubTitleTextColor.rgb)
            )
        }
    }

}