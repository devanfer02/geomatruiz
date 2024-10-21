package com.example.litecartesnative.features.quiz.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.litecartesnative.features.auth.presentation.components.ProgressBar
import com.example.litecartesnative.features.quiz.presentation.components.OptionButton
import com.example.litecartesnative.features.quiz.domain.model.Question
import com.example.litecartesnative.ui.theme.LitecartesColor
import com.example.litecartesnative.ui.theme.nunitosFontFamily

@Composable
fun QuestionScreen(question: Question) {
    Scaffold(
        topBar = {
            ProgressBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .background(LitecartesColor.Surface)
        ) {
            Box(
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            bottomEnd = 12.dp,
                            bottomStart = 12.dp
                        )
                    )
                    .background(LitecartesColor.Primary)
                    .padding(
                        top = 18.dp
                    ),
            ) {
                Column(
                    modifier = Modifier
                        .padding(
                            horizontal = 20.dp
                        )
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = question.title,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 20.sp,
                        fontFamily = nunitosFontFamily
                    )

                    Text(
                        text = question.description,
                        textAlign = TextAlign.Justify,
                        color = Color.White,
                        fontFamily = nunitosFontFamily,
                        fontSize = 17.sp,
                        modifier = Modifier
                            .padding(
                                vertical = 20.dp
                            )
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(LitecartesColor.Surface)
                    .padding(top = 20.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(
                            horizontal = 18.dp,
                        )
                ) {
                    Text(
                        text = question.question,
                        textAlign = TextAlign.Center,
                        color = LitecartesColor.Secondary,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(
                        modifier = Modifier
                            .padding(10.dp)
                    )
                    LazyColumn {
                        items(question.options) { option ->
                            OptionButton(text = option)
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewQuestionScreen() {
    QuestionScreen(
        question = Question(
            title = "Artificial Intelligence (AI)",
            description = "Artificial Intelligence (AI) menjadi semakin terdepan dalam dunia teknologi. Kemampuannya untuk mengenali pola, belajar dari pengalaman, dan membuat keputusan semakin kompleks, memperluas penggunaannya dari industri hingga ke kehidupan sehari-hari. Dari asisten virtual yang bisa merespon pertanyaan kita hingga mobil otonom yang dapat mengemudi sendiri, kehadiran AI telah mengubah cara kita berinteraksi dengan teknologi.",
            question = "Apa yang membuat Artificial Intelligence semakin dominan dalam dunia teknologi?",
            options = mutableListOf(
                "Kemampuan belajar dari pengalaman",
                "Keterbatasan dalam penggunaan",
                "Ketergantungan pada manusia",
                "Kelemahan dalam mengenali pola"
            ),
            rightIndex = 0
        )
    )
}