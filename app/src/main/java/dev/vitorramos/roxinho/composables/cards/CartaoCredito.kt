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
import dev.vitorramos.roxinho.azul
import dev.vitorramos.roxinho.cinzaClaro
import dev.vitorramos.roxinho.verde

@Composable
fun CartaoCredito(
    fatura: Float,
    limiteDisponivel: Float,
    visivel: Boolean,
) = Card(Modifier.padding(16.dp, 8.dp)) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(painterResource(R.drawable.ic_cartao_credito), null, tint = Color.Gray)
            Spacer(Modifier.width(8.dp))
            Text("Cartão de Crédito", color = Color.Gray, fontSize = 14.sp)
        }
        Spacer(Modifier.height(8.dp))
        Text("Fatura atual", color = Color.Gray, fontSize = 12.sp)
        Spacer(Modifier.height(8.dp))
        Surface(
            Modifier.fillMaxWidth(),
            color = if (visivel) Color.Transparent else cinzaClaro,
        ) {
            Column {
                Text(
                    if (visivel) "R$ ${decimalFormat.format(fatura)}" else "",
                    color = azul,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                )
                Row {
                    Text(
                        if (visivel) "Limite disponível " else "",
                        color = Color.Gray,
                        fontSize = 12.sp
                    )
                    Text(
                        if (visivel) "R$ ${decimalFormat.format(limiteDisponivel)}" else "",
                        color = verde,
                        fontSize = 12.sp,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun CartaoCreditoPreview() = CartaoCredito(
    fatura = 1120.56f,
    limiteDisponivel = 1879.44f,
    visivel = true,
)
