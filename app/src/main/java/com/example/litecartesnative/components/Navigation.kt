package com.example.litecartesnative.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.litecartesnative.features.auth.presentation.screens.AuthStartScreen

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

        }
        composable(
            route = Screen.AuthRegisterScreen.route
        ) {

        }
    }
}