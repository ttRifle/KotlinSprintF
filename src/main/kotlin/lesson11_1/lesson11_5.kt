class ForumMember(
    var userId: Int = -1,
    var userName: String = "",
)

class Forum(
    var forumThreadId: Int = -1,
    var forumMembers: MutableList<ForumMember> = mutableListOf(),
    var forumMessages: MutableList<ForumMsg> = mutableListOf(),
) {

    fun createNewUser(forumMember: ForumMember): ForumMember {

        println("Введите имя нового пользователя")
        forumMember.userName = readln()
        forumThreadId++
        forumMember.userId = forumThreadId
        forumMembers.add(forumMember)
        return forumMember

    }

    fun printThread() {

        for (i in 0..<forumMessages.size) {
            println("${forumMembers[forumMessages[i].authorId].userName}: ${forumMessages[i].message}")
        }

    }

    fun createNewMessage(forumMsg: ForumMsg): ForumMsg {

        println("Введите ID пользователя для отправки сообщения")
        val id = readln().toInt()

        for (i in 0..<forumMembers.size) {

            if (forumMembers[i].userId == id) {

                println("Введите сообщение от пользователя ${forumMembers[i].userName}")
                forumMsg.message = readln()
                forumMsg.authorId = forumMembers[i].userId
                forumMessages.add(forumMsg)
                return forumMsg
            }

        }

        println("Пользователь с id: $id не найден")

        return forumMsg
    }

}


class ForumMsg(
    var authorId: Int = -1,
    var message: String = "",
)

fun main() {

    var forumMember1 = ForumMember()
    var forumMember2 = ForumMember()

    var forumMsg1 = ForumMsg()
    var forumMsg2 = ForumMsg()
    var forumMsg3 = ForumMsg()
    var forumMsg4 = ForumMsg()

    val forum1 = Forum()

    forumMember1 = forum1.createNewUser(forumMember1)

    forumMember2 = forum1.createNewUser(forumMember2)

    forumMsg1 = forum1.createNewMessage(forumMsg1)

    forumMsg2 = forum1.createNewMessage(forumMsg2)

    forumMsg3 = forum1.createNewMessage(forumMsg3)

    forumMsg4 = forum1.createNewMessage(forumMsg4)

    forum1.printThread()


}

