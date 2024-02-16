package com.itami.itami_mobile.components.sections.works

import androidx.compose.runtime.Composable
import com.itami.itami_mobile.components.widgets.section.SectionContainer
import com.itami.itami_mobile.theme.fonts.DisplayTextStyle
import com.itami.itami_mobile.theme.fonts.TextStyle
import com.itami.itami_mobile.theme.fonts.TextStylePrimaryColor
import com.itami.itami_mobile.utils.Section
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText


@Composable
fun WorksSection() {
    SectionContainer(
        modifier = Modifier,
        section = Section.Works,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpanText(
            modifier = TextStyle.toModifier(DisplayTextStyle, TextStylePrimaryColor)
                .textAlign(TextAlign.Center),
            text = Section.Works.text
        )
    }
}