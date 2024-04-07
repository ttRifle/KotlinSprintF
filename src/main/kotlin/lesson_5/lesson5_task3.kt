package org.example.lesson_5

fun main() {

    val winNumber1 = 2
    val winNumber2 = 22

    println("Введите первое число от 0 до 42")
    val userNumber1 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val userNumber2 = readln().toInt()

    if (((userNumber1 == winNumber1) && (userNumber2 == winNumber2)) || ((userNumber2 == winNumber1) && (userNumber1 == winNumber2))) println(
        "Поздравляем! Вы выиграли главный приз!"
    )
    else if ((userNumber1 == winNumber1) || (userNumber1 == winNumber2)) println("Вы выиграли утешительный приз!")
    else if ((userNumber2 == winNumber1) || (userNumber2 == winNumber2)) println("Вы выиграли утешительный приз!")
    else println("Неудача!")

}