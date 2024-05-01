package lesson14

open class Liner1(
    val name: String,
    val speed: Int = 100,
    val cargoCapacity: Int = 10,
    val passengersCapacity: Int = 100,
    val isIcebreaker: Boolean = false,
    var isCargoLoadingActive: Boolean = false,
)

class Cargo1(
    name: String,
) : Liner1(name, speed = 10, cargoCapacity = 100)

class Icebreaker1(
    name: String
) : Liner1(name, speed = 10, isIcebreaker = true)

fun main() {

    val liner = Liner1("Liner")
    val cargo = Cargo1("Cargo")
    val icebreaker = Icebreaker1("Icebreaker")

}
