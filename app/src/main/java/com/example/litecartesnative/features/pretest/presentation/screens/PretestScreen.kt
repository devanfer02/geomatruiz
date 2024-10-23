package com.example.litecartesnative.features.pretest.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.litecartesnative.R
import com.example.litecartesnative.features.pretest.domain.model.Pretest
import com.example.litecartesnative.features.pretest.presentation.components.PretestButton
import com.example.litecartesnative.features.pretest.presentation.components.ProgressBar
import com.example.litecartesnative.ui.constants.Screen
import com.example.litecartesnative.ui.theme.LitecartesColor

@Composable
fun PretestScreen(
    navController: NavController,
    pretest: Pretest
) {
    Scaffold(
        topBar = {
            ProgressBar(navController = navController)
        },
        modifier = Modifier
            .systemBarsPadding()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .background(LitecartesColor.Surface)
                .padding(
                    horizontal = 12.dp
                )
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.padding(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .background(LitecartesColor.Primary),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tanya),
                    contentDescription = "",
                    modifier = Modifier
                        .size(150.dp)
                )
                Text(
                    text = pretest.question,
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.padding(14.dp))
            LazyColumn {
                items(pretest.options) { option ->
                    PretestButton(
                        text = option
                    )
                }
            }
            Spacer(modifier = Modifier.padding(20.dp))
            PretestButton(
                text = "Lanjutkan",
                backgroundColor = LitecartesColor.Secondary,
                textColor = LitecartesColor.Surface,
                onClick = {
                    navController.navigate(Screen.HomeScreen.route)
                }
            )
        }
    }
}

@Preview
@Composable
fun PreviewPretestScreen() {
    PretestScreen(
        navController = rememberNavController(),
        pretest = Pretest(
            question = "Bagaimana tingkat kenyamanan kamu dalam memahami teks bacaan sehari-hari",
            options = mutableListOf(
                "Pemula tapi semangat",
                "Oke lah, cukup nyamana",
                "Sudah bisa sih!",
                "Ahli banget nih"
            )
        )
    )
}