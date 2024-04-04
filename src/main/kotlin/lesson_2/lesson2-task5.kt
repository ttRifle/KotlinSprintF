package org.example.lesson_2

fun main() {

    var depositSum = 70000
    var depositYearPercent = 0.167
    var depositYears = 20

    val FinalSum = String.format("%.3f",depositSum.toDouble() * Math.pow((1 + depositYearPercent),depositYears.toDouble()))

    println(FinalSum)
}