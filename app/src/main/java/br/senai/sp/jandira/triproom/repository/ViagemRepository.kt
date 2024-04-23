package br.senai.sp.jandira.triproom.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Viagem
import java.time.LocalDate

class ViagemRepository {
    @Composable
    fun listarTodasAsViagens() : List<Viagem>{
        val londres = Viagem()
        londres.id = 1
        londres.destino = "Londres"
        londres.descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana."
        londres.dataChegada = LocalDate.of(2019, 2, 18)
        londres.dataPartida = LocalDate.of(2019, 2, 21)
        londres.imagem = painterResource(
            id = R.drawable.london
        )

        val porto = Viagem()
        porto.id = 2
        porto.destino = "Porto"
        porto.descricao = "O Porto é uma cidade portuguesa e capital da sub-região da Área Metropolitana do Porto e da região do Norte, pertencendo ao distrito do Porto."
        porto.dataChegada = LocalDate.of(2019, 2, 18)
        porto.dataPartida = LocalDate.of(2019, 2, 21)
        porto.imagem = painterResource(
            id = R.drawable.porto
        )
        val gramado = Viagem()
        gramado.id = 3
        gramado.destino = "Gramado"
        gramado.descricao = "Gramado é uma cidade com uma estância de montanha situada no estado mais a sul do Brasil, Rio Grande do Sul."
        gramado.dataChegada = LocalDate.of(2019, 2, 18)
        gramado.dataPartida = LocalDate.of(2019, 2, 21)
        gramado.imagem = null

        val fortaleza = Viagem()
        fortaleza.id = 4
        fortaleza.destino = "Fortaleza"
        fortaleza.descricao = "Fortaleza é um município brasileiro, capital e a cidade mais populosa do estado do Ceará, situado na região Nordeste do Brasil."
        fortaleza.dataChegada = LocalDate.of(2019, 2, 18)
        fortaleza.dataPartida = LocalDate.of(2019, 2, 21)
        fortaleza.imagem = painterResource(
            id = R.drawable.fortaleza
        )
        val recife = Viagem()
        recife.id = 5
        recife.destino = "Recife"
        recife.descricao = "Recife, a capital do estado de Pernambuco, no nordeste do Brasil, distingue-se pelos seus vários rios, pontes, ilhéus e penínsulas. Recife Antigo, na própria ilha junto ao porto, é o centro histórico da cidade antiga que data do século XVI. "
        recife.dataChegada = LocalDate.of(2019, 2, 18)
        recife.dataPartida = LocalDate.of(2019, 2, 21)
        recife.imagem = null

        return listOf(londres, porto, gramado, fortaleza, recife)

    }
}