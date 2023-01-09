package com.example.depression.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Mood() {
    val image = painterResource(com.example.depression.R.drawable.background)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )


    }
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(scrollState)){
        Text(
            text = "Mood", fontSize = 50.sp,color= Color.DarkGray,
            modifier = Modifier.padding(start = 140.dp, top = 20.dp)
        )


            Card(
                modifier = Modifier.padding(
                    top = 15.dp,
                    bottom = 15.dp,
                    start = 15.dp,
                    end = 15.dp
                ),
                shape = RoundedCornerShape(15.dp),
                elevation = 4.dp,
                onClick = {}
            ) {
                Row {
                    val image1 = painterResource(id = com.example.depression.R.drawable.orange)
                    Image(
                        painter = image1,
                        contentDescription = "",
                        modifier = Modifier
                            .height(100.dp)
                            .padding(end = 20.dp)
                    )
                    Text(
                        text = "Happy", fontSize = 20.sp,
                        modifier = Modifier.padding(top = 35.dp, start = 60.dp, end = 90.dp)
                    )
                }
            }


            Card(
                modifier = Modifier.padding(
                    top = 15.dp,
                    bottom = 15.dp,
                    start = 15.dp,
                    end = 15.dp
                ),
                shape = RoundedCornerShape(15.dp),
                elevation = 4.dp,
                onClick = {}
            ) {
                Row {
                    val image1 = painterResource(id = com.example.depression.R.drawable.yellow2)
                    Image(
                        painter = image1,
                        contentDescription = "",
                        modifier = Modifier.height(100.dp)
                    )
                    Text(
                        text = "Angry", fontSize = 20.sp,
                        modifier = Modifier.padding(top = 35.dp, start = 80.dp, end = 90.dp)
                    )
                }
            }


            Card(
                modifier = Modifier.padding(
                    top = 15.dp,
                    bottom = 15.dp,
                    start = 15.dp,
                    end = 15.dp
                ),
                shape = RoundedCornerShape(15.dp),
                elevation = 4.dp,
                onClick = {}
            ) {
                Row {
                    val image1 = painterResource(id = com.example.depression.R.drawable.yellow1)
                    Image(
                        painter = image1,
                        contentDescription = "",
                        modifier = Modifier
                            .height(98.dp)
                            .padding(end = 20.dp)
                    )
                    Text(
                        text = "Nervous", fontSize = 20.sp,
                        modifier = Modifier.padding(top = 35.dp, start = 50.dp, end = 85.dp)
                    )
                }
            }


            Card(
                modifier = Modifier.padding(
                    top = 15.dp,
                    bottom = 15.dp,
                    start = 15.dp,
                    end = 15.dp
                ),
                shape = RoundedCornerShape(15.dp),
                elevation = 4.dp,
                onClick = {}
            ) {
                Row {
                    val image1 = painterResource(id = com.example.depression.R.drawable.green)
                    Image(
                        painter = image1,
                        contentDescription = "",
                        modifier = Modifier
                            .height(100.dp)
                            .padding(end = 20.dp)
                    )
                    Text(
                        text = "Productive", fontSize = 20.sp,
                        modifier = Modifier.padding(top = 35.dp, start = 40.dp, end = 70.dp)
                    )
                }
            }


            Card(
                modifier = Modifier.padding(
                    top = 15.dp,
                    bottom = 15.dp,
                    start = 15.dp,
                    end = 15.dp
                ),
                shape = RoundedCornerShape(15.dp),
                elevation = 4.dp
            ) {
                Row {
                    val image1 = painterResource(id =com.example.depression.R.drawable.blue)
                    Image(
                        painter = image1,
                        contentDescription = "",
                        modifier = Modifier
                            .height(100.dp)
                            .padding(end = 20.dp)
                    )
                    Text(
                        text = "Bored", fontSize = 20.sp,
                        modifier = Modifier.padding(top = 35.dp, start = 70.dp, end = 85.dp)
                    )
                }
            }


            Card(
                modifier = Modifier.padding(
                    top = 15.dp,
                    bottom = 15.dp,
                    start = 15.dp,
                    end = 15.dp
                ),
                shape = RoundedCornerShape(15.dp),
                elevation = 4.dp,
                onClick = {}
            ) {
                Row {
                    val image1 = painterResource(id =com.example.depression. R.drawable.purple)
                    Image(
                        painter = image1,
                        contentDescription = "",
                        modifier = Modifier
                            .height(100.dp)
                            .padding(end = 20.dp)
                    )
                    Text(
                        text = "Sad", fontSize = 20.sp,
                        modifier = Modifier.padding(top = 35.dp, start = 75.dp, end = 100.dp)
                    )
                }
            }


                Card(
                    modifier = Modifier.padding(
                        top = 15.dp,
                        bottom = 15.dp,
                        start = 15.dp,
                        end = 15.dp
                    ),
                    shape = RoundedCornerShape(15.dp),
                    elevation = 4.dp,
                    onClick = {}

                ) {
                    Row {
                        val image1 = painterResource(id = com.example.depression.R.drawable.pink)
                        Image(
                            painter = image1,
                            contentDescription = "",
                            modifier = Modifier
                                .height(100.dp)
                                .padding(end = 20.dp)
                        )
                        Text(
                            text = "Tired", fontSize = 20.sp,
                            modifier = Modifier.padding(top = 35.dp, start = 65.dp, end = 100.dp)
                        )
                    }
                }
            }
        }








