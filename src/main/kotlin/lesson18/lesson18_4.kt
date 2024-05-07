package lesson18

open class Box {
    open val name: String = ""
    open var square: Int = 0

    open fun getPackageSquare(): Int = 0
}

class RectangleBox(
    override val name: String,
    val height: Int,
    val width: Int,
    val depth: Int,
) : Box() {

    override fun getPackageSquare() = height * width * depth

}

class CubeBox(
    override val name: String,
    val edge: Int,
) : Box() {

    override fun getPackageSquare() = 6 * edge * 2
}


fun main() {

    val rectangleBox = RectangleBox("Прямоугольник", 10, 10, 10)
    val cubeBox = CubeBox("Куб", 10)
    val listOfBox: List<Box> = listOf(rectangleBox, cubeBox)

    getBoxSquare(listOfBox)

}

fun getBoxSquare(box: List<Box>) {
    for (i in box.indices) {
        println("Для посылки №${i + 1} нужна коробка ${box[i].name} с площадью ${box[i].getPackageSquare()}")
    }
}