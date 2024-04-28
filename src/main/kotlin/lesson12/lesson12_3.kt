class DayWhetherNew(dayTemperature: Int, nightTemperature: Int, isRainfall: Boolean) {

    var dayTemperature: Int = 280
    var nightTemperature: Int = 278
    var isRainfall: Boolean = true

    init {

        this.dayTemperature = dayTemperature - KEL_TO_CEL.toInt()
        this.nightTemperature = nightTemperature - KEL_TO_CEL.toInt()

    }


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

    println(dayWhether.printWhether1())

}

const val KEL_TO_CEL = 273.12