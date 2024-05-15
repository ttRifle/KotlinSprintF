package lesson19

enum class Category {
    CLOTHES,
    STATIONARY,
    OTHERS;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHES -> "Одежда"
            STATIONARY -> "Канцелярские товары"
            OTHERS -> "Другое"
        }

    }
}

class GOOD33(_name: String, _id: Int, _category: Category) {

    val name = _name
    private val id = _id
    private val category = _category

    fun printGood() {
        println()
        println("id: $id")
        println("название: $name")
        println("Категория: ${category.getCategoryName()}")
    }

}


fun main() {

    val good11 = GOOD33("Куртка", 0, Category.CLOTHES)
    val good22 = GOOD33("Диск", 1, Category.OTHERS)
    val good33 = GOOD33("Дырокол", 2, Category.STATIONARY)

    good11.printGood()
    good22.printGood()
    good33.printGood()

}