package lesson22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {

    val regularBook = RegularBook("dictionary", "Mark")
    val regularBook1 = RegularBook("dictionary", "Mark")

    val dataBook = DataBook("dictionary", "Mark")
    val dataBook2 = DataBook("dictionary", "Mark")

    println("${regularBook == regularBook1}, тк у обычных классов сравниваются ссылки на объекты в памяти, а не их значения ")
    println("${dataBook == dataBook2}, тк у дата классов сравниваются значения объектов")

}