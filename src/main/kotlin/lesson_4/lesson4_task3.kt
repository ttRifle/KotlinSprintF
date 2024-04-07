package org.example.lesson_4

fun main() {

    val whetherSunny = true
    val tentOpen = true
    val airWarmInPercent = 20
    val seasonTime = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(whetherSunny == true) && (tentOpen == true) && (airWarmInPercent == 20) && (seasonTime != "зима")}")

}