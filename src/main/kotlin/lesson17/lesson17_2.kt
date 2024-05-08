package lesson17

class Ship1(name: String) {

    var name: String = name
        set(value) {
            if (value != field)
                println("Имя корабля менять нельзя")
        }
    val averageSpeed: Int = 0
    val motherPort: String = "Спб"

}

fun main() {

    val ship1 = Ship1("Аврора")

    ship1.name = "1"
    println(ship1.name)

}

