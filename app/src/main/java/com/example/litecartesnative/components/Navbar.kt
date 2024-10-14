package com.example.litecartesnative.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.litecartesnative.R
import com.example.litecartesnative.ui.constants.NavItem
import com.example.litecartesnative.ui.theme.LitecartesColor

@Composable
fun Navbar(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(LitecartesColor.Surface)
    ) {
        BottomNavigation(
            backgroundColor = LitecartesColor.Primary,
            modifier = Modifier

                .clip(RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp
                ))
                .background(LitecartesColor.Primary)
        ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route

            NavItem.items.forEach { item ->
                BottomNavigationItem(
                    selected = currentRoute == item.route,
                    onClick = { /*TODO*/ },
                    icon = {
                        Image(
                            painter = painterResource(id = item.idIcon),
                            contentDescription = item.label
                        )
                    }
                )
            }
        }
    }

}

@Preview
@Composable
fun PreviewNavbar(){
    Navbar(navController = rememberNavController())
}