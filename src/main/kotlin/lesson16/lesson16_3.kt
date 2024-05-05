package lesson16

class User123 {

    val userName: String = String()
    private val userPass: String = "123"

    fun checkPass(readPass: String) = readPass == userPass

}

fun main() {

    val user123 = User123()
    val readPass = "123"

    println(user123.checkPass(readPass))

}
