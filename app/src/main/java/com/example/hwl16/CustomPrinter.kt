package com.example.hwl16

import java.time.LocalDate

class CustomPrinter : Observer {
    override fun doOnChanged() {
        Container.getAllElements().forEach {
            it.currentDate = LocalDate.now()
            println(it.toString())
        }
    }

}