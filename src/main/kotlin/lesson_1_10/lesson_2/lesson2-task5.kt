package lesson_1_10.lesson_2

fun main() {

    var depositSum = 70000
    var depositYearPercent = 16.7
    var depositYears = 20

    val FinalSum =
        String.format("%.3f", depositSum.toDouble() * Math.pow((1 + depositYearPercent / 100), depositYears.toDouble()))

    println(FinalSum)
}