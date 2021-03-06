package dev.vitorramos.roxinho.composables

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.vitorramos.roxinho.DadosAtalhos
import dev.vitorramos.roxinho.composables.cards.CartaoCredito
import dev.vitorramos.roxinho.composables.cards.Conta
import dev.vitorramos.roxinho.composables.cards.Emprestimo
import dev.vitorramos.roxinho.composables.cards.Rewards

@Composable
fun Tela(
    atalhos: List<DadosAtalhos>,
    cliqueOcultar: () -> Unit,
    nome: String,
    fatura: Float,
    limiteDisponivel: Float,
    saldo: Float,
    emprestimo: Float,
    pontos: Int,
    pontosAcumulados: Int,
    visivel: Boolean,
) = Surface(color = Color(0xFF8A05BE)) {
    Column(Modifier.fillMaxSize()) {
        Cabecalho(
            nome,
            cliqueOcultar,
            visivel,
        )
        Column(
            Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState()),
        ) {
            CartaoCredito(fatura, limiteDisponivel, visivel)
            Conta(saldo, visivel)
            Emprestimo(emprestimo, visivel)
            Rewards(pontos, pontosAcumulados, visivel)
        }
        Row(
            Modifier
                .padding(0.dp, 16.dp)
                .horizontalScroll(rememberScrollState()),
        ) {
            atalhos.forEachIndexed { i, data ->
                val start = if (i == 0) 16.dp else 0.dp
                val end = if (i == atalhos.lastIndex) 16.dp else 8.dp
                Atalho(
                    Modifier.padding(start, 0.dp, end, 0.dp),
                    data.icone,
                    data.texto,
                )
            }
        }
    }
}
