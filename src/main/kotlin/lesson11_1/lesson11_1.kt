package lesson11_1
//class ForumMember(
//    var userId: Int = 0,
//    var userName: String? = null,
//) {
//
//    fun createNewMember(newUserName: String): ForumMember {
//        userId++
//        userName = newUserName
//        return ForumMember()
//    }
//}
//
//class Forum(
//    var forumThreadId: Int = 0,
//    var forumUsers: MutableList<String> = mutableListOf(),
//    var forumMessages: MutableList<String> = mutableListOf()
//) {
//    fun printThread() {
//
//        for (i in 0..<forumMessages.size) println("${forumUsers[i]}: ${forumMessages[i]}")
//
//    }
//}
//
//
//class ForumMsg(
//    var authorId: Int = 0,
//    var message: String? = null,
//) {
//
//    fun createNewMsg(userId: Int): ForumMsg {
//        authorId = userId
//        println("Введите сообщение")
//        message = readln()
//        return ForumMsg()
//    }
//
//}
//
//fun main() {
//
//    val userName1 = "Boris"
//    val userName2 = "Alex"
//    val forumMember = ForumMember()
//    val forum = Forum()
//    val forumMsg = ForumMsg()
//
//    forumMember.createNewMember(userName1)
//
//    forum.forumUsers.add(forumMember.userName.toString())
//
//    forumMsg.createNewMsg(forumMember.userId)
//
//    if (forum.forumUsers.contains(forumMember.userName)) {
//        forum.forumMessages.add(forumMsg.message.toString())
//        forum.forumThreadId++
//    }
//
//    forumMsg.createNewMsg(forumMember.userId)
//
//    if (forum.forumUsers.contains(forumMember.userName)) {
//        forum.forumMessages.add(forumMsg.message.toString())
//        forum.forumThreadId++
//        forum.forumUsers.add(forumMember.userName.toString())
//    }
//
//    forumMember.createNewMember(userName2)
//
//    forum.forumUsers.add(forumMember.userName.toString())
//
//    forumMsg.createNewMsg(forumMember.userId)
//
//    if (forum.forumUsers.contains(forumMember.userName)) {
//        forum.forumMessages.add(forumMsg.message.toString())
//        forum.forumThreadId++
//    }
//
//    forumMsg.createNewMsg(forumMember.userId)
//
//    if (forum.forumUsers.contains(forumMember.userName)) {
//        forum.forumMessages.add(forumMsg.message.toString())
//        forum.forumThreadId++
//        forum.forumUsers.add(forumMember.userName.toString())
//    }
//
//    forum.printThread()
//
}