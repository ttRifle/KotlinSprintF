package lesson14

class Chat(
    val listOfMessages: MutableList<Message> = mutableListOf(),
    val listOfChildMessages: MutableList<ChildMessage> = mutableListOf(),
) {

    fun addMessage() {

        println("Введите имя")
        val readUserName = readln()

        println("Введите сообщение")
        val readMessage = readln()

        val message = Message(readUserName, readMessage, listOfMessages.size)

        listOfMessages.add(message)

    }

    fun addThreadMessage() {

        println("Введите id сообщения под которым хотите написать")
        val readMessageToThread = readln().toInt()

        println("Введите имя")
        val readUserName = readln()

        println("Введите сообщение")
        val readMessage = readln()

        val childMessage = ChildMessage(readUserName, readMessage, listOfChildMessages.size, readMessageToThread)

        listOfChildMessages.add(childMessage)

    }

    fun printChat() {

        val mapOfMessages = listOfMessages.groupBy { it.id }
        val mapOfChildMessages = listOfChildMessages.groupBy { it.parentMessageId }

        for (messageId in mapOfMessages.keys) {

            println("${mapOfMessages[messageId]?.get(0)?.userName}: ${mapOfMessages[messageId]?.get(0)?.message}")

            mapOfChildMessages[messageId]?.indices?.forEach() {
                println("    ${mapOfChildMessages[messageId]?.get(it)?.userName}: " +
                        "${mapOfChildMessages[messageId]?.get(it)?.message}")
            }

        }

    }

}

open class Message(

    var userName: String = "",
    var message: String = "",
    var id: Int = 0,
) {

}


class ChildMessage(
    userName: String = "",
    message: String = "",
    id: Int = 0,
    var parentMessageId: Int,
) : Message(userName, message, id)

fun main() {


    var addNewMessageWord = "да"
    var addNewSubMessageWord = "да"
    val chat = Chat()

    while (addNewMessageWord.equals("да", ignoreCase = true)) {

        chat.addMessage()

        println("Еще сообщение?")
        addNewMessageWord = readln()

    }

    while (addNewSubMessageWord.equals("да", ignoreCase = true)) {

        chat.addThreadMessage()

        println("Еще сообщение?")
        addNewSubMessageWord = readln()

    }

    chat.printChat()

}
