package lesson20

class Player(_name: String, _currentHealth: Int, _maxHealth: Int) {

    val name = _name
    var currentHealth = _currentHealth
    val maxHealth = _maxHealth

}

fun main() {

    val player = Player("user", 62, 100)

    val heal: (Player) -> Unit = fun(player: Player) {
        player.currentHealth += player.maxHealth - player.currentHealth
    }

    println(player.currentHealth)

    heal(player)

}
