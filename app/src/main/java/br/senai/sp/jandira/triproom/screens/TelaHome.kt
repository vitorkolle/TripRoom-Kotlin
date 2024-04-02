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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.DownhillSkiing
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
fun TelaHome(controleDeNavegacao: NavHostController) {
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
                                text = "You're in Paris",
                                color = Color.White,
                            )
                        }
                        Text(
                            text = "My Trips",
                            fontSize = 30.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }

            }

            Column {
                Text(
                    text = "Categories",
                    color = Color(0xFF565454),
                    modifier = Modifier
                        .padding(20.dp)
                )
                LazyRow(
                    modifier = Modifier
                        .offset(x = 10.dp)
                ) {
                    item {
                        Card(
                            modifier = Modifier
                                .padding(end = 10.dp)
                                .size(width = 150.dp, height = 90.dp),
                            colors = CardDefaults
                                .cardColors(
                                    containerColor = Color(0xFFCF06F0)
                                )
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Landscape,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Text(
                                    text = "Mountain",
                                    color = Color.White
                                )
                            }

                        }
                    }
                    item {
                        Card(
                            modifier = Modifier
                                .padding(end = 10.dp)
                                .size(width = 150.dp, height = 90.dp),
                            colors = CardDefaults
                                .cardColors(
                                    containerColor = Color(0xFFEAABF4)
                                )
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.DownhillSkiing,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Text(
                                    text = "Snow",
                                    color = Color.White
                                )
                            }

                        }
                    }

                    item {
                        Card(
                            modifier = Modifier
                                .padding(end = 10.dp)
                                .size(width = 150.dp, height = 90.dp),
                            colors = CardDefaults
                                .cardColors(
                                    containerColor = Color(0xFFEAABF4)
                                )
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.BeachAccess,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Text(
                                    text = "Montain",
                                    color = Color.White
                                )
                            }

                        }
                    }
                }
                Spacer(
                    modifier = Modifier
                        .height(30.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
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
                            text = "Search your destiny",
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
                    text = "Past Trips",
                    color = Color(0xFF565454),
                    modifier = Modifier
                        .padding(20.dp)
                )
            }
            LazyColumn(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        )
                    ) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.london),
                                contentDescription = "",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(5.dp),
                                contentScale = ContentScale.Crop
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start
                            ) {
                                Text(
                                    text = "London, 2019",
                                    modifier = Modifier
                                        .padding(5.dp),
                                    color = Color(0xFFCF06F0)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                                    fontSize = 12.sp,
                                    lineHeight = 16.sp,
                                    color = Color(0xFFA09C9C),
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    text = "18 Feb - 21 Feb",
                                    color = Color(0xFFCF06F0),
                                    fontSize = 14.sp,
                                    modifier = Modifier
                                        .padding(end = 5.dp, bottom = 8.dp)
                                )
                            }
                        }


                    }
                    Spacer(
                        modifier = Modifier
                            .height(20.dp)
                    )
                }

                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        )
                    ) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.porto),
                                contentDescription = "",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(5.dp),
                                contentScale = ContentScale.Crop
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start
                            ) {
                                Text(
                                    text = "Porto, 2022",
                                    modifier = Modifier
                                        .padding(5.dp),
                                    color = Color(0xFFCF06F0)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Porto is the second city in Portugal, the capital of the Oporto District, and one of the Iberian Peninsula's major urban areas.",
                                    fontSize = 12.sp,
                                    lineHeight = 16.sp,
                                    color = Color(0xFFA09C9C),
                                    modifier = Modifier
                                        .padding(5.dp)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    text = "15 may - 22 may",
                                    color = Color(0xFFCF06F0),
                                    fontSize = 14.sp,
                                    modifier = Modifier
                                        .padding(end = 5.dp, bottom = 8.dp)
                                )
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
      // TelaHome(controleDeNavegacao)
    }
}