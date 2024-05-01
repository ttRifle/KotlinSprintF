package lesson13

class PhoneDir2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

    fun printDir2() {

        val textIfNull = "<не указано>"

        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: textIfNull}")

    }

}

fun main() {

    val phoneDir = PhoneDir2("Alex", 92136745633)

    phoneDir.printDir2()

}