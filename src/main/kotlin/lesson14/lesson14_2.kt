package lesson14

open class Liner2(
    val name: String,
    val speed: Int = 100,
    val cargoCapacity: Int = 10,
    val passengersCapacity: Int = 100,
    var isCargoLoadingActive: Boolean = false,
) {

    open fun activateCargoLoading() {

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
            Активирована погрузка: $isCargoLoadingActive
        """.trimIndent()
        )
    }
}

class Cargo2(
    name: String,
) : Liner2(name, speed = 10, cargoCapacity = 100) {

    override fun activateCargoLoading() {

        isCargoLoadingActive = true
        println("На корабле $name активирован погрузочный кран")
        println()

    }

}

class Icebreaker2(
    name: String,
    val isIcebreaker: Boolean = true,
) : Liner2(name, speed = 10) {

    override fun activateCargoLoading() {

        isCargoLoadingActive = true
        println("На корабле $name открыты ворота со стороны кормы")
        println()

    }

}

fun main() {

    val liner = Liner2("Liner")
    val cargo = Cargo2("Cargo")
    val icebreaker = Icebreaker2("Icebreaker")

    liner.activateCargoLoading()
    cargo.activateCargoLoading()
    icebreaker.activateCargoLoading()

    liner.printShipInfo()
    cargo.printShipInfo()
    icebreaker.printShipInfo()

}
