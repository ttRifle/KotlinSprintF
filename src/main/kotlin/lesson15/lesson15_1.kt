package lesson15

abstract class Creatures : Swimmable, Flyable {

    abstract val creatureClass: String
    abstract val family: String
    abstract fun rest()

}

class Bird(
    override val family: String,
    override val creatureClass: String = "Птица",
) : Creatures() {

    override fun rest() {
        println("Отдых")
    }

    override fun fly() {
        println("Взлет")
    }

}

class Fish(
    override val family: String,
    override val creatureClass: String = "Рыба",
) : Creatures() {

    override fun rest() {
        println("Отдых")
    }

    override fun fly() {
        println("Выпрыгнуть из воды")
    }

}

interface Swimmable {

    fun swimForward() {
        println("Плыть вперед")
    }

    fun swimBack() {
        println("Плыть назад")
    }
}

interface Flyable {

    fun fly()

}

fun main() {

    val bird1 = Bird("Чайка")
    val bird2 = Bird("Утка")
    val fish1 = Fish("Карась")

    bird1.rest()
    bird1.swimForward()
    bird1.swimBack()
    bird1.fly()

    fish1.rest()
    fish1.swimForward()
    fish1.swimBack()
    fish1.fly()

}