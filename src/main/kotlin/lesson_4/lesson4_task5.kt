package org.example.lesson_4

fun main() {

    println("Есть ли повреждения у коробля? Ответ 'true' или 'false'")
    val isShipDamage: Boolean = readln().toBoolean()

    println("Сколько человек в экипаже?")
    val shipCrewNumber: Int = readln().toInt()

    println("Сколько единиц провизии?")
    val shipFoodNumber: Int = readln().toInt()

    println("Погода хорошая? Ответ 'true' или 'false'")
    val isGoodWhether: Boolean = readln().toBoolean()

    println("корабль может приступить к долгосрочному плаванию: ${((isShipDamage == SHIP_TRIP_DAMAGE) && (shipCrewNumber in SHIP_CREW_MIN..SHIP_CREW_MAX) && (shipFoodNumber > SHIP_FOOD_MIN) && (isGoodWhether == GOOD_WHETHER || isGoodWhether !== GOOD_WHETHER)) || ((isShipDamage !== SHIP_TRIP_DAMAGE) && (shipCrewNumber == SHIP_CREW_EXACT) && (isGoodWhether == GOOD_WHETHER) && (shipFoodNumber >= SHIP_FOOD_MIN))}")

}

const val SHIP_FOOD_MIN = 50
const val SHIP_CREW_MIN = 55
const val SHIP_CREW_MAX = 70
const val SHIP_CREW_EXACT = 70
const val SHIP_TRIP_DAMAGE = false
const val GOOD_WHETHER = true