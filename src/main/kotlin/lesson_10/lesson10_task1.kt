fun main() {

    val compThrowResult = getCubeThrow()
    println("Компьютер выбросил ${compThrowResult}")

    val userThrowResult = getCubeThrow()
    println("Пользователь выбросил ${userThrowResult}")

    val gameResult = when {
        compThrowResult > userThrowResult -> "Победила машина"
        compThrowResult < userThrowResult -> "Победило человечество"
        else -> "Ничья"
    }

    println(gameResult)

}

fun getCubeThrow(): Int = (1..6).random()

