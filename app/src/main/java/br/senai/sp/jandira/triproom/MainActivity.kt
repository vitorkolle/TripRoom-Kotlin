package br.senai.sp.jandira.triproom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.triproom.screens.TelaCadastro
import br.senai.sp.jandira.triproom.screens.TelaHome
import br.senai.sp.jandira.triproom.screens.TelaLogin
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val controleDeNavegacao = rememberNavController()
                    NavHost(
                        navController = controleDeNavegacao,
                        startDestination = "Login"

                    ){
                        composable(route = "Login"){  TelaLogin(controleDeNavegacao) }
                        composable(route = "Home"){  TelaHome(controleDeNavegacao) }
                        composable(route = "Cadastro"){  TelaCadastro(controleDeNavegacao) }
                    }
                }
            }
        }
    }
}