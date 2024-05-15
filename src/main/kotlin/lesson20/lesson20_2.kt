package lesson20

class Player(_name: String, _currentHealth: Int, _maxHealth: Int) {

    val name = _name
    var currentHealth = _currentHealth
    val maxHealth = _maxHealth

}

fun main() {

    val player = Player("user", 62, 100)

    val getHealthToMaxHealth: () -> Int = { player.maxHealth - player.currentHealth }

    val heal: (Player) -> Unit = { player.currentHealth += getHealthToMaxHealth() }

    heal(player)

}
