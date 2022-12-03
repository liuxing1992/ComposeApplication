package com.hitech.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hitech.composeapplication.ui.theme.ComposeApplicationTheme

class MainActivity05 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    ListItems(cards = arrayListOf(
                        MessageCard("hello1" , "googlegoogle1"),
                        MessageCard("hello2" , "googlegoogle2"),
                        MessageCard("hello3" , "googlegoogle3"),
                        MessageCard("hello4" , "googlegoogle4"),
                        MessageCard("hello5" , "googlegoogle5"),
                    ))
                }
            }
        }
    }

    @Composable
    fun ListItems(cards: List<MessageCard>) {

        LazyColumn( ){
            items(cards ) {
                Greeting(card = it)
            }
        }

    }

    @Composable
    fun Greeting(card: MessageCard) {

        Row(modifier = Modifier.padding(10.dp)) {
            Image(painter = painterResource(id = R.drawable.icon_avatar_default), contentDescription = null , modifier = Modifier
                .size(60.dp, 60.dp)
                .alpha(0.5f)
            )

            Spacer(modifier = Modifier.width(8.dp))
            Column(verticalArrangement = Arrangement.Center  ) {
                Text(text = card.name)
                Text(text = card.author)
            }
        }

    }

}

