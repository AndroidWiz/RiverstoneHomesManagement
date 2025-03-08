package com.demo.riverstonehomesmanagement.components.widgets

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.models.Services
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.styles.offerings.ServiceItemSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.offerings.ServiceItemTitleTextStyle
import com.varabyte.kobweb.compose.css.AlignSelf
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnDefaults
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
import org.jetbrains.compose.web.css.cssRem
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
//                .margin(left = (-120).px)
                        .size(250.px)
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
                        modifier = ServiceItemTitleTextStyle.toModifier().textAlign(TextAlign.Center)
                        /*modifier = modifier
                            .fontFamily("Rubik")
                            .fontWeight(FontWeight.Medium)
                            .fontSize(1.75.cssRem)
                            .color(Color.ServiceTitleTextColor.rgb)*/
                    )

                    SpanText(
                        text = service.description,
                        modifier = ServiceItemSubTitleTextStyle.toModifier().textAlign(TextAlign.Justify)
                        /*modifier = modifier
                            .fillMaxWidth()
                            .fontFamily("Karla")
                            .fontWeight(FontWeight.Light)
                            .lineHeight(25.px)
                            .fontSize(17.px)
                            .textAlign(TextAlign.Start)
                            .color(Color.ServiceSubTitleTextColor.rgb)*/
                    )

                    // button
                    BorderedButton(
                        modifier = modifier.alignSelf(AlignSelf.Center),
//                onClick = { ctx.router.tryRoutingTo(Constants.OFFERINGS_ROUTE) },
                        onClick = { onClick() },
                        buttonTitle = buttonTitle
                    )
                    /* Button(
                         onClick = { ctx.router.tryRoutingTo(Constants.OFFERINGS_ROUTE) },
                         variant = UncoloredButtonVariant,
                         modifier = modifier
                             .fontFamily("Karla")
                             .fontSize(16.px)
                             .border(1.px, LineStyle.Solid, Color.ServiceSubTitleTextColor.rgb)
                             .hovered { modifier ->
                                 modifier.background(Colors.LightGreen)
                             }
                             .color(Color.ServiceSubTitleTextColor.rgb),
                         size = ButtonSize.LG,
                     ) {
                         Text(buttonTitle)
                     }*/
                }
            }
        }

        else -> {
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
                        modifier = ServiceItemTitleTextStyle.toModifier().textAlign(TextAlign.Start)
                        /*modifier = modifier
                            .fontFamily("Rubik")
                            .fontWeight(FontWeight.Medium)
                            .fontSize(1.75.cssRem)
                            .color(Color.ServiceTitleTextColor.rgb)*/
                    )

                    SpanText(
                        text = service.description,
                        modifier = ServiceItemSubTitleTextStyle.toModifier().textAlign(TextAlign.Start)
                        /*modifier = modifier
                            .fillMaxWidth()
                            .fontFamily("Karla")
                            .fontWeight(FontWeight.Light)
                            .lineHeight(25.px)
                            .fontSize(17.px)
                            .textAlign(TextAlign.Start)
                            .color(Color.ServiceSubTitleTextColor.rgb)*/
                    )

                    // button
                    BorderedButton(
                        modifier = modifier,
//                onClick = { ctx.router.tryRoutingTo(Constants.OFFERINGS_ROUTE) },
                        onClick = { onClick() },
                        buttonTitle = buttonTitle
                    )
                    /* Button(
                         onClick = { ctx.router.tryRoutingTo(Constants.OFFERINGS_ROUTE) },
                         variant = UncoloredButtonVariant,
                         modifier = modifier
                             .fontFamily("Karla")
                             .fontSize(16.px)
                             .border(1.px, LineStyle.Solid, Color.ServiceSubTitleTextColor.rgb)
                             .hovered { modifier ->
                                 modifier.background(Colors.LightGreen)
                             }
                             .color(Color.ServiceSubTitleTextColor.rgb),
                         size = ButtonSize.LG,
                     ) {
                         Text(buttonTitle)
                     }*/
                }
            }
        }
    }
}