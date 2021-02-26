package dev.vitorramos.roxinho.composables.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
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
import dev.vitorramos.roxinho.roxo

@Composable
fun Emprestimo(
    emprestimo: Float,
    visivel: Boolean,
) = Card(Modifier.padding(16.dp, 8.dp)) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(painterResource(R.drawable.ic_dinheiro), null, tint = Color.Gray)
            Spacer(Modifier.width(8.dp))
            Text("Empréstimo", color = Color.Gray, fontSize = 14.sp)
        }
        Spacer(Modifier.height(8.dp))
        Surface(Modifier.fillMaxWidth(), color = if (visivel) Color.Transparent else cinzaClaro) {
            Column {
                Text(if (visivel) "Valor disponível de até" else "", fontSize = 14.sp)
                Text(
                    if (visivel) "R$ ${decimalFormat.format(emprestimo)}" else "",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
        Spacer(Modifier.height(8.dp))
        OutlinedButton(
            {},
            border = BorderStroke(ButtonDefaults.OutlinedBorderSize, roxo),
        ) {
            Text("SIMULAR EMPRÉSTIMO", color = roxo)
        }
    }
}

@Preview
@Composable
fun EmprestimoPreview() = Emprestimo(4000f, true)
