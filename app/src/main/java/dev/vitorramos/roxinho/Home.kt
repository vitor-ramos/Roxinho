package dev.vitorramos.roxinho

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.vitorramos.roxinho.ui.accent

@Composable
fun Home(
    name: String,
    onClickEye: () -> Unit,
    onClickSettings: () -> Unit,
) {
    Surface(color = Color(0xFF8A05BE)) {
        Column(Modifier.fillMaxSize()) {
            Row(
                Modifier.fillMaxWidth().padding(0.dp, 32.dp),
                Arrangement.SpaceBetween,
                Alignment.CenterVertically,
            ) {
                Text("Olá, $name", color = Color.White)
                Row(Modifier) {
                    Surface(
                        Modifier.size(56.dp).clickable(onClick = onClickEye),
                        RoundedCornerShape(24.dp),
                        accent,
                    ) {
                        Icon(Icons.Outlined.Star, tint = Color.White)
                    }
                    Surface(
                        Modifier.size(56.dp).clickable(onClick = onClickSettings),
                        RoundedCornerShape(24.dp),
                        accent,
                    ) {
                        Icon(Icons.Outlined.Settings, tint = Color.White)
                    }
                }
            }
        }
    }
}
