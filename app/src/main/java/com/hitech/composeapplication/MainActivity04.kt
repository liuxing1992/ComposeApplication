package com.hitech.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hitech.composeapplication.ui.theme.ComposeApplicationTheme

class MainActivity04 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting(MessageCard("hello" , "google player"))
                }
            }
        }
    }

    @Composable
    fun Greeting(card: MessageCard) {

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top)
            .background(color = Color.Green)) {
            Image(painter = painterResource(id = R.drawable.icon_avatar_default), contentDescription = "头像" , modifier = Modifier
                .size(60.dp, 60.dp)
                .alpha(0.5f)
            )
            
            Image(bitmap = ImageBitmap.imageResource(R.drawable.girl), contentDescription = null , modifier = Modifier.clip(RoundedCornerShape(6.dp)))
            
            Spacer(modifier = Modifier.width(8.dp))


            Column(verticalArrangement = Arrangement.SpaceBetween  , modifier = Modifier.background(color = Color.Blue)  ) {
                Text(text = card.name , color = Color.White)
                Text(text = card.author)
            }
        }

    }


}

