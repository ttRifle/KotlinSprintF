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

    println(regularBook) //  по умолчанию toString выведет в консоль хешкод объекта для обычного класса
    println(dataBook) //  по умолчанию toString выведет название класса и его поля для дата класса

}