package com.example.depression.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//function for happy mood
@Composable
fun Anxiety(){
    val image = painterResource(id = com.example.depression.R.drawable.background)
    Image(
        painter = image,
        contentDescription = "",
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(scrollState)) {
        Card(
            modifier = Modifier.padding(top = 15.dp, bottom = 15.dp, start = 15.dp, end = 15.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = 4.dp
        ) {
            Column {
                Text(
                    text = stringResource(com.example.depression.R.string.anxiety), fontSize = 17.sp,
                    modifier = Modifier.padding(top = 10.dp, start = 130.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a1), fontSize = 14.sp,
                    modifier = Modifier.padding(top = 2.dp, start = 5.dp, bottom = 5.dp)
                )
            }
        }

        Card(
            modifier = Modifier.padding(top = 15.dp, bottom = 15.dp, start = 15.dp, end = 15.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = 4.dp
        ) {
            Column {
                Row {
                    val image1 = painterResource(id = com.example.depression.R.drawable.symptoms)
                    Image(
                        painter = image1,
                        contentDescription = "",
                        modifier = Modifier.padding(top = 20.dp, bottom = 5.dp, start = 70.dp)
                            .height(40.dp)
                    )
                    val image2 = painterResource(id = com.example.depression.R.drawable.causes)
                    Image(
                        painter = image2,
                        contentDescription = "",
                        modifier = Modifier.padding(top = 25.dp, bottom = 5.dp, start = 50.dp)
                    )
                    val image3 = painterResource(id = com.example.depression.R.drawable.precautions)
                    Image(
                        painter = image3,
                        contentDescription = "",
                        modifier = Modifier.padding(top = 25.dp, bottom = 5.dp, start = 50.dp)
                    )
                }
                Row {
                    Text(
                        text = stringResource(com.example.depression.R.string.Symptoms), fontSize = 15.sp,
                        modifier = Modifier.padding(start = 55.dp, bottom = 10.dp)
                    )
                    Text(
                        text = stringResource(com.example.depression.R.string.Causes), fontSize = 15.sp,
                        modifier = Modifier.padding(top = 2.dp, start = 20.dp, bottom = 10.dp)
                    )
                    Text(
                        text = stringResource(com.example.depression.R.string.Prevention), fontSize = 15.sp,
                        modifier = Modifier.padding(top = 2.dp, start = 20.dp, bottom = 10.dp)
                    )
                }
            }
        }
        Card(
            modifier = Modifier.padding(top = 15.dp, bottom = 15.dp, start = 15.dp, end = 15.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = 4.dp
        ) {
            Column {
                Text(
                    text = stringResource(com.example.depression.R.string.sym), fontSize = 16.sp,
                    modifier = Modifier.padding(top = 10.dp, start = 130.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a2), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a3), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a4), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )

                Text(
                    text = stringResource(com.example.depression.R.string.a5), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a6), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a7), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp, end = 5.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a8), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp, bottom = 5.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a9), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp, bottom = 5.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a10), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp, bottom = 5.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a11), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp, bottom = 5.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a12), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp, bottom = 5.dp)
                )
            }
        }

        Card(
            modifier = Modifier.padding(top = 15.dp, bottom = 15.dp, start = 15.dp, end = 15.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = 4.dp
        ) {
            Column {
                Text(
                    text = stringResource(com.example.depression.R.string.Cs), fontSize = 16.sp,
                    modifier = Modifier.padding(top = 10.dp, start = 150.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a13), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a14), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a16), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )

                Text(
                    text = stringResource(com.example.depression.R.string.a17), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )
            }
        }
        Card(
            modifier = Modifier.padding(top = 15.dp, bottom = 15.dp, start = 15.dp, end = 15.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = 4.dp
        ) {
            Column {
                Text(
                    text = stringResource(com.example.depression.R.string.Pv), fontSize = 16.sp,
                    modifier = Modifier.padding(top = 10.dp, start = 100.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a18), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a19), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a20), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )

                Text(
                    text = stringResource(com.example.depression.R.string.a21), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )
                Text(
                    text = stringResource(com.example.depression.R.string.a22), fontSize = 13.sp,
                    modifier = Modifier.padding(top = 4.dp, start = 25.dp)
                )
            }
        }

    }
}
