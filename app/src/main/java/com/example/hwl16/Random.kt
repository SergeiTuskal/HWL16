package com.example.hwl16

import java.time.LocalDate
import kotlin.random.Random

fun randomElement(): Record {
    val listOfElements = arrayListOf(
        Record("title1", "message1", LocalDate.of(2022, 5, 20)),
        Record("title2", "message2", LocalDate.of(2022, 5, 21)),
        Record("title3", "message3", LocalDate.of(2022, 5, 22)),
        Record("title4", "message4", LocalDate.of(2022, 5, 23)),
        Record("title5", "message5", LocalDate.of(2022, 5, 24))
    )

    val random = Random.nextInt(1, 5)

    return listOfElements[random]
}