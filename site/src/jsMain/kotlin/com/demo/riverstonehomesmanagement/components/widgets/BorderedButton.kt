package com.demo.riverstonehomesmanagement.components.widgets

import androidx.compose.runtime.*
import com.demo.riverstonehomesmanagement.UncoloredButtonVariant
import com.demo.riverstonehomesmanagement.theme.Color
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.onMouseEnter
import com.varabyte.kobweb.compose.ui.modifiers.onMouseLeave
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Text


@Composable
fun BorderedButton(
    modifier: Modifier,
    onClick: () -> Unit,
    buttonTitle: String,
    defaultBgColor: CSSColorValue = Colors.Transparent,
    hoveredBgColor: CSSColorValue = Color.HoveredGreenButtonColor.rgb,
    defaultTextColor: CSSColorValue = Color.ServiceSubTitleTextColor.rgb,
    hoveredTextColor: CSSColorValue = Color.White.rgb,
    defaultBorderColor: CSSColorValue = Color.ServiceSubTitleTextColor.rgb,
    hoveredBorderColor: CSSColorValue = Color.White.rgb,
) {
    var isHovered by remember { mutableStateOf(false) }

    Button(
        onClick = { onClick() },
        variant = UncoloredButtonVariant,
        modifier = modifier
            .fontFamily("Karla")
            .fontSize(16.px)
            .onMouseEnter { isHovered = true }
            .onMouseLeave { isHovered = false }
            .styleModifier {
                color(if (isHovered) hoveredTextColor else defaultTextColor) // text color
                border(1.px, LineStyle.Solid, if (isHovered) hoveredBorderColor else defaultBorderColor)
                backgroundColor(if (isHovered) hoveredBgColor else defaultBgColor)
            },
        size = ButtonSize.LG,
    ) {
        Text(buttonTitle)
    }
}

