package com.example.marvel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marvel.ui.theme.MarvelTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarvelTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.padding(10.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "Sign Up",
                            fontWeight = FontWeight.Bold,
                            fontSize = 32.sp,
                            modifier = Modifier.padding(2.dp)
                        )
                        Text("It's quick and easy", Modifier.padding(2.dp))
                        Divider()
                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp)
                        ) {
                            TextField(
                                value = "",
                                onValueChange = {},
                                placeholder = { Text(text = "FirstName") },
                                modifier = Modifier
                                    .padding(2.dp)
                                    .weight(1f)
                            )
                            TextField(
                                value = "",
                                onValueChange = {},
                                placeholder = { Text(text = "Surname") },
                                modifier = Modifier
                                    .padding(2.dp)
                                    .weight(1f)
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp)
                        ) {
                            TextField(
                                value = "",
                                onValueChange = {},
                                modifier = Modifier.fillMaxWidth(),
                                placeholder = { Text(text = "Email") })
                        }
                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp)
                        ) {
                            TextField(
                                value = "",
                                onValueChange = {},
                                placeholder = { Text(text = "Password") },
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        Row {
                            Text(
                                modifier = Modifier.padding(12.dp),
                                fontSize = 8.sp,
                                lineHeight = 12.sp,
                                text = "People who use our service may have uploaded your contact information to Facebook. Learn more.\n" +
                                        "\nBy clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy. You may receive SMS notifications from us and can opt out at any time."
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Button(
                                shape = RoundedCornerShape(10.dp),
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(Color(0, 165, 0))
                            ) {
                                Text(text = "Sign Up!", color = Color.White)
                            }
                        }
                    }
                    //                    Column(verticalArrangement = Arrangement.Center,
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        modifier = Modifier.padding(20.dp)) {
//                        var a by remember {
//                            mutableStateOf("")
//                        }
//                        var b by remember {
//                            mutableStateOf("")
//                        }
//                        Text("Welcome", fontSize = 23.sp);
//                        Image(painterResource(id = R.drawable.login), contentDescription = "Login",
//                            Modifier
//                                .width(100.dp)
//                                .height(100.dp))
//
//                        Text("UserName", textAlign = TextAlign.Start, modifier = Modifier.fillMaxWidth());
//
//                        TextField(value = a, onValueChange = { a= it }, Modifier.fillMaxWidth())
//
//                        Text("Password", textAlign = TextAlign.Start, modifier = Modifier.fillMaxWidth());
//
//                        TextField(value = b, onValueChange = { b= it }, Modifier.fillMaxWidth())
//                        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
//                            Button(onClick = {  }, colors = ButtonDefaults.buttonColors(Color.Yellow)) {
//                                Text("Sign in", color = Color.Black)
//                            }
//                            Button(onClick = {}) {
//                                Text("Sign up")
//                            }
//                        }
//                    }

                }
            }
        }
    }
}
