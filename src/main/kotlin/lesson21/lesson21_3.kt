package lesson21

class Player321(_name: String, _currentHealth: Int, _maxHealth: Int) {

    val name = _name
    var currentHealth = _currentHealth
    val maxHealth = _maxHealth

}

fun main() {

    val player = Player321("user", 90, 100)

    fun Player321.isHealthy(): Boolean = currentHealth == maxHealth

    println(player.isHealthy())

}