package lesson16

class Player {

    val name: String = String()
    var impactPower: Int = 33
    private var health: Int = 100
        set(value) {
            field = value
            if (value <= 0) {
                die()
                field = 0
            }

        }
    var isDead = false

    fun receiveDamage() {

        val damage = 25

        if (health > 0) {
            println("Ты получил урон $damage здоровья. осталось здоровья: ${health - damage}")
            health -= damage
        }

    }

    fun heal() {

        val heal = 20
        if (!isDead) {
            health += heal
            println("Ты вылечил $heal здоровья. осталось здоровья: $health")
        } else
            println("Ты не можешь лечиться, так как ты мертв")

    }

    private fun die() {

        impactPower = 0
        isDead = true
        println("Ты умер")

    }

}

fun main() {

    val player = Player()

    player.receiveDamage()
    player.heal()
    player.receiveDamage()
    player.receiveDamage()
    player.receiveDamage()
    player.receiveDamage()

}