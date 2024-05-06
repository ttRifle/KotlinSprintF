package lesson17

class User4(login: String, password: String) {

    var login: String = login
        set(value) {
            field = value
            println("Новый логин $field")
        }
    var password: String = password
        get() {
            var passToString = ""
            for (i in 1..field.length) {
                passToString += "*"
            }
            return passToString
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }

}


fun main() {

    val user4 = User4("login", "password")

    user4.password = "123"

    println(user4.password)

    user4.login = "Boris"


}