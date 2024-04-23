fun main() {

    val arrayOfTomyamIngredients = arrayOf("галанган", "чили", "креветки", "лемонграс", "грибы")

    println("Введите ингридиент который хотите найти")
    val searchIngredient = readln()

    for (i in arrayOfTomyamIngredients) {
        if (i == searchIngredient) {
            println("Ингридиент $i в рецепте есть")
            return
        }

    }

    println("Такого ингридинета в рецепте нет")

}