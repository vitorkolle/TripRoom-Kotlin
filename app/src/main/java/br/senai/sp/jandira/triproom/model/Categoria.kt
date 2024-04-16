package br.senai.sp.jandira.triproom.model

import android.graphics.drawable.Icon
import androidx.compose.ui.graphics.painter.Painter

data class Categoria(
    var id:Int = 0,
    var nome:String = "",
    var imagem: Icon? = null
)
