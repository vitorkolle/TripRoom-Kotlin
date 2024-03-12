package br.senai.sp.jandira.triproom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    TelaLogin()
                }
            }
        }
    }
}

@Composable
fun TelaLogin() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
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
                text = "Login",
                fontSize = 58.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFCF06F0)
            )
            Text(
                text = "Please sign in to continue.",
                color = Color(0xFFA09C9C)
            )
            Spacer(modifier = Modifier.height(90.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
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
            OutlinedTextField(
                value = "",
                onValueChange = {},
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults
                    .colors(
                        unfocusedContainerColor = Color(0xffffffff),
                        unfocusedLeadingIconColor = Color(0xFFCF06F0),
                        unfocusedIndicatorColor = Color(0xFFCF06F0),
                        focusedIndicatorColor = Color(0xFFCF06F0)
                    ),
                label = {
                    Text(text = "Password")
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
            Spacer(modifier = Modifier.height(40.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Column(horizontalAlignment = Alignment.End) {
                    Button(
                        onClick = { /*TODO*/ },
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
                                text = "SIGN IN",
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
                            text = "Don’t have an account? ",
                            color = Color(0xFFA09C9C)
                        )
                        Text(
                            text = "Sign up",
                            color = Color(0xFFCF06F0),
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }

            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Box(
                modifier = Modifier
                    .width(120.dp)
                    .height(50.dp)
                    .offset(y = 31.dp)
                    .background(
                        Color(0xFFCF06F0),
                        shape = RoundedCornerShape(topEnd = 10.dp)
                    )
            )
        }
    }
}
@Composable
fun TelaCadastro() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
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
                .height(650.dp)
                .padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally

            ) {
            Text(
                text = "Sign Up",
                fontSize = 58.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFCF06F0)
            )
            Text(
                text = "Create a new account",
                color = Color(0xFFA09C9C)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(id = R.drawable.group),
                contentDescription = "",
                Modifier
                    .width(100.dp)
                    .height(100.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults
                    .colors(
                        unfocusedContainerColor = Color(0xffffffff),
                        unfocusedLeadingIconColor = Color(0xFFCF06F0),
                        unfocusedIndicatorColor = Color(0xFFCF06F0),
                        focusedIndicatorColor = Color(0xFFCF06F0)
                    ),
                label = {
                    Text(text = "Username")
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
            OutlinedTextField(
                value = "",
                onValueChange = {},
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults
                    .colors(
                        unfocusedContainerColor = Color(0xffffffff),
                        unfocusedLeadingIconColor = Color(0xFFCF06F0),
                        unfocusedIndicatorColor = Color(0xFFCF06F0),
                        focusedIndicatorColor = Color(0xFFCF06F0)
                    ),
                label = {
                    Text(text = "Phone")
                },
                modifier = Modifier
                    .width(600.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Phone,
                        contentDescription = null
                    )
                }
            )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
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
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults
                    .colors(
                        unfocusedContainerColor = Color(0xffffffff),
                        unfocusedLeadingIconColor = Color(0xFFCF06F0),
                        unfocusedIndicatorColor = Color(0xFFCF06F0),
                        focusedIndicatorColor = Color(0xFFCF06F0)
                    ),
                label = {
                    Text(text = "Password")
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
            Spacer(modifier = Modifier.height(0.dp))
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
                    checked = false,
                    onCheckedChange = {}
                )
                Text(
                    text = "Over 18?"
                )
            }
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
                        onClick = { /*TODO*/ },
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
                                text = "CREATE ACCOUNT",
                                fontWeight = FontWeight.ExtraBold,
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
                            text = "Already have an account?",
                            color = Color(0xFF7A3C3C)
                        )
                        Text(
                            text = "Sign in",
                            color = Color(0xFFCF06F0),
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }

            }
        }
        Spacer(modifier = Modifier.height(15.dp))
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
                    .offset(y = 33.dp)
                    .background(
                        Color(0xFFCF06F0),
                        shape = RoundedCornerShape(topEnd = 10.dp)
                    )
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaloginPreview() {
    TripRoomTheme {
        TelaLogin()
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaCadastroPreview() {
    TripRoomTheme {
        TelaCadastro()
    }
}