package com.example.litecartesnative.features.quiz.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.litecartesnative.ui.theme.LitecartesColor
import com.example.litecartesnative.ui.theme.nunitosFontFamily

@Composable
fun ProfileTopBar() {
    Box(
        modifier = Modifier
            .background(LitecartesColor.Secondary)
            .fillMaxWidth()
    ) {
        Row {
            Box(
                modifier = Modifier
                    .background(LitecartesColor.Primary)
                    .widthIn(min = 100.dp, max = 100.dp)
                    .heightIn(min = 100.dp, max = 100.dp)
                    .padding(10.dp)
            ) {
                AsyncImage(
                    model = "https://png.pngtree.com/png-clipart/20211121/original/pngtree-man-cartoon-character-profile-clipart-drawing-png-image_6949254.png",
                    contentDescription = "profile image"
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier

            ) {
                Text(
                    text = "My Name",
                    fontFamily = nunitosFontFamily,
                    color = LitecartesColor.Surface,
                    fontWeight = FontWeight.SemiBold,
                )
                Text(
                    text = "My School",
                    fontFamily = nunitosFontFamily,
                    color = LitecartesColor.Surface,
                    fontWeight = FontWeight.SemiBold,
                )
            }
            Column {
                Row {
                    Box(
                        modifier = Modifier
                            .background(LitecartesColor.Surface)
                    ) {
                        Text(
                            text = "250",
                            fontFamily = nunitosFontFamily,
                            color = LitecartesColor.Secondary,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                    Box(
                        modifier = Modifier
                            .background(LitecartesColor.Surface)
                    ) {
                        Text(
                            text = "150",
                            fontFamily = nunitosFontFamily,
                            color = LitecartesColor.Secondary,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .background(LitecartesColor.Surface),

                ) {
                    Text(
                        text = "Voyager",
                        fontFamily = nunitosFontFamily,
                        color = LitecartesColor.Secondary,
                        fontWeight = FontWeight.SemiBold,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewProfileTopBar() {
    ProfileTopBar()
}