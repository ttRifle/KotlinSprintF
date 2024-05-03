package lesson14

abstract class Figure(
    val color: String,
) {

    abstract fun calculateSquare(): Double
    abstract fun calculatePerimeter(): Double

}

class Circle(
    color: String,
    val radius: Double = 0.0,
    var square: Double = 0.0,
    var perimeter: Double = 0.0,
) : Figure(color) {
    override fun calculateSquare(): Double {
        square = radius * kotlin.math.PI
        return square
    }

    override fun calculatePerimeter(): Double {
        perimeter = 2 * kotlin.math.PI * radius
        return perimeter
    }

}

class Rectangle(
    color: String,
    val height: Double = 0.0,
    val width: Double = 0.0,
    var square: Double = 0.0,
    var perimeter: Double = 0.0,

    ) : Figure(color) {
    override fun calculateSquare(): Double {
        square = height * width
        return square
    }

    override fun calculatePerimeter(): Double {
        perimeter = (height + width) * 2
        return perimeter
    }

}

fun main() {

    val circle1 = Circle(FIGURE_COLOR_1, 10.0)
    val circle2 = Circle(FIGURE_COLOR_2, 12.0)
    val rectangle1 = Rectangle(FIGURE_COLOR_2, 5.0, 5.0)
    val rectangle2 = Rectangle(FIGURE_COLOR_1, 6.0, 6.0)

    circle1.square = circle1.calculateSquare()
    circle1.perimeter = circle1.calculatePerimeter()
    circle2.square = circle2.calculateSquare()
    circle2.perimeter = circle2.calculatePerimeter()
    rectangle1.square = rectangle1.calculateSquare()
    rectangle1.perimeter = rectangle1.calculatePerimeter()
    rectangle2.square = rectangle2.calculateSquare()
    rectangle2.perimeter = rectangle2.calculatePerimeter()

    val listOfCircles = listOf(
        circle1,
        circle2,
    )

    val listOfRectangles = listOf(
        rectangle1,
        rectangle2,
    )

    val perimeterBlackFigures =
        listOfCircles.filter { it.color == FIGURE_COLOR_1 }
            .sumOf { it.perimeter } + listOfRectangles.filter { it.color == FIGURE_COLOR_1 }.sumOf { it.perimeter }

    val squareWhiteFigures =
        listOfCircles.filter { it.color == FIGURE_COLOR_2 }
            .sumOf { it.square } + listOfRectangles.filter { it.color == FIGURE_COLOR_2 }.sumOf { it.square }


    println("Сумма периметров всех черных фигур: ${String.format("%.2f", perimeterBlackFigures)}")

    println("Сумма площадей всех белых фигур: ${String.format("%.2f", squareWhiteFigures)}")

}

const val FIGURE_COLOR_1 = "black"

const val FIGURE_COLOR_2 = "white"

