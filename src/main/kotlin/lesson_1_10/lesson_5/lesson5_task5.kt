package lesson_1_10.lesson_5

fun main() {

    val lotteryNumbersList = (0..42).toList()

    val winNumber1 = lotteryNumbersList.random()
    val winNumber2 = lotteryNumbersList.random()
    val winNumber3 = lotteryNumbersList.random()

    val winList = listOf(winNumber1, winNumber2, winNumber3)

    println("Введите первое число")
    val userNumber1 = readln().toInt()

    println("Введите второе число")
    val userNumber2 = readln().toInt()

    println("Введите третье число")
    val userNumber3 = readln().toInt()

    val userList = listOf(userNumber1, userNumber2, userNumber3)

    val userWinNumbers = winList.intersect(userList)

    val numberOfWinNumbers = userWinNumbers.size

    when (numberOfWinNumbers) {
        3 -> println("Вы угадали все числа и выиграли джекпот")
        2 -> println("Вы угадали два числа и выиграли крупный приз")
        1 -> println("Вы угадали одно число и выиграли утешительный приз")
        else -> println("Вы не угадали ни одного числа")
    }

    println("Выигрышные номера $winList")

}