package com.example.litecartesnative.features.auth.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.litecartesnative.R
import com.example.litecartesnative.features.auth.presentation.components.AuthTopBar
import com.example.litecartesnative.features.auth.presentation.components.Button
import com.example.litecartesnative.features.auth.presentation.components.Input
import com.example.litecartesnative.ui.theme.LitecartesColor
import com.example.litecartesnative.ui.theme.nunitosFontFamily

@Composable
fun AuthRegisterScreen(
    navController: NavController
) {
    Scaffold(

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(LitecartesColor.Surface)
                .padding(innerPadding)
        ) {
            AuthTopBar(
                painter = painterResource(id = R.drawable.register_screen),
                contentAlignment = Alignment.TopEnd
            )
            Column(
                modifier = Modifier
                    .padding(
                        horizontal = 40.dp,
                        vertical = 50.dp
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Input(
                    value = "",
                    label = "Fullname",
                    onValueChange = {

                    }
                )
                Spacer(
                    modifier = Modifier.padding(2.dp)
                )
                Input(
                    value = "",
                    label = "Username",
                    onValueChange = {

                    }
                )
                Spacer(
                    modifier = Modifier.padding(2.dp)
                )
                Input(
                    value = "",
                    label = "Password",
                    onValueChange = {

                    }
                )
                Text(
                    text = "Lupa Password?",
                    textAlign = TextAlign.End,
                    color = LitecartesColor.Secondary,
                    fontFamily = nunitosFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            vertical = 5.dp
                        )
                )
                Spacer(
                    modifier = Modifier.padding(2.dp)
                )
                Button(
                    text = "masuk".uppercase(),
                    borderColor = LitecartesColor.Secondary,
                    color = LitecartesColor.Surface,
                    backgroundColor = LitecartesColor.Secondary
                )
                Text(
                    text = "atau".uppercase(),
                    color = LitecartesColor.Secondary,
                    fontFamily = nunitosFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(
                        vertical = 20.dp
                    )
                )
                Spacer(
                    modifier = Modifier.padding()
                )
                Button(
                    text = "Sign up with Google",
                    borderColor = Color.White,
                    color = Color.Black,
                    backgroundColor = Color.White,
                    icon = painterResource(id = R.drawable.google_icon),
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewAuthRegisterScreen() {
    AuthRegisterScreen(
        navController = rememberNavController()
    )
}
