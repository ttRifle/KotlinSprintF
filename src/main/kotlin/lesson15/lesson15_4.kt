package lesson15

abstract class MusicShop {
    abstract val name: String
    abstract val storageQuantity: Int
}

class Instruments(
    override val name: String,
    override val storageQuantity: Int,
    val listOfParts: List<Parts> = listOf(),
) : MusicShop(), Searchable

class Parts(
    override val name: String,
    override val storageQuantity: Int
) : MusicShop()

interface Searchable {

    fun searchByName() {
        println("Производится поиск")
    }

}

fun main() {

    val parts = Parts("Трость", 100)
    val instruments = Instruments("Кларнет", 100, listOf(parts))

    instruments.searchByName()

}