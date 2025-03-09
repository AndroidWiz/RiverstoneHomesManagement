package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.*
import com.demo.riverstonehomesmanagement.components.widgets.BorderedButton
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.styles.ReachOutDescriptionTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.ReachOutSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.ReachOutTitleTextStyle
import com.varabyte.kobweb.compose.css.AlignSelf
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.TextInput
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun ReachOutSection(modifier: Modifier = Modifier, breakpoint: Breakpoint) {

    val ctx = rememberPageContext()

    // padding and alignment dynamically
    val padding = when (breakpoint) {
        Breakpoint.SM -> modifier.padding(20.px) // small screens
        else -> modifier.padding(10.px) // default, large screen
    }

    Div(
        attrs = modifier
            .fillMaxWidth()
//            .alignItems(AlignItems.Center)
            .alignSelf(AlignSelf.Center)
//            .justifyContent(JustifyContent.Center)
            .toAttrs(),
    ) {
        when (breakpoint) {
            Breakpoint.ZERO, Breakpoint.SM, Breakpoint.MD -> {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .then(padding),
                    verticalArrangement = Arrangement.spacedBy(30.px),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    ReachOutInfo(modifier = modifier.fillMaxWidth())

                    ReachOutForm(modifier = modifier.fillMaxWidth(), breakpoint = breakpoint)
                }
            }

            else -> {
                Box(
                    modifier = modifier.margin(topBottom = 65.px).fillMaxWidth()
//                        .alignSelf(AlignSelf.Center)
                        .then(padding),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .then(padding),
//                .padding(leftRight = 100.px, topBottom = 50.px),
                        horizontalArrangement = Arrangement.Center,
//                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        ReachOutInfo(modifier = modifier.weight(1f))

                        // divider line
                        Box(
                            modifier = modifier
                                .margin(left = 30.px, right = 0.px)
//                                .margin(leftRight = 10.px)
                                .width(1.px)
                                .height(400.px)
                                .backgroundColor(Color.HoveredGreenButtonColor.rgb)
                        )

                        ReachOutForm(modifier = modifier.weight(1f), breakpoint = breakpoint)
                    }
                }
            }
        }
    }
}

@Composable
fun ReachOutInfo(modifier: Modifier) {
//    Div {
    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(20.px, Alignment.CenterVertically)
        ) {
            SpanText(
                text = "Reach Out To Us Today For Your Needs",
                modifier = ReachOutTitleTextStyle.toModifier()
                /*modifier = modifier
                    .fontFamily("Rubik")
                    .fontWeight(FontWeight.Medium)
                    .fontSize(1.75.cssRem)
                    .color(Color.ServiceTitleTextColor.rgb)*/
            )

            // divider line
            Box(
                modifier = modifier
                    .margin(top = (-10).px, bottom = 5.px)
                    .fillMaxWidth()
                    .height(0.5.px)
                    .backgroundColor(Color.HoveredGreenButtonColor.rgb)
            )

            Box {
                Column {
                    SpanText(
                        text = "Address",
                        modifier = ReachOutSubTitleTextStyle.toModifier()
                        /*modifier = modifier
                            .fontFamily("Rubik")
                            .fontWeight(FontWeight.Medium)
                            .fontSize(20.px)
                            .color(Color.ServiceTitleTextColor.rgb)*/
                    )

                    SpanText(
                        text = "7901 4th St N STE 300, St. Petersburg, FL 33702",
                        modifier = ReachOutDescriptionTextStyle.toModifier()
                        /*modifier = modifier
                            .fontFamily("Karla")
                            .fontWeight(FontWeight.Light)
                            .lineHeight(25.px)
                            .fontSize(17.px)
                            .textAlign(TextAlign.Justify)
                            .color(Color.ServiceSubTitleTextColor.rgb)*/
                    )
                }
            }
            Box {
                Column {
                    SpanText(
                        text = "Phone",
                        modifier = ReachOutSubTitleTextStyle.toModifier()
                        /*modifier = modifier
                            .fontFamily("Rubik")
                            .fontWeight(FontWeight.Medium)
                            .fontSize(20.px)
                            .color(Color.ServiceTitleTextColor.rgb)*/
                    )

                    SpanText(
                        text = "(321) 204-3110",
                        modifier = ReachOutDescriptionTextStyle.toModifier()
                        /*modifier = modifier
                            .fontFamily("Karla")
                            .fontWeight(FontWeight.Light)
                            .lineHeight(25.px)
                            .fontSize(17.px)
                            .textAlign(TextAlign.Justify)
                            .color(Color.ServiceSubTitleTextColor.rgb)*/
                    )
                }
            }
            Box {
                Column {
                    SpanText(
                        text = "Email",
                        modifier = ReachOutSubTitleTextStyle.toModifier()
                        /*modifier = modifier
                            .fontFamily("Rubik")
                            .fontWeight(FontWeight.Medium)
                            .fontSize(20.px)
                            .color(Color.ServiceTitleTextColor.rgb)*/
                    )

                    SpanText(
                        text = "info@riverstonehomesmgt.com",
                        modifier = ReachOutDescriptionTextStyle.toModifier()
                        /*modifier = modifier
                            .fontFamily("Karla")
                            .fontWeight(FontWeight.Light)
                            .lineHeight(25.px)
                            .fontSize(17.px)
                            .textAlign(TextAlign.Justify)
                            .color(Color.ServiceSubTitleTextColor.rgb)*/
                    )
                }
            }

            // divider line
            Box(
                modifier = modifier
                    .margin(top = 10.px, bottom = 5.px)
                    .fillMaxWidth()
                    .height(0.5.px)
                    .backgroundColor(Color.HoveredGreenButtonColor.rgb)
            )
        }
    }
//    }
}

@Composable
fun ReachOutForm(modifier: Modifier, breakpoint: Breakpoint) {

    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    Box(
        modifier = modifier.fillMaxWidth(),
//        contentAlignment = Alignment.Center
        contentAlignment = when(breakpoint){
            Breakpoint.LG -> Alignment.CenterStart
            else -> Alignment.Center
        }
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.px, Alignment.CenterVertically),
        ) {

            // full name
            Column {
                /*Form {
                   Label(forId = fullName)
                }*/
                SpanText(text = "Full Name")
                TextInput(
                    text = fullName,
                    placeholder = "Enter your full name",
                    onTextChange = { fullName = it },
                    modifier = modifier.height(40.px).width(100.percent),
                    focusBorderColor = Color.HoveredGreenButtonColor.rgb
                )
            }

            // email
            Column {
                SpanText(text = "Email")
                TextInput(
                    text = email,
                    placeholder = "Enter your email",
                    onTextChange = { email = it },
                    modifier = modifier.height(40.px).fillMaxWidth(),
                    focusBorderColor = Color.HoveredGreenButtonColor.rgb
                )
            }

            // message
            Column {
                SpanText(text = "Message")
                TextInput(
                    text = message,
                    placeholder = "Enter your message",
                    onTextChange = { message = it },
                    modifier = modifier.height(140.px).fillMaxWidth(),
                    focusBorderColor = Color.HoveredGreenButtonColor.rgb,
                )
            }

            // submit button
            BorderedButton(
                modifier = modifier,
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

