package dev.vitorramos.roxinho

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.DecimalFormat

@Composable
fun Home(
    nome: String,
    fatura: Float,
    limiteDisponivel: Float,
    saldo: Float,
    emprestimo: Float,
    pontos: Int,
    pontosAcumulados: Int,
    onClickEye: () -> Unit,
    onClickSettings: () -> Unit,
) {
    Surface(color = Color(0xFF8A05BE)) {
        Column(Modifier.fillMaxSize()) {
            Row(
                Modifier.fillMaxWidth().padding(16.dp, 32.dp),
                Arrangement.SpaceBetween,
                Alignment.CenterVertically,
            ) {
                Text("Olá, $nome", color = Color.White, fontSize = 22.sp)
                Row(Modifier) {
                    Surface(
                        Modifier.size(48.dp).clickable(onClick = onClickEye),
                        RoundedCornerShape(24.dp),
                        colorAccent,
                    ) {
                        Icon(Icons.Outlined.Star, tint = Color.White)
                    }
                    Spacer(Modifier.width(8.dp))
                    Surface(
                        Modifier.size(48.dp).clickable(onClick = onClickSettings),
                        RoundedCornerShape(24.dp),
                        colorAccent,
                    ) {
                        Icon(Icons.Outlined.Settings, tint = Color.White)
                    }
                }
            }
            ScrollableColumn {
                val dec = DecimalFormat("#,###.##")
                Card(Modifier.padding(16.dp, 8.dp)) {
                    Column(Modifier.fillMaxWidth().padding(16.dp)) {
                        Row {
                            Icon(Icons.Outlined.ShoppingCart, tint = Color.Gray)
                            Spacer(Modifier.width(8.dp))
                            Text("Cartão de Crédito", color = Color.Gray)
                        }
                        Spacer(Modifier.height(8.dp))
                        Text("Fatura atual", color = Color.Gray, fontSize = 12.sp)
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "R$ ${dec.format(fatura)}", color = colorBlue, fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Row {
                            Text("Limite disponível ", color = Color.Gray, fontSize = 12.sp)
                            Text(
                                "R$ ${dec.format(limiteDisponivel)}",
                                color = colorGreen,
                                fontSize = 12.sp,
                            )
                        }
                    }
                }
                Card(Modifier.padding(16.dp, 8.dp)) {
                    Column(Modifier.fillMaxWidth().padding(16.dp)) {
                        Row {
                            Icon(Icons.Outlined.Build, tint = Color.Gray)
                            Spacer(Modifier.width(8.dp))
                            Text("Conta", color = Color.Gray)
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
                Card(Modifier.padding(16.dp, 8.dp)) {
                    Column(Modifier.fillMaxWidth().padding(16.dp)) {
                        Row {
                            Icon(Icons.Outlined.Email, tint = Color.Gray)
                            Spacer(Modifier.width(8.dp))
                            Text("Empréstimo", color = Color.Gray)
                        }
                        Spacer(Modifier.height(8.dp))
                        Text("Valor disponível de até", fontSize = 14.sp)
                        Text(
                            "R$ ${dec.format(emprestimo)}",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(Modifier.height(8.dp))
                        Button({}) {
                            Text("SIMULAR EMPRÉSTIMO")
                        }
                    }
                }
                Card(Modifier.padding(16.dp, 8.dp)) {
                    Column(Modifier.fillMaxWidth().padding(16.dp)) {
                        Row {
                            Icon(Icons.Outlined.Person, tint = Color.Gray)
                            Spacer(Modifier.width(8.dp))
                            Text("Rewards", color = Color.Gray)
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
                                color = colorGreen,
                                fontSize = 12.sp,
                            )
                            Text("pontos esse mês.", color = Color.Gray, fontSize = 12.sp)
                        }
                    }
                }
            }
        }
    }
}
