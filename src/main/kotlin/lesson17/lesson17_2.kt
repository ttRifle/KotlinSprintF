package lesson17

class Ship1 {

    var name: String = "Аврора"
        set(value) {
            if (value != field)
                println("Нельзя")
        }
    val averageSpeed: Int = 0
    val motherPort: String = "Спб"

}

fun main() {

    val ship1 = Ship1()

    ship1.name = "1"
    println(ship1.name)

}

