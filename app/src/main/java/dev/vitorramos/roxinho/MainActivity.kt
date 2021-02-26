package dev.vitorramos.roxinho

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import dev.vitorramos.roxinho.composables.Tela

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val atalhos = listOf(
                DadosAtalhos(
                    painterResource(R.drawable.ic_codigo_barra),
                    "Pagar",
                ),
                DadosAtalhos(
                    painterResource(R.drawable.ic_indicar_amigos),
                    "Indicar amigos",
                ),
                DadosAtalhos(
                    painterResource(R.drawable.ic_dinheiro),
                    "Transferir",
                ),
                DadosAtalhos(
                    painterResource(R.drawable.ic_dinheiro),
                    "Depositar",
                ),
                DadosAtalhos(
                    painterResource(R.drawable.ic_cartao_credito),
                    "Cartão virtual",
                ),
                DadosAtalhos(
                    painterResource(R.drawable.ic_celular),
                    "Recarga de celular",
                ),
                DadosAtalhos(
                    painterResource(R.drawable.ic_ajustar_limite),
                    "Ajustar limite",
                ),
                DadosAtalhos(
                    painterResource(R.drawable.ic_cadeado),
                    "Bloquear cartão",
                ),
                DadosAtalhos(
                    painterResource(R.drawable.ic_ajuda),
                    "Me ajuda",
                ),
            )

            var visivel by remember { mutableStateOf(true) }
            val cliqueOcultar = { visivel = !visivel }

            MaterialTheme {
                Tela(
                    atalhos,
                    cliqueOcultar,
                    "Alex",
                    1120.56f,
                    1879.44f,
                    2895.46f,
                    4000f,
                    965,
                    2348,
                    visivel,
                )
            }
        }
    }
}
