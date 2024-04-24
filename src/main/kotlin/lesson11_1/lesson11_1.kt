package lesson11_1

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)

fun main() {

    val user1 = User(
        id = 1,
        login = "Alex",
        password = "1234",
        mail = "Alex1234@mai.ru"
    )

    val user2 = User(
        id = 2,
        login = "John",
        password = "1234",
        mail = "John1234@mai.ru"
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)

}
