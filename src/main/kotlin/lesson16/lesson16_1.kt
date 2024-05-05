package lesson16

class Cube2 {

    private val throwResult: Int = (1..6).random()

    fun getThrowResult() = throwResult

}

fun main() {

    val cube2 = Cube2()

    println(cube2.getThrowResult())

}
