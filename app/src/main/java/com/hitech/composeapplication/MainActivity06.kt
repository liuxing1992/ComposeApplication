package com.hitech.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity06 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            conversationList(
                messages = listOf(

                    MessageCard("张三", "哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开"),
                    MessageCard("张三", "哈付费哈哈离开哈付费哈哈离开"),
                )
            )
        }
    }


    @Composable
    fun conversationList(messages: List<MessageCard>) {

        LazyColumn(content = {
            items(messages) {
                cardItem(messageCard = it)
            }
        })
    }


    @Composable
    fun cardItem(messageCard: MessageCard) {
        //储存变量
        var isExpanded by remember { mutableStateOf(false) }

        val surfaceColor by animateColorAsState(targetValue = if (isExpanded) MaterialTheme.colors.primary else MaterialTheme.colors.surface)


        Row(modifier = Modifier
            .padding(8.dp)
            .clickable {
                isExpanded = !isExpanded
            }) {

            Image(
                painter = painterResource(id = R.drawable.girl), contentDescription = null, modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column() {
                Text(text = messageCard.name, fontSize = 16.sp)
                Spacer(modifier = Modifier.height(4.dp))
                androidx.compose.material.Surface(
                    color = surfaceColor,
                    modifier = Modifier.animateContentSize().padding(4.dp)
                ) {
                    Text(
                        text = messageCard.author, lineHeight = 24.sp, maxLines = if (isExpanded) Int.MAX_VALUE else 1, modifier = Modifier.padding(4.dp),
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

