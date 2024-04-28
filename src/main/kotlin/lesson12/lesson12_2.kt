package lesson12

class DayWhether1(val dayTemperature: Int, val nightTemperature: Int, val isRainfall: Boolean, val isCloudy: Boolean) {
    fun printWhether() {

        println(
            """
            |Температура днем: $dayTemperature 
            |Температура ночь: $nightTemperature
            |Осадки: $isRainfall""".trimMargin()
        )
    }
}

fun main() {

    val dayWhether1 = DayWhether1(12, 4, true, false)
    dayWhether1.printWhether()

}