package com.demo.riverstonehomesmanagement.components.sections

import androidx.compose.runtime.*
import com.demo.riverstonehomesmanagement.components.widgets.BorderedButton
import com.demo.riverstonehomesmanagement.components.widgets.IconButton
import com.demo.riverstonehomesmanagement.theme.Color
import com.demo.riverstonehomesmanagement.theme.toSitePalette
import com.demo.riverstonehomesmanagement.utils.Constants
import com.demo.riverstonehomesmanagement.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.css.functions.clamp
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.CloseIcon
import com.varabyte.kobweb.silk.components.icons.HamburgerIcon
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.components.overlay.Overlay
import com.varabyte.kobweb.silk.components.overlay.OverlayVars
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.breakpoint.displayUntil
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*

val NavHeaderStyle = CssStyle.base {
    Modifier
        .background(rgba(255, 255, 255, 0f))
        .fillMaxWidth()
        .padding(1.cssRem)
        .backdropFilter(blur(4.px))
        .styleModifier {
            property("-webkit-backdrop-filter", "blur( 4px )")
        }
//        .zIndex(1)
}

@Composable
private fun NavLink(path: String, text: String, color: CSSColorValue) {
    Link(
        path = path,
        text = text,
        variant = UndecoratedLinkVariant.then(UncoloredLinkVariant),
        modifier = Modifier
//            .color(Color.NavLinkTextColor.rgb)
            .color(color)
            .fontFamily("Karla")
            .fontSize(16.px)
            .fontWeight(FontWeight.Light)
    )
}

@Composable
private fun MenuItems(isSideMenu: Boolean = false, scrollY: Int) {
//    val linkColor = if (isSideMenu) Color.OurStoryBgColor.rgb else Color.NavLinkTextColor.rgb
//    val linkColor = if (isSideMenu) Color.ServiceTitleTextColor.rgb else Color.NavLinkTextColor.rgb
    val linkColor =
        if (isSideMenu) Color.ServiceTitleTextColor.rgb else if (scrollY > 500) Color.ServiceTitleTextColor.rgb else Color.NavLinkTextColor.rgb


    NavLink(path = Constants.HOME_ROUTE, text = Constants.HOME_PAGE_TITLE, color = linkColor)
    NavLink(path = Constants.ABOUT_ROUTE, text = Constants.ABOUT_PAGE_TITLE, color = linkColor)
    NavLink(path = Constants.OFFERINGS_ROUTE, text = Constants.OFFERINGS_PAGE_TITLE, color = linkColor)
    NavLink(path = Constants.CONTACT_ROUTE, text = Constants.CONTACT_PAGE_TITLE, color = linkColor)
//    NavLink("/", Constants.CALL_NOW_TITLE)
    BorderedButton(
        modifier = Modifier,
        onClick = { },
        buttonTitle = Constants.CALL_NOW_TITLE,
        hoveredBgColor = Color.UnHoveredGreenButtonColor.rgb,
        defaultTextColor = linkColor,
//        defaultTextColor = Color.NavLinkTextColor.rgb,
        hoveredTextColor = Color.NavLinkTextColor.rgb,
        defaultBorderColor = linkColor,
//        defaultBorderColor = Color.White.rgb,
        hoveredBorderColor = Color.UnHoveredGreenButtonColor.rgb
    )
}

@Composable
private fun HamburgerButton(onClick: () -> Unit) {
    IconButton(onClick) {
        HamburgerIcon()
    }
}

@Composable
private fun CloseButton(onClick: () -> Unit) {
    IconButton(onClick) {
        CloseIcon()
    }
}

val SideMenuSlideInAnim = Keyframes {
    from {
        Modifier.translateX(100.percent)
    }

    to {
        Modifier
    }
}

// Note: When the user closes the side menu, we don't immediately stop rendering it (at which point it would disappear
// abruptly). Instead, we start animating it out and only stop rendering it when the animation is complete.
enum class SideMenuState {
    CLOSED,
    OPEN,
    CLOSING;

    fun close() = when (this) {
        CLOSED -> CLOSED
        OPEN -> CLOSING
        CLOSING -> CLOSING
    }
}

