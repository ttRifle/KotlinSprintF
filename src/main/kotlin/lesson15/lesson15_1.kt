package lesson15

class Seagull(
    override val birdId: Int
) : Flyable {

}

class Duck(
    override val birdId: Int
) : Flyable {

}

class Carp(
    override val fishId: Int
) : Swimmable {

}

interface Swimmable {

    val fishId: Int

    fun swimForward() {
        println("Плыть вперед")
    }

    fun swimDown() {
        println("Плыть вниз")
    }
}

interface Flyable {

    val birdId: Int

    fun flyForward() {
        println("лететь вперед")
    }

    fun flyDown() {
        println("лететь вниз")
    }

}

fun main() {

    val seagull = Seagull(1)
    val duck = Duck(2)
    val carp = Carp(1)


    seagull.flyForward()
    seagull.flyDown()

    duck.flyForward()
    duck.flyDown()

    carp.swimForward()
    carp.swimDown()

}