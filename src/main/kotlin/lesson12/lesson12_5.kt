import kotlin.random.Random

class MonthWeather(_dayTemps: MutableList<Int>, _nightTemps: MutableList<Int>, _rainyDays: Int) {

    var dayTemps = _dayTemps
    var nightTemps = _nightTemps
    var rainyDays = _rainyDays
    var averageDayTemp = 0
    var averageNightTemp = 0

    constructor(
        dayTemps: MutableList<Int>,
        nightTemps: MutableList<Int>,
        rainyDays: Int,
        averageDayTemp: Int,
        averageNightTemp: Int
    ) : this(dayTemps, nightTemps, rainyDays) {

        this.averageDayTemp = dayTemps.average().toInt()
        this.averageNightTemp = nightTemps.average().toInt()

    }

    fun printWheater() {

        println(
            """
            |Средняя температура днем: $averageDayTemp 
            |Средняя температура ночью: $averageNightTemp
            |Количество дней с осадками: $rainyDays""".trimMargin()
        )

    }

}


class DayWheatherNew(_dayTemperature: Int, _nightTemperature: Int, _isRainfall: Boolean) {

    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var isRainfall = _isRainfall

    init {

        this.dayTemperature = _dayTemperature - KEL_TO_CEL.toInt()
        this.nightTemperature = _nightTemperature - KEL_TO_CEL.toInt()

    }

}

fun main() {
    val daysMonth = 30
    val temperatureRange = (270..290)
    val listOfDayWheatherNew: MutableList<DayWheatherNew> = mutableListOf()
    var monthWeather = MonthWeather(mutableListOf(), mutableListOf(), 0)

    for (i in 0..<daysMonth) {

        val dayWheatherNew = DayWheatherNew(temperatureRange.random(), temperatureRange.random(), Random.nextBoolean())

        listOfDayWheatherNew.add(dayWheatherNew)

        monthWeather.dayTemps.add(listOfDayWheatherNew[i].dayTemperature)
        monthWeather.nightTemps.add(listOfDayWheatherNew[i].nightTemperature)

        if (listOfDayWheatherNew[i].isRainfall) monthWeather.rainyDays++

    }

    monthWeather = MonthWeather(
        monthWeather.dayTemps,
        monthWeather.nightTemps,
        monthWeather.rainyDays,
        monthWeather.averageDayTemp,
        monthWeather.averageNightTemp
    )

    monthWeather.printWheater()

}

const val KEL_TO_CEL = 273.12