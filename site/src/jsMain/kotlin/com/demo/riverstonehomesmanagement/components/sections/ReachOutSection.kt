package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.*
import com.demo.riverstonehomesmanagement.components.widgets.BorderedButton
import com.demo.riverstonehomesmanagement.theme.Color
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.TextArea
import org.jetbrains.compose.web.dom.TextInput

@Composable
fun ReachOutSection(modifier: Modifier = Modifier, breakpoint: Breakpoint) {

    val ctx = rememberPageContext()

    // padding and alignment dynamically
    val padding = when (breakpoint) {
        Breakpoint.SM -> Modifier.padding(topBottom = 80.px, leftRight = 20.px) // small screens
        Breakpoint.MD -> Modifier.padding(topBottom = 120.px, leftRight = 30.px)
        else -> Modifier.padding(topBottom = 150.px, leftRight = 50.px) // default, large screen
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .justifyContent(JustifyContent.Center),
        contentAlignment = Alignment.Center,
    ) {
        when (breakpoint) {
            Breakpoint.ZERO, Breakpoint.SM, Breakpoint.MD -> {
                Column(
                    modifier = modifier
                        .minWidth(100.vw)
                        .fillMaxWidth()
                        .then(padding),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    ReachOutInfo(Modifier.fillMaxWidth())
                    ReachOutForm(Modifier.fillMaxWidth())
                }
            }
            else -> {
                Row(
                    modifier = modifier
                        .minWidth(100.vh)
                        .fillMaxWidth()
                        .then(padding),
//                .padding(leftRight = 100.px, topBottom = 50.px),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    ReachOutInfo(modifier.fillMaxWidth().weight(1f))
                    ReachOutForm(modifier.fillMaxWidth().weight(1f))
                }
            }
        }
    }
}

@Composable
fun ReachOutInfo(modifier: Modifier = Modifier) {
    Div {
        Box(
            modifier = modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(20.px)
            ) {
                SpanText(
                    text = "Reach Out To Us Today For Your Needs",
                    modifier = modifier
                        .fontFamily("Rubik")
                        .fontWeight(FontWeight.Medium)
                        .fontSize(1.75.cssRem)
                        .color(Color.ServiceTitleTextColor.rgb)
                )

                Box {
                    Column {
                        SpanText(
                            text = "Address",
                            modifier = modifier
                                .fontFamily("Rubik")
                                .fontWeight(FontWeight.Medium)
                                .fontSize(20.px)
                                .color(Color.ServiceTitleTextColor.rgb)
                        )

                        SpanText(
                            text = "7901 4th St N STE 300, St. Petersburg, FL 33702",
                            modifier = modifier
                                .fontFamily("Karla")
                                .fontWeight(FontWeight.Light)
                                .lineHeight(25.px)
                                .fontSize(17.px)
                                .textAlign(TextAlign.Justify)
                                .color(Color.ServiceSubTitleTextColor.rgb)
                        )
                    }
                }
                Box {
                    Column {
                        SpanText(
                            text = "Phone",
                            modifier = modifier
                                .fontFamily("Rubik")
                                .fontWeight(FontWeight.Medium)
                                .fontSize(20.px)
                                .color(Color.ServiceTitleTextColor.rgb)
                        )

                        SpanText(
                            text = "(321) 204-3110",
                            modifier = modifier
                                .fontFamily("Karla")
                                .fontWeight(FontWeight.Light)
                                .lineHeight(25.px)
                                .fontSize(17.px)
                                .textAlign(TextAlign.Justify)
                                .color(Color.ServiceSubTitleTextColor.rgb)
                        )
                    }
                }
                Box {
                    Column {
                        SpanText(
                            text = "Email",
                            modifier = modifier
                                .fontFamily("Rubik")
                                .fontWeight(FontWeight.Medium)
                                .fontSize(20.px)
                                .color(Color.ServiceTitleTextColor.rgb)
                        )

                        SpanText(
                            text = "info@riverstonehomesmgt.com",
                            modifier = modifier
                                .fontFamily("Karla")
                                .fontWeight(FontWeight.Light)
                                .lineHeight(25.px)
                                .fontSize(17.px)
                                .textAlign(TextAlign.Justify)
                                .color(Color.ServiceSubTitleTextColor.rgb)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ReachOutForm(modifier: Modifier = Modifier) {

    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    Box(modifier = modifier.fillMaxWidth()) {
        Column(verticalArrangement = Arrangement.spacedBy(10.px)) {

            // full name
            Column {
                /*Form {
                   Label(forId = fullName)
                }*/
                SpanText(text = "Full Name")
                TextInput(value = fullName)
            }

            // email
            Column {
                SpanText(text = "Email")
                TextInput(value = email)
            }

            // message
            Column {
                SpanText(text = "Message")
                TextArea(value = message)
            }

            // submit button
            BorderedButton(
                modifier = Modifier,
                onClick = { },
                buttonTitle = "Send Message",
                defaultBgColor = Color.HoveredGreenButtonColor.rgb,
                hoveredBgColor = Color.UnHoveredGreenButtonColor.rgb,
                defaultTextColor = Color.White.rgb,
                hoveredTextColor = Color.White.rgb,
                defaultBorderColor = Colors.Transparent,
                hoveredBorderColor = Color.UnHoveredGreenButtonColor.rgb
            )
        }
    }
}

