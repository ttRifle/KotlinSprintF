package lesson22

data class GalacticGuide(
    val placeOrEvent: String,
    val descriptionOfPlaceOrEvent: String,
    val dateAndTime: String?,
    val placeOrEventDistanceFromEarth: String,
)

fun main() {

    val galacticGuide = GalacticGuide("Alpha Centauri", "Stellar system", "01.02.23 15:30", "4,36 light years")

    println("Название места: ${galacticGuide.component1()}, Описание места: ${galacticGuide.component2()}, Дата и время: ${galacticGuide.component3()}, Расстояние до места от земли: ${galacticGuide.component4()}")

}