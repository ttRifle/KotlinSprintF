package lesson21

fun main() {

    val listOfNumbers = listOf(1, 2, 3, 4, 5, 6)

    fun List<Int>.evenNumbersSum() = filter { number -> number % 2 == 0 }.sum()

    println(listOfNumbers.evenNumbersSum())

}