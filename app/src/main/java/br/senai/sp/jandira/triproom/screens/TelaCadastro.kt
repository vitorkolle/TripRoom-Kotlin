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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.dao.UsuarioDao
import br.senai.sp.jandira.triproom.model.Usuario
import br.senai.sp.jandira.triproom.repository.UsuarioRepository
import br.senai.sp.jandira.triproom.ui.theme.PoppinsBold
import br.senai.sp.jandira.triproom.ui.theme.PoppinsRegular
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
fun TelaCadastro(controleDeNavegacao: NavHostController) {
    var nomeState = remember {
        mutableStateOf("")
    }
    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }
    var telefoneState = remember {
        mutableStateOf("")
    }

    var erroState = remember {
        mutableStateOf(false)
    }

    var mensagemErroState = remember{
        mutableStateOf(" ")
    }
    var checkState = remember {
        mutableStateOf(false)
    }
   val cr = UsuarioRepository(LocalContext.current)

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
                        .height(40.dp)
                        .background(
                            Color(0xFFCF06F0),
                            shape = RoundedCornerShape(bottomStart = 10.dp)
                        )
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(750.dp)
                    .padding(5.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    text = stringResource(id = R.string.sign_up),
                    fontSize = 58.sp,
                    fontFamily = PoppinsBold,
                    color = Color(0xFFCF06F0)
                )
                Text(
                    text = stringResource(id = R.string.new_account),
                    color = Color(0xFFA09C9C),
                    fontFamily = PoppinsRegular
                )
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(id = R.drawable.group),
                    contentDescription = "",
                    Modifier
                        .width(100.dp)
                        .height(100.dp)
                )

                var nomeState = remember {
                    mutableStateOf("")
                }
                OutlinedTextField(
                    value = nomeState.value,
                    onValueChange = {
                        nomeState.value = it
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults
                        .colors(
                            unfocusedContainerColor = Color(0xffffffff),
                            unfocusedLeadingIconColor = Color(0xFFCF06F0),
                            unfocusedIndicatorColor = Color(0xFFCF06F0),
                            focusedIndicatorColor = Color(0xFFCF06F0)
                        ),
                    label = {
                        Text(
                            text = stringResource(id = R.string.username),
                            fontFamily = PoppinsRegular
                        )
                    },
                    modifier = Modifier
                        .width(600.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Person,
                            contentDescription = null,
                            modifier = Modifier.
                            height(50.dp)
                        )
                    }
                )
                Spacer(modifier = Modifier.height(10.dp))

                var phoneState = remember {
                    mutableStateOf("")
                }
                OutlinedTextField(
                    value = phoneState.value,
                    onValueChange = {
                        phoneState.value = it
                    },
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults
                        .colors(
                            unfocusedContainerColor = Color(0xffffffff),
                            unfocusedLeadingIconColor = Color(0xFFCF06F0),
                            unfocusedIndicatorColor = Color(0xFFCF06F0),
                            focusedIndicatorColor = Color(0xFFCF06F0)
                        ),
                    label = {
                        Text(
                            text = stringResource(id = R.string.phone),
                            fontFamily = PoppinsRegular
                        )
                    },
                    modifier = Modifier
                        .width(600.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Phone,
                            contentDescription = null
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(modifier = Modifier.height(10.dp))
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
                        Text(
                            text = "E-mail",
                            fontFamily = PoppinsRegular)
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
                Spacer(modifier = Modifier.height(10.dp))
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
                        Text(
                            text = stringResource(id = R.string.password),
                            fontFamily = PoppinsRegular
                            )
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
                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(35.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start

                ) {
                    Checkbox(
                        colors = CheckboxDefaults.colors(
                            uncheckedColor = Color(0xFFCF06F0)
                        ),
                        checked = checkState.value,
                        onCheckedChange = {
                            checkState.value = it
                        }
                    )
                    Text(
                        text = stringResource(id = R.string.over_18),
                        fontFamily = PoppinsRegular
                    )
                }
                Text(
                    color = Color.Red,
                    text = mensagemErroState.value
                )
                OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xFFCF06F0),
                        focusedBorderColor = Color(0xFFCF06F0),
                        unfocusedLabelColor = Color(0xFFCF06F0),
                        disabledLeadingIconColor = Color(0xFFCF06F0),
                        focusedLeadingIconColor = Color(0xFFCF06F0)
                    )
                Spacer(modifier = Modifier.height(1.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Column(horizontalAlignment = Alignment.End) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(
                            onClick = {
                                    val usuario = Usuario(
                                        nome = nomeState.value,
                                        email = emailState.value,
                                        telefone = phoneState.value
                                    )
                                    cr.salvar(usuario)
                                    controleDeNavegacao.navigate("Home")
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFCF06F0),
                                contentColor = Color(0xFFFFFFFF)
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(60.dp)
                                .padding(10.dp, 0.dp)
                        ) {
                            Row {
                                Text(
                                    text = stringResource(id = R.string.create_account),
                                    fontFamily = PoppinsBold,
                                    fontSize = 16.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(
                            modifier = Modifier
                                .padding(12.dp,0.dp)
                        ) {
                            Text(
                                text = stringResource(id = R.string.already_account),
                                fontFamily = PoppinsRegular,
                                color = Color(0xFF7A3C3C)
                            )
                            Text(
                                text = stringResource(id = R.string.login),
                                color = Color(0xFFCF06F0),
                                fontFamily = PoppinsBold,
                                modifier = Modifier
                                    .clickable {
                                        controleDeNavegacao.navigate("Login")

                                    }
                            )
                        }
                    }

                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Box(
                    modifier = Modifier
                        .width(120.dp)
                        .height(40.dp)
                        .offset(y = 38.dp)
                        .background(
                            Color(0xFFCF06F0),
                            shape = RoundedCornerShape(topEnd = 10.dp)
                        )
                )
            }
        }
    }

@Preview
@Composable
fun TelaCadastroPreview() {
    TripRoomTheme {
       //TelaCadastro()
    }
}