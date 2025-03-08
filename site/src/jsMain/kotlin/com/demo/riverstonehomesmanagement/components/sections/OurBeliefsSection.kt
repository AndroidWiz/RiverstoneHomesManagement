package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.components.widgets.BeliefItem
import com.demo.riverstonehomesmanagement.models.getAllBeliefs
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.styles.OurBeliefsSubTitleTextStyle
import com.demo.riverstonehomesmanagement.theme.styles.OurBeliefsTitleTextStyle
import com.varabyte.kobweb.compose.css.BackgroundSize
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun OurBeliefsSection(modifier: Modifier = Modifier, breakpoint: Breakpoint) {
    Div {
        Box(
            modifier = Modifier
                .fillMaxWidth()
//                .padding(leftRight = 300.px)
                .backgroundColor(Color.OurStoryBgColor.rgb)
                .backgroundSize(BackgroundSize.Cover),
            contentAlignment = Alignment.Center,
        ) {
            // content
            Column(
                modifier = modifier
                    .fillMaxSize(100.percent)
                    .position(Position.Relative)
//                    .padding(topBottom = 100.px, leftRight = 40.px),
                    .padding(topBottom = 100.px),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(15.px)
            ) {

                SpanText(
                    text = "Our Beliefs",
                    modifier = OurBeliefsTitleTextStyle.toModifier()
                    /* modifier = modifier
                        .fontFamily("Rubik")
                        .fontWeight(FontWeight.Medium)
                        .fontSize(3.cssRem)
                        .color(Color.ServiceTitleTextColor.rgb)*/
                )

                SpanText(
                    text = "Guided by a commitment to integrity and excellence, our core values define who we are and how we work.",
                    modifier = OurBeliefsSubTitleTextStyle.toModifier()
                    /*modifier = modifier
                        .fontFamily("Karla")
                        .fontWeight(FontWeight.Light)
                        .lineHeight(25.px)
                        .fontSize(17.px)
                        .textAlign(TextAlign.Center)
                        .color(Color.ServiceSubTitleTextColor.rgb)*/
                )

                SimpleGrid(
//                    numColumns = numColumns(base = 3),
                    numColumns = numColumns(base = 1, lg = 3),
                    modifier = Modifier.padding(
                        leftRight = when (breakpoint) {
                            Breakpoint.ZERO,
                            Breakpoint.SM,
                            Breakpoint.MD -> 15.px
                            else -> 150.px
                        }
                    ).margin(top = 1.5.cssRem, bottom = 2.cssRem)
//                    modifier = Modifier.padding(leftRight = 150.px).margin(top = 1.5.cssRem, bottom = 2.cssRem)
                ) {
                    val beliefs = getAllBeliefs()

                    repeat(beliefs.size) {
                        BeliefItem(beliefs = beliefs[it])
                    }
                }
            }
        }
    }
}