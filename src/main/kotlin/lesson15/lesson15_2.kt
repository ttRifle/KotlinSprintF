package lesson15

abstract class WeatherStationStats {
    abstract val stationValue: Int
}

class Temperature(

    override val stationValue: Int,
    val typeOfData: String = "Температура",

    ) : WeatherStationStats()

class PrecipitationAmount(
    override val stationValue: Int,
    val typeOfData: String = "Количество осадков",

    ) : WeatherStationStats()

class WeatherServer(
    val typeOfData: String = String(),
    val stationValue: Int? = null,
) {

    fun sentServerSMS(typeOfData: String, dataToSent: Int): WeatherServer {
        val weatherServer =
            WeatherServer(typeOfData, dataToSent)
        return weatherServer
    }

}


fun main() {

    val weatherServer = WeatherServer()
    val temperature = Temperature(2)
    val precipitationAmount = PrecipitationAmount(30)

    val dataToSent = precipitationAmount

    val sentServer = weatherServer.sentServerSMS(dataToSent.typeOfData, dataToSent.stationValue)

}