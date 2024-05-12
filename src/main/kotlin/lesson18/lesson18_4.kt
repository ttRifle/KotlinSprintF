package lesson18

import kotlin.math.pow

abstract class Box {

    abstract val name: String
    abstract val square: Int

    abstract fun getPackageSquare(): Int

}

class RectangleBox(

    override val name: String,
    private val height: Int,
    private val width: Int,
    private val length: Int,

    ) : Box() {

    override val square: Int = 0
    override fun getPackageSquare() = 2 * length * height + 2 * length * width + 2 * height * width

}

class CubeBox(

    override val name: String,
    private val edge: Int

) : Box() {

    override val square: Int = 0

    override fun getPackageSquare() = 6 * edge.toDouble().pow(2).toInt()
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