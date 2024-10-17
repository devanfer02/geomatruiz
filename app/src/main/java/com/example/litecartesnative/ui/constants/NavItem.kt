package com.example.litecartesnative.ui.constants

import com.example.litecartesnative.R

sealed class NavItem(
    val route: String,
    val idIcon: Int,
    val label: String
) {
    object Home : NavItem(
        Screen.HomeScreen.route,
        R.drawable.home,
        "home"
    )

    object Leaderboard : NavItem(
        Screen.LeaderboardScreen.route,
        R.drawable.emoji_events,
        "leaderboard"
    )

    object Friends : NavItem(
        "friends",
        R.drawable.add_friends,
        "friends"
    )

    object Profile : NavItem(
        "profile",
        R.drawable.profile,
        "profile"
    )

    companion object {
        val items = listOf(Home, Leaderboard, Friends, Profile)
    }
}