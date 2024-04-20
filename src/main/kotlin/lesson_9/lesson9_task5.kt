import java.util.*

fun main() {

    var listOfIngredients: MutableList<String> = mutableListOf()
    val numberOfIngredients = 5

    println("Введите 5 ингридиентов вареной картошки")
    for (i in 0..<numberOfIngredients) {
        listOfIngredients.add(readln())
    }

    listOfIngredients.sort()

    listOfIngredients = listOfIngredients.toMutableSet().toMutableList()

    listOfIngredients[0] =
        listOfIngredients[0].replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

    println(listOfIngredients)

}

