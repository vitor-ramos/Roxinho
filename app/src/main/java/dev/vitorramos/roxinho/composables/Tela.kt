package dev.vitorramos.roxinho.composables

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.vitorramos.roxinho.*

@Composable
fun Tela(
    atalhos: List<DadosAtalhos>,
    cliqueAtalho: (index: Int) -> Unit,
    cliqueOcultar: () -> Unit,
    cliqueConfiguracoes: () -> Unit,
    nome: String,
    fatura: Float,
    limiteDisponivel: Float,
    saldo: Float,
    emprestimo: Float,
    pontos: Int,
    pontosAcumulados: Int,
) = Surface(color = Color(0xFF8A05BE)) {
    Column(Modifier.fillMaxSize()) {
        Cabecalho(Modifier, nome, cliqueOcultar, cliqueConfiguracoes)
        ScrollableColumn(Modifier.weight(1f)) {
            CartaoCredito(fatura, limiteDisponivel)
            Conta(saldo)
            Emprestimo(emprestimo)
            Rewards(pontos, pontosAcumulados)
        }
        ScrollableRow(Modifier.padding(0.dp, 16.dp)) {
            atalhos.forEachIndexed { i, data ->
                val start = if (i == 0) 16.dp else 0.dp
                val end = if (i == atalhos.lastIndex) 16.dp else 8.dp
                Atalho(
                    Modifier.padding(start, 0.dp, end, 0.dp),
                    { cliqueAtalho(i) },
                    data.icone,
                    data.texto,
                )
            }
        }
    }
}
