package lesson12

class DayWhether(
    val dayTemperature: Int = 12,
    val nightTemperature: Int = 2,
    val isRainfall: Boolean = true,
    val isCloudy: Boolean = true,
) {


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

    val dayWhether1 = DayWhether(
        dayTemperature = 11,
        nightTemperature = 3,
        isRainfall = false,
        isCloudy = false,
    )

    val dayWhether2 = DayWhether(
        dayTemperature = 14,
        nightTemperature = 4,
        isCloudy = false,
    )

    dayWhether1.printWhether()
    dayWhether2.printWhether()


}