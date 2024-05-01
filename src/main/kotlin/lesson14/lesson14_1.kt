package lesson14

open class Ship(
    val name: String,
    val speed: Int,
    val cargoCapacity: Int,
    val passengersCapacity: Int,
    val isIcebreaker: Boolean = false,
)

open class Liner(
    name: String = "Liner",
    speed: Int = 100,
    cargoCapacity: Int = 10,
    passengersCapacity: Int = 100,
) : Ship(name, speed, cargoCapacity, passengersCapacity)

class Cargo(
    name: String = "Cargo",
    speed: Int = 10,
    cargoCapacity: Int = 100,
) : Liner(name, speed, cargoCapacity)

class Icebreaker(
    name: String = "Icebreaker",
    speed: Int = 10,
    isIcebreaker: Boolean = true,
) : Liner(name, speed)

fun main() {

    val liner = Liner()
    val cargo = Cargo()
    val icebreaker = Icebreaker()

}