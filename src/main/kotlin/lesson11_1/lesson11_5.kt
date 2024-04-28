class ForumMember(
    var userId: Int,
    var userName: String,
)

class Forum(
    var forumMembers: MutableList<ForumMember> = mutableListOf(),
    var forumMessages: MutableList<ForumMsg> = mutableListOf(),
) {

    fun createNewUsers() {

        val forumMember1 = ForumMember(0, "Boris")

        forumMembers.add(forumMember1)

        val forumMember2 = ForumMember(1, "Moris")

        forumMembers.add(forumMember2)

    }

    fun printThread() {

        for (i in 0..<forumMessages.size) {

            println("${forumMembers[forumMessages[i].authorId].userName}: ${forumMessages[i].message}")

        }


    }

    fun createNewMessage() {


        val forumMsg1 = ForumMsg(0, "Привет")

        for (i in 0..<forumMembers.size) {

            if (forumMsg1.authorId == forumMembers[i].userId) forumMessages.add(forumMsg1)

        }

        val forumMsg2 = ForumMsg(1, "Привет")

        for (i in 0..<forumMembers.size) {

            if (forumMsg2.authorId == forumMembers[i].userId) forumMessages.add(forumMsg2)

        }

        val forumMsg3 = ForumMsg(0, "Пока")

        for (i in 0..<forumMembers.size) {

            if (forumMsg3.authorId == forumMembers[i].userId) forumMessages.add(forumMsg3)

        }

        val forumMsg4 = ForumMsg(1, "Пока")

        for (i in 0..<forumMembers.size) {

            if (forumMsg4.authorId == forumMembers[i].userId) forumMessages.add(forumMsg4)

        }

    }

}


class ForumMsg(
    var authorId: Int,
    var message: String,
)

fun main() {

    val forum1 = Forum()

    forum1.createNewUsers()

    forum1.createNewMessage()

    forum1.printThread()

}
