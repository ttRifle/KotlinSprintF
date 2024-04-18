fun main() {

    println("Введите Логин")
    val newUserName: String = readln()

    println("Введите пароль")
    val newPassword: String = readln()

    println("Пользовать $newUserName зарегистрирован!")

    do {

        println("Для авторизации введите логин")
        val userNameCheck: String = readln()

        println("введите пароль")
        val userPassCheck: String = readln()

    } while ((newUserName != userNameCheck) || (newPassword != userPassCheck))

    println("Авторизация прошла успешно")

}
