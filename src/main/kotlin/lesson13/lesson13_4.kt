package lesson13

class PhoneBook(_phoneBook: MutableList<Contact2>) {

    var contacts = _phoneBook

}

fun printContact(phoneBook: PhoneBook) {

    for (i in phoneBook.contacts.indices + 1) {
        println(
            """
            |Контакт №$i
            |Имя: ${phoneBook.contacts[i].name} 
            |Номер: ${phoneBook.contacts[i].phoneNumber}
            |Компания: ${phoneBook.contacts[i].company}""".trimMargin()
        )
    }

}

class Contact2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {

    val phoneBook = PhoneBook(addContacts())

    printContact(phoneBook)

}

fun addContacts(): MutableList<Contact2> {

    val phoneBook1: MutableList<Contact2> = mutableListOf()
    var addWord = "да"

    while (addWord.equals("да", ignoreCase = true)) {

        println("Введите введите имя")
        val name = readln()

        println("Введите телефон")
        val phoneNumber: Long? = readln().toLongOrNull()

        if (phoneNumber != null) {

            println("Введите название компании")
            var company: String? = readln()
            if (company == "") company = null
            val contact = Contact2(name, phoneNumber, company)
            phoneBook1.add(contact)

        } else

            println("Контакт без телефона не может быть добавлен")

        println("Желаете добавить еще?")
        addWord = readln()
    }
    return phoneBook1

}