@Composable
fun NavHeader(modifier: Modifier = Modifier, breakpoint: Breakpoint) {

    var scrollY by remember { mutableStateOf(0) }

    LaunchedEffect(Unit) {
        window.addEventListener("scroll", {
            scrollY = window.scrollY.toInt()
        })
    }

    Row(NavHeaderStyle.toModifier().fillMaxWidth().then(modifier), verticalAlignment = Alignment.CenterVertically) {
        Spacer()
        Link(Constants.HOME_ROUTE) {
            // Block display overrides inline display of the <img> tag, so it calculates centering better
            Image(
                src = Res.LOGO,
                description = "Riverstone Homes Management Logo",
//                modifier = Modifier.width(12.5.cssRem).height(3.938.cssRem).display(DisplayStyle.Block)
                modifier = Modifier
                    .width(
                        when (breakpoint) {
                            Breakpoint.ZERO, Breakpoint.SM, Breakpoint.MD -> (12.5.cssRem).times(0.7)
                                else -> 12.5.cssRem
                        }
                    )
                .height(
                    when (breakpoint) {
                        Breakpoint.ZERO, Breakpoint.SM, Breakpoint.MD -> (3.938.cssRem).times(0.7)
                        else -> 3.938.cssRem
                    }
                )
                .display(DisplayStyle.Block)
            )
        }

        Spacer()
        Spacer()
        Spacer()
        Spacer()

        Row(Modifier.gap(1.5.cssRem).displayIfAtLeast(Breakpoint.MD), verticalAlignment = Alignment.CenterVertically) {
            MenuItems(scrollY = scrollY)
        }

        Spacer()

        Row(
            Modifier
                .fontSize(1.5.cssRem)
                .gap(1.cssRem)
                .displayUntil(Breakpoint.MD),
            verticalAlignment = Alignment.CenterVertically
        ) {
            var menuState by remember { mutableStateOf(SideMenuState.CLOSED) }

            HamburgerButton(onClick = { menuState = SideMenuState.OPEN })

            if (menuState != SideMenuState.CLOSED) {
                SideMenu(
                    menuState,
                    close = { menuState = menuState.close() },
                    onAnimationEnd = { if (menuState == SideMenuState.CLOSING) menuState = SideMenuState.CLOSED }
                )
            }
        }
    }
}

@Composable
private fun SideMenu(menuState: SideMenuState, close: () -> Unit, onAnimationEnd: () -> Unit) {
    Overlay(
        Modifier
            .setVariable(OverlayVars.BackgroundColor, Colors.Transparent)
            .onClick { close() }
            .zIndex(1) // fixes the issue partially, need to remove hamburger icon
//            .zIndex(10)
    ) {
        key(menuState) { // Force recompute animation parameters when close button is clicked
            Column(
                Modifier
                    .fillMaxHeight()
                    .width(clamp(16.cssRem, 33.percent, 18.cssRem))
                    .align(Alignment.CenterEnd)
                    // Close button will appear roughly over the hamburger button, so the user can close
                    // things without moving their finger / cursor much.
                    .padding(top = 1.cssRem, leftRight = 1.cssRem)
                    .gap(1.5.cssRem)
//                    .backgroundColor(ColorMode.current.toSitePalette().nearBackground)
                    .backgroundColor(rgb(255, 255, 255))
                    .animation(
                        SideMenuSlideInAnim.toAnimation(
                            duration = 200.ms,
                            timingFunction = if (menuState == SideMenuState.OPEN) AnimationTimingFunction.EaseOut else AnimationTimingFunction.EaseIn,
                            direction = if (menuState == SideMenuState.OPEN) AnimationDirection.Normal else AnimationDirection.Reverse,
                            fillMode = AnimationFillMode.Forwards
                        )
                    )
                    .borderRadius(topLeft = 2.cssRem)
                    .onClick { it.stopPropagation() }
                    .onAnimationEnd { onAnimationEnd() },
                horizontalAlignment = Alignment.End
            ) {
                CloseButton(onClick = { close() })
                Column(
                    Modifier.padding(right = 0.75.cssRem).gap(1.5.cssRem).fontSize(1.4.cssRem),
                    horizontalAlignment = Alignment.End
                ) {
                    MenuItems(isSideMenu = true, scrollY = 0)
                }
            }
        }
    }
}
