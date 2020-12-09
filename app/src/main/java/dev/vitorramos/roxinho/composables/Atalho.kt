package dev.vitorramos.roxinho.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRippleIndication
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vitorramos.roxinho.roxoClaro

@Composable
fun Atalho(
    modifier: Modifier = Modifier,
    icone: ImageVector?,
    texto: String,
) = Surface(
    modifier.clickable(
        onClick = {},
        indication = rememberRippleIndication(color = Color.White),
    ),
    shape = RoundedCornerShape(4.dp),
    color = roxoClaro,
) {
    Column(
        Modifier.size(88.dp).padding(8.dp),
        Arrangement.SpaceBetween,
    ) {
        if (icone != null) Icon(icone, tint = Color.White)
        else Spacer(Modifier)
        Text(texto, color = Color.White, fontSize = 14.sp)
    }
}
