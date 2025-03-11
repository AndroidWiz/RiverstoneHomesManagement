package com.demo.riverstonehomesmanagement.components.widgets

import androidx.compose.runtime.Composable
import com.demo.riverstonehomesmanagement.theme.Color
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.silk.components.forms.TextInput
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.CSSLengthValue
import org.jetbrains.compose.web.css.px

@Composable
fun LabeledTextInput(
    label: String,
    value: String,
    onTextChanged: (String) -> Unit,
    placeholder: String,
    modifier: Modifier = Modifier,
    height: CSSLengthValue = 40.px,
) {
    Column {
        SpanText(text = label)
        TextInput(
            text = value,
            placeholder = placeholder,
            onTextChange = onTextChanged,
            modifier = modifier.height(height).fillMaxWidth(),
            focusBorderColor = Color.HoveredGreenButtonColor.rgb
        )
    }
}