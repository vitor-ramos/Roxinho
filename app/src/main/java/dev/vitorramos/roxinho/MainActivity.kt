package dev.vitorramos.roxinho

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.loadVectorResource
import dev.vitorramos.roxinho.composables.Tela

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val atalhos = listOf(
                DadosAtalhos(Icons.Outlined.Edit, "Pix"),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_codigo_barra).resource.resource,
                    "Pagar",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_indicar_amigos).resource.resource,
                    "Indicar amigos",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_dinheiro).resource.resource,
                    "Transferir",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_dinheiro).resource.resource,
                    "Depositar",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_dinheiro).resource.resource,
                    "Emprestimo",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_cartao_credito).resource.resource,
                    "Cartão virtual",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_celular).resource.resource,
                    "Recarga de celular",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_ajustar_limite).resource.resource,
                    "Ajustar limite",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_cadeado).resource.resource,
                    "Bloquear cartão",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_dinheiro).resource.resource,
                    "Cobrar",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_dinheiro).resource.resource,
                    "Dividir valor",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_dinheiro).resource.resource,
                    "Doação",
                ),
                DadosAtalhos(
                    loadVectorResource(R.drawable.ic_ajuda).resource.resource,
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
