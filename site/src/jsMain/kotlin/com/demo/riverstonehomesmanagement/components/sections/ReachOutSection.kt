package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.*
import com.demo.riverstonehomesmanagement.components.widgets.AppearanceAwareImage
import com.demo.riverstonehomesmanagement.components.widgets.BorderedButton
import com.demo.riverstonehomesmanagement.components.widgets.IconButtonNoHover
import com.demo.riverstonehomesmanagement.components.widgets.LabeledTextInput
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.styles.ReachOutDescriptionTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.ReachOutSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.ReachOutTitleTextStyle
import com.demo.riverstonehomesmanagement.utils.Constants
import com.demo.riverstonehomesmanagement.utils.Res
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
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

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
            .alignSelf(AlignSelf.Center)
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
                    ReachOutInfo(modifier = modifier.fillMaxWidth(), ctx = ctx)

                    ReachOutForm(modifier = modifier.fillMaxWidth(), breakpoint = breakpoint)
                }
            }

            else -> {
                Box(
                    modifier = modifier
                        .margin(topBottom = 65.px)
                        .fillMaxWidth()
                        .then(padding),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .then(padding),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        ReachOutInfo(modifier = modifier.weight(1f), ctx = ctx)

                        // divider line
                        Box(
                            modifier = modifier
                                .margin(left = 30.px, right = 0.px)
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
fun ReachOutInfo(modifier: Modifier, ctx: PageContext) {
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
            )

            // divider line
            Box(
                modifier = modifier
                    .margin(top = (-10).px, bottom = 5.px)
                    .fillMaxWidth()
                    .height(0.5.px)
                    .backgroundColor(Color.HoveredGreenButtonColor.rgb)
            )

            // address
            Box {
                Column {
                    SpanText(
                        text = "Address",
                        modifier = ReachOutSubTitleTextStyle.toModifier()
                    )

                    SpanText(
                        text = "7901 4th St N STE 300, St. Petersburg, FL 33702",
                        modifier = ReachOutDescriptionTextStyle.toModifier()
                    )
                }
            }

            // phone
            Box {
                Column {
                    SpanText(
                        text = "Phone",
                        modifier = ReachOutSubTitleTextStyle.toModifier()
                    )

                    SpanText(
                        text = "(321) 204-3110",
                        modifier = ReachOutDescriptionTextStyle.toModifier()
                    )
                }
            }

            // email
            Box {
                Column {
                    SpanText(
                        text = "Email",
                        modifier = ReachOutSubTitleTextStyle.toModifier()
                    )

                    SpanText(
                        text = "info@riverstonehomesmgt.com",
                        modifier = ReachOutDescriptionTextStyle.toModifier()
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
}

@Composable
fun NetworkingIconButtons(ctx: PageContext, modifier: Modifier) {
    SimpleGrid(
        modifier = modifier,
        numColumns = numColumns(base = 3)
    ) {
        IconButtonNoHover(
            onClick = { ctx.router.navigateTo(Constants.FACEBOOK_URL) }
        ) {
            AppearanceAwareImage(src = Res.FACEBOOK)
        }

        /*IconButtonNoHover(
            onClick = { ctx.router.navigateTo(Constants.INSTAGRAM_URL) }
        ) {
            AppearanceAwareImage(src = Res.INSTAGRAM)
        }*/

        IconButtonNoHover(
            onClick = { ctx.router.navigateTo(Constants.TWITTER_URL) }
        ) {
            AppearanceAwareImage(src = Res.TWITTER_X)
        }

        IconButtonNoHover(
            onClick = { ctx.router.navigateTo(Constants.LINKEDIN_URL) }
        ) {
            AppearanceAwareImage(src = Res.LINKEDIN)
        }

        /*IconButtonNoHover(
            onClick = { ctx.router.navigateTo(Constants.YOUTUBE_URL) }
        ) {
            AppearanceAwareImage(src = Res.YOUTUBE)
        }*/
    }
}

@Composable
fun ReachOutForm(modifier: Modifier, breakpoint: Breakpoint) {

    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }
    var showPopup by remember { mutableStateOf(false) }


    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = when (breakpoint) {
            Breakpoint.LG -> Alignment.CenterStart
            else -> Alignment.Center
        }
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.px, Alignment.CenterVertically),
        ) {

            // full name
            LabeledTextInput(
                label = "Full Name",
                value = fullName,
                onTextChanged = { fullName = it },
                placeholder = "Enter your full name",
                modifier = modifier,
            )

            // email
            LabeledTextInput(
                label = "Email",
                value = email,
                onTextChanged = { email = it },
                placeholder = "Enter your email",
                modifier = modifier,
            )

            // message
            LabeledTextInput(
                label = "Message",
                value = message,
                onTextChanged = { message = it },
                placeholder = "Enter your message",
                modifier = modifier,
                height = 140.px
            )

            // submit button
            BorderedButton(
                modifier = modifier,
                onClick = {
                    if (fullName.isBlank() || email.isBlank() || message.isBlank()) {
                        errorMessage = "Please fill in all fields."
                    } else {
                        errorMessage = ""
                        sendEmail(fullName, email, message)
                        showPopup = true

                        // clear out inputs
                        fullName = ""
                        email = ""
                        message = ""
                    }
                },
                buttonTitle = "Send Message",
                defaultBgColor = Color.HoveredGreenButtonColor.rgb,
                hoveredBgColor = Color.UnHoveredGreenButtonColor.rgb,
                defaultTextColor = Color.White.rgb,
                hoveredTextColor = Color.White.rgb,
                defaultBorderColor = Colors.Transparent,
                hoveredBorderColor = Color.UnHoveredGreenButtonColor.rgb
            )

            if (errorMessage.isNotEmpty()) {
                Span(attrs = { style { color(Colors.Red) } }) {
                    Text(value = errorMessage)
                }
            }
        }

        // Popup
        if (showPopup) {
            EmailSentPopup { showPopup = false }
        }
    }
}

@Composable
fun EmailSentPopup(onClose: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(Colors.Black.copy(alpha = 0.5f.toInt())),
        contentAlignment = Alignment.Center
    ) {
        Div(attrs = {
            style {
                backgroundColor(Colors.White)
                padding(20.px)
                borderRadius(8.px)
            }
        }) {
            Text("Email sent successfully!")
            Button(onClick = { onClose() }) {
                Text("Close")
            }
        }
    }
}

fun sendEmail(fullName: String, email: String, message: String) {
    val recipient = "rashedc004@gmail.com"
    val subject = "Contact Form Submission"
    val body = "Full Name: $fullName\nEmail: $email\nMessage: $message"

    val mailtoUri = "mailto:$recipient?subject=${encodeURIComponent(subject)}&body=${encodeURIComponent(body)}"
    window.location.href = mailtoUri
}

fun encodeURIComponent(value: String): String {
    return js("encodeURIComponent(value)") as String
}

