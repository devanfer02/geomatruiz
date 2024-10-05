package com.example.litecartesnative.components

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
}