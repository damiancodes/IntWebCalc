package com.intentcalcweb.ui.theme.Screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.intentcalcweb.navigation.ROUTE_CALC
import com.intentcalcweb.navigation.ROUTE_INTENT
import com.intentcalcweb.navigation.ROUTE_WEB

// Define a modern color palette
private val backgroundColor = Color(0xFFF5F5F5)
private val primaryColor = Color(0xFF3F51B5)
private val secondaryColor = Color(0xFF03A9F4)
private val accentColor = Color(0xFFFF4081)
private val textColor = Color(0xFF212121)

@Composable
fun Home_Screen(navcontroller: NavHostController) {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = backgroundColor)
            .fillMaxSize()
            .padding(24.dp)
    ) {
        // Header
        Card(
            modifier = Modifier.padding(bottom = 16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            colors = CardDefaults.cardColors(containerColor = primaryColor)
        ) {
            Text(
                text = "Welcome",
                fontSize = 32.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(16.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = " ",
            fontSize = 18.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Medium,
            color = textColor,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Calculator Button
        Button(
            onClick = { navcontroller.navigate(ROUTE_CALC) },
            modifier = Modifier
                .width(300.dp)
                .height(60.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = secondaryColor)
        ) {
            Text(
                text = "Calculator",
                fontSize = 18.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))


        Button(
            onClick = { navcontroller.navigate(ROUTE_INTENT) },
            modifier = Modifier
                .width(300.dp)
                .height(60.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = accentColor)
        ) {
            Text(
                text = "Intent",
                fontSize = 18.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))


        Button(
            onClick = { navcontroller.navigate(ROUTE_WEB) },
            modifier = Modifier
                .width(300.dp)
                .height(60.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = primaryColor)
        ) {
            Text(
                text = "Web",
                fontSize = 18.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
private fun HomePreview() {
    Home_Screen(rememberNavController())
}