package lesson18

open class Animal(
    open val name: String = String(),
) {
    open val eatType: String = ""

    open fun sleep() {}

    open fun eat() = ""


}


class Fox(
    override val name: String,
) : Animal() {

    override val eatType: String = "Ягода"

    override fun eat(): String {
        return "[$name]->[$eatType]"

    }

}

class Dog(
    override val name: String
) : Animal() {

    override val eatType: String = "Кость"

    override fun eat(): String {
        return "[$name]->[$eatType]"
    }
}

class Cat(
    override val name: String
) : Animal() {

    override val eatType: String = "Рыба"

    override fun eat(): String {
        return "[$name]->[$eatType]"
    }
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

