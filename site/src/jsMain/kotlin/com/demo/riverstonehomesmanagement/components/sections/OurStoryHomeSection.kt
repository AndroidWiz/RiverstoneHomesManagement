package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.widgets.BorderedButton
import com.demo.riverstonehomesmanagement.components.widgets.ServiceImage
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.styles.OurStorySubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.OurStoryTitleTextStyle
import com.demo.riverstonehomesmanagement.utils.Constants
import com.demo.riverstonehomesmanagement.utils.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun OurStoryHomeSection(modifier: Modifier = Modifier, breakpoint: Breakpoint) {

    val ctx = rememberPageContext()

    when (breakpoint) {

        Breakpoint.ZERO,
        Breakpoint.SM -> {
            Div {
                Box(
                    modifier = Modifier.fillMaxWidth().padding(leftRight = 30.px)
                        .backgroundColor(Color.OurStoryBgColor.rgb),
                    contentAlignment = Alignment.Center,
                ) {
                    Column(
                        modifier = modifier.fillMaxWidth().margin { topBottom(70.px) },
                        verticalArrangement = Arrangement.spacedBy(15.px),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        SpanText(
                            text = "Our Story",
                            modifier = OurStoryTitleTextStyle.toModifier().textAlign(TextAlign.Center)
                        )

                        SpanText(
                            text = "With a lot of industry experience, Riverstone Homes Management excels in delivering top-quality residential solutions. Our expertise ensures your project is in safe hands.",
                            modifier = OurStorySubTitleTextStyle.toModifier().textAlign(TextAlign.Center)
                        )

                        Spacer()

                        BorderedButton(
                            modifier = modifier,
                            onClick = { ctx.router.tryRoutingTo(Constants.OFFERINGS_ROUTE) },
                            buttonTitle = "Learn More"
                        )

                        Spacer()

                        ServiceImage(
                            src = Res.OUT_STORY_IMAGE,
                            modifier = modifier
                                .size(250.px)
                                .aspectRatio(1f)
                                .objectFit(ObjectFit.Cover)
                                .clip(shape = Rect(10.px)),
                        )
                    }
                }
            }
        }

        else -> {
            Div {
                Box(
                    modifier = Modifier.fillMaxWidth().padding(leftRight = 300.px)
                        .backgroundColor(Color.OurStoryBgColor.rgb),
                    contentAlignment = Alignment.Center,
                ) {
                    Row(
                        modifier = modifier.fillMaxWidth().margin { topBottom(70.px) },
                        horizontalArrangement = Arrangement.spacedBy(100.px),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {


                        Column(
                            verticalArrangement = Arrangement.spacedBy(20.px)
                        ) {
                            SpanText(
                                text = "Our Story",
                                modifier = OurStoryTitleTextStyle.toModifier().textAlign(TextAlign.Start)
                            )

                            SpanText(
                                text = "With a lot of industry experience, Riverstone Homes Management excels in delivering top-quality residential solutions. Our expertise ensures your project is in safe hands.",
                                modifier = OurStorySubTitleTextStyle.toModifier().textAlign(TextAlign.Start)
                            )

                            BorderedButton(
                                modifier = modifier,
                                onClick = { ctx.router.tryRoutingTo(Constants.OFFERINGS_ROUTE) },
                                buttonTitle = "Learn More"
                            )
                        }

                        ServiceImage(
                            src = Res.OUT_STORY_IMAGE,
                            modifier = modifier
                                .size(500.px)
                                .aspectRatio(1f)
                                .objectFit(ObjectFit.Cover)
                                .clip(shape = Rect(10.px)),
                        )
                    }
                }
            }
        }
    }
}