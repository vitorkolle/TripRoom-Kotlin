package br.senai.sp.jandira.triproom.repository

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AreaChart
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Categoria

class CategoriaRepository {
    @Composable
    fun listarTodasAsCategorias() : List<Categoria> {
        val montain = Categoria()
        montain.id = 1;
        montain.nome = "Mountain";
        montain.imagem = painterResource(
            id = Icons.Default.AreaChart
        )

    }
}