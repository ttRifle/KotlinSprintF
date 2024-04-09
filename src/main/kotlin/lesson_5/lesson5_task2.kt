package org.example.lesson_5


fun main() {

    val yearToday = 2024

    println("Введите год рождения!")
    val userBirthDate = readln().toInt()

    if ((yearToday - userBirthDate) > AGE_OF_MAJORITY) println("Показать экран со скрытым контентом") else println("Контент запрещен")

}

const val AGE_OF_MAJORITY = 18