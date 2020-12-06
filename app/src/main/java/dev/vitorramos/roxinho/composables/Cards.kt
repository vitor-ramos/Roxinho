package dev.vitorramos.roxinho.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vitorramos.roxinho.azul
import dev.vitorramos.roxinho.verde
import dev.vitorramos.roxinho.roxo
import java.text.DecimalFormat

private val dec = DecimalFormat("#,###.##")

@Composable
fun CartaoCredito(
    fatura: Float,
    limiteDisponivel: Float,
) = Card(Modifier.padding(16.dp, 8.dp)) {
    Column(Modifier.fillMaxWidth().padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Outlined.ShoppingCart, tint = Color.Gray)
            Spacer(Modifier.width(8.dp))
            Text("Cartão de Crédito", color = Color.Gray, fontSize = 14.sp)
        }
        Spacer(Modifier.height(8.dp))
        Text("Fatura atual", color = Color.Gray, fontSize = 12.sp)
        Spacer(Modifier.height(8.dp))
        Text(
            "R$ ${dec.format(fatura)}", color = azul, fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
        )
        Row {
            Text("Limite disponível ", color = Color.Gray, fontSize = 12.sp)
            Text(
                "R$ ${dec.format(limiteDisponivel)}",
                color = verde,
                fontSize = 12.sp,
            )
        }
    }
}

@Composable
fun Conta(
    saldo: Float,
) = Card(Modifier.padding(16.dp, 8.dp)) {
    Column(Modifier.fillMaxWidth().padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Outlined.Build, tint = Color.Gray)
            Spacer(Modifier.width(8.dp))
            Text("Conta", color = Color.Gray, fontSize = 14.sp)
        }
        Spacer(Modifier.height(8.dp))
        Text("Saldo disponível", color = Color.Gray, fontSize = 12.sp)
        Spacer(Modifier.height(8.dp))
        Text(
            "R$ ${dec.format(saldo)}",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun Emprestimo(
    emprestimo: Float,
) = Card(Modifier.padding(16.dp, 8.dp)) {
    Column(Modifier.fillMaxWidth().padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Outlined.Email, tint = Color.Gray)
            Spacer(Modifier.width(8.dp))
            Text("Empréstimo", color = Color.Gray, fontSize = 14.sp)
        }
        Spacer(Modifier.height(8.dp))
        Text("Valor disponível de até", fontSize = 14.sp)
        Text(
            "R$ ${dec.format(emprestimo)}",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(Modifier.height(8.dp))
        OutlinedButton(
            {},
            border = BorderStroke(ButtonConstants.OutlinedBorderSize, roxo),
        ) {
            Text("SIMULAR EMPRÉSTIMO", color = roxo)
        }
    }
}

@Composable
fun Rewards(
    pontos: Int,
    pontosAcumulados: Int,
) = Card(Modifier.padding(16.dp, 8.dp)) {
    Column(Modifier.fillMaxWidth().padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Outlined.Person, tint = Color.Gray)
            Spacer(Modifier.width(8.dp))
            Text("Rewards", color = Color.Gray, fontSize = 14.sp)
        }
        Spacer(Modifier.height(8.dp))
        Text("Total", color = Color.Gray, fontSize = 12.sp)
        Spacer(Modifier.height(8.dp))
        Text(
            "${dec.format(pontos)} pts",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
        )
        Row {
            Text("Você acumulou", color = Color.Gray, fontSize = 12.sp)
            Text(
                " ${dec.format(pontosAcumulados)} ",
                color = verde,
                fontSize = 12.sp,
            )
            Text("pontos esse mês.", color = Color.Gray, fontSize = 12.sp)
        }
    }
}
