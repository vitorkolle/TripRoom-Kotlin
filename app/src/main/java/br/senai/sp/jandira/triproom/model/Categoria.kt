package br.senai.sp.jandira.triproom.model

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

data class Categoria(
    var id:Int = 0,
    var nome:String = "",
    var imagem: Painter? = null
)
