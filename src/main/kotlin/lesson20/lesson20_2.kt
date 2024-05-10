package lesson20

class Player(_name: String, _currentHealth: Int, _maxHealth: Int) {

    val name = _name
    var currentHealth = _currentHealth
    val maxHealth = _maxHealth

}

fun main() {

    val player = Player("user", 62, 100)

    val getCurrentHealthToMaxHealth: () -> Int = fun(): Int = player.maxHealth - player.currentHealth

    val heal: (Player) -> Unit = fun(player: Player) {
        player.currentHealth += getCurrentHealthToMaxHealth()
    }

    heal(player)

}
