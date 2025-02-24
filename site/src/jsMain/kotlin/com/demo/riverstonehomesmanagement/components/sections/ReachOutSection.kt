package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.theme.Color
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun ReachOutSection(modifier: Modifier = Modifier) {

    val ctx = rememberPageContext()

    Div {
        Row {
            ReachOutInfo()
        }
    }
}

@Composable
fun ReachOutInfo() {
    Div {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(20.px)
            ) {
                SpanText(
                    text = "Reach Out To Us Today For Your Needs",
                    modifier = Modifier
                        .fontFamily("Rubik")
                        .fontWeight(FontWeight.Medium)
                        .fontSize(1.75.cssRem)
                        .color(Color.ServiceTitleTextColor.rgb)
                )

                Box {
                    Column {
                        SpanText(
                            text = "Address",
                            modifier = Modifier
                                .fontFamily("Rubik")
                                .fontWeight(FontWeight.Medium)
                                .fontSize(20.px)
                                .color(Color.ServiceTitleTextColor.rgb)
                        )

                        SpanText(
                            text = "7901 4th St N STE 300, St. Petersburg, FL 33702",
                            modifier = Modifier
                                .fontFamily("Karla")
                                .fontWeight(FontWeight.Light)
                                .lineHeight(25.px)
                                .fontSize(17.px)
                                .textAlign(TextAlign.Center)
                                .color(Color.ServiceSubTitleTextColor.rgb)
                        )
                    }
                }
                Box {
                    Column {
                        SpanText(
                            text = "Phone",
                            modifier = Modifier
                                .fontFamily("Rubik")
                                .fontWeight(FontWeight.Medium)
                                .fontSize(20.px)
                                .color(Color.ServiceTitleTextColor.rgb)
                        )

                        SpanText(
                            text = "(321) 204-3110",
                            modifier = Modifier
                                .fontFamily("Karla")
                                .fontWeight(FontWeight.Light)
                                .lineHeight(25.px)
                                .fontSize(17.px)
                                .textAlign(TextAlign.Center)
                                .color(Color.ServiceSubTitleTextColor.rgb)
                        )
                    }
                }
                Box {
                    Column {
                        SpanText(
                            text = "Email",
                            modifier = Modifier
                                .fontFamily("Rubik")
                                .fontWeight(FontWeight.Medium)
                                .fontSize(20.px)
                                .color(Color.ServiceTitleTextColor.rgb)
                        )

                        SpanText(
                            text = "info@riverstonehomesmgt.com",
                            modifier = Modifier
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
    }
}

@Composable
fun ReachOutForm() {
}