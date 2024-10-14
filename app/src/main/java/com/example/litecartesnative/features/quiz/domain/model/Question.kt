package com.example.litecartesnative.features.quiz.domain.model

data class Question(
    val title: String,
    val description: String,
    val question: String,
    val options: List<String>,
    val rightIndex: Int
)