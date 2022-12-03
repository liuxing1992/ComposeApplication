package com.hitech.composeapplication.layout

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet

/**
 * Description:
 * Data：2022/11/30-14:50
 * Author: ly
 */

@Composable
fun ConstrainContent() {
    ConstraintLayout {

        val (button, text) = createRefs()

        Button(
            onClick = { },
            modifier = Modifier.constrainAs(button) {
                top.linkTo(parent.top, 16.dp)
            }
        ) {

            Text(text = "Button")

        }

        Text(text = "Text", modifier = Modifier.constrainAs(text) {
            top.linkTo(button.bottom, margin = 20.dp)
            start.linkTo(button.start)
            end.linkTo(button.end)
        })
    }
}


@Composable
fun ConstrainContent2() {

    ConstraintLayout {
        val (button1, button2, text) = createRefs()
        Button(
            onClick = { },
            modifier = Modifier.constrainAs(button1) {
                top.linkTo(parent.top, margin = 16.dp)
            }
        ) {
            Text(text = "Button1Button1")
        }
        
        Text(text = "Text", modifier = Modifier.constrainAs(text) {
            top.linkTo(button1.bottom , margin = 16.dp)
            centerAround(button1.end)
        })

        val barrier = createEndBarrier(button1 , text)
        Button(
            onClick = { /*TODO*/ } ,
            modifier = Modifier.constrainAs(button2){
                top.linkTo(parent.top , margin = 16.dp)
                start.linkTo(barrier)
            }
        ) {
            Text(text = "Button2")
        }
    }
}

@Composable
fun ConstrainContent3(){
    ConstraintLayout(createSet()) {
        
        Button(onClick = { /*TODO*/ } , modifier = Modifier.layoutId("button")) {
            Text(text = "Button")
        }
        
        Text(text = "text" , modifier = Modifier.layoutId("text"))
    }
}

fun createSet() : ConstraintSet {
    return  ConstraintSet {
        val button = createRefFor("button")
        val text = createRefFor("text")
        constrain(button){
            top.linkTo(parent.top , margin = 20.dp)
        }
        
        constrain(text){
            top.linkTo(button.bottom , 20.dp)
            start.linkTo(button.start)
            end.linkTo(button.end)
        }
    }
}