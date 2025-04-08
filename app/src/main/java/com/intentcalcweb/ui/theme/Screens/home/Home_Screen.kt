package com.intentcalcweb.ui.theme.Screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//
//@Composable
//fun Home_Screen(modifier: Modifier = Modifier) {
//    Column (
//        verticalArrangement = Arrangement.Top,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .fillMaxSize()
//    ){
//         Text(
//             text = "Home Screen",
//             fontSize = 30.sp,
//            color = Color.Blue,
//            fontWeight = FontWeight.Bold,
//            fontFamily = FontFamily.SansSerif,
//            fontStyle = FontStyle.Italic
//                )
//        Spacer(modifier = Modifier.padding(50.dp))
//        Button(
//            onClick = { },
//              modifier = Modifier.padding(300.dp)
//        ){
//            Text(
//                text = "Intent",
//                color = Color.Red,
//                fontSize = 30.sp,
//                fontWeight = FontWeight.Bold,
//                fontFamily = FontFamily.SansSerif,
//                fontStyle = FontStyle.Italic
//            )
//        }
//        Button(onClick = { },
//            modifier = Modifier.padding(300.dp)){
//            Text(text = "web",
//                color = Color.Blue,
//                fontWeight = FontWeight.Bold,
//                fontFamily = FontFamily.SansSerif,
//                fontStyle = FontStyle.Italic
//            )
//        }
//
//    }
//
//}
//@Preview
//@Composable
//private fun Homeprev() {
//    Home_Screen()
//}


@Composable
fun Home_Screen(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = "Home Screen",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier = Modifier.padding(30.dp))
        Button(
            onClick = { /* TODO: */ },
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Intent",
                color = Color.Cyan,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Italic
            )
        }
        Spacer(modifier = Modifier.padding(30.dp))
        Button(
            onClick = { /* TODO:  */ },
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Web",
                color = Color.Cyan,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Italic
            )
        }
        Spacer(modifier = Modifier.padding(30.dp))
        Button(
            onClick = { /* TODO */ },
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Calculator",
                color = Color.Cyan,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Italic
            )
        }
    }
}
@Preview
@Composable
private fun Homeprev() {
    Home_Screen()
}
