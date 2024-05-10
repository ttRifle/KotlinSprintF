package lesson20

class Player321(_hasKey: Boolean) {

    val hasKey = _hasKey

}

fun main() {

    val player = Player321(true)

    val openDoor: () -> Unit = fun() {

        if (player.hasKey) println("Ты открыл дверь")
        else println("дверь заперта")

    }

    openDoor()

}