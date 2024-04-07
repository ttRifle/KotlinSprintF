package org.example.lesson_4

fun main() {

    println("Есть ли повреждения у коробля? Ответ 'true' или 'false'")
    val shipDamage: Boolean = readln().toBoolean()

    println("Сколько человек в экипаже?")
    val shipCrewNumber: Int = readln().toInt()

    println("Сколько единиц провизии?")
    val shipFoodNumber: Int = readln().toInt()

    println("Погода хорошая? Ответ 'true' или 'false'")
    val whetherGoodForTrip: Boolean = readln().toBoolean()

    println("корабль может приступить к долгосрочному плаванию: ${((shipDamage != true) && (shipCrewNumber in SHIPCREWMIN..SHIPCREWMAX) && (shipFoodNumber > SHIPFOODMIN) && (whetherGoodForTrip == true || whetherGoodForTrip == false)) || ((shipDamage == true) && (shipCrewNumber == SHIPCREWEXACT) && (whetherGoodForTrip == true) && (shipFoodNumber >= SHIPFOODMIN))}")

}

const val SHIPFOODMIN = 50
const val SHIPCREWMIN = 55
const val SHIPCREWMAX = 70
const val SHIPCREWEXACT = 70