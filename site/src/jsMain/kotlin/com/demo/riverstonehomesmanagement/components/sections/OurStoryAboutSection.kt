package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.widgets.BorderedButton
import com.demo.riverstonehomesmanagement.components.widgets.ServiceImage
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.styles.about.OurStoryAboutDescriptionTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.about.OurStoryAboutSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.about.OurStoryAboutTitleTextStyle
import com.demo.riverstonehomesmanagement.utils.Constants
import com.demo.riverstonehomesmanagement.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun OurStoryAboutSection(modifier: Modifier = Modifier, breakpoint: Breakpoint) {


    when (breakpoint) {
        Breakpoint.ZERO,
        Breakpoint.SM -> {
            Div {
                Box(
                    modifier = Modifier.fillMaxWidth().padding(leftRight = 30.px),
                    contentAlignment = Alignment.Center,
                ) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        SpanText(
                            text = "Our Story",
                            modifier = OurStoryAboutTitleTextStyle.toModifier().margin(topBottom = 15.px)
                            /*modifier = modifier
                                .fontFamily("Rubik")
                                .fontWeight(FontWeight.Medium)
                                .fontSize(3.cssRem)
                                .color(Color.ServiceTitleTextColor.rgb)
                                .margin(top = 30.px)*/
                        )

                        Column(
                            modifier = modifier.fillMaxWidth().margin { topBottom(35.px) },
                            verticalArrangement = Arrangement.spacedBy(15.px),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            ServiceImage(
                                src = Res.OUT_STORY_IMAGE,
                                modifier = modifier
                                    .size(250.px)
                                    .aspectRatio(1f)
                                    .objectFit(ObjectFit.Cover)
                                    .clip(shape = Rect(10.px)),
                            )

                            Column(
                                modifier = modifier,
                                verticalArrangement = Arrangement.spacedBy(20.px)
                            ) {
                                SpanText(
                                    text = "Riverstone Homes Management is a reliable property management company based in Petersburg, FL, dedicated to exceeding client expectations in every project we undertake.",
                                    modifier = OurStoryAboutSubTitleTextStyle.toModifier().textAlign(TextAlign.Center)
                                    /*modifier = modifier
                                        .fontFamily("Rubik")
                                        .fontWeight(FontWeight.Medium)
                                        .fontSize(1.25.cssRem)
                                        .color(Color.ServiceTitleTextColor.rgb)*/
                                )

                                SpanText(
                                    text = "Founded with a passion for craftsmanship and a commitment to excellence, Riverstone Homes Management started with a vision to redefine the home building experience.",
                                    modifier = OurStoryAboutDescriptionTextStyle.toModifier().textAlign(TextAlign.Center)
                                    /*modifier = modifier
                                        .fillMaxWidth()
                                        .fontFamily("Karla")
                                        .fontWeight(FontWeight.Light)
                                        .lineHeight(25.px)
                                        .fontSize(17.px)
                                        .textAlign(TextAlign.Start)
                                        .color(Color.ServiceSubTitleTextColor.rgb)*/
                                )
                            }
                        }
                    }
                }
            }
        }

        else -> {
            Div {
                Box(
                    modifier = Modifier.fillMaxWidth().padding(leftRight = 300.px),
                    contentAlignment = Alignment.Center,
                ) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        SpanText(
                            text = "Our Story",
                            modifier = OurStoryAboutTitleTextStyle.toModifier().margin(topBottom = 30.px)
                            /*modifier = modifier
                                .fontFamily("Rubik")
                                .fontWeight(FontWeight.Medium)
                                .fontSize(3.cssRem)
                                .color(Color.ServiceTitleTextColor.rgb)
                                .margin(top = 30.px)*/
                        )

                        Row(
                            modifier = modifier.fillMaxWidth().margin { topBottom(70.px) },
                            horizontalArrangement = Arrangement.spacedBy(100.px),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            ServiceImage(
                                src = Res.OUT_STORY_IMAGE,
                                modifier = modifier
                                    .size(500.px)
                                    .aspectRatio(1f)
                                    .objectFit(ObjectFit.Cover)
                                    .clip(shape = Rect(10.px)),
                            )

                            Column(
                                modifier = modifier,
                                verticalArrangement = Arrangement.spacedBy(20.px)
                            ) {
                                SpanText(
                                    text = "Riverstone Homes Management is a reliable property management company based in Petersburg, FL, dedicated to exceeding client expectations in every project we undertake.",
                                    modifier = OurStoryAboutSubTitleTextStyle.toModifier()
                                    /*modifier = modifier
                                        .fontFamily("Rubik")
                                        .fontWeight(FontWeight.Medium)
                                        .fontSize(1.25.cssRem)
                                        .color(Color.ServiceTitleTextColor.rgb)*/
                                )

                                SpanText(
                                    text = "Founded with a passion for craftsmanship and a commitment to excellence, Riverstone Homes Management started with a vision to redefine the home building experience.",
                                    modifier = OurStoryAboutDescriptionTextStyle.toModifier().textAlign(TextAlign.Start)
                                    /*modifier = modifier
                                        .fillMaxWidth()
                                        .fontFamily("Karla")
                                        .fontWeight(FontWeight.Light)
                                        .lineHeight(25.px)
                                        .fontSize(17.px)
                                        .textAlign(TextAlign.Start)
                                        .color(Color.ServiceSubTitleTextColor.rgb)*/
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}