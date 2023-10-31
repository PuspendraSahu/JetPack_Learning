package com.example.styletext

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val fontFamily = FontFamily(
           Font(R.font.playpensans_bold),
           Font(R.font.playpensans_extralight),
           Font(R.font.playpensans_light)



       )
        setContent {

            ColorBox(
                Modifier.fillMaxSize()
            )

//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.Black)
//                    .border(10.dp, Color.Black)
//
//            ){
//                Text(
//                    text = buildAnnotatedString {
//                        withStyle(
//                            style = SpanStyle(
//                                color = Color.Green,
//                                fontSize = 60.sp
//                            )
//                        ){
//                            append("J")
//                        }
//                        append(" for Jungle")
//                    },
//                    color = Color.White,
//
//                    fontFamily = fontFamily,
//                    fontWeight = FontWeight.Light,
//                    fontStyle = FontStyle.Italic,
//                    textAlign = TextAlign.Center,
//
//                    fontSize = 30.sp,
//
//                    modifier = Modifier
//                        .padding(top = 40.dp)
//                        .padding(start = 20.dp)
//
//                )
//
//
//
//            }
//
       }
    }
}


@Composable
fun ColorBox(modifier: Modifier = Modifier) {

    val color = remember{
        mutableStateOf(Color.Yellow)
    }
    
    Box(modifier = modifier
        .background(color.value)
        .clickable {
            color.value = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )
        }
    )
}

