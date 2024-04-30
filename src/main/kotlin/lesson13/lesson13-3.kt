package lesson13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {

    val phoneBook = listOf(
        Contact("Boris", 88125676544),
        Contact("Igor", 88125435544),
        Contact("Bob", 88125672436, "null"),
        Contact("Steve", 88124356544, "Apple"),
        Contact("John", 88125637544, "Apple"),
    )

    phoneBook.map { if (it.company != null) println(it.company) }

}