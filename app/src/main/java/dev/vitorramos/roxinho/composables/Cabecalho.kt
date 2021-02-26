package dev.vitorramos.roxinho.composables

import androidx.compose.foundation.clickable
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vitorramos.roxinho.R
import dev.vitorramos.roxinho.roxoClaro

@Composable
fun Cabecalho(
    nome: String,
    cliqueOcultar: () -> Unit,
    visivel: Boolean,
) = Row(
    Modifier
        .fillMaxWidth()
        .padding(16.dp),
    Arrangement.SpaceBetween,
    Alignment.CenterVertically,
) {
    Text("Olá, $nome", color = Color.White, fontSize = 22.sp)
    Row {
        Surface(
            Modifier
                .size(48.dp)
                .clickable(onClick = cliqueOcultar),
            RoundedCornerShape(24.dp),
            roxoClaro,
        ) {
            val icone =
                if (visivel) R.drawable.ic_visibilidade_riscado else R.drawable.ic_visibilidade
            Icon(
                painterResource(icone),
                if (visivel) "Ocultar valores" else "Exibir valores",
                Modifier.padding(8.dp),
                Color.White,
            )
        }
        Spacer(Modifier.width(8.dp))
        Surface(
            Modifier
                .size(48.dp)
                .clickable(onClick = {}),
            RoundedCornerShape(24.dp),
            roxoClaro,
        ) {
            Icon(
                Icons.Outlined.Settings,
                "Configurações",
                Modifier.padding(8.dp),
                Color.White,
            )
        }
    }
}

@Preview
@Composable
fun Preview() = Cabecalho("Alex", {}, true)
