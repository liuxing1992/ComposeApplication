package com.hitech.composeapplication

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
import com.hitech.composeapplication.ui.theme.ComposeApplicationTheme

class MainActivity02 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting(MessageCard("android" , "google"))
                }
            }
        }
    }

    @Composable
    fun Greeting(card: MessageCard) {
        Text(text = "Hello ${card.name}!")
        Text(text = "Hello ${card.author}!")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposeApplicationTheme {
            Greeting(MessageCard("android" , "google"))
        }
    }
}


