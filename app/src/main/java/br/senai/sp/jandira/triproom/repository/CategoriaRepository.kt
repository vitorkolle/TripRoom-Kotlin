package br.senai.sp.jandira.triproom.repository

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Categoria

class CategoriaRepository {
    @Composable
    fun listarTodasAsCategorias() : List<Categoria> {
        val mountain = Categoria()
        mountain.id = 1
        mountain.nome = "Mountain"
        mountain.imagem = painterResource(
            id = R.drawable.landscape,
        )
        val snow = Categoria()
        snow.id = 2
        snow.nome = "Snow"
        snow.imagem = painterResource(
            id = R.drawable.ski
        )
        val beach = Categoria()
        beach.id = 3
        beach.nome = "Beach"
        beach.imagem = painterResource(
            id = R.drawable.beach
        )
        val houseboat = Categoria()
        houseboat.id = 4
        houseboat.nome = "Houseboat"
        houseboat.imagem = painterResource(
            id = R.drawable.houseboat
        )
        val camping = Categoria()
        camping.id = 5
        camping.nome = "Camping"
        camping.imagem = painterResource(
            id = R.drawable.camping
        )

        return listOf(mountain, snow, beach, houseboat, camping)
    }

}