package com.demo.riverstonehomesmanagement.components.widgets

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.models.Beliefs
import com.demo.riverstonehomesmanagement.theme.styles.BeliefItemSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.BeliefItemTitleTextStyle
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px

@Composable
fun BeliefItem(
    beliefs: Beliefs,
    modifier: Modifier = Modifier
) {

    val breakpoint = rememberBreakpoint()

    Box(
        modifier = modifier
//            .margin(leftRight = 50.px),
            .margin(
                leftRight = when (breakpoint) {
                    Breakpoint.SM,
                    Breakpoint.MD -> 5.px

                    else -> 50.px
                },
                topBottom = when (breakpoint) {
                    Breakpoint.SM, Breakpoint.MD -> 20.px
                    else -> 0.px
                }
            ),
        contentAlignment = Alignment.TopCenter,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.px),
        ) {
            SpanText(
                text = beliefs.title,
                modifier = BeliefItemTitleTextStyle.toModifier()
                    .textAlign(TextAlign.Center)
                    .margin(
                        top = 15.px,
                        bottom =
                            when (breakpoint) {
                                Breakpoint.ZERO,
                                Breakpoint.SM,
                                Breakpoint.MD -> (-8).px
                                else -> 0.px
                            }
                        /*modifier = modifier
                            .fontFamily("Rubik")
                            .fontWeight(FontWeight.Medium)
                            .fontSize(1.5.cssRem)
                            .color(Color.ServiceTitleTextColor.rgb)
                            .alignSelf(AlignSelf.Center)*/
                    )
            )

            SpanText(
                text = beliefs.description,
                modifier = BeliefItemSubTitleTextStyle.toModifier().textAlign(TextAlign.Start)
                /*modifier = modifier
                    .fillMaxWidth()
                    .fontFamily("Karla")
                    .fontWeight(FontWeight.Light)
                    .lineHeight(25.px)
                    .fontSize(17.px)
//                    .textAlign(TextAlign.Start)
                    .color(Color.ServiceSubTitleTextColor.rgb)
                    .alignSelf(AlignSelf.Stretch)*/
            )
        }
    }
}