package lesson15

abstract class User {

    abstract val userId: Int
    abstract val username: String
    abstract val password: String
    abstract val dateOfBirth: String

    fun readMessage() {
        println("Сообщение прочитано")
    }

    fun writeMessage() {
        println("Сообщение написано")
    }

}

class Member(
    override val userId: Int,
    override val username: String,
    override val password: String,
    override val dateOfBirth: String,
) : User()

class Admin(
    override val userId: Int,
    override val username: String,
    override val password: String,
    override val dateOfBirth: String,
    val isAdmin: Boolean = true,
) : User() {

    fun deleteMessage() {
        println("Сообщение удалено")
    }

    fun deleteUser() {
        println("Пользователь удален")
    }

}

fun main() {
    val admin = Admin(1, "1", "1", "1")
    val member = Member(2, "2", "2", "2")

    admin.readMessage()
    admin.writeMessage()
    admin.deleteUser()
    admin.deleteMessage()

    member.readMessage()
    member.writeMessage()

}