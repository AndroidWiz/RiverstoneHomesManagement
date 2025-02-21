package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.widgets.BorderedButton
import com.demo.riverstonehomesmanagement.components.widgets.ServiceImage
import com.demo.riverstonehomesmanagement.theme.Color
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
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun OurStorySection(modifier: Modifier = Modifier) {

    val ctx = rememberPageContext()

    Div {
        Box(
            modifier = Modifier.fillMaxWidth().padding(leftRight = 300.px).backgroundColor(Color.OurStoryBgColor.rgb),
            contentAlignment = Alignment.Center,
        ) {
            Row(
                modifier = modifier.fillMaxWidth().margin { topBottom(70.px) },
//        modifier = modifier.fillMaxWidth().margin(topBottom = 20.px, leftRight = (-50).px),
                horizontalArrangement = Arrangement.spacedBy(100.px),
                verticalAlignment = Alignment.CenterVertically,
            ) {


                Column(
//                    modifier = modifier.margin(right = (-150).px),
                    verticalArrangement = Arrangement.spacedBy(20.px)
                ) {
                    SpanText(
                        text = "Our Story",
                        modifier = modifier
                            .fontFamily("Rubik")
                            .fontWeight(FontWeight.Medium)
                            .fontSize(1.75.cssRem)
                            .color(Color.ServiceTitleTextColor.rgb)
                    )

                    SpanText(
                        text = "With a lot of industry experience, Riverstone Homes Management excels in delivering top-quality residential solutions. Our expertise ensures your project is in safe hands.",
                        modifier = modifier
                            .fillMaxWidth()
                            .fontFamily("Karla")
                            .fontWeight(FontWeight.Light)
                            .lineHeight(25.px)
                            .fontSize(17.px)
                            .textAlign(TextAlign.Start)
                            .color(Color.ServiceSubTitleTextColor.rgb)
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
//                        .margin(left = (-120).px)
                        .size(500.px)
                        .aspectRatio(1f)
                        .objectFit(ObjectFit.Cover)
                        .clip(shape = Rect(10.px)),
                )
            }
        }
    }
}