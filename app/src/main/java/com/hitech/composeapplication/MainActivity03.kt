package com.hitech.composeapplication

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hitech.composeapplication.ui.theme.ComposeApplicationTheme

class MainActivity03 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           ComposeApplicationTheme() {
               Greeting(MessageCard("hello" , "googlegoogle"))
           }
        }
    }

    @Composable
    fun Greeting(card: MessageCard) {

        Row(modifier =  Modifier.background(MaterialTheme.colors.background)) {
            Image(painter = painterResource(id = R.drawable.girl), contentDescription = "头像")
            Column() {
                Text(text = card.name)
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = card.author)
            }
        }

    }


}

