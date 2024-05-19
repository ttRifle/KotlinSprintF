package lesson22

data class Table(
    val width: Int,
    val height: Int,
    val depth: Int,
)

fun main() {

    val table = Table(10, 10, 10)
    val (width, height, depth) = table

    println(width)
    println(height)
    println(depth)

}
