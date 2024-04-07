package org.example.lesson_4

fun main() {

    val cargo1Weight = 20
    val cargo2Weight = 50
    val cargo1Volume = 80
    val cargo2Volume = 100

    println("Груз №1 с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории 'Average': ${(cargo1Weight >= CARGOAVERAGEMINWEIGHT) && (cargo1Weight <= CARGOAVERAGEMAXWEIGHT) && (cargo1Volume <= CARGOAVERAGEMAXVOLUME)}")
    println("Груз №2 с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории 'Average': ${(cargo2Weight >= CARGOAVERAGEMINWEIGHT) && (cargo2Weight <= CARGOAVERAGEMAXWEIGHT) && (cargo2Volume <= CARGOAVERAGEMAXVOLUME)}")

}

const val CARGOAVERAGEMINWEIGHT = 35
const val CARGOAVERAGEMAXWEIGHT = 100
const val CARGOAVERAGEMAXVOLUME = 100
