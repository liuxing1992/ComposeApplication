package com.hitech.composeapplication.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Description:
 * Data：2022/12/3-14:16
 * Author: ly
 */

@Composable
fun TwoTextLayout(modifier: Modifier = Modifier) {
    Row (modifier = modifier.height(IntrinsicSize.Min)){

        Text(text = "Hi", modifier = Modifier
            .weight(1f)
            .padding(4.dp)
            .background(color = Color.Blue)
            .align(alignment = Alignment.CenterVertically)
            .wrapContentWidth(align = Alignment.Start) ,
            color = Color.White
        )

        Divider(color = Color.Black , modifier = Modifier.width(1.dp).fillMaxHeight())

        Text(text = "HThereHThereHThereHThereHThereHThereHThereHThereHThereHThereHThereHThereHThereHThereHThereHThere", modifier = Modifier
            .weight(1f)
            .padding(4.dp)
            .background(color = Color.Green)
            .wrapContentWidth(align = Alignment.End) ,
            color = Color.White
        )


    }

}