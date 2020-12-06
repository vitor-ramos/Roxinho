package dev.vitorramos.roxinho

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import dev.vitorramos.roxinho.ui.RoxinhoTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoxinhoTheme {
                Home(
                    "Mariza",
                    {
                        Log.e("MainActivity", "Eye")
                    },
                    {
                        Log.e("MainActivity", "Settings")
                    },
                )
            }
        }
    }
}
