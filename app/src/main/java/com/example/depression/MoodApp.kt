package com.example.depression

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

import com.example.depression.ui.*

import com.example.depression.ui.theme.*


enum class MoodApp(@StringRes val title: Int) {
    Start(title=com.example.depression.R.string.MoodCheckApp),
    MoodCheck(title = com.example.depression.R.string.Moodcheck),
    Depression(title = com.example.depression.R.string.Depress),
    Anxiety(title = com.example.depression.R.string.anxiety),
    EatingDisorder(title = com.example.depression.R.string.eating),
    ADHD(title = com.example.depression.R.string.adhd),
    Addiction(title = com.example.depression.R.string.addiction)

}


@Composable
fun MoodAppBar(
    currentScreen: MoodApp,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(com.example.depression.R.string.back_button)
                    )
                }
            }
        }
    )
}
@Composable
fun MentalHealth(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()


) {

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

    // Get current back stack entry
    val backStackEntry by navController.currentBackStackEntryAsState()
    // Get the name of the current screen
    val currentScreen = MoodApp.valueOf(
        backStackEntry?.destination?.route ?: MoodApp.MoodCheck.name
    )
    Scaffold(
        topBar = {
            MoodAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ){
        NavHost(navController = navController, startDestination = MoodApp.Start.name){

            composable(route= MoodApp.Start.name){
                StartScreen(navController = navController)
            }

            composable(route=MoodApp.MoodCheck.name){
                Mood()
            }


            composable(route=MoodApp.Depression.name){
                Depression()
            }
            composable(route=MoodApp.Anxiety.name){
                Anxiety()
            }
            composable(route=MoodApp.EatingDisorder.name){
                eating()
            }
            composable(route=MoodApp.ADHD.name){
                ADHD()
            }
            composable(route=MoodApp.Addiction.name){
                addiction()
            }
        }
    }


}

