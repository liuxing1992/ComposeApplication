package com.hitech.composeapplication.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hitech.composeapplication.R

/**
 * Description:
 * Data：2022/11/24-15:00
 * Author: ly
 */

@Composable
fun photoCard() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp), verticalAlignment = Alignment.CenterVertically
    ) {

        Surface(modifier = Modifier.size(50.dp), shape = CircleShape) {
            Image(painter = painterResource(id = R.drawable.girl), contentDescription = null)
        }

        Column() {
            Text(text = "my name", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Text(text = "3 minute ago", style = MaterialTheme.typography.body2)
        }
    }
}