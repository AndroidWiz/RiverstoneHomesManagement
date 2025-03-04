package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.widgets.ServiceItem
import com.demo.riverstonehomesmanagement.models.getAllServices
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.styles.about.ServiceSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.about.ServiceTitleTextStyle
import com.demo.riverstonehomesmanagement.utils.Constants
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun ServicesSection(breakpoint: Breakpoint) {

    val ctx = rememberPageContext()

    Div {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().margin { top(50.px) },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(15.px)
            ) {

                SpanText(
                    text = "Explore Our Services",
                    modifier = ServiceTitleTextStyle.toModifier()
                    /*modifier = Modifier
                        .fontFamily("Rubik")
                        .fontWeight(FontWeight.Medium)
                        .fontSize(3.cssRem)
                        .color(Color.ServiceTitleTextColor.rgb)*/
                )

                SpanText(
                    text = "Discover the range of high-quality services we offer to meet all your residential construction needs.",
                    modifier = ServiceSubTitleTextStyle.toModifier()
                        .padding(when(breakpoint){
                            Breakpoint.ZERO,
                            Breakpoint.SM -> 15.px
                            else -> 0.px
                        })
                    /* modifier = Modifier
                        .fontFamily("Karla")
                        .fontWeight(FontWeight.Light)
                        .lineHeight(25.px)
                        .fontSize(17.px)
                        .textAlign(TextAlign.Center)
                        .color(Color.ServiceSubTitleTextColor.rgb)*/
                )

                Spacer()

                SimpleGrid(
                    numColumns = numColumns(base = 1),
                    modifier = Modifier.padding(leftRight = 300.px).margin(top = 1.5.cssRem, bottom = 2.cssRem)
                ) {
                    val services = getAllServices().take(2)

                    repeat(services.size) {
                        ServiceItem(
                            service = services[it],
                            buttonTitle = "Get Started",
                            onClick = { ctx.router.tryRoutingTo(Constants.OFFERINGS_ROUTE) }
                        )
                    }
                }
            }
        }
    }

}
