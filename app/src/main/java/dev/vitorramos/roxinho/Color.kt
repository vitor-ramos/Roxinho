package dev.vitorramos.roxinho

import android.os.Build
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AmbientContext

@Composable
val colorPrimary
    get() = Color(getColor(R.color.colorPrimary))

@Composable
val colorPrimaryDark
    get() = Color(getColor(R.color.colorPrimaryDark))

@Composable
val colorAccent
    get() = Color(getColor(R.color.colorAccent))

@Composable
val colorBlue
    get() = Color(getColor(R.color.colorBlue))

@Composable
val colorGreen
    get() = Color(getColor(R.color.colorGreen))

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
