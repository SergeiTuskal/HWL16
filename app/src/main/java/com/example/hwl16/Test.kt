package com.example.hwl16

fun main() {

    Container.addSubscriber(Printer())

    Container.addSubscriber(CustomPrinter())

    Container.addNewElement(randomElement())
}