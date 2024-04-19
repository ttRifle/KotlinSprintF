fun main() {

    val passAndLoginMinLenght = 4

    println("Придумай логин(не менее 4х символов")
    val userName = readln()

    println("Придумай пароль(не менее 4х символов")
    val userPass = readln()

    println(getLenghtCheck(passAndLoginMinLenght, userName, userPass))

}

fun getLenghtCheck(lenght: Int, userName: String, userPass: String): String {
    return if ((userName.length < lenght) || (userPass.length < lenght)) "Логин или пароль недостаточно длинные"
    else "Добро пожаловать"

}