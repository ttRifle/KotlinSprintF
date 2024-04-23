package lesson_1_10.lesson_5

fun main() {

    val passengerUser1Name = "Zaphod"
    val passengerUser1Pass = "PanGalactic"

    println("Введите свое имя")
    val userName = readln()

    if (userName == passengerUser1Name) {
        println("Введите пароль")
        val userPassword = readln()
        if (userPassword == passengerUser1Pass) println("Добро пожаловать $userName")
    } else println("Необходимо зарегистрироваться")

}