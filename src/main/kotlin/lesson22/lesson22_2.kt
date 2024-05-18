package lesson22

class RegularBook22(
    val name: String,
    val author: String,
)

data class DataBook22(
    val name: String,
    val author: String,
)

fun main() {

    val regularBook = RegularBook22("dictionary", "Mark")

    val dataBook = DataBook22("dictionary", "Mark")

    println("${regularBook}, тк у обычных классов по умолчанию toString выводит название класса")
    println("${dataBook}, тк у дата классов по умолчанию toString выводит название класса и его поля")

}