package com.example.litecartesnative.features.auth.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.litecartesnative.R
import com.example.litecartesnative.ui.theme.LitecartesColor

@Composable
fun ProgressBar() {
    Column {
        Row(
            modifier = Modifier
                .background(LitecartesColor.Primary)
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.prev),
                contentDescription = "prev",
                modifier = Modifier
                    .weight(0.2f)
                    .size(30.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.temp_progress),
                contentDescription = "progress",
                modifier = Modifier
                    .weight(0.6f)
                    .size(30.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.next),
                contentDescription = "next",
                modifier = Modifier
                    .weight(0.2f)
                    .size(30.dp)
            )
        }
        Divider(
            color = Color(0xFFFFD4B8).copy(alpha = 0.25f),
            thickness = 0.5.dp
        )
    }
}

@Preview
@Composable
fun PreviewProgressBar() {
    ProgressBar()
}