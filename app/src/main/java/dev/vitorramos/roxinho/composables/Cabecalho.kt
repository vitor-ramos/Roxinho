package dev.vitorramos.roxinho.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vitorramos.roxinho.roxoClaro

@Composable
fun Cabecalho(
    nome: String,
    cliqueOcultar: () -> Unit,
    iconeVisibilidade: ImageVector?,
) = Row(
    Modifier.fillMaxWidth().padding(16.dp),
    Arrangement.SpaceBetween,
    Alignment.CenterVertically,
) {
    Text("Olá, $nome", color = Color.White, fontSize = 22.sp)
    Row {
        iconeVisibilidade?.let { iconeVisibilidade ->
            Surface(
                Modifier.size(48.dp).clickable(onClick = cliqueOcultar),
                RoundedCornerShape(24.dp),
                roxoClaro,
            ) {
                Icon(iconeVisibilidade, tint = Color.White)
            }
            Spacer(Modifier.width(8.dp))
        }
        Surface(
            Modifier.size(48.dp).clickable(onClick = {}),
            RoundedCornerShape(24.dp),
            roxoClaro,
        ) {
            Icon(Icons.Outlined.Settings, tint = Color.White)
        }
    }
}
