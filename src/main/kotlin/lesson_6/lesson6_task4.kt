import kotlin.random.Random

fun main() {

    var numberOfTry = 5
    val secretNumber = (0..9).random()
    println(secretNumber)

    while (numberOfTry > 0) {
        println("Угадайте число от 1 до 9")
        println("Осталось попыток: ${numberOfTry--}")
        val userNumber = readln().toInt()
        if (userNumber == secretNumber) {
            println("Это была великолепная игра!")
            return
        } else println("Неверно!")

    }

    println("Загаданное число - $secretNumber")

}



