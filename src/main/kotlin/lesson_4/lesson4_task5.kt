package org.example.lesson_4

fun main() {

    println("Есть ли повреждения у коробля? Ответ 'true' или 'false'")
    val isShipDamaged: Boolean = readln().toBoolean()

    println("Сколько человек в экипаже?")
    val shipCrewNumber: Int = readln().toInt()

    println("Сколько единиц провизии?")
    val shipFoodNumber: Int = readln().toInt()

    println("Погода хорошая? Ответ 'true' или 'false'")
    val isGoodWhether: Boolean = readln().toBoolean()

    println("корабль может приступить к долгосрочному плаванию: ${((isShipDamaged == HAS_SHIP_DAMAGE_CONDITION) && (shipCrewNumber in SHIP_CREW_MIN..SHIP_CREW_MAX) && (shipFoodNumber > SHIP_FOOD_MIN)) || ((shipCrewNumber == SHIP_CREW_EXACT) && (isGoodWhether == IS_GOOD_WHETHER_CONDITION) && (shipFoodNumber >= SHIP_FOOD_MIN))}")

}

const val SHIP_FOOD_MIN = 50
const val SHIP_CREW_MIN = 55
const val SHIP_CREW_MAX = 70
const val SHIP_CREW_EXACT = 70
const val HAS_SHIP_DAMAGE_CONDITION = false
const val IS_GOOD_WHETHER_CONDITION = true