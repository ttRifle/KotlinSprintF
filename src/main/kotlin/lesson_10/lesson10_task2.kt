fun main() {

    println("Придумай логин(не менее 4х символов)")
    val userName = readln()

    if (isLenghtValid(userName)) {
        println("Придумай пароль(не менее 4х символов)")
        val userPass = readln()

        if (isLenghtValid(userPass)) {
            println("Пользователь зарегистрирован!")
        } else {
            println("Пароль должен быть более 4х символов")
            return
        }

    } else {
        println("Логин должен быть более 4х символов")
        return
    }
}

const val PASS_AND_LOGIN_MIN_LENGHT = 4

fun isLenghtValid(toCheck: String): Boolean = toCheck.length >= PASS_AND_LOGIN_MIN_LENGHT


