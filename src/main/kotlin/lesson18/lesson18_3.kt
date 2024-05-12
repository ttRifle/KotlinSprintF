package lesson18

abstract class Animal {

    abstract val name: String
    abstract val eatType: String

    abstract fun sleep()

    abstract fun eat(): String

}


class Fox(

    override val name: String,

    ) : Animal() {

    override val eatType: String = "Ягода"

    override fun sleep() {
        TODO("Not yet implemented")
    }

    override fun eat(): String = "[$name]->[$eatType]"

}

class Dog(

    override val name: String,

    ) : Animal() {

    override val eatType: String = "Кость"
    override fun sleep() {
        TODO("Not yet implemented")
    }

    override fun eat(): String = "[$name]->[$eatType]"

}

class Cat(

    override val name: String,

    ) : Animal() {

    override val eatType: String = "Рыба"
    override fun sleep() {
        TODO("Not yet implemented")
    }

    override fun eat(): String = "[$name]->[$eatType]"

}

fun main() {

    val fox: Animal = Fox("Лиса")
    val dog: Animal = Dog("Собака")
    val cat: Animal = Cat("Кошка")
    val listOfAnimals: List<Animal> = listOf(fox, dog, cat)

    getAllResults(listOfAnimals)

}

fun getAllResults(animals: List<Animal>) {

    for (element in animals) println(element.eat())

}

