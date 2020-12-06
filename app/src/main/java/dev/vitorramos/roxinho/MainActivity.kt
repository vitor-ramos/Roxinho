package dev.vitorramos.roxinho

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.platform.setContent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Home(
                    "Vitor",
                    5120.56f,
                    987.97f,
                    10319.28f,
                    10300f,
                    5662,
                    12851,
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
