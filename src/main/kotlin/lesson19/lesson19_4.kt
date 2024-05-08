package lesson19

import lesson19.TankMissile.*

enum class TankMissile(private val shootPower: Int) {

    BLUE(5),
    GREEN(10),
    RED(20);

    fun getShootPower(missile: TankMissile): Int {

        return when (missile) {
            BLUE -> BLUE.shootPower
            GREEN -> GREEN.shootPower
            RED -> RED.shootPower
        }

    }

}

class Tank(_missile: TankMissile) {

    private var missile = _missile

    fun shoot() {

        println(" Выстрел нанес ${BLUE.getShootPower(missile)}")

    }

    fun changeMissile(missileType: TankMissile) = missileType.also { missile = it }

}

fun main() {

    val tank = Tank(RED)

    tank.shoot()

    tank.changeMissile(BLUE)

    tank.shoot()

    tank.changeMissile(GREEN)

    tank.shoot()

}