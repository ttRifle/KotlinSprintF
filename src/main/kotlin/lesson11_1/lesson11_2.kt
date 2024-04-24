package lesson11_1


class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {

    fun printUser() {
        println("Пользователь №$id: $login, пароль: $password, mail: $mail, о себе: $bio")
    }

    fun changeBio() {
        println("Напишите о себе")
        bio = readln()
    }

    fun changePass() {
        println("Для смены пароля введитие текущий пароль")
        if (readln() == password) {
            println("Введите новый пароль")
            password = readln()
        } else println("Пароль не верный")
    }


}

fun main() {

    val user = User2(
        id = 1,
        login = "Alex",
        password = "1234",
        mail = "Alex1234@mai.ru"
    )

    user.changeBio()
    user.changePass()
    user.printUser()

}