package com.example.litecartesnative.ui.constants

sealed class Screen(
    val route: String
) {
    object AuthStartScreen : Screen(
        "auth_start_screen"
    )

    object AuthLoginScreen : Screen(
        "auth_login_screen"
    )

    object AuthRegisterScreen : Screen(
        "auth_register_screen"
    )

    object HomeScreen : Screen(
        "home_screen"
    )

    object LevelScreen : Screen(
        "level_screen"
    )

    object QuestionScreen : Screen(
        "question_screen"
    )
}