package com.demo.riverstonehomesmanagement.components.widgets

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.models.Services
import com.demo.riverstonehomesmanagement.theme.styles.ServiceItemSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.ServiceItemTitleTextStyle
import com.varabyte.kobweb.compose.css.AlignSelf
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.px

@Composable
fun ServiceItem(
    service: Services,
    buttonTitle: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val breakpoint = rememberBreakpoint()

    when (breakpoint) {
        Breakpoint.ZERO,
        Breakpoint.SM -> {
            Column(
                modifier = modifier.fillMaxWidth().margin { topBottom(20.px) },
                verticalArrangement = Arrangement.spacedBy(10.px),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                ServiceImage(
                    src = service.image,
                    modifier = modifier
                        .size(250.px)
                        .aspectRatio(1f)
                        .objectFit(ObjectFit.Cover)
                        .clip(shape = Rect(10.px)),
                )


                Column(
                    verticalArrangement = Arrangement.spacedBy(20.px)
                ) {
                    SpanText(
                        text = service.title.uppercase(),
                        modifier = ServiceItemTitleTextStyle.toModifier().textAlign(TextAlign.Center)
                    )

                    SpanText(
                        text = service.description,
                        modifier = ServiceItemSubTitleTextStyle.toModifier().textAlign(TextAlign.Justify)
                    )

                    // button
                    BorderedButton(
                        modifier = modifier.alignSelf(AlignSelf.Center),
                        onClick = { onClick() },
                        buttonTitle = buttonTitle
                    )
                }
            }
        }

        else -> {
            Row(
                modifier = modifier.fillMaxWidth().margin { topBottom(20.px) },
                horizontalArrangement = Arrangement.spacedBy(100.px),
                verticalAlignment = Alignment.CenterVertically,
            ) {

                ServiceImage(
                    src = service.image,
                    modifier = modifier
                        .size(500.px)
                        .aspectRatio(1f)
                        .objectFit(ObjectFit.Cover)
                        .clip(shape = Rect(10.px)),
                )


                Column(
                    verticalArrangement = Arrangement.spacedBy(20.px)
                ) {
                    SpanText(
                        text = service.title.uppercase(),
                        modifier = ServiceItemTitleTextStyle.toModifier().textAlign(TextAlign.Start)
                    )

                    SpanText(
                        text = service.description,
                        modifier = ServiceItemSubTitleTextStyle.toModifier().textAlign(TextAlign.Start)
                    )

                    // button
                    BorderedButton(
                        modifier = modifier,
                        onClick = { onClick() },
                        buttonTitle = buttonTitle
                    )
                }
            }
        }
    }
}