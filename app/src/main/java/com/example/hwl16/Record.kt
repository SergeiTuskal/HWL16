package com.example.hwl16

import java.time.LocalDate

class Record(
    val title: String,
    val message: String,
    var currentDate: LocalDate = LocalDate.of(2022,5,24)
) {
    override fun toString(): String {
        return "Record(title='$title', message='$message', currentDate=$currentDate)"
    }
}