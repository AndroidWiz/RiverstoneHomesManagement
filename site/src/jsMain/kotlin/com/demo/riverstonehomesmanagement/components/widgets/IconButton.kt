package com.demo.riverstonehomesmanagement.components.widgets

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.CircleButtonVariant
import com.demo.riverstonehomesmanagement.UncoloredButtonVariant
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.scale
import com.varabyte.kobweb.compose.ui.modifiers.setVariable
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.em

@Composable
fun IconButton(onClick: () -> Unit, content: @Composable () -> Unit) {
    Button(
        onClick = { onClick() },
        Modifier.setVariable(ButtonVars.FontSize, 1.em), // Make button icon size relative to parent container font size
        variant = CircleButtonVariant.then(UncoloredButtonVariant)
    ) {
        content()
    }
}

val SocialIconsStyle = CssStyle {
    hover {
        Modifier.scale(1.1)
    }
}
@Composable
fun IconButtonNoHover(
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Button(
        onClick = { onClick() },
        SocialIconsStyle.toModifier().setVariable(ButtonVars.FontSize, 1.em)
            .backgroundColor(Colors.Transparent), // Make button icon size relative to parent container font size
        variant = CircleButtonVariant.then(UncoloredButtonVariant)
    ) {
        content()
    }
}