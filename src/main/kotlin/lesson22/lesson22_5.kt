package lesson22

data class GalacticGuide(
    val placeOrEvent: String,
    val descriptionOfPlaceOrEvent: String,
    val dateAndTime: String?,
    val placeOrEventDistanceFromEarth: String,
) {

    override fun toString(): String {
        return "GalacticGuide(place='$placeOrEvent', descriptionOfPlace='$descriptionOfPlaceOrEvent', placeDistanceFromEarth='$placeOrEventDistanceFromEarth')"
    }

}

fun main() {

    val galacticGuide = GalacticGuide("Alpha Centauri", "Stellar system", "01.02.23 15:30", "4,36 light years")

    println(galacticGuide)

}