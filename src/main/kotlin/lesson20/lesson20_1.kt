package lesson20

fun main() {

    val username = "Boris"

    val greetUser: () -> String = { "С наступающим Новым Годом, $username!" }

    println(greetUser())

}