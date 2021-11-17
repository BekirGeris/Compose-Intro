package com.example.composeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "android")
        }

        //testFunction(5, { testFuntionLambda() })

        testFunction(5){
            testFuntionLambda()
            println(55)
        }
    }

    private fun testFunction(int: Int, myFunction: () -> Unit){
        myFunction.invoke()
    }

    private fun testFuntionLambda() {
        println("test lambda")
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeIntroTheme {
        Greeting("Android")
    }
}