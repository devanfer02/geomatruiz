package com.example.litecartesnative.constants

import com.example.litecartesnative.R
import com.example.litecartesnative.features.pretest.domain.model.Pretest
import com.example.litecartesnative.features.quiz.domain.model.Chapter
import com.example.litecartesnative.features.quiz.domain.model.Question

val pretestsData = mutableListOf(
    Pretest(
        question = "Manakah yang berbentuk seperti es krim?",
        options = mutableListOf(
            "Bola",
            "Kubus",
            "Kerucut"
        ),
        answer = "Kerucut",
        imageId = R.drawable.pretest1
    ),
    Pretest(
        question = "Di antara benda tersebut, manakah yang paling panjang?",
        options = mutableListOf(
            "Pensil",
            "Penggaris",
            "Penghapus"
        ),
        answer = "Penggaris",
        imageId = R.drawable.pretest2
    ),
    Pretest(
        question = "Sebutkan ciri-ciri bangun datar ini:\n",
        options = mutableListOf(
            "Memiliki 4 sisi sama panjang",
            "Memiliki 2 pasang sisi sejajar dan sama panjang",
            "Memiliki 3 sisi sama panjang"
        ),
        answer = "Memiliki 2 pasang sisi sejajar dan sama panjang",
        imageId = R.drawable.pretest3
    ),
    Pretest(
        question = "Panjang sebuah tali adalah 250 centimeter. Berapa meter panjang tali tersebut?",
        options = mutableListOf(
            "2.5 meter",
            "25 meter",
            "0.25 meter"
        )
    )
)

val chaptersData = mutableListOf(
    Chapter(
        title = "Mengenal Bangun Datar",
        description = "Belajar mengenal bangun datar dan bangun ruang serta pengukurannya",
        imageLink = R.drawable.chap1,
        levels = mutableListOf(
            mutableListOf(
                Question(
                    title = "Geometri",
                    imageId = R.drawable.fase_a_l1_1,
                    question = "Manakah yang berbentuk seperti roda?",
                    options = mutableListOf(
                        "Segitiga",
                        "Persegi",
                        "Lingkaran"
                    ),
                    description = "",
                    answer = "Lingkaran"
                ),
                Question(
                    title = "Geometri",
                    imageId = R.drawable.fase_a_l1_2,
                    question = "Manakah posisi buku yang benar?\n",
                    options = mutableListOf(
                        "Di kanan meja",
                        "Di depan meja",
                        "Di atas meja"
                    ),
                    description = "",
                    answer = "Di atas meja"
                )
            ),
            mutableListOf(
                Question(
                    title = "Pengukuran",
                    imageId = R.drawable.fase_a_l2_1,
                    question = "Pensil manakah yang paling panjang?",
                    options = mutableListOf(
                        "Pensil merah",
                        "Pensil biru",
                        "Pensil hijau"
                    ),
                    description = "Bandingkan panjang pensil diatas",
                    answer = "Pensil biru"
                ),
                Question(
                    title = "Pengukuran",
                    imageId = R.drawable.fase_a_l2_2,
                    question = "Manakah yang lebih panjang?",
                    options = mutableListOf(
                        "Meja",
                        "Buku"
                    ),
                    description = "Perhatikan jengkal tangan yang ada pada gambar",
                    answer = "Di atas meja"
                )
            )
        )
    ),
    Chapter(
        title = "Mencirikan Bangun Datar",
        description = "Pada chapter ini, kita akan belajar ciri-ciri bangun datar dan bangun ruang",
        imageLink = R.drawable.chap2,
        levels = mutableListOf(
            mutableListOf(
                Question(
                    title = "Geometri",
                    imageId = R.drawable.fase_b_l1_1,
                    question = "Manakah yang merupakan ciri persegi panjang?\n",
                    options = mutableListOf(
                        "Semua sisi sama panjang",
                        "Memiliki dua pasang sisi sejajar dan sama panjang",
                        "Memiliki tiga sisi sama panjang"
                    ),
                    description = "Perhatikan persegi panjang pada gambar tersebut",
                    answer = "Semua sisi sama panjang"
                ),
                Question(
                    title = "Geometri",
                    imageId = R.drawable.fase_b_l1_2,
                    question = "Bangun apakah ini",
                    options = mutableListOf(
                        "Persegi panjang",
                        "Persegi",
                        "Jajar genjang"
                    ),
                    description = "Bangun datar ini bisa dibagi menjadi dua segitiga yang sama. ",
                    answer = "Persegi"
                )
            ),
            mutableListOf(
                Question(
                    title = "Pengukuran",
                    question = "Berapa meter panjang pita tersebut?",
                    options = mutableListOf(
                        "3 meter",
                        "30 meter",
                        "0.3 meter"
                    ),
                    description = "Budi memiliki sebuah pita yang memiliki panjang 300 centimeter",
                    answer = "3 meter"
                ),
                Question(
                    title = "Pengukuran",
                    imageId = R.drawable.fase_b_l2_2,
                    question = "Berapa luas persegi pada gambar tersebut jika dihitung menggunakan satuan persegi?",
                    options = mutableListOf(
                        "8 satuan persegi",
                        "12 satuan persegi",
                        "16 satuan persegi"
                    ),
                    description = "Perhatikan gambar tersebut",
                    answer = "16 satuan persegi"
                )
            )
        )
    ),
)