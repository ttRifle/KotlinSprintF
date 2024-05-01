import kotlin.random.Random

class MonthWeather(_listOfWeather: List<DayWeatherNew>) {

    var listOfWeather = _listOfWeather
    val rainyDays = listOfWeather.filter { it.isRainfall }.size
    val nightTemps = listOfWeather.map { it.nightTemperature }.average().toInt()
    val dayTemps = listOfWeather.map { it.dayTemperature }.average().toInt()

    fun printWeather() {

        println(
            """
            |Средняя температура днем: $dayTemps  
            |Средняя температура ночью: $nightTemps
            |Количество дней с осадками: $rainyDays""".trimMargin()
        )

    }

}

class DayWeatherNew(_dayTemperature: Int, _nightTemperature: Int, _isRainfall: Boolean) {

    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var isRainfall = _isRainfall

    init {

        this.dayTemperature = _dayTemperature - KEL_TO_CEL
        this.nightTemperature = _nightTemperature - KEL_TO_CEL

    }

}

fun main() {

    val monthDays = 30
    val temperatureRange = (270..290)
    val listOfDayWeatherNew: MutableList<DayWeatherNew> = mutableListOf()

    for (i in 0..<monthDays) {

        val dayWeatherNew = DayWeatherNew(temperatureRange.random(), temperatureRange.random(), Random.nextBoolean())
        listOfDayWeatherNew.add(dayWeatherNew)

    }

    val monthWeather = MonthWeather(listOfDayWeatherNew)

    monthWeather.printWeather()

}

const val KEL_TO_CEL = 273