package lesson15

abstract class MusicShop {
    abstract val name: String
    abstract val storageQuantity: Int
}

class Instrument(
    override val name: String,
    override val storageQuantity: Int,
    val listOfParts: List<Part> = listOf(),
) : MusicShop(), Searchable

class Part(
    override val name: String,
    override val storageQuantity: Int
) : MusicShop()

interface Searchable {

    fun searchByName() {
        println("Производится поиск")
    }

}

fun main() {

    val part = Part("Трость", 100)
    val instrument = Instrument("Кларнет", 100, listOf(part))

    instrument.searchByName()

}