package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Usuario
import br.senai.sp.jandira.triproom.repository.UsuarioRepository
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
fun TelaLogin(controleDeNavegacao: NavHostController) {
    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }

    var erroState = remember {
        mutableStateOf(false)
    }

    var mensagemErroState = remember{
        mutableStateOf(" ")
    }

    val cr = UsuarioRepository(LocalContext.current)

        Surface {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = Color.White
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Box(
                        modifier = Modifier
                            .width(120.dp)
                            .height(50.dp)
                            .background(
                                Color(0xFFCF06F0),
                                shape = RoundedCornerShape(bottomStart = 10.dp)
                            )
                    )
                }
                Spacer(modifier = Modifier.height(100.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(550.dp)
                        .padding(20.dp),

                    ) {
                    Text(
                        text = stringResource(id = R.string.login),
                        fontSize = 58.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFCF06F0)
                    )
                    Text(
                        text = stringResource(id = R.string.sign_in_message),
                        color = Color(0xFFA09C9C)
                    )
                    Spacer(modifier = Modifier.height(90.dp))

                    var emailState = remember{
                        mutableStateOf("")
                    }
                    OutlinedTextField(
                        value = emailState.value,
                        onValueChange = {
                            emailState.value = it
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        shape = RoundedCornerShape(10.dp),
                        colors = TextFieldDefaults
                            .colors(
                                unfocusedContainerColor = Color(0xffffffff),
                                unfocusedLeadingIconColor = Color(0xFFCF06F0),
                                unfocusedIndicatorColor = Color(0xFFCF06F0),
                                focusedIndicatorColor = Color(0xFFCF06F0)
                            ),
                        label = {
                            Text(text = "E-mail")
                        },
                        modifier = Modifier
                            .width(600.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Email,
                                contentDescription = null
                            )
                        }
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    var senhaState = remember {
                        mutableStateOf("")
                    }
                    OutlinedTextField(
                        value = senhaState.value,
                        onValueChange = {
                            senhaState.value = it
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        visualTransformation = PasswordVisualTransformation(),
                        shape = RoundedCornerShape(10.dp),
                        colors = TextFieldDefaults
                            .colors(
                                unfocusedContainerColor = Color(0xffffffff),
                                unfocusedLeadingIconColor = Color(0xFFCF06F0),
                                unfocusedIndicatorColor = Color(0xFFCF06F0),
                                focusedIndicatorColor = Color(0xFFCF06F0)
                            ),
                        label = {
                            Text(text = stringResource(id = R.string.password))
                        },
                        modifier = Modifier
                            .width(600.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Lock,
                                contentDescription = null
                            )
                        }
                    )
                    Text(
                        color = Color.Red,
                        text = mensagemErroState.value
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Column(horizontalAlignment = Alignment.End) {
                            Button(
                                onClick = {
                                          if (cr.buscarUsuario(emailState.value).isEmpty() == false  && cr.buscarSenha(senhaState.value).isEmpty() == false) {
                                              controleDeNavegacao.navigate("Home")
                                          }else{
                                              erroState.value = true
                                              mensagemErroState.value = "Usuário e/ou Senha inválidos"
                                          }
                                },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFCF06F0),
                                    contentColor = Color(0xFFFFFFFF)
                                ),
                                modifier = Modifier
                                    .width(150.dp)
                                    .height(60.dp)
                            ) {
                                Row {
                                    Text(
                                        text = stringResource(id = R.string.sign_in),
                                        fontWeight = FontWeight.ExtraBold,
                                        fontSize = 16.sp
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.vector),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .width(18.dp)
                                            .offset(x = 10.dp, y = 2.dp),
                                        contentScale = ContentScale.Crop,
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(30.dp))
                            Row {
                                Text(
                                    text = stringResource(id = R.string.no_account),
                                    color = Color(0xFFA09C9C)
                                )
                                Text(
                                    text = stringResource(id = R.string.sign_up),
                                    color = Color(0xFFCF06F0),
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier
                                        .clickable {
                                            controleDeNavegacao.navigate("Cadastro")
                                        }
                                )
                            }
                        }

                    }
                }
                Spacer(
                    modifier = Modifier
                        .height(116.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Box(
                        modifier = Modifier
                            .width(120.dp)
                            .height(50.dp)
                            .background(
                                Color(0xFFCF06F0),
                                shape = RoundedCornerShape(topEnd = 10.dp)
                            )
                    )
                }
            }

        }
    }
    @Preview
    @Composable
    fun TelaLoginPreview() {
        TripRoomTheme {
           // TelaLogin(controleDeNavegacao)
        }
    }
