fun main() {

    val arrayOfTomyamIngredients = arrayOf("галанган", "чили", "креветки", "лемонграс", "грибы")
    //val searchIndex: Int = null

    println("Введите ингредиент который хотите найти")
    val searchIngredient = readln()

    if (arrayOfTomyamIngredients.indexOf(searchIngredient) != -1)
        println("Ингредиент $searchIngredient в рецепте есть")
    else println("Такого ингрединета в рецепте нет")

}
