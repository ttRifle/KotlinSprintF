fun main() {

    println("Введите 5 ингридиентов разделенных запятыми")
    val listOfIngredients = readln().split(", ")

    if (listOfIngredients.size == 5) {
        val listOfIngredientsSorted = listOfIngredients.sorted()
        println(listOfIngredientsSorted)
    } else println("Вы ввели не верное количество ингредиентов")

}