package com.example.litecartesnative.features.quiz.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.litecartesnative.R
import com.example.litecartesnative.ui.theme.LitecartesColor
import com.example.litecartesnative.ui.theme.nunitosFontFamily

@Composable
fun ResultScreen() {
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(LitecartesColor.Surface),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(12.dp)
                    )
                    .background(LitecartesColor.Primary)
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Sempurna".uppercase(),
                    color = LitecartesColor.Surface,
                    fontSize = 28.sp,
                    fontFamily = nunitosFontFamily,
                    fontWeight = FontWeight.ExtraBold
                )
                Image(
                    painter = painterResource(id = R.drawable.result),
                    contentDescription = "uwaw",
                    modifier = Modifier
                        .size(300.dp)
                )
                Row {
                    Box(
                        modifier = Modifier
                            .background(LitecartesColor.Surface)
                            .padding(
                                horizontal = 30.dp,
                                vertical = 10.dp
                            )
                    ) {
                        Text(
                            text = "5",
                            color = LitecartesColor.Primary,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(
                        modifier = Modifier
                            .padding(10.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(LitecartesColor.Surface)
                            .padding(
                                horizontal = 30.dp,
                                vertical = 10.dp
                            ),
                    ) {
                        Text(
                            text = "0",
                            color = LitecartesColor.Primary,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .background(LitecartesColor.Surface)
                    ,
                ) {
                    Text(
                        text = "Yeay kamu mendapatkan 5 Point",
                        color = LitecartesColor.Primary,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewResultScreen() {
    ResultScreen()
}