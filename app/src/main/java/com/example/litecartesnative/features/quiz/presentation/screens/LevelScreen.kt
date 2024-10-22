package com.example.litecartesnative.features.quiz.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.litecartesnative.R
import com.example.litecartesnative.components.Navbar
import com.example.litecartesnative.features.quiz.presentation.components.LevelButton
import com.example.litecartesnative.features.quiz.presentation.components.ProfileTopBar
import com.example.litecartesnative.ui.constants.Screen
import com.example.litecartesnative.ui.theme.LitecartesColor

@Composable
fun LevelScreen(
    navController: NavController
) {
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            ProfileTopBar(
                backgroundColor = LitecartesColor.DarkerSurface
            )
        },
        modifier = Modifier.systemBarsPadding()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .verticalScroll(
                        scrollState
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.level_background),
                    contentDescription = "bg",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                )
                Box(
                    modifier = Modifier
                        .offset(
                            x = 80.dp,
                            y = 10.dp
                        )
                ) {
                    LevelButton(
                        level = 1,
                        onClick = {
                            navController.navigate(
                                Screen.QuestionScreen.route
                            )
                        }
                    )
                }
                Box(
                    modifier = Modifier
                        .offset(
                            x = 250.dp,
                            y = 20.dp
                        )
                ) {
                    LevelButton(level = 2)
                }
                Box(
                    modifier = Modifier
                        .offset(
                            x = 330.dp,
                            y = 130.dp
                        )
                ) {
                    LevelButton(level = 3)
                }
                Box(
                    modifier = Modifier
                        .offset(
                            x = 250.dp,
                            y = 220.dp
                        )
                ) {
                    LevelButton(level = 4)
                }
                Box(
                    modifier = Modifier
                        .offset(
                            x = 100.dp,
                            y = 230.dp
                        )
                ) {
                    LevelButton(level = 5)
                }
                Box(
                    modifier = Modifier
                        .offset(
                            x = 60.dp,
                            y = 350.dp
                        )
                ) {
                    LevelButton(level = 6)
                }
                Box(
                    modifier = Modifier
                        .offset(
                            x = 180.dp,
                            y = 390.dp
                        )
                ) {
                    LevelButton(level = 7)
                }
                Box(
                    modifier = Modifier
                        .offset(
                            x = 320.dp,
                            y = 480.dp
                        )
                ) {
                    LevelButton(level = 8)
                }
                Box(
                    modifier = Modifier
                        .offset(
                            x = 200.dp,
                            y = 560.dp
                        )
                ) {
                    LevelButton(level = 9)
                }
                Box(
                    modifier = Modifier
                        .offset(
                            x = 40.dp,
                            y = 600.dp
                        )
                ) {
                    LevelButton(level = 10)
                }
            }
            Navbar(navController = navController)
        }
    }
}

@Preview
@Composable
fun PreviewLevelScreen() {
    LevelScreen(
        navController = rememberNavController()
    )
}