package lesson15

abstract class WeatherStationStats {

    abstract val timeOfDay: String

}

class Temperature(
    override val timeOfDay: String,
    val temp: Int,
) : WeatherStationStats() {

}

class PrecipitationAmount(
    override val timeOfDay: String,
    val precipitationAmount: Int,
) : WeatherStationStats() {

}

class WeatherServer(
    val timeOfDay: String = String(),
    val temperature: Int? = null,
    val precipitationAmount: Int? = null,
) {

    fun sentServerSMS(temperature: Temperature, precipitationAmount: PrecipitationAmount): WeatherServer {
        val weatherServer =
            WeatherServer(temperature.timeOfDay, temperature.temp, precipitationAmount.precipitationAmount)
        return weatherServer
    }

}


fun main() {

    val weatherServer = WeatherServer()
    val temperature = Temperature("Утро", 2)
    val precipitationAmount = PrecipitationAmount("утро", 30)

    val sentSever = weatherServer.sentServerSMS(temperature, precipitationAmount)

}