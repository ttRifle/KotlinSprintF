package lesson13

class PhoneBook2(contacts: MutableList<Contact3>) {

    var contacts: MutableList<Contact3> = mutableListOf()

}


class Contact3(
    val name: String?,
    val company: String?,
    var phoneNumber: Long? = null,
)

fun main() {

    val contact = Contact3("Boris", "Apple")

    println("Введите номер телефона")
    try {
        contact.phoneNumber = readln().toLong()
    } catch (e: Exception) {
        println("Ошибка: $e")
    }

}