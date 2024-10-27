package com.example.litecartesnative.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.litecartesnative.features.auth.presentation.screens.AuthLoginScreen
import com.example.litecartesnative.features.auth.presentation.screens.AuthRegisterScreen
import com.example.litecartesnative.features.auth.presentation.screens.AuthStartScreen
import com.example.litecartesnative.features.pretest.domain.model.Pretest
import com.example.litecartesnative.features.pretest.presentation.screens.PretestScreen
import com.example.litecartesnative.features.pretest.presentation.screens.QuickCheckScreen
import com.example.litecartesnative.features.user.presentations.screens.LeaderboardScreen
import com.example.litecartesnative.features.quiz.presentation.screens.ChapterScreen
import com.example.litecartesnative.features.quiz.presentation.screens.LevelScreen
import com.example.litecartesnative.features.quiz.presentation.screens.QuestionScreen
import com.example.litecartesnative.features.user.presentations.screens.FriendScreen
import com.example.litecartesnative.features.user.presentations.screens.ProfileScreen
import com.example.litecartesnative.constants.Screen
import com.example.litecartesnative.constants.questionDummy
import com.example.litecartesnative.features.quiz.presentation.screens.ResultScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.AuthStartScreen.route
    ) {
        composable(
            route = Screen.AuthStartScreen.route
        ) {
            AuthStartScreen(
                navController = navController
            )
        }
        composable(
            route = Screen.AuthLoginScreen.route
        ) {
            AuthLoginScreen(
                navController = navController
            )
        }
        composable(
            route = Screen.AuthRegisterScreen.route
        ) {
            AuthRegisterScreen(
                navController = navController
            )
        }
        composable(
            route = Screen.QuickCheckScren.route
        ) {
            QuickCheckScreen(
                navController = navController
            )
        }
        composable(
            route = "${Screen.PretestScreen.route}/{id}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                }
            )
        ) {
            val id = it.arguments?.getInt("id") ?: 1

            PretestScreen(
                navController = navController,
                pretestId = id
            )
        }
        composable(
            route = Screen.HomeScreen.route
        ) {
            ChapterScreen(navController = navController)
        }
        composable(
            route = "${Screen.LevelScreen.route}/{id}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                }
            )
        ) {
            val id = it.arguments?.getInt("id") ?: 1

            LevelScreen(
                navController = navController,
                chapterId = id
            )
        }
        composable(
            route = "${Screen.QuestionScreen.route}/{chapterId}/levels/{level}/questions/{id}",
            arguments = listOf(
                navArgument("chapterId") {
                    type = NavType.IntType
                },
                navArgument("level") {
                    type = NavType.IntType
                },
                navArgument("id") {
                    type = NavType.IntType
                }
            )
        ) {
            val chapterId = it.arguments?.getInt("chapterId") ?: 1
            val level = it.arguments?.getInt("level") ?: 1
            val id = it.arguments?.getInt("id") ?: 1

            QuestionScreen(
                chapterId = chapterId,
                level = level,
                id = id,
                navController = navController
            )
        }
        composable(
            route = Screen.LeaderboardScreen.route
        ) {
            LeaderboardScreen(navController = navController)
        }
        composable(
            route = Screen.ProfileScreen.route
        ) {
            ProfileScreen(navController = navController)
        }
        composable(
            route = Screen.FriendScreen.route
        ) {
            FriendScreen(navController = navController)
        }
        composable(
            route = "${Screen.ResultScreen.route}/{chapterId}",
            arguments = listOf(
                navArgument("chapterId") {
                    type = NavType.IntType
                }
            )
        ) {
            val chapterId = it.arguments?.getInt("chapterId") ?: 0

            ResultScreen(
                navController = navController,
                chapterId = chapterId
            )
        }
    }
}