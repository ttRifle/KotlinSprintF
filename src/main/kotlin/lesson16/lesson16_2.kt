package lesson16


class Circle3(private val radius: Double) {

    private val piDecimal: Double = 3.14

    fun getPerimeter() = 2 * piDecimal * radius

    fun getSquare() = radius * piDecimal

}

fun main() {

    val circle3 = Circle3(3.0)

    println(circle3.getPerimeter())
    println(circle3.getSquare())

}