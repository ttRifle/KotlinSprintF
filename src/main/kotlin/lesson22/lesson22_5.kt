package lesson22

data class GalacticGuide(
    val placeOrEvent: String,
    val descriptionOfPlaceOrEvent: String,
    val dateAndTime: String?,
    val placeOrEventDistanceFromEarth: String,
)

data class Planet(
    val place: String,
    val descriptionOfPlace: String,
    val placeDistanceFromEarth: String,
)

fun main() {

    val galacticGuide = GalacticGuide("Alpha Centauri", "Stellar system", "01.02.23 15:30", "4,36 light years")
    val planet = Planet(galacticGuide.component1(), galacticGuide.component2(), galacticGuide.component4())

    println(planet)

}