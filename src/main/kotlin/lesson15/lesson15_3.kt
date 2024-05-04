package lesson15

abstract class ForumMembers5 : Userable {

    abstract val userId: Int
    abstract val username: String
    abstract val password: String
    abstract val dateOfBirth: String

    fun loginForum() {
        println("Пользователь авторизирован")
    }
}

class User(
    override val userId: Int,
    override val username: String,
    override val password: String,
    override val dateOfBirth: String,
) : ForumMembers5()

class Admin(
    override val userId: Int,
    override val username: String,
    override val password: String,
    override val dateOfBirth: String,
    val isAdmin: Boolean = true,
) : ForumMembers5(), Adminable

interface Userable {

    fun readMessage() {
        println("Сообщение прочитано")
    }

    fun writeMessage() {
        println("Сообщение написано")
    }

}

interface Adminable {

    fun deleteMessage() {
        println("Сообщение удалено")
    }

    fun deleteUser() {
        println("Пользователь удален")
    }

}


fun main() {
    val admin = Admin(1, "1", "1", "1")
    val user = User(2, "2", "2", "2")

    admin.loginForum()
    admin.readMessage()
    admin.writeMessage()
    admin.deleteUser()
    admin.deleteMessage()

    user.loginForum()
    user.readMessage()
    user.writeMessage()

}