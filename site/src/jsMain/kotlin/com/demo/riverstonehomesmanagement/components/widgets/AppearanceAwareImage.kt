package com.demo.riverstonehomesmanagement.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.dom.ElementRefScope
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.graphics.ImageKind
import com.varabyte.kobweb.silk.style.CssStyleVariant
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.w3c.dom.HTMLImageElement

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun AppearanceAwareImage(
    src: String,
    modifier: Modifier = Modifier,
    variant: CssStyleVariant<ImageKind>? = null,
    width: Int? = null,
    height: Int? = null,
    alt: String = "",
    ref: ElementRefScope<HTMLImageElement>? = null,
) {
    val isLight = when (ColorMode.current) {
        ColorMode.LIGHT -> true
        ColorMode.DARK -> true
    }

    Image(
        src = src,
        modifier = Modifier
//            .styleModifier { filter { if (isLight) invert(1) else invert(0) } }
            .then(modifier),
        variant = variant,
        width = width,
        height = height,
        alt = alt,
        ref = ref
    )
}


@Composable
fun BackgroundImage(
    src: String,
    modifier: Modifier = Modifier,
    variant: CssStyleVariant<ImageKind>? = null,
    width: Int? = null,
    height: Int? = null,
    alt: String = "",
    ref: ElementRefScope<HTMLImageElement>? = null,
    cropHeight: Int? = null
) {
    Image(
        src = src,
        modifier = Modifier
            .then(modifier)
            .styleModifier {
                if (cropHeight != null) {
                    property("object-fit", "cover")
                    property("height", "${cropHeight}px")
                }
            },
        variant = variant,
        width = width,
        height = height,
        alt = alt,
        ref = ref
    )
}