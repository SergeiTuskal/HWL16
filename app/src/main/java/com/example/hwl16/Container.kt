package com.example.hwl16

object Container {

    private val recordsList = arrayListOf<Record>()

    private val subscribersList = arrayListOf<Observer>()

    fun getAllElements() = recordsList

    fun addNewElement(record: Record) {
        recordsList.add(record)
        subscribersList.forEach {
            it.doOnChanged()
        }
    }

    fun addSubscriber(subscriber: Observer) {
        subscribersList.add(subscriber)
    }

}