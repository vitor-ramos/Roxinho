package dev.vitorramos.roxinho.composables.cards

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vitorramos.roxinho.R
import dev.vitorramos.roxinho.cinzaClaro

@Composable
fun Conta(
    saldo: Float,
    visivel: Boolean,
) = Card(Modifier.padding(16.dp, 8.dp)) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(painterResource((R.drawable.ic_dinheiro)), null, tint = Color.Gray)
            Spacer(Modifier.width(8.dp))

            Text("Conta", color = Color.Gray, fontSize = 14.sp)
        }
        Spacer(Modifier.height(8.dp))
        Text("Saldo disponível", color = Color.Gray, fontSize = 12.sp)
        Spacer(Modifier.height(8.dp))
        Surface(Modifier.fillMaxWidth(), color = if (visivel) Color.Transparent else cinzaClaro) {
            Text(
                if (visivel) "R$ ${decimalFormat.format(saldo)}" else "",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}


@Preview
@Composable
fun ContaPreview() = Conta(2895.46f, true)
