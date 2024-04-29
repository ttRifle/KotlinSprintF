package lesson12

class DayWhether() {
    var dayTemperature: Int = 12
    var nightTemperature: Int = 2
    var isRainfall: Boolean = true

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

    val dayWhether1 = DayWhether()

    val dayWhether2 = DayWhether()

    dayWhether2.dayTemperature = 14
    dayWhether2.nightTemperature = 3
    dayWhether2.isRainfall = false


    dayWhether1.printWhether()
    dayWhether2.printWhether()


}