package lesson11_1

class User(
    val id: Int,
    var userName: String,
    val avatar: String,
    var status: String,
    val roomId: Int,
) {
    fun changeStatusAndName(name: String, newStatus: String) {
        status = newStatus
        userName = name
    }

    fun getUserInfo() {
        println("Пользователь №$id: $userName, status: $status")
    }

}

class Room(
    val roomId: Int,
    val name: String,
    val cover: String,
    var userIds: MutableList<Int>,
) {
    fun addUser(newUser: User) {
        userIds.add(newUser.id)
    }

}

fun main() {

    val user1 = User(
        id = 1,
        userName = "",
        avatar = "none",
        status = "микрофон выключен",
        roomId = 0,
    )

    val room1 = Room(
        roomId = 1,
        name = "black room",
        cover = "о путешествиях",
        userIds = mutableListOf(),
    )

    val userName = "Alex"
    val listOfStatus = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")

    room1.addUser(user1)

    user1.changeStatusAndName(userName, listOfStatus[0])

    user1.getUserInfo()

}