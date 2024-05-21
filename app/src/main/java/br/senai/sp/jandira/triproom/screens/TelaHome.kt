package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.reduzirData
import br.senai.sp.jandira.triproom.repository.CategoriaRepository
import br.senai.sp.jandira.triproom.repository.ViagemRepository
import br.senai.sp.jandira.triproom.ui.theme.PoppinsBold
import br.senai.sp.jandira.triproom.ui.theme.PoppinsRegular
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
fun TelaHome(controleDeNavegacao: NavHostController?) {

    val viagens = ViagemRepository().listarTodasAsViagens()
    val categorias = CategoriaRepository().listarTodasAsCategorias()

    TripRoomTheme {
        Column(
            modifier = Modifier
                .background(Color(0xFFF6F6F6))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.paris),
                    contentDescription = "Imagem da torre eifel",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.usuario),
                            contentDescription = "imagem usuario",
                            modifier = Modifier
                                .size(width = 70.dp, height = 70.dp)
                        )
                        Text(
                            text = "Susanna Hoffs",
                            color = Color.White,
                            fontFamily = PoppinsRegular,
                            modifier = Modifier
                                .offset(x = -18.dp, y = 6.dp)
                        )
                    }

                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom,
                    modifier = Modifier
                        .width(200.dp)
                        .fillMaxHeight()
                ) {
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .offset(x = 0.dp, y = -3.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .offset(x = 0.dp, y = 10.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.LocationOn,
                                contentDescription = null,
                                tint = Color.White
                            )
                            Text(
                                text = stringResource(id = R.string.in_paris),
                                fontFamily = PoppinsRegular,
                                color = Color.White,
                            )
                        }
                        Text(
                            text = stringResource(id = R.string.my_trips),
                            fontSize = 30.sp,
                            color = Color.White,
                            fontFamily = PoppinsBold
                        )
                    }

                }

            }

            Column {
                Text(
                    text = stringResource(id = R.string.categories),
                    color = Color(0xFF565454),
                    fontFamily = PoppinsRegular,
                    modifier = Modifier
                        .padding(15.dp)
                )
                LazyRow(
                    modifier = Modifier
                        .offset(x = 10.dp)
                ) {
                    items(categorias){
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFCF06F0)
                            ),
                            modifier = Modifier
                                .height(90.dp)
                                .width(150.dp)
                                .padding(end = 12.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 10.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Image(
                                    if(it.imagem == null) painterResource(id = R.drawable.no_image) else it.imagem!!,
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(40.dp)
                                        .height(40.dp),
                                    contentScale = ContentScale.FillBounds,
                                    colorFilter = ColorFilter.tint(Color.White)
                                )
                                Text(
                                    text = it.nome,
                                    color = Color.White,
                                )

                            }
                        }
                    }
                }
                Spacer(
                    modifier = Modifier
                        .height(15.dp)
                )
                var destinoState = remember{
                    mutableStateOf("")
                }
                OutlinedTextField(
                    value = destinoState.value,
                    onValueChange = {
                        destinoState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, bottom = 15.dp, end = 15.dp),
                    colors = TextFieldDefaults
                        .colors(
                            unfocusedContainerColor = Color(0xffffffff),
                            unfocusedLeadingIconColor = Color(0xFFFFFFFF),
                            unfocusedIndicatorColor = Color(0xFFFFFFFF),
                            focusedIndicatorColor = Color(0xFFFFFFFF)
                        ),
                    shape = RoundedCornerShape(20.dp),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.search_destiny),
                            fontFamily = PoppinsRegular,
                            color = Color(0xFFA09C9C)
                        )
                    },
                    trailingIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "",
                                tint = Color(0xFFA09C9C)
                            )
                        }
                    }
                )

                Text(
                    text = stringResource(id = R.string.past_trips),
                    fontFamily = PoppinsRegular,
                    color = Color(0xFF565454),
                    modifier = Modifier
                        .padding(top = 10.dp, start = 10.dp)
                )
            }
            LazyColumn(
                modifier = Modifier
                    .padding(6.dp)
            ) {
                items(viagens){
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 12.dp, end = 12.dp, top = 2.dp, bottom = 10.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFFFFFF)
                        ),

                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            Surface(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Image(
                                    if (it.imagem == null ) painterResource(id = R.drawable.no_image) else it.imagem!!,
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                modifier = Modifier
                                    .padding(8.dp)
                            ) {
                                Text(
                                    text = "${it.destino}, ${it.dataChegada.year}",
                                    fontFamily = PoppinsRegular,
                                    color = Color(0xFFCF06F0),
                                    fontSize = 24.sp
                                )
                                Text(
                                    text = it.descricao,
                                    fontFamily = PoppinsRegular,
                                    fontSize = 14.sp,
                                    lineHeight = 18.sp,
                                    color = Color(0xFFA09C9C),
                                    modifier = Modifier
                                        .padding(top = 10.dp)
                                )
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Text(
                                        text = "${reduzirData(it.dataChegada)} - ${reduzirData(it.dataPartida)}",
                                        fontFamily = PoppinsRegular,
                                        color = Color(0xFFCF06F0),
                                        modifier = Modifier
                                            .padding(2.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                }
            }
        }
    }

@Preview
@Composable
fun TelaHomePreview() {
    TripRoomTheme {
      TelaHome(controleDeNavegacao = null)
    }
}