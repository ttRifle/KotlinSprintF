package lesson12

class DayWhetherNew(dayTemperature: Int, nightTemperature: Int, isRainfall: Boolean) {

    var dayTemperature = dayTemperature - KEL_TO_CEL
    var nightTemperature = nightTemperature - KEL_TO_CEL
    var isRainfall: Boolean = true

    fun printWhether1() {

        println(
            """
            |Температура днем: $dayTemperature 
            |Температура ночь: $nightTemperature
            |Осадки: $isRainfall""".trimMargin()
        )
    }
}


fun main() {

    val dayWhether = DayWhetherNew(280, 278, false)

    dayWhether.printWhether1()

}

const val KEL_TO_CEL = 273.12