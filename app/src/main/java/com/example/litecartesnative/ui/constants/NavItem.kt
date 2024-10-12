package com.example.litecartesnative.ui.constants

import com.example.litecartesnative.R

sealed class NavItem(
    val route: String,
    val idIcon: Int,
    val label: String
) {
    object Home : NavItem(
        "leaderboard",
        R.drawable.home,
        "home"
    )

    object Leaderboard : NavItem(
        "leaderboard",
        R.drawable.emoji_events,
        "leaderboard"
    )

    object Contest : NavItem(
        "contest",
        R.drawable.contest,
        "contest"
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
        val items = listOf(Home, Leaderboard, Contest, Friends, Profile)
    }
}