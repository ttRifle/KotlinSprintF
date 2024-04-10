package org.example.lesson_5

fun main() {

    val correctAnswer = 5

    println("Сколько будет 2+3?")

    val userAnswer = readln().toInt()

    if (userAnswer == correctAnswer)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен!")

}