package lesson15

class Seagull(
    val seagullId: Int
) : Flyable

class Duck(
    val duckId: Int,
) : Flyable, Swimmable

class Carp(
    val carpId: Int
) : Swimmable

interface Swimmable {

    fun swimForward() {
        println("Плыть вперед")
    }

    fun swimDown() {
        println("Плыть вниз")
    }
}

interface Flyable {

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
    duck.swimForward()
    duck.swimDown()


    carp.swimForward()
    carp.swimDown()

}