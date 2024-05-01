package lesson14

open class Liner2(
    val name: String,
    val speed: Int = 100,
    val cargoCapacity: Int = 10,
    val passengersCapacity: Int = 100,
    val isIcebreaker: Boolean = false,
    var isCargoLoadingActive: Boolean = false,
) {

    open fun cargoLoadingActivation() {

        isCargoLoadingActive = true
        println("На корабле $name выдвинут горизонтальный трап")
        println()

    }

    fun printShipInfo() {

        println(
            """
            Название: $name
            Скорость: $speed
            Вместимость груза: $cargoCapacity
            Вместимость пассажиров: $passengersCapacity
            Ледокол: $isIcebreaker
            Активирована погрузка: $isCargoLoadingActive
            
        """.trimIndent()
        )

    }

}

class Cargo2(
    name: String,
) : Liner2(name, speed = 10, cargoCapacity = 100) {

    override fun cargoLoadingActivation() {

        isCargoLoadingActive = true
        println("На корабле $name активирован погрузочный кран")
        println()

    }

}

class Icebreaker2(
    name: String
) : Liner2(name, speed = 10, isIcebreaker = true) {

    override fun cargoLoadingActivation() {

        isCargoLoadingActive = true
        println("На корабле $name открыты ворота со стороны кормы")
        println()

    }

}

fun main() {

    val liner = Liner2("Liner")
    val cargo = Cargo2("Cargo")
    val icebreaker = Icebreaker2("Icebreaker")

    liner.cargoLoadingActivation()
    cargo.cargoLoadingActivation()
    icebreaker.cargoLoadingActivation()

    liner.printShipInfo()
    cargo.printShipInfo()
    icebreaker.printShipInfo()

}
