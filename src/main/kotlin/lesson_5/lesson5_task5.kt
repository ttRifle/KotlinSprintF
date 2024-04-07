package org.example.lesson_5

fun main() {

    val lotteryNumbersList = (0..42).toList()

    val winNumber1 = lotteryNumbersList.random()
    val winNumber2 = lotteryNumbersList.random()
    val winNumber3 = lotteryNumbersList.random()

    val winList = listOf(winNumber1, winNumber2, winNumber3)

    println("Введите первое число")
    var userNumber1 = readln().toInt()

    println("Введите второе число")
    var userNumber2 = readln().toInt()

    println("Введите третье число")
    var userNumber3 = readln().toInt()

    val userList = listOf(userNumber1, userNumber2, userNumber3)

    val userWinNumbers = winList.intersect(userList)

    val numberOfWinNumbers = userWinNumbers.size

    if (numberOfWinNumbers == 3) println("Вы угадали все числа и выиграли джекпот")
    else if (numberOfWinNumbers == 2) println("Вы угадали два числа и выиграли крупный приз")
    else if (numberOfWinNumbers == 1) println("Вы угадали одно число и выиграли утешительный приз")
    else println("Вы не угадали ни одного числа")

    println("Выигрышные номера $winList")

}