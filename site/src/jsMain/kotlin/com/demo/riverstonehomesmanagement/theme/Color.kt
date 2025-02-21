package com.demo.riverstonehomesmanagement.theme

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

enum class Color(
    val hex: String,
    val rgb: CSSColorValue
) {
    Primary(hex = "#19142A", rgb = rgb(25, 20, 42)),
    Secondary(hex = "#D6223B", rgb = rgb(r = 214, g = 34, b = 59)),
    SecondaryVariant(hex = "#2a2344", rgb = rgb(42, 35, 68)),
    WelcomeTextBackground(hex = "#51182e", rgb = rgb(81, 24, 46)),
    White(hex = "#FFFFFF", rgb = rgb(255, 255, 255)),
    GreyTextColor(hex = "#282432", rgb = rgb(137, 132, 152)),

    GreenButton1(hex = "#369237", rgb = rgb(54, 146, 55)),
    GreenButton2(hex = "#54B434", rgb = rgb(84, 180, 52)),
    ServiceNumberTextColor(hex = "#6db249", rgb = rgb(109, 178, 73)),
    ServiceTitleTextColor(hex = "#0F172A", rgb = rgb(15, 23, 42)),
    ServiceSubTitleTextColor(hex = "#2f3b40", rgb = rgb(47, 59, 64)),
    ServiceDescriptionTextColor(hex = "#313b3f", rgb = rgb(49, 59, 63)),
    OurStoryBgColor(hex = "#f0fbe4", rgb = rgb(240, 251, 228)),
    NavLinkTextColor(hex = "#D5EAD8", rgb = rgb(213, 234, 216)),

    HoveredGreenButtonColor(hex = "#54B435", rgb = rgb(84 ,180 ,53)),
    UnHoveredGreenButtonColor(hex = "#379237", rgb = rgb(55 ,146 ,55)),

}