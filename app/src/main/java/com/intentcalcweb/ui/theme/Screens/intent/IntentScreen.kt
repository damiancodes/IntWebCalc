package com.intentcalcweb.ui.theme.Screens.intent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Intent_Screen(navcontroller: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
    ) {
        Text(
            text = "Intent Screen",
            color = Color.Red,
            fontFamily = FontFamily.Serif,
            fontSize = 30.sp,
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { /* TODO */ },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "call",
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { /* TODO */ },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "share",
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { /* TODO */ },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "sms",
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { /* TODO */ },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Dial",
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { /* TODO */ },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Camera",
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { /* TODO */ },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "EMOJI",
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { /* TODO */ },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "STK",
                fontSize = 30.sp
            )
        }
    }
}

@Preview
@Composable
private fun Intentprev() {
    Intent_Screen(rememberNavController())
}