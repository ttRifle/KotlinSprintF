package org.example.lesson_4

fun main() {

    val numberOfOrderedTablesToday = 13
    val numberOdOrderedTablesTomorrow = 9

    println("Доступность столиков на сегодня: ${numberOfOrderedTablesToday < NUMBER_OF_TABLES} \nДоступность столиков на завтра: ${numberOdOrderedTablesTomorrow < NUMBER_OF_TABLES}")

}

const val NUMBER_OF_TABLES = 13