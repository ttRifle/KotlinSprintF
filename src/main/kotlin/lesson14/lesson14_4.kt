package lesson14

abstract class CosmicBody(
    val type: String,
    val name: String,
    val isLandingSuitable: Boolean,
    val hasAtmosphere: Boolean,
)

class Planet(
    name: String,
    isLandingSuitable: Boolean,
    hasAtmosphere: Boolean,
    val listOfSatellites: MutableList<Satellite> = mutableListOf(),
    type: String = "Planet",
) : CosmicBody(type, name, isLandingSuitable, hasAtmosphere)

class Satellite(
    name: String,
    isLandingSuitable: Boolean,
    hasAtmosphere: Boolean,
    type: String = "Satellite",
) : CosmicBody(type, name, isLandingSuitable, hasAtmosphere)

fun main() {

    val satellite1 = Satellite(
        "Fobos",
        isLandingSuitable = true,
        hasAtmosphere = false
    )

    val satellite2 = Satellite(
        "Deimos",
        isLandingSuitable = true,
        hasAtmosphere = false
    )

    val planet1 = Planet(
        "Mars",
        isLandingSuitable = true,
        hasAtmosphere = false,
        mutableListOf(satellite1, satellite2)
    )

    println(
        """
        |Планета: ${planet1.name}
        |Спутники: ${planet1.listOfSatellites.joinToString { it.name }}
    """.trimMargin()
    )

}