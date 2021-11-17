package com.example.composeintro

import android.graphics.fonts.Font
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(name = "android")
        }
    }
}

@Composable
fun MainScreen(name: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomText("android")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText("world")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText("world")
        Spacer(modifier = Modifier.padding(5.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CustomText("android")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText("world")
        }
    }
}

@Composable
fun CustomText(text: String){
    Text(
        modifier = Modifier
            .clickable {
                println("hello android clicked")
            }
            .background(color = Color.DarkGray)
            .padding(5.dp),
        text = "Hello $text!",
        color = Color.White,
        fontSize = 25.sp,
        fontWeight = FontWeight.Black,
        textAlign = TextAlign.Center)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen(name = "android")
}