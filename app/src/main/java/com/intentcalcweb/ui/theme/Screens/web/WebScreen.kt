package com.intentcalcweb.ui.theme.Screens.web

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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Web_Screen(navcontroller: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Web screen",
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Normal,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedButton(
            onClick = {},
            modifier = Modifier.width(150.dp), // You probably meant 150 instead of 50 for visibility
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Magenta
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Google",
                fontSize = 20.sp
            )
        }
    }
}



@Preview
@Composable
private fun webprev() {
    Web_Screen(rememberNavController())

}