package lesson12

class DayWhetherNew2(var dayTemperature: Int, var nightTemperature: Int, var isRainfall: Boolean) {

    init {

        this.dayTemperature = dayTemperature - KEL_TO_CEL.toInt()
        this.nightTemperature = nightTemperature - KEL_TO_CEL.toInt()

        println(
            """
            |Температура днем: $dayTemperature 
            |Температура ночь: $nightTemperature
            |Осадки: $isRainfall""".trimMargin()
        )

    }

}

fun main() {

    val dayWhether2 = DayWhetherNew2(280, 278, false)

}

const val KEL_TO_CEL = 273.12