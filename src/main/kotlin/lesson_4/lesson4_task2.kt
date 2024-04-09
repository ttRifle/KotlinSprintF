package org.example.lesson_4

fun main() {

    val cargo1Weight = 20
    val cargo2Weight = 50
    val cargo1Volume = 80
    val cargo2Volume = 100

    println("Груз №1 с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории 'Average': ${(cargo1Weight >= CARGO_AVERAGE_MIN_WEIGHT) && (cargo1Weight <= CARGO_AVERAGE_MAX_WEIGHT) && (cargo1Volume < CARGO_AVERAGE_MAX_VOLUME)}")
    println("Груз №2 с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории 'Average': ${(cargo2Weight >= CARGO_AVERAGE_MIN_WEIGHT) && (cargo2Weight <= CARGO_AVERAGE_MAX_WEIGHT) && (cargo2Volume < CARGO_AVERAGE_MAX_VOLUME)}")

}

const val CARGO_AVERAGE_MIN_WEIGHT = 35
const val CARGO_AVERAGE_MAX_WEIGHT = 100
const val CARGO_AVERAGE_MAX_VOLUME = 100
