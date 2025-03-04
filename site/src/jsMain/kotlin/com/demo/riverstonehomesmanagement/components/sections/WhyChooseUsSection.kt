package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.widgets.ServiceItem
import com.demo.riverstonehomesmanagement.models.getAllServices
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.styles.about.WhyChooseUsSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.about.WhyChooseUsTitleTextStyle
import com.demo.riverstonehomesmanagement.utils.Constants
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
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
fun WhyChooseUsSection(modifier: Modifier = Modifier, breakpoint: Breakpoint) {

    val ctx = rememberPageContext()

    Div {
        Box(
            modifier = modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ) {
            Column(
                modifier = modifier.fillMaxWidth().margin { top(50.px) },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(15.px)
            ) {

                SpanText(
                    text = "Why Choose Us",
                    modifier = WhyChooseUsTitleTextStyle.toModifier()
                    /* modifier = modifier
                        .fontFamily("Rubik")
                        .fontWeight(FontWeight.Medium)
                        .fontSize(3.cssRem)
                        .color(Color.ServiceTitleTextColor.rgb)*/
                )

                SpanText(
                    text = "We stand out through our commitment to excellence, client-focused approach, and delivering superior results that exceed expectations.",
                    modifier = WhyChooseUsSubTitleTextStyle.toModifier()
                        .padding(
                            when (breakpoint) {
                                Breakpoint.ZERO,
                                Breakpoint.SM -> 15.px
                                else -> 0.px
                            }
                        )
                    /*modifier = modifier
                        .fontFamily("Karla")
                        .fontWeight(FontWeight.Light)
                        .lineHeight(25.px)
                        .fontSize(17.px)
                        .textAlign(TextAlign.Center)
                        .color(Color.ServiceSubTitleTextColor.rgb)*/
                )

                SimpleGrid(
                    numColumns = numColumns(base = 1),
                    modifier = Modifier.padding(leftRight = 300.px).margin(top = 1.5.cssRem, bottom = 2.cssRem)
                ) {
                    val services = getAllServices().takeLast(2)

                    repeat(services.size) {
                        ServiceItem(
                            service = services[it],
                            buttonTitle = "Learn More",
                            onClick = { ctx.router.navigateTo(Constants.OFFERINGS_ROUTE) }
                        )
                    }
                }
            }
        }
    }
}