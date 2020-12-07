package dev.vitorramos.roxinho

import android.os.Build
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AmbientContext

@Composable
val roxo
    get() = Color(getColor(R.color.roxo))

@Composable
val roxoEscuro
    get() = Color(getColor(R.color.roxoEscuro))

@Composable
val roxoClaro
    get() = Color(getColor(R.color.roxoClaro))

@Composable
val azul
    get() = Color(getColor(R.color.azul))

@Composable
val verde
    get() = Color(getColor(R.color.verde))

@Composable
val cinzaClaro
    get() = Color(getColor(R.color.cinzaClaro))

@ColorInt
@Composable
private fun getColor(@ColorRes id: Int) = with(AmbientContext.current) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        resources.getColor(id, theme)
    } else {
        @Suppress("DEPRECATION")
        resources.getColor(id)
    }
}
