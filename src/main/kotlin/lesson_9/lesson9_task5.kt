fun main() {

    val listOfIngredientsFinalFormat: MutableList<String> = mutableListOf()
    val listOfIngredients: MutableList<String> = mutableListOf()
    val numberOfIngredients = 5

    println("Введите 5 ингридиентов вареной картошки")
    for (i in 0..<numberOfIngredients) {
        listOfIngredients.add(readln())
    }

    val listOfIngredientsDistinct = listOfIngredients.distinct().sorted()

    listOfIngredientsDistinct.indices.forEach() {
        if (it != 0) listOfIngredientsFinalFormat.add(listOfIngredientsDistinct[it])
        else listOfIngredientsFinalFormat.add(listOfIngredientsDistinct[it].capitalize())
    }

    println(listOfIngredientsFinalFormat)

}