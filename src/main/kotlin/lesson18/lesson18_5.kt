package lesson18

open class Object1(
    open val name: String,
)

class Circle55(name: String) : Object1(name)

class Square(name: String) : Object1(name)

class Point(name: String) : Object1(name)

class Screen(
    var object1: Object1? = null,
    val objectXCoordinate: Float = 0F,
    val objectYCoordinate: Float = 0F,
) {

    fun draw(object1: Object1, x: Int, y: Int): Screen {

        return Screen(object1, x.toFloat(), y.toFloat())
    }

    fun draw(object1: Object1, x: Float, y: Float): Screen {

        return Screen(object1, x, y)

    }

}

fun main() {

    val circle55 = Circle55("Круг")
    val square = Square("Квадрат")
    val point = Point("Точка")
    val screen = Screen()
    val listOfObjects: MutableList<Screen> = mutableListOf()

    listOfObjects.add(screen.draw(circle55, 5, 5))
    listOfObjects.add(screen.draw(square, 5.0F, 5.0F))
    listOfObjects.add(screen.draw(point, 5.0F, 5.0F))

}