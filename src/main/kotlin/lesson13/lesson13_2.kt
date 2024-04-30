package lesson13

class PhoneDir2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {

    val phoneDir = PhoneDir2("Alex", 92136745633)
    val textIfNull = "<не указано>"

    println("Имя: ${phoneDir.name}\nНомер: ${phoneDir.phoneNumber}\nКомпания: ${phoneDir.company ?: textIfNull}")

}