package lesson14

abstract class Figure(
    val color: String,
    var square: Int,
    var perimeter: Int,
) {

    abstract fun squareCalculation()
    abstract fun perimeterCalculation()

}

class Circle(
    color: String,
    val radius: Int = 0,
    square: Int = 0,
    perimeter: Int = 0,
) : Figure(color, square, perimeter) {
    override fun squareCalculation() {
        square = (radius * PI).toInt()
    }

    override fun perimeterCalculation() {
        perimeter = (2 * PI * radius).toInt()
    }

}

class Rectangle(
    color: String,
    val height: Int = 0,
    val width: Int = 0,
    square: Int = 0,
    perimeter: Int = 0,

    ) : Figure(color, square, perimeter) {
    override fun squareCalculation() {
        square = height * width
    }

    override fun perimeterCalculation() {
        perimeter = (height + width) * 2
    }

}

fun main() {

    val circle1 = Circle("black", 10)
    val circle2 = Circle("white", 12)
    val rectangle1 = Rectangle("white", 5, 5)
    val rectangle2 = Rectangle("black", 6, 6)

    val listOfFigures = listOf(
        circle1.also {
            it.squareCalculation()
            it.perimeterCalculation()
        },

        circle2.also {
            it.squareCalculation()
            it.perimeterCalculation()
        },

        rectangle1.also {
            it.squareCalculation()
            it.perimeterCalculation()
        },

        rectangle2.also {
            it.squareCalculation()
            it.perimeterCalculation()
        }
    )


    println(
        "Сумма периметров всех черных фигур: ${listOfFigures.filter { it.color == "black" }.sumOf { it.perimeter }}"
    )

    println(
        "Сумма площадей всех белых фигур: ${listOfFigures.filter { it.color == "white" }.sumOf { it.square }}"
    )

}

const val PI = 3.14