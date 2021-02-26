package dev.vitorramos.roxinho.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vitorramos.roxinho.roxoClaro

@Composable
fun Atalho(
    modifier: Modifier = Modifier,
    icone: Painter,
    texto: String,
) = Surface(
    modifier.clickable(
        onClick = {},
        indication = rememberRipple(color = Color.White),
        interactionSource = remember { MutableInteractionSource() },
    ),
    shape = RoundedCornerShape(4.dp),
    color = roxoClaro,
) {
    Column(
        Modifier
            .size(88.dp)
            .padding(8.dp),
        Arrangement.SpaceBetween,
    ) {
        // TODO: content description
        Icon(icone, null, tint = Color.White)
        Text(texto, color = Color.White, fontSize = 14.sp)
    }
}
