package com.example.hwl16

class Printer : Observer {

    override fun doOnChanged() {
        Container.getAllElements().forEach {
            println(it.toString())
        }
    }
}