fun main() {

    var userWantPlayAnswer = "да"
    var numberOfUserWins = 0

    while (userWantPlayAnswer.equals("да", ignoreCase = true)) {
        if (isUserWin()) numberOfUserWins++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        userWantPlayAnswer = readln()
    }

    println("Вы выиграли партий: $numberOfUserWins")

}

fun getCubeThrow1(): Int = (1..6).random()

fun isUserWin(): Boolean {

    val compThrowResult = getCubeThrow1()
    println("Компьютер выбросил $compThrowResult")

    val userThrowResult = getCubeThrow1()
    println("Пользователь выбросил $userThrowResult")

    val gameResult = when {
        compThrowResult > userThrowResult -> "Победила машина"
        compThrowResult < userThrowResult -> "Победило человечество"
        else -> "Ничья"
    }

    println(gameResult)

    return (userThrowResult > compThrowResult)

}