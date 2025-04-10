package com.intentcalcweb.ui.theme.Screens.calc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Calc_Screen(navcontroller: NavHostController) {
    var firstnum by remember { mutableStateOf(TextFieldValue("")) }
    var secondnum by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color.LightGray)
    ) {

        Text(
            text = "Answer: $answer",
            color = Color.Red,
            fontFamily = FontFamily.Serif,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = firstnum,
            onValueChange = { firstnum = it },
            label = {
                Text(
                    text = "Enter first No.",
                    fontSize = 30.sp
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = secondnum,  
            onValueChange = { secondnum = it },
            label = {
                Text(
                    text = "Enter second No.",
                    fontSize = 30.sp
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(50.dp))

        Row {
            OutlinedButton(
                onClick = {
                    val myfirstnum = firstnum.text.trim()
                    val mysecondnum = secondnum.text.trim()
                    if (myfirstnum.isEmpty() || mysecondnum.isEmpty()){
                        answer = "Please input values"
                    } else {
                        try {
                            val myanswer = myfirstnum.toDouble() + mysecondnum.toDouble()
                            answer = myanswer.toString()
                        } catch (e: Exception) {
                            answer = "Invalid input"
                        }
                    }
                },
                modifier = Modifier.width(50.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    text = "+",
                    fontSize = 30.sp
                )
            }

            Spacer(modifier = Modifier.width(40.dp))

            OutlinedButton(
                onClick = {
                    val myfirstnum = firstnum.text.trim()
                    val mysecondnum = secondnum.text.trim()
                    if (myfirstnum.isEmpty() || mysecondnum.isEmpty()){
                        answer = "Please input values"
                    } else {
                        try {
                            val myanswer = myfirstnum.toDouble() - mysecondnum.toDouble()
                            answer = myanswer.toString()
                        } catch (e: Exception) {
                            answer = "Invalid input"
                        }
                    }
                },
                modifier = Modifier.width(50.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    text = "-",
                    fontSize = 30.sp
                )
            }

            Spacer(modifier = Modifier.width(40.dp))

            OutlinedButton(
                onClick = {
                    val myfirstnum = firstnum.text.trim()
                    val mysecondnum = secondnum.text.trim()
                    if (myfirstnum.isEmpty() || mysecondnum.isEmpty()){
                        answer = "Please input values"
                    } else {
                        try {
                            val myanswer = myfirstnum.toDouble() * mysecondnum.toDouble()
                            answer = myanswer.toString()
                        } catch (e: Exception) {
                            answer = "Invalid input"
                        }
                    }
                },
                modifier = Modifier.width(50.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    text = "*",
                    fontSize = 30.sp
                )
            }

            Spacer(modifier = Modifier.width(40.dp))

            OutlinedButton(
                onClick = {
                    val myfirstnum = firstnum.text.trim()
                    val mysecondnum = secondnum.text.trim()
                    if (myfirstnum.isEmpty() || mysecondnum.isEmpty()){
                        answer = "Please input values"
                    } else {
                        try {
                            if (mysecondnum.toDouble() == 0.0) {
                                answer = "Cannot divide by zero"
                            } else {
                                val myanswer = myfirstnum.toDouble() / mysecondnum.toDouble()
                                answer = myanswer.toString()
                            }
                        } catch (e: Exception) {
                            answer = "Invalid input"
                        }
                    }
                },
                modifier = Modifier.width(50.dp),
                colors = ButtonDefaults.buttonColors(Color.Magenta),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    text = "/",
                    fontSize = 30.sp
                )
            }
        }
    }
}

@Preview
@Composable
private fun Calc_preview() {
    Calc_Screen(rememberNavController())
}