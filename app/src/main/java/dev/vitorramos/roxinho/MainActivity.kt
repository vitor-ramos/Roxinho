package dev.vitorramos.roxinho

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.*
import androidx.compose.ui.platform.setContent
import dev.vitorramos.roxinho.composables.Tela

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var visivel by remember { mutableStateOf(true) }

            val cliqueOcultar = { visivel = !visivel }
            val cliqueConfiguracoes = {

            }
            val cliqueAtalho: (Int) -> Unit = {
                Toast.makeText(this, "Clicou no atalho $it", Toast.LENGTH_SHORT).show()
            }
            val atalhos = listOf(
                DadosAtalhos(Icons.Outlined.Edit, "Pix"),
                DadosAtalhos(Icons.Outlined.Edit, "Pagar"),
                DadosAtalhos(Icons.Outlined.Edit, "Indicar amigos"),
                DadosAtalhos(Icons.Outlined.Edit, "Transferir"),
                DadosAtalhos(Icons.Outlined.Edit, "Depositar"),
                DadosAtalhos(Icons.Outlined.Edit, "Emprestimo"),
                DadosAtalhos(Icons.Outlined.Edit, "Cartão virtual"),
                DadosAtalhos(Icons.Outlined.Edit, "Recarga de celular"),
                DadosAtalhos(Icons.Outlined.Edit, "Ajustar limite"),
                DadosAtalhos(Icons.Outlined.Edit, "Bloquear cartão"),
                DadosAtalhos(Icons.Outlined.Edit, "Cobrar"),
                DadosAtalhos(Icons.Outlined.Edit, "Dividir valor"),
                DadosAtalhos(Icons.Outlined.Edit, "Doação"),
                DadosAtalhos(Icons.Outlined.Edit, "Me ajuda"),
            )

            MaterialTheme {
                Tela(
                    atalhos,
                    cliqueAtalho,
                    cliqueOcultar,
                    cliqueConfiguracoes,
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
