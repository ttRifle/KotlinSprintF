package org.example.lesson_5

fun main() {

    val answerNumber1 = 2
    val answerNumber2 = 3

    println("Сколько будет $answerNumber1+$answerNumber2?")

    val userAnswer = readln().toInt()

    if (userAnswer == (answerNumber1 + answerNumber2))
        println("Добро пожаловать!")
    else
        println("Доступ запрещен!")

}