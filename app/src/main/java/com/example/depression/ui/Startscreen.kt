package com.example.depression.ui



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.depression.MoodApp

@Composable
fun StartScreen(

    modifier: Modifier = Modifier,
    navController: NavController

){
    val image = painterResource(id = com.example.depression.R.drawable.background)
    Image(
        painter = image,
        contentDescription = "",
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Column(
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = stringResource(com.example.depression.R.string.mentalhealth), style = MaterialTheme.typography.h4, fontWeight = FontWeight.Bold,color= Color.DarkGray)
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { navController.navigate(MoodApp.MoodCheck.name)
            },
            modifier = modifier.widthIn(min = 250.dp)
        ) {
            Text(stringResource(com.example.depression.R.string.Moodcheck))
        }
        Button(
            onClick = {navController.navigate(MoodApp.Depression.name)},
            modifier = modifier.widthIn(min = 250.dp)
        ) {
            Text(stringResource(com.example.depression.R.string.Depress))
        }
        Button(
            onClick = {navController.navigate(MoodApp.Anxiety.name)},
            modifier = modifier.widthIn(min = 250.dp)
        ) {
            Text(stringResource(com.example.depression.R.string.anxiety))
        }
        Button(
            onClick = {navController.navigate(MoodApp.EatingDisorder.name)},
            modifier = modifier.widthIn(min = 250.dp)
        ) {
            Text(stringResource(com.example.depression.R.string.eating))
        }
        Button(
            onClick = {navController.navigate(MoodApp.ADHD.name)},
            modifier = modifier.widthIn(min = 250.dp)
        ) {
            Text(stringResource(com.example.depression.R.string.adhd))
        }
        Button(
            onClick = {navController.navigate(MoodApp.Addiction.name)},
            modifier = modifier.widthIn(min = 250.dp)
        ) {
            Text(stringResource(com.example.depression.R.string.addiction))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StartPreview(){
}