package lesson19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESEFIGHTINGFISH,
}

fun main() {

    println("Вы можете добавить следующих рыб в свой аквариум:")
    println(Fish.entries)

}